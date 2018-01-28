// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j325a.java 
 * created : Time-stamp: <09/06/30(火) 08:55:00 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j325a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j325a.java >>
//
//  アプレット（２）：レイアウトマネージャー（GridBagLayout、基礎）
//
//　　２個のラベルを配置する。
//
//　　デフォルトでは、部品は中央に集まるように設定されている。
//　　ウィンドウのサイズを変更しても、ラベルのサイズに変化はなく、指定された
//　　位置関係を保存しながら、ウィンドウの中央に集まる。
//
//　○GridBagConstrintsクラスの変数
//
//    int gridx        部品の位置が左からgridx+1列目であることを指定する。
//　　　　　　　　　　 すなわち、gridx=0が１列目、gridx=1が２列目、・・・。
//
//    int gridy        部品の位置が上からgridy+1行目であることを指定する。
//　　　　　　　　　　 すなわち、gridy=0が１行目、gridy=1が２行目、・・・。
//
//    int gridwidth    部品が使う幅(列数)。デフォルトは１。
//
//    int gridheight   部品が使う高さ(行数)。デフォルトは１。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*;

public class j325a extends Applet {

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
    gb.setConstraints(lab1,gbc);
    this.add(lab1);

    // ラベル２を(1,1)から(2,2)に配置する。
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
<applet code="j325a.class" width="160" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j325a.class" width="160" height="160">
</applet>
<br><br>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j325a.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j325a.class" width="300" height="200">
</applet>

</body>
</html>
*/
