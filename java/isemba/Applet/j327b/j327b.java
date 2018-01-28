// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j327b.java 
 * created : Time-stamp: <09/06/30(火) 20:00:57 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j327b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j327b.java >>
//
//　アプレット（２）：レイアウトマネージャー（BorderLayout）
//
//　　BorderLayoutを使うと、部品を東西南北・中央の位置に配置できる。
//
//　　　　North（ウインドウの上部を意味する）
//　　　　South（ウインドウの下部を意味する）
//　　　　West（ウインドウの左部を意味する）
//　　　　East（ウインドウの右部を意味する）
//　　　　Center（ウインドウの中央部を意味する）
//
//　　アプレットの大きさに応じて、アプレットに格納された部品の大きさも変わる。
//
//
//　●BorderLayoutクラス
//    java.awt.BorderLayout
//
//　●BorderLayoutクラスのコンストラクタ
//　　public BorderLayout()
//　　　機能：部品間に間隔を設けず、上、下、左、右、中央に配置する。
//　　public BorderLayout(int h, int v)
//　　　機能：部品を、上、下、左、右、中央に配置する。
//　　　　　　各部品の間隔は均等。
//　　　　　　部品数は最大５個まで。
//            hは部品間の水平間隔、vは部品間の垂直間隔。
//
//　●Containerクラス
//    java.awt.Container
//
//　●Containerクラスのメソッド      
//    public Component add(Component comp, int index)
//      機能：部品compをこのコンテナの指定された位置に追加する。
//            位置 NORTH,SOUTH,WEST,EAST,CENTER
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 

public class j327b extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをBorderLayoutに設定。
    this.setLayout(new BorderLayout(10,10));

    // ボタンの作成。
    Button b1 = new Button("ボタン１");
    Button b2 = new Button("ボタン２");
    Button b3 = new Button("ボタン３");
    Button b4 = new Button("ボタン４");
    Button b5 = new Button("ボタン５");

    // 部品をアプレット内に追加。
    this.add(b1,BorderLayout.NORTH);  // 上に配置。
    this.add(b2,BorderLayout.SOUTH);  // 下に配置。
    this.add(b3,BorderLayout.WEST);   // 左に配置。
    this.add(b4,BorderLayout.EAST);   // 右に配置。
    this.add(b5,BorderLayout.CENTER); // 中央に配置。

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
<applet code="j327b.class" width="200" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j327b.class" width="200" height="200">
</applet>
<br><br>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j327b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j327b.class" width="300" height="100">
</applet>

</body>
</html>
*/
