////////////////////////////////////////////////////////////////////////////////
// << g144a.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（ダイアログ）
//
//　　ユーザからの入力を受け付けるための一時的なウィンドウをダイアログという。
//　　閉じるボタンのみ表示される。
//　　ダイアログを作成し表示する。
//
//　●Dialogクラスのコンストラクタ
//    Dialog(Frame f, trueまたはfalse)
//      機能：ダイアログを生成する。
//　　　　　　fはこのダイアログを呼び出したフレーム。
//　　　　　　trueはモーダル指定、falseはモーダレス指定。
//    Dialog(Frame f, String s, trueまたはfalse)
//      機能：タイトル付きのダイアログを生成する。
//　　　　　　fはこのダイアログを呼び出したフレーム。
//　　　　　　文字列sはタイトル。
//　　　　　　trueはモーダル指定、falseはモーダレス指定。
//
//    ・ダイアログを作成するには、作成するダイアログを呼び出すフレームまたは
//　　　他のダイアログが必要である。
//
//　●モーダルダイアログとモードレスダイアログ
//　　ダイアログには、モーダルダイアログとモードレスダイアログがある。
//    モーダルダイアログでは、ダイアログへの入力が完了するまで他の
//　　アプリケーションの入力を阻止する。
//　　モーダレスダイアログでは、ダイアログへの入力と独立に他のアプリケーション
//　　は実行される。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*; 

class g144a {

  // コンストラクタ。
  g144a() {
    // フレームの作成。
    Frame f = new Frame("フレーム");
    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // ボタンの作成。
    Button bf = new Button("ダイアログ表示");
    // ボタンをフレーム内に追加。
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

    // ダイアログの作成。
    Dialog d = new Dialog(f,"モーダルダイアログ",true);    

   d.addWindowListener(new WindowAdapter(){
    	public void windowClosing(WindowEvent we){
            System.exit(0);
     	}
    });
  	
    // ダイアログの大きさを設定。
    d.setSize(150,100);
    // ダイアログの表示位置を設定。
    d.setLocation(150,150);
    // ダイアログを表示。
    d.setVisible(true);
  }

  public static void main(String[] args) {
    g144a g = new g144a();
  }

}
