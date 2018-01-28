// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j374a.java 
 * created : Time-stamp: <09/06/30(火) 10:49:23 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j374a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j374a.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（フレーム、メニュー、配置）
//
//　　フレーム内にメニューを作成し表示する。
//
//　●フレーム、メニューバー、メニュー、メニュー項目の関係
//
//       フレームは、メニューバーを含む。
//       メニューバーは、メニューを含む。
//       メニューは、メニュー項目を含む。
//
//  ●Frameクラスのメソッド
//    public void setMenuBar(MenuBar mb)
//　　　機能：メニューバーmbをフレーム内に設定する。
//
//  ●MenuBarクラス、Menuクラス、MenuItemクラス
//　　フレーム内にメニューバーを追加するのに、MenuBarクラスを使う。
//　　メニューバー内にメニューを追加するのに、Menuクラスを使う。
//　　メニュー内にメニュー項目を追加するのに、MenuItemクラスを使う。
//
//  ○MenuBarクラスのコンストラクタ
//    MenuBar()
//　　　機能：メニューバーを作成する。
//
//  ○MenuBarクラスのメソッド
//　　public Menu add(Menu m)
//      機能：メニューバーにメニューmを追加。
//
//  ○Menuクラスのコンストラクタ
//　　Menu(String s)
//      機能：メニューsを作成する。
//
//  ○Menuクラスのメソッド
//　　public MenuItem add(MenuItem m)
//      機能：メニュー項目mをメニューに追加。
//　　public void add(String s)
//      機能：文字列sをメニューに追加。
//
//  ○MenuItemクラスのコンストラクタ
//　　MenuItem(String s)
//      機能：メニュー項目sを作成する。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
  
public class j374a extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // フレームの作成。
    Frame f = new Frame("フレーム");
    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームの表示。
    f.setVisible(true);

    // メニューバーmbの作成とフレーム内に追加。
    MenuBar mb = new MenuBar();
    f.setMenuBar(mb);

    // メニューmの作成とメニューバー内に追加。。
    Menu m = new Menu("メニュー");
    mb.add(m);

    // メニュー項目の作成とメニュー内に追加。
    MenuItem mi1 = new MenuItem("赤");
    MenuItem mi2 = new MenuItem("黄");
    MenuItem mi3 = new MenuItem("青");
    m.add(mi1);
    m.add(mi2);
    m.add(mi3);

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
<applet code="j374a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j374a.class" width="300" height="100">
</applet>
<br><br>

<img src="j374a.jpg" width=300 height=200>

</body>
</html>
*/
