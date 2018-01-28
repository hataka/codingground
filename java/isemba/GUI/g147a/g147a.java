// -*- mode: java -*- Time-stamp: <2009-06-19 21:02:38 kahata>
/*====================================================================
 * name: g147a.java 
 * created : Time-stamp: <09/06/19(金) 21:00:14 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: 
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GUI/g147a.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << g147a.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（キャンバス）
//
//　　キャンバスを作成し表示する。
//
//　●Canvasクラス
//    矩形の描画領域を提供する。
//　　・Canvasクラスのクラス階層
//　　　java.lang.Object --> java.awt.Component --> java.awt.Canvas
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class g147a {

  // コンストラクタ。
  g147a() {
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

    // キャンバスの作成。
    Canvas c = new Canvas();

    // キャンバスの大きさを設定。
    c.setSize(100,100);

    // キャンバスの背景色を黄色に設定。
    c.setBackground(Color.yellow);

    // キャンバスをフレーム内に追加。
    f.add(c);

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームを表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g147a g = new g147a();
  }
}
