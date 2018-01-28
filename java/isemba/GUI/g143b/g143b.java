////////////////////////////////////////////////////////////////////////////////
// << g143b.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（フレーム、閉じるボタン、イベント処理）
//
//　　フレームと呼ばれるウィンドウ(タイトルなし)を表示する。
//　　閉じるボタンをクリックすると終了する。
//
//　　WindowAdapterクラスを使う。
//　　
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*;

class g143b extends WindowAdapter {

  // コンストラクタ。
  g143b() {
    // フレームの作成。
    Frame f = new Frame();
    // フレームの大きさを設定。
    //f.setSize(300,200);
    f.addWindowListener(new WindowAdapter(){
    	public void windowClosing(WindowEvent we){
            System.exit(0);
     	}
    });
    // フレームの大きさを設定。
    f.setSize(640,480);
    f.setLocationRelativeTo(null);
    // フレームの表示。
    f.setVisible(true);

    // イベントリスナの登録。
    f.addWindowListener(this);
  }

  // windowClosingメソッドを定義する。
  public void windowClosing(WindowEvent e) {
    System.exit(0); // プログラムを終了させるメソッド。
  }

  public static void main(String[] args) {
    g143b g = new g143b();
  }
  
}
