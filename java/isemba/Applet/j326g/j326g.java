// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j326g.java 
 * created : Time-stamp: <09/06/30(火) 19:56:32 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j326g.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j326g.java >>
//
//  アプレット（２）：レイアウトマネージャー（GridBagLayout、応用）
//
//　　４個のラベルを下図のように配置する。
//
//         －－－－－－－－－－－
//         ｜　　　　｜　　　　｜
//         －　　　　－－－－－－
//         ｜  　　  ｜　  　　｜
//         －　　　　－－－－－－
//         ｜    　　｜    　　｜
//         －－－－－－－－－－－
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*;

public class j326g extends Applet {

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
    lab1.setBackground(Color.green);
    Label lab2 = new Label("ラベル２");
    lab2.setBackground(Color.red);
    Label lab3 = new Label("ラベル３");
    lab3.setBackground(Color.cyan);
    Label lab4 = new Label("ラベル４");
    lab4.setBackground(Color.lightGray);

    // ラベル１の配置。
    gbc.gridx = 0; gbc.gridy = 0;
    gbc.gridwidth = 1; gbc.gridheight = 3;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    gb.setConstraints(lab1,gbc);
    this.add(lab1);

    // ラベル２の配置。
    gbc.gridx = 1;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gb.setConstraints(lab2,gbc);
    this.add(lab2);

    // ラベル３の配置。
    gbc.gridy = GridBagConstraints.RELATIVE;
    gb.setConstraints(lab3,gbc);
    this.add(lab3);

    // ラベル４の配置。
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
<applet code="j326g.class" width="160" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j326g.class" width="160" height="160">
</applet>
<br><br>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j326g.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j326g.class" width="300" height="200">
</applet>

</body>
</html>
*/
