////////////////////////////////////////////////////////////////////////////////
// << g144b.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（ダイアログ、イベント処理）
//
//　　「ダイアログ表示」ボタンを押すと、ダイアログが表示される。
//　　ダイアログの「閉じる」ボタンを押すと、ダイアログが閉じる。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class g144b implements ActionListener {

  Button bf;
  Dialog d;

  // コンストラクタ。
  g144b() {
    // フレームの作成。
    Frame f = new Frame("フレーム");
    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // ボタンの作成。
    bf = new Button("ダイアログ表示");
    // ボタンをダイアログ内に追加。
    f.add(bf);

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
   // フレームを表示。
    f.setVisible(true);

    // ダイアログボックスの作成。
    d = new Dialog(f,"モーダルダイアログ",true);    

    // ダイアログの大きさを設定。
    d.setSize(150,100);
    // ダイアログの表示位置を設定。
    d.setLocation(150,150);
    // ダイアログを表示。
    d.setVisible(false);

    // イベントリスナの登録。
    bf.addActionListener(this);
    // 閉じるボタンを押すとダイアログが閉じる。
    d.addWindowListener( new WindowAdapter() {
      // windowClosingメソッドを定義する。
      public void windowClosing(WindowEvent e) {
        d.setVisible(false);
      }
    });
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    // ボタンがクリックされたときの処理（ダイアログの表示）。
    if( e.getSource() == bf) { 
      // ダイアログを可視状態にする。
      d.setVisible(true); 
    } 
  }

  public static void main(String[] args) {
    g144b g = new g144b();
  }

}
