// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j369b.java 
 * created : Time-stamp: <09/07/01(水) 09:25:19 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j369b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j369b.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（パネル、配置）
//
//　　パネルを作成し表示する。パネル内に部品を格納する。
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
//    Panel(LayoutManager lm)
//      機能：指定のレイアウトマネージャーlmを使ってパネル
//　　　　　　（部品を搭載するコンテナ）を作成する。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j369b extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをBorderLayoutに設定。
    this.setLayout(new BorderLayout());

    // パネル(p1)の作成。
    Panel p1 = new Panel();

    // パネル(p1)のレイアウトマネージャをFlowLayoutに設定。
    p1.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

    // ボタンの作成。
    Button b1 = new Button("ボタン１");
    Button b2 = new Button("ボタン２");

    // ボタンをパネル(p1)内に追加。
    p1.add(b1); 
    p1.add(b2);

    // パネル(p2)の作成。
    // パネル(p2)のレイアウトマネージャをGridLayoutに設定。
    Panel p2 = new Panel(new GridLayout());

    // ボタンの作成。
    Button b3 = new Button("ボタン３");
    Button b4 = new Button("ボタン４");

    // ボタンをパネル(p2)内に追加。
    p2.add(b3); 
    p2.add(b4);

    // パネル(p1,p2)をアプレット内に追加。
    this.add(p1,BorderLayout.NORTH);
    this.add(p2,BorderLayout.SOUTH);

    // ボタンをアプレット内に追加。
    this.add(new Button("中央ボタン"),BorderLayout.CENTER);

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
<applet code="j369b.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j369b.class" width="300" height="200">
</applet>

</body>
</html>
*/
