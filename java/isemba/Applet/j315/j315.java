// -*- mode: java -*- Time-stamp: <2009-06-20 16:55:50 kahata>
/*====================================================================
 * name: j315.java 
 * created : Time-stamp: <09/06/20(土) 15:52:08 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:  JavaAppletApplication
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j315.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j315.java >>
//
//  アプレット（１）：グラフィックス（基本図形）
//  
//　●Graphicsクラスのメソッド
//　  public abstract void drawOval(int x, int y, int width, int height)
//  　  機能：楕円を描く。
//　　　      x　 　：楕円がぴったり収まる四角形の左上隅を指定するx座標。
//　　      　y 　　：楕円がぴったり収まる四角形の左上隅を指定するy座標。
//　　      　width ：楕円の幅。
//　　　      height：楕円の高さ
//
//　  public abstract void fillOval(int x, int y, int width, int height)
//  　  機能：塗りつぶされた楕円を描く。
//          　x　 　：楕円がぴったり収まる四角形の左上隅を指定するx座標。
//　　　      y 　　：楕円がぴったり収まる四角形の左上隅を指定するy座標。
//　　　      width ：楕円の幅。
//　　　      height：楕円の高さ
//
//　　public abstract void drawRect(int x, int y, int width, int height)
//   　 機能：四角形を描く。
//　　　      x   　：四角形の左上隅のx座標
//　      　　y　   ：四角形の左上隅のy座標
//　　　      width ：四角形の幅。
//　　　      height：四角形の高さ。
//
//　　public abstract void fillRect(int x, int y, int width, int height)
//   　 機能：塗りつぶされた四角形を描く。
//　　　      x   　：四角形の左上隅のx座標
//      　　　y　   ：四角形の左上隅のy座標
//　　      　width ：四角形の幅。
//　　　      height：四角形の高さ。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.Graphics; 
import java.awt.Color; 

public class j315 extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray); 

  }

  public void paint(Graphics g) {

    // 円の描画。
    g.setColor(Color.red);
    g.drawOval(30,30,60,60);
    g.fillOval(130,30,60,60);

    // 四角形の描画。
    g.setColor(Color.green);
    g.drawRect(30,100,60,60);
    g.fillRect(130,100,60,60);
  }
}
/*
<!-- ＨＴＭＬファイル -->
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j315.class" width="640" height="480">
</applet>
</body>
</html>
*/
