////////////////////////////////////////////////////////////////////////////////
// << s136.java >>
//
//  Ｓｗｉｎｇ（３）：フレーム（スプリットペイン）
//
//　　表示領域全体を上下に２分割、上部を左右に２分割する。
//
//　●javax.swing.JSplitPaneクラス
//　　画面を分割するのに、JSplitPaneクラスを使う。
//
//　●JSplitPaneクラスのコンストラクタ
//    public JSplitPane(int d, Component c1, Component c2)
//    　機能：dで水平または垂直方向の画面分割を指定する。
//    　　　  　HORIZONTAL_SPLIT  水平方向（左右）に分割。
//    　　　  　VERTICAL_SPLIT    垂直方向（上下）に分割。
//　　　　　　c1は最初に追加するコンポーネント。
//　　　　　　c2は2番目に追加するコンポーネント。
//
//　●JSplitPaneクラスのメソッド
//    public void setContinuousLayout(boolean b)
//    　機能：trueの場合、連続更新機能を有効にする。
//　　　　　　連続更新機能が有効になると、分割線の移動に応じて分割領域が
//　　　　　　更新され再描画される。
//    public void setOneTouchExpandable(boolean b)
//    　機能：trueの場合、ワンタッチ拡張機能が有効になる。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

class s136 extends JFrame {

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s136(String t) { 

    super(t);

    // フレームからコンテンツペインを取得。
    Container c = this.getContentPane();

    // ３個の領域をラベルとする。
    JLabel lab1 = new JLabel("ラベル１");
    JLabel lab2 = new JLabel("ラベル２");
    JLabel lab3 = new JLabel("ラベル３");

    // 上部を左右に分割し、ラベルlab1,lab2を割り当てる。
    JSplitPane sp1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,lab1,lab2);

    // 上部に連続更新機能を設定。
    sp1.setContinuousLayout(true);

    // 全体を上下に分割し、sp1とラベルlab3を割り当てる。
    JSplitPane sp2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,sp1,lab3);

    // 下部にワンタッチ拡張機能を設定。
    sp2.setOneTouchExpandable(true);

    // スプリットペインをコンテンツペイン内に追加。
    c.add(sp2,BorderLayout.CENTER);
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレームの作成。
    s136 f = new s136("画面分割のフレーム");

    // フレームの大きさを設定。
    f.setSize(800,600);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレーム表示。
    f.setVisible(true);
  }
}
