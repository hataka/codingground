// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j328a.java 
 * created : Time-stamp: <09/06/30(火) 20:02:16 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j328a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j328a.java >>
//
//　　アプレット（２）：レイアウトマネージャー（絶対位置指定）
//
//　　部品を任意の大きさで、任意の位置に配置する。
//　　レイアウトマネージャを使わないことを宣言する。
//
//　　　　setLayout(null)
//
//　●Componentクラスのメソッド
//　　void setBounds(int x, int y, int width, int height)
//　　　機能：部品を配置する。
//            x     ：ｘ座標。
//            y     ：ｙ座標。
//            width ：幅。
//            height：高さ。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*;

public class j328a extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットにレイアウトマネージャの不使用設定。
    this.setLayout(null);

    // ラベルの作成。
    Label lab1 = new Label("ラベル１");
    lab1.setBackground(Color.green);
    Label lab2 = new Label("ラベル２");
    lab2.setBackground(Color.red);
    Label lab3 = new Label("ラベル３");
    lab3.setBackground(Color.cyan);

    // ラベル１の配置。
    lab1.setBounds(20,40,100,20);
    this.add(lab1);

    // ラベル２の配置。
    lab2.setBounds(160,40,100,40);
    this.add(lab2);

    // ラベル３の配置。
    lab3.setBounds(60,100,160,60);
    this.add(lab3);

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
<applet code="j328a.class" width="160" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j328a.class" width="160" height="160">
</applet>
<br><br>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j328a.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j328a.class" width="300" height="200">
</applet>

</body>
</html>
*/
