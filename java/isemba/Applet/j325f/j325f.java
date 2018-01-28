// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j325f.java 
 * created : Time-stamp: <09/06/30(火) 07:42:41 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j325f.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j325f.java >>
//
//  アプレット（２）：レイアウトマネージャー（GridBagLayout、基礎）
//
//    見栄えを少しよくするために、部品の回りや内部に余白を付ける。
//
//　●Insetsクラス
//　　部品の周りに余白を作るには、Insetsクラスを使う。
//
//　○Insetsクラスのコンストラクタ
//　　public Insets(int top, int left, int bottom, int right)
//      機能：部品の外側の余白を作る。
//            デフォルトは、0,0,0,0。
//
//  ○GridBagLayoutクラスの変数
//　　Insets insets
//      機能：部品の外側の余白を指定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*;

public class j325f extends Applet {

  public void init() {

    // アプレットの背景色を黄色に設定。
    this.setBackground(Color.yellow);

    // アプレットのレイアウトマネージャをGridBagLayoutに設定。
    GridBagLayout gb = new GridBagLayout();
    this.setLayout(gb);

    // GridBagConstraintsオブジェクトの作成。
    GridBagConstraints gbc = new GridBagConstraints();

    // ラベルの作成。
    Label lab1 = new Label("ラベル１");
    lab1.setBackground(Color.green); // ラベル１の背景色を緑に設定。
    Label lab2 = new Label("ラベル２");
    lab2.setBackground(Color.red); // ラベル２の背景色を赤に設定。

    // ラベル１を(0,0)から(1,1)に配置する。
    gbc.gridx = 0; gbc.gridy = 0;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.insets = new Insets(5,5,5,5);
    gb.setConstraints(lab1,gbc);
    this.add(lab1);

    // ボタン２を(1,1)から(2,2)に配置する。
    gbc.gridx = 1; gbc.gridy = 1;
    gb.setConstraints(lab2,gbc);
    this.add(lab2);

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
<applet code="j325f.class" width="160" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j325f.class" width="160" height="160">
</applet>
<br><br>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j325f.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j325f.class" width="300" height="200">
</applet>

</body>
</html>
*/
