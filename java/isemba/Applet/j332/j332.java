// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j332.java 
 * created : Time-stamp: <09/06/30(火) 20:08:15 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j332.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j332.java >>
//
//  アプレット（３）：アプレットのサイズを取得
//  
//　　アプレットのサイズを取得しサイズに応じて図形を変化させる。
//
//  ●Componentクラスのメソッド
//    public Dimension getSize()
//      機能：部品(アプレットも部品)のサイズをDimensionクラスのオブジェクト
//　　　　　　として取得。
//　　　　　　Dimensionクラスは幅(width)と高さ(height)の２個の変数からなる。
//　　　　　　それぞれ整数の値をもつ。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.Dimension; 

public class j332 extends Applet {

  public void init() {      

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

  }

  public void paint(Graphics g) {
    // アプレットのサイズを取得。
    Dimension d = this.getSize();
    int x = 0;
    int y = d.height/2;
    int size = d.width/10;
    Font f = new Font("Serif",Font.BOLD,size);
    g.setFont(f);
    g.drawString("高さ：" + d.height + "　幅：" + d.width,x,y);
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
<applet code="j332.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j332.class" width="300" height="200">
</applet>
<br><br>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j332.class" width="200" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j332.class" width="200" height="100">
</applet>

</body>
</html>
*/
