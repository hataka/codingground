////////////////////////////////////////////////////////////////////////////////
// << g143a.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（フレーム、閉じるボタン、イベント処理）
//
//　　フレームと呼ばれるウィンドウ(タイトルなし)を表示する。
//　　閉じるボタンをクリックすると終了する。
//
//　　フレームにおいて、最大化ボタン、最小化ボタンはクリックして機能するが、
//　　閉じるボタンは機能しない。
//　　閉じるボタンを機能させるには、WindowListenerインターフェースの
//　　windowClosingメソッドを実装する必要がある。
//
//　●WindowListenerインターフェースのメソッド
//    WindowListenerインターフェースには、7個のメソッドがある。
//
//　　(1)windowActivated    ウィンドウがアクティブウィンドウに設定されたとき、
//　　　　　　　　　　　　  呼び出される。
//    (2)windowClosed       ウィンドウが閉じられたとき、呼び出される。
//    (3)windowClosing      閉じるボタンをクリックしたとき、呼び出される。
//　　(4)windowDeactivated  ウィンドウがアクティブウィンドウでなくなったとき、
//　　　　　　　　　　　  　呼び出される。
//    (5)windowIconified    最小化ボタンをクリックして、通常の状態から
//                          最小の状態に変更されたとき呼び出される。
//    (6)windowDeiconified  最小化ボタンをクリックして、最小の状態から
//　　　　　　　　　　　　　通常の状態に変更されたとき呼び出される。
//　　(7)windowOpened       ウィンドウが初めて可視状態になったとき呼び出される。
//　　
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*;

class g143a implements WindowListener {

  // コンストラクタ。
  g143a() {
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
  // 他のメソッドすべてを空メソッドとして定義する必要がある。
  public void windowActivated(WindowEvent e) { }
  public void windowClosed(WindowEvent e) { }
  public void windowDeactivated(WindowEvent e) { }
  public void windowIconified(WindowEvent e) { }
  public void windowDeiconified(WindowEvent e) { }
  public void windowOpened(WindowEvent e) { }

  public static void main(String[] args) {
    g143a g = new g143a();
  }
  
}
