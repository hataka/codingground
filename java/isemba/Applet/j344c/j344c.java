//  -*- mode: java -*-  Time-stamp: <2009-06-16 20:49:36 kahata>
/*================================================================
 * name: j112b.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j112a.htm
 * description:
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j344c.java >>
//
//  アプレット（４）：イベント処理（マウス操作、MouseMotionAdapterクラス、匿名クラス）
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
////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;     

public class j344c extends Applet {

  int Px=0,Py=0; // マウスの直前の位置。
  int Cx,Cy;     // マウスの現在の位置。
 
  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // イベントリスナの作成。
    MouseMotionAdapter ma = new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        Cx = e.getX(); // クリックした点のx座標を取得する。 
        Cy = e.getY(); // クリックした点のy座標を取得する。 
        repaint();
      }
      public void mouseMoved(MouseEvent e) { }
    };

    // イベントリスナの登録。
    this.addMouseMotionListener(ma);

  }

  public void update(Graphics g) {
    if( (Px == 0)&&(Py == 0) ) { Px = Cx; Py = Cy; }
    g.drawLine(Px,Py,Cx,Cy); // 直線の描画。
    Px = Cx; Py = Cy; // 直前の位置を更新。
  }

}
/*
<!-- ＨＴＭＬファイル-->
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j344c.class" width="300" height="200">
</applet>
</body>
</html>
</PRE><FONT color=blue size=5>実行結果</FONT><BR><APPLET height=200 width=300 
code=j344c.class></APPLET> </BODY></HTML>
*/
