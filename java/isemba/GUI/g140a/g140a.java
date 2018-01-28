//  -*- mode: java -*-  Time-stamp: <2009-06-16 18:41:49 kahata>
/*================================================================
 * プログラム名: ja140a.java
 * created: Time-stamp: Time-stamp: <08/06/17(火) 16:58:05 hata>
 * $Id$
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GUI/g140a.htm
 * description:
 *================================================================*/
////////////////////////////////////////////////////////////////////
// << g140a.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（メニューバー、メニュー、メニュー項目）
//
//　　メニューを作成し表示する。
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
//  ●MenuBarクラスのコンストラクタ
//    MenuBar()
//　　　機能：メニューバーを作成する。
//
//  ●MenuBarクラスのメソッド
//　　public Menu add(Menu m)
//      機能：メニューバーにメニューmを追加。
//
//  ●Menuクラスのコンストラクタ
//　　Menu(String s)
//      機能：メニューsを作成する。
//
//  ●Menuクラスのメソッド
//　　public MenuItem add(MenuItem m)
//      機能：メニュー項目mをメニューに追加。
//　　public void add(String s)
//      機能：文字列sをメニューに追加。
//
//  ●MenuItemクラスのコンストラクタ
//　　MenuItem(String s)
//      機能：メニュー項目sを作成する。
//
///////////////////////////////////////////////////////////////////

import java.awt.*;
//import javax.swing.*;
import java.awt.event.*; 
//import javax.swing.event.*;
//import java.net.URL;

class g140a {

  // コンストラクタ。
  g140a() {
    // フレームの作成。
    Frame f = new Frame("g140a: フレーム ＧＵＩ部品（メニューバー、メニュー、メニュー項目）");

    // 追加 これを入れないとWindowが閉じない
    // Time-stamp: <09/06/16(火) 18:43:09 hata>
    f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
     });
 
    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // メニューバーmbの作成。
    MenuBar mb = new MenuBar();

    // メニューバーmbをフレーム内に追加。
    f.setMenuBar(mb);

    // メニューmの作成。
    Menu m = new Menu("メニュー");

    // メニューmをメニューバー内に追加。
    mb.add(m);

    // メニュー項目の作成。
    MenuItem mi1 = new MenuItem("赤");
    MenuItem mi2 = new MenuItem("黄");
    MenuItem mi3 = new MenuItem("青");

    // メニュー項目をメニュー内に追加。
    m.add(mi1);
    m.add(mi2);
    m.add(mi3);

    // フレームの大きさを設定。
    //f.setSize(300,200);
    f.setSize(640,480);
	f.setLocationRelativeTo(null);

	//フレームを表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
	g140a g = new g140a();
  }
}
