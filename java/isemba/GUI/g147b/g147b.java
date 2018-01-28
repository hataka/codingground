// -*- mode: java -*- Time-stamp: <2009-06-19 21:23:02 kahata>
/*====================================================================
 * name: g147b.java 
 * created : Time-stamp: <09/06/19(金) 21:20:14 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links:
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GUI/g147b.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << g147b.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（キャンバス）
//
//　　キャンバスを作成し表示する。
//    キャンバス内に文字列を描画する。
//
//　●Graphicsクラス
//    グラフィックスコンテキスト(仮想的な画面。描画の対象に依存しない)を提供する。
//
//　●Graphicsクラスのメソッド
//    public abstract void drawString(String s, int x, int y)
//　　　機能：文字列sを位置(x,y)に描画する。
//            xは垂直下方向、yは水平横方向。
//　
//　●Canvasクラスのメソッド
//    public void paint(Graphics g)
//　　　機能：キャンバスをペイントする。
//            gは、ペイントに使用するグラフィックスコンテキスト
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class g147b extends Canvas {

  // コンストラクタ。
  g147b() {
    // フレームの作成。
    Frame f = new Frame("フレーム");

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent evt) {
            System.exit(0);
            }
    });

    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // キャンバスの大きさを設定。
    this.setSize(100,100);

    // キャンバスの背景色を黄色に設定。
    this.setBackground(Color.yellow);

    // キャンバスをフレーム内に追加。
    f.add(this);

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームを表示。
    f.setVisible(true);

  }

  // paintメソッドをオーバーライド。
  public void paint(Graphics g) {
    g.drawString("こんにちは",20,40);
  }

  public static void main(String[] args) {
    g147b g = new g147b();
  }
}
