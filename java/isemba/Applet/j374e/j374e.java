// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j374e.java 
 * created : Time-stamp: <09/07/01(水) 10:09:13 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j374e.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j374e.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（フレーム、チェック付きメニュー、配置）
//
//　　メニュー内にチェック付きメニュー項目を作成する。
//    チェック付き項目をクリックすると、クリックするたびにチェックがついたり
//　　消えたりする。
//
//　●フレーム、メニューバー、メニュー、チェック付きメニュー項目の関係
//
//       フレームは、メニューバーを含む。
//       メニューバーは、メニューを含む。
//       メニューは、チェック付きメニュー項目を含む。
//
//  ●java.awt.CheckboxMenuItemクラス
//　　メニュー内にチェック付きメニュー項目を追加するのに、このクラスを使う。
//
//  ○CheckboxMenuItemクラスのコンストラクタ
//    public CheckboxMenuItem(String s) throws HeadlessException
//　　　機能：文字列sのチェックボックスメニュー項目を作成する。
//　　　　　　項目の初期状態は、チェックなしに設定される。
//    public CheckboxMenuItem(String s, boolean b) throws HeadlessException
//　　　機能：文字列sのチェックボックスメニュー項目を作成する。
//　　　　　　項目の初期状態は、bがtrueでチェックあり、falseでチェックなしに
//　　　　　　設定される。
//
//  ●java.awt.MenuItemクラス
//    public void setEnabled(boolean b)
//　　　機能：bがtrueでメニュー項目が選択可、falseで選択不可にする。
//            選択不可になると、メニュー項目は淡色表示になる。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
  
public class j374e extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // フレームの作成。
    Frame f = new Frame();
    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームの表示。
    f.setVisible(true);

    // メニューバーmbの作成とフレーム内に追加。
    MenuBar mb = new MenuBar();
    f.setMenuBar(mb);

    // メニューmの作成とメニューバー内に追加。
    Menu m = new Menu("メニュー");
    mb.add(m);

    // メニュー項目の作成とメニュー内に追加。
    CheckboxMenuItem mi1 = new CheckboxMenuItem("赤");
    CheckboxMenuItem mi2 = new CheckboxMenuItem("黄");
    mi2.setEnabled(false);
    CheckboxMenuItem mi3 = new CheckboxMenuItem("青",true);
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
<applet code="j374e.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j374e.class" width="300" height="100">
</applet>
<br><br>

<img src="j374e.jpg" width=300 height=200>

</body>
</html>
*/
