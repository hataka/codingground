// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j323b.java 
 * created : Time-stamp: <09/06/30(火) 07:51:30 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j323b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j323b.java >>
//
//　アプレット（２）：レイアウトマネージャー（GridLayout）
//
//　　部品を格子状に配置する。
//　　コンテナのサイズが変わると、部品の大きさも変わるが、どの部品も同じ
//　　大きさになる。
//
//　●GridLayoutクラス
//　　java.awt.GridLayout
//
//　○GridLayoutクラスのコンストラクタ
//　　public GridLayout(int r, int c, int h, int v)
//　　　機能：部品を、格子状に配置する。
//            r：行の数。
//            c：列の数。
//            h：部品間の水平間隔（単位はピクセル）。
//            v：部品間の垂直間隔（単位はピクセル）。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 

public class j323b extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをGridLayoutに設定。
    this.setLayout(new GridLayout(2,3,10,10));

    // ボタンの作成。
    Button b1 = new Button("ボタン１");
    Button b2 = new Button("ボタン２");
    Button b3 = new Button("ボタン３");
    Button b4 = new Button("ボタン４");
    Button b5 = new Button("ボタン５");

    // ボタンをアプレット内に追加。
    this.add(b1);
    this.add(b2);
    this.add(b3);
    this.add(b4);
    this.add(b5);

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
<applet code="j323b.class" width="160" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j323b.class" width="160" height="160">
</applet>
<br><br>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j323b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j323b.class" width="300" height="100">
</applet>

</body>
</html>
*/
