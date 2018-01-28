// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j331.java 
 * created : Time-stamp: <09/06/30(火) 20:05:23 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j331.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j331.java >>
//
//  アプレット（３）：HTML文書中のパラメータの取得
//  
//　　HTML文書中、<param>タグに記述したパラメータをアプレットに渡すことができる。
//
//  ●<param>タグ
//    <param name=****  value=####>
//      ****は、パラメータ名
//      ####は、パラメータの値。数値または文字列。
//
//  ●Appletクラスのメソッド
//    public String getParameter(String name)
//      機能：nameで指定されたパラメータの値を取得し戻り値とする。
//　　　　　　値がないときはnullを戻す。
//            name :HTML文書中に記述されるパラメータ名
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 

public class j331 extends Applet {

  String s;

  public void init() {      

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    s = this.getParameter("msg");
    if( s == null ) { s = "メッセージがありません"; }

  }

  public void paint(Graphics g) {
    g.drawString(s,20,50);
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
<applet code="j331.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j331.class" width="300" height="100">
</applet>
<br><br>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j331.class" width="300" height="100">
<param name=msg value="HTML文書からのメッセージです">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j331.class" width="300" height="100">
  <param name=msg value="HTML文書からのメッセージです">
</applet>

</body>
</html>
*/
