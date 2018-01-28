// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j343d.java 
 * created : Time-stamp: <09/06/30(火) 20:56:00 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run: JavaAppletApplication
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j343d.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j343d.java >>
//
//  アプレット（４）：イベント処理（マウス操作、MouseAdapterクラス、外部クラス）
//
//　●操作
//　　マウスボタンをクリックすると、その位置に"Mouse Clicked"と位置座標を
//　　表示する。
//
//　●イベント処理
//　　イベントソース： マウス
//　　イベントクラス： MouseEventクラス
//　　イベントリスナ： MouseAdapterクラスを拡張したクラス
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 

public class j343d extends Applet {

  String s = "";
  int Mx = 0, My = 0; // マウスの最初の位置。

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // イベントリスナを定義。
    EventListener343d el = new EventListener343d(this);

    // イベントリスナの登録。
    this.addMouseListener(el);

  }

  public void paint(Graphics g) {
    // マウスのイベント操作と位置の表示。
    g.drawString(s,Mx,My);
    String pos = "(" + Mx + "," + My + ")";
    g.drawString(pos,Mx,My+12);
  }

}

class EventListener343d extends MouseAdapter {

  j343d obj;

  public EventListener343d(j343d obj) { // コンストラクタ。*/
    this.obj = obj;
  }

  // MouseAdapterクラスのメソッド。
  // mouseClickedメソッドの定義。
  public void mouseClicked(MouseEvent e) {
    obj.Mx = e.getX(); // クリックした点のx座標を取得する。 
    obj.My = e.getY(); // クリックした点のy座標を取得する。
    obj.s = "Mouse Clicked"; 
    obj.repaint(); // 再描画。
  }

}
/*
</pre>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j343d.class" width="300" height="100">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j343d.class" width="300" height="100">
</applet>

</body>
</html>
*/
