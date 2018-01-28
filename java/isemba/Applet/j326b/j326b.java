// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j326b.java 
 * created : Time-stamp: <09/06/30(火) 17:42:45 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j326b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j326b.java >>
//
//  アプレット（２）：レイアウトマネージャー（GridBagLayout、応用）
//
//　　５個のボタンを配置する。
//
//　　これらのボタンは、指定された位置関係を保存しながら表示される。
//
//         －－－－－－－－－－
//         ｜    ｜　　　　　｜
//         －　　－－－－－－－
//         ｜    ｜　　｜　　｜
//         －－－－－－－　　－
//         ｜    　　　｜　　｜
//         －－－－－－－－－－
//
//　　ただし、中央のボタン５を作成しない場合、その領域は消滅する。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*;

public class j326b extends Applet {

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
    Label lab3 = new Label("ラベル３");
    lab3.setBackground(Color.cyan); // ラベル３の背景色を水色に設定。
    Label lab4 = new Label("ラベル４");
    lab4.setBackground(Color.lightGray); // ラベル４の背景色を灰色に設定。

    // ラベル１を(0,0)から(1,2)に配置する。
    gbc.gridx = 0; gbc.gridy = 0;
    gbc.gridwidth = 1; gbc.gridheight = 2;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    gb.setConstraints(lab1,gbc);
    this.add(lab1);

    // ラベル２を(1,0)から(3,1)に配置する。
    gbc.gridx = 1; gbc.gridy = 0;
    gbc.gridwidth = 2; gbc.gridheight = 1;
    gb.setConstraints(lab2,gbc);
    this.add(lab2);

    // ラベル３を(2,1)から(3,3)に配置する。
    gbc.gridx = 2; gbc.gridy = 1;
    gbc.gridwidth = 1; gbc.gridheight = 2;
    gb.setConstraints(lab3,gbc);
    this.add(lab3);

    // ラベル４(0,2)から(2,3)に配置する。
    gbc.gridx = 0; gbc.gridy = 2;
    gbc.gridwidth = 2; gbc.gridheight = 1;
    gb.setConstraints(lab4,gbc);
    this.add(lab4);

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
<applet code="j326b.class" width="160" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j326b.class" width="160" height="160">
</applet>
<br><br>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j326b.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j326b.class" width="300" height="200">
</applet>

</body>
</html>
*/
