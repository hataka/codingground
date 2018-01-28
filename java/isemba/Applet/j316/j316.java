// -*- mode: java -*- Time-stamp: <2009-06-20 17:10:09 kahata>
/*====================================================================
 * name: j316.java 
 * created : Time-stamp: <09/06/20(土) 15:52:08 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run: JavaAppletApplication
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j316.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j316.java >>
//
//  アプレット（１）：グラフィックス（複写）
//  
//　　市松模様を描く。
//
//　●Graphicsクラスのメソッド
//　　public abstract void copyArea(int x,int y,int w,int h,int dx,int dy)
//      機能：領域の複写。
//　　　      x ：複写元の左上隅のx座標
//　　　      y ：複写元の左上隅のy座標
//　　　      w ：複写元の幅。
//　　      　h ：複写元の高さ。
//　　　      dx：x座標の移動量。
//　　　      dy：y座標の移動量。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.Graphics; 
import java.awt.Color; 

public class j316 extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray); 

  }

  public void paint(Graphics g) {

    // オレンジ領域の複写。
    int x=30, y=30, h=30, n=5;
    g.setColor(Color.orange); g.fillRect(x,y,h,h);
    for( int i=1; i<=n; i++ ) { // 行。
      for( int j=1; j<=n; j++ ) { // 列。
        if( (i+j)%2 == 0 ) {
          // 複写。
          g.copyArea(x,y,h,h,(j-1)*h,(i-1)*h);
        }
      }
    }

    // グリーン領域の複写。
    x=60; y=30; 
    g.setColor(Color.green); g.fillRect(x,y,h,h);
    for( int i=1; i<=n; i++ ) { // 行。
      for( int j=1; j<=n; j++ ) { // 列。
        if( (i+j)%2 == 1 ) {
          // 複写。
          g.copyArea(x,y,h,h,(j-2)*h,(i-1)*h);
        }
      }
    }
  }
}
/*
<!-- ＨＴＭＬファイル -->
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j316.class" width="300" height="200">
</applet>
</body>
</html>
*/
