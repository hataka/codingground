// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j361a.java 
 * created : Time-stamp: <09/07/01(水) 07:32:47 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j361a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j361a.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（ラベル、配置）
//
//　　短い文字列を表示する。
//
//　●java.awt.Labelクラス
//　　文字列やイメージを表示するときにLabelクラスを使う。
//
//　○Labelクラスのコンストラクタ
//    public Label() throws HeadlessException
//    　機能：空の文字列を表示する。後で、文字列が設定されると、
//　　　　　　水平方向は左揃え、垂直方向に中央揃えされる。
//    public Label(String s) throws HeadlessException
//    　機能：文字列sを表示する。
//            水平方向は左揃え、垂直方向に中央揃えされる。 
//    public Label(String s, int alignment) throws HeadlessException
//　　　機能：文字列sを、配置alignmentで表示する。
//　　　　　　配置alignment Label.LEFT　  左揃え
//　　　　　　　　　　　　　Label.RIGHT　 右揃え
//　　　　　　　　　　　　　Label.CENTER  中央揃え
//
//　○Labelクラスのメソッド
//    public void setText(String s)
//    　機能：表示する文字列sを設定する。
//    public void setAlignment(int alignment)
//　　　機能：ラベルを配置alignmentに設定する。
//　　　　　　値は、Label.LEFT、Label.RIGHT、Label.CENTER
// 
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j361a extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをBorderLayoutに設定。
    this.setLayout(new BorderLayout(10,10));

    // ラベル１の作成。
    Label lab1 = new Label();
    lab1.setText("ラベル１");

    // ラベル２の作成。
    Label lab2 = new Label("ラベル２",Label.CENTER);

    // ラベル３の作成。
    Label lab3 = new Label();
    lab3.setText("ラベル３");
    lab3.setAlignment(Label.RIGHT);

    // ラベルをアプレットに追加。
    this.add(lab1,BorderLayout.NORTH);
    this.add(lab2,BorderLayout.CENTER);
    this.add(lab3,BorderLayout.SOUTH);

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
<applet code="j361a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j361a.class" width="300" height="100">
</applet>

</body>
</html>
*/
