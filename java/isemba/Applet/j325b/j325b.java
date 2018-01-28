// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j325b.java 
 * created : Time-stamp: <09/06/30(火) 08:56:21 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j325b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j325b.java >>
//
//  アプレット（２）：レイアウトマネージャー（GridBagLayout、基礎）
//
//　　２個のラベルを配置する。
//
//　　ラベルは、指定された位置関係を保存しながら表示される。
//    部品のサイズ（幅、高さ）を変更する。
//
//　○GridBagConstraintsクラスの変数
//
//    public int ipadx   デフォルトは0。
//          部品の最小幅に追加する領域の値を指定する。単位はピクセル。
// 
//    public int ipady   デフォルトは0。
//          部品の最小の高さに追加する領域の値を指定する。単位はピクセル。 
//　
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*;

public class j325b extends Applet {

  public void init() {

    // アプレットの背景色を黄色に設定。
    this.setBackground(Color.yellow);

    // レイアウトマネージャをGridBagLayoutに設定。
    GridBagLayout gb = new GridBagLayout();
    this.setLayout(gb);

    // GridBagConstraintsオブジェクトの作成。
    GridBagConstraints gbc = new GridBagConstraints();

     // ラベルの作成。
    Label lab1 = new Label("ラベル１");
    lab1.setBackground(Color.green);
    Label lab2 = new Label("ラベル２");
    lab2.setBackground(Color.red);

    // ラベル１を(0,0)から(1,1)に配置する。
    gbc.gridx = 0; gbc.gridy = 0;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gbc.ipadx = 20; gbc.ipady = 0;
    gb.setConstraints(lab1,gbc);
    this.add(lab1);

    // ラベル２を(1,1)から(2,2)に配置する。
    gbc.gridx = 1; gbc.gridy = 1;
    gbc.ipadx = 0; gbc.ipady = 20;
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
<applet code="j325b.class" width="160" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j325b.class" width="160" height="160">
</applet>
<br><br>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j325b.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j325b.class" width="300" height="200">
</applet>

</body>
</html>
*/
