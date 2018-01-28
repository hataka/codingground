// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j325e.java 
 * created : Time-stamp: <09/06/30(火) 09:00:09 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j325e.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j325e.java >>
//
//  アプレット（２）：レイアウトマネージャー（GridBagLayout、基礎）
//
//　　２個のラベルを配置する。
//
//　　これらのラベルは、指定された位置関係を保存しながら表示される。
//　　部品の表示領域が部品のサイズより大きくなったとき、拡張できる。
//
//　●GridBagConstraintsクラスの変数
//
//　　int fill         部品の表示領域が部品のサイズより大きくなったとき、
//　　　　　　　　　　 どのようにするか指定する。
//                     GridBagConstraints.BOTH        部品を水平・垂直の両方向
//                                                    一杯に拡張する。
//                     GridBagConstraints.HORIZONTAL  部品を水平方向一杯に
//                                                    拡張する。
//                     GridBagConstraints.VERTICAL    部品を垂直方向一杯に
//                                                    拡張する。
//                     GridBagConstraints.NONE        なにもしない。
//　
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*;

public class j325e extends Applet {

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
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gb.setConstraints(lab1,gbc);
    this.add(lab1);

    // ボタン２を(1,1)から(2,2)に配置する。
    gbc.gridx = 1; gbc.gridy = 1;
    gbc.fill = GridBagConstraints.VERTICAL;
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
<applet code="j325e.class" width="160" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j325e.class" width="160" height="160">
</applet>
<br><br>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j325e.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j325e.class" width="300" height="200">
</applet>

</body>
</html>
*/
