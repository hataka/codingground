// -*- mode: java -*- Time-stamp: <2009-06-20 16:40:17 kahata>
/*====================================================================
 * name: j314.java 
 * created : Time-stamp: <09/06/20(土) 15:52:08 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j314.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j314.java >>
//
//  アプレット（１）：グラフィックス（直線)
//  
//　　ｎ×ｎのマス目を描く。
//
//　●Graphicsクラスのメソッド
// 　 public abstract void drawLine(int x0, int y0, int x1, int y1)
//  　  機能：点(x0,y0)と点(x1,y1)の間に直線を引く。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.Graphics;
import java.awt.Color;

public class j314 extends Applet {

  public void init() {

    // アプレットの背景色を白色に設定。
    this.setBackground(Color.white);

  }

  public void paint(Graphics g) {

    // n×nのマス目を描画。
    int x=30,y=30,h=40,n=3;
    for( int i=0; i<=n; i++ ) {
      g.drawLine(x,y+h*i,x+h*n,y+h*i);
      g.drawLine(x+h*i,y,x+h*i,y+h*n);
    }
  }
}
/*
<!-- ＨＴＭＬファイル  -->
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j314.class" width="300" height="200">
</applet>
</body>
</html>
*/
