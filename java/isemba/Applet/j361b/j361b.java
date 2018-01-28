// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j361b.java 
 * created : Time-stamp: <09/07/01(水) 08:21:15 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j361b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j361b.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（ラベル、配置）
//
//　　短い文字列を表示する。
//
//　●java.awt.Componentクラスのメソッド
//    public void setForeground(Color bg)
//      機能：部品の前景色bgを設定する。
//    public void setBackground(Color bg)
//      機能：部品の背景色bgを設定する。
//
//　●java.awt.Colorクラス
//　　色のデータや操作が定義されているクラス。
//
//　　・Colorクラスに用意されている色
//　　　magenta：暗い桃色　　 　black：黒　　white：白     yellow：黄
//　　　darkGray：暗い灰色　　　gray：灰色   cyan：空色　  blue：青　
//　　　lightGray：明るい灰色 　red：赤　　  orange：橙　　green：緑　
//　　　pink：明るい桃色        
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j361b extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをBorderLayoutに設定。
    this.setLayout(new BorderLayout(10,10));

    // ラベル１の作成。
    Label lab1 = new Label();
    lab1.setText("ラベル１");
    lab1.setForeground(Color.black);
    lab1.setBackground(Color.yellow);

    // ラベル２の作成。
    Label lab2 = new Label("ラベル２");
    lab2.setForeground(Color.red);
    lab2.setBackground(Color.green);

    // ラベル３の作成。
    Label lab3 = new Label();
    lab3.setText("ラベル３");
    lab3.setForeground(Color.blue);
    lab3.setBackground(Color.magenta);

    // ラベルをアプレット内に追加。
    this.add(lab1,BorderLayout.WEST);
    this.add(lab2,BorderLayout.CENTER);
    this.add(lab3,BorderLayout.EAST);

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
<applet code="j361b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j361b.class" width="300" height="100">
</applet>

</body>
</html>
*/
