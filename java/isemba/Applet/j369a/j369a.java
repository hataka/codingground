// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j369a.java 
 * created : Time-stamp: <09/07/01(水) 09:24:17 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j369a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j369a.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（パネル、配置）
//
//　　パネルを作成し表示する。
//
//  ●java.awt.Panelクラス
//    部品をグループ分けして、各グループごとに異なるレイアウトマネージャーを
//　　指定するときなどに、Panelクラスを使う。
//    デフォルトのレイアウトマネージャは、FlowLayoutである。 
//
//  ○Panelクラスのコンストラクタ　
//    Panel()
//      機能：デフォルトのレイアウトマネージャーを使ってパネル
//　　　　　　（部品を搭載するコンテナ）を作成する。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j369a extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをBorderLayoutに設定。
    this.setLayout(new BorderLayout(10,10));

    // パネル(p1)の作成。
    Panel p1 = new Panel();
    p1.setBackground(Color.red);

    // パネル(p2)の作成。
    Panel p2 = new Panel();
    p2.setBackground(Color.green);

    // パネル(p3)の作成。
    Panel p3 = new Panel();
    p3.setBackground(Color.yellow);

    // パネル(p1,p2,p3)をアプレット内に追加。
    this.add(p1,BorderLayout.NORTH);
    this.add(p2,BorderLayout.SOUTH);
    this.add(p3,BorderLayout.CENTER);

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
<applet code="j369a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j369a.class" width="300" height="100">
</applet>

</body>
</html>
*/
