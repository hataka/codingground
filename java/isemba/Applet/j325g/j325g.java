// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j325g.java 
 * created : Time-stamp: <09/06/30(火) 07:44:17 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j325g.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j325g.java >>
//
//  アプレット（２）：レイアウトマネージャー（GridBagLayout、基礎）
//
//　　５個のラベルを配置する。
//
//　　これらのラベルは、指定された位置関係を保存しながら表示される。
//    セル内での部品の位置を指定する（中央、東西南北等）。
//
//　○GridBagConstrintsクラスの変数
// 
//　　int anchor       セル内での部品の配置を指定する。
//　　　　　　　　　　 CENTER,NORTH,SOUTH,EAST,WEST,NORTHEAST,NORTHWEST,
//                     SOUTHEAST,SOUTHWESTがある。
//                     デフォルトはCENTER。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*;

public class j325g extends Applet {

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
    Label lab5 = new Label("ラベル５");
    lab5.setBackground(Color.pink); // ラベル５の背景色を桃色に設定。

    // ラベル１を(0,0)から(1,1)に配置する。
    gbc.gridx = 0; gbc.gridy = 0;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.NONE;
    gbc.anchor = GridBagConstraints.NORTH;
    gb.setConstraints(lab1,gbc);
    this.add(lab1);

    // ラベル２を(2,0)から(3,1)に配置する。
    gbc.gridx = 2; gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.SOUTH;
    gb.setConstraints(lab2,gbc);
    this.add(lab2);

    // ラベル３を(1,1)から(2,2)に配置する。
    gbc.gridx = 1; gbc.gridy = 1;
    gbc.anchor = GridBagConstraints.EAST;
    gb.setConstraints(lab3,gbc);
    this.add(lab3);

    // ラベル４を(0,2)から(1,3)に配置する。
    gbc.gridx = 0; gbc.gridy = 2;
    gbc.anchor = GridBagConstraints.WEST;
    gb.setConstraints(lab4,gbc);
    this.add(lab4);

    // ラベル５を(2,2)から(3,3)に配置する。
    gbc.gridx = 2; gbc.gridy = 2;
    gbc.anchor = GridBagConstraints.CENTER;
    gb.setConstraints(lab5,gbc);
    this.add(lab5);

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
<applet code="j325g.class" width="160" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j325g.class" width="160" height="160">
</applet>
<br><br>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j325g.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j325g.class" width="300" height="200">
</applet>

</body>
</html>
*/
