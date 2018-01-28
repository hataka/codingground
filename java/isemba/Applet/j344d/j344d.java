// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j344d.java 
 * created : Time-stamp: <09/07/01(水) 06:42:33 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j344d.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j344d.java >>
//
//  アプレット（４）：イベント処理（マウス操作、MouseMotionAdapterクラス、外部クラス）
//
//　●操作
//　　マウスをドラッグして曲線を描く。
//    ・repaintメソッドから呼び出されるupdateメソッドをオーバーライドする。
//　　　すなわち、以前に描画した文字や図形を消去しないようにする。
//
//　●イベント処理
//　　イベントソース： マウス
//　　イベントクラス： MouseEventクラス
//　　イベントリスナ： MouseMotionAdapterクラスを拡張したクラス
//
//  ●MouseMotionAdapterクラス
//　　MouseMotionListenerインターフェースに対応するアダプタクラス。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;     

public class j344d extends Applet {

  int Px=0,Py=0; // マウスの直前の位置。
  int Cx,Cy;     // マウスの現在の位置。
 
  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // イベントリスナの作成。
    EventListener344d el = new EventListener344d(this);

    // イベントリスナの登録。
    this.addMouseMotionListener(el);

  }

  public void update(Graphics g) {
    if( (Px == 0)&&(Py == 0) ) { Px = Cx; Py = Cy; }
    g.drawLine(Px,Py,Cx,Cy); // 直線の描画。
    Px = Cx; Py = Cy; // 直前の位置を更新。
  }

}

class EventListener344d extends MouseMotionAdapter {

  j344d obj;

  EventListener344d(j344d obj) {
    this.obj = obj;
  }
 
  public void mouseDragged(MouseEvent e) {
    obj.Cx = e.getX(); // クリックした点のx座標を取得する。 
    obj.Cy = e.getY(); // クリックした点のy座標を取得する。 
    obj.repaint();
  }

  public void mouseMoved(MouseEvent e) { }

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
<applet code="j344d.class" width="300" height="200">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j344d.class" width="300" height="200">
</applet>

</body>
</html>
*/
