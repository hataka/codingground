// -*- mode: java -*- Time-stamp: <2009-06-18 12:53:26 kahata>
/*====================================================================
 * name: j716a.java 
 * created : Time-stamp: <09/06/18(木) 12:47:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links:
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/NETWORK/j716a.htm
 * description:
 *================================================================*/
//////////////////////////////////////////////////////////////////////
// << j716a.java >>
//
//  ネットワーク（１）：Webページの表示
//
//　　JEditorPaneクラスを使うと、URLで指定するWebページを表示できる。
//
//　●JEditorPaneクラスのコンストラクタ
//    public JEditorPane()
//      機能：エディタペインを作成する。
//
//　●JEditorPaneクラスのメソッド
//    public void setPage(String url) throws IOException
//　　　機能：urlによって指定されたWebページを表示する。
//
//　●javax.swing.text.JTextComponentクラスから継承したメソッド
//    public void setEditable(boolean b)
//      機能：エディタペインが編集可能かどうかを設定する。
//　　　　　　bがtrueの場合、編集可能、falseの場合、編集不可。
//
//　●JScrollPaneクラス
//    部品のスクロール可能なビューを提供する。
//
//　●JScrollPaneのコンストラクタ
//    public JScrollPane(Component comp)
//      機能：部品compを表示するスクロールペインを作成する。
//
//////////////////////////////////////////////////////////////////////

import java.io.*;
import java.awt.*;
import javax.swing.*;

class j716af extends JFrame {

  public j716af(String t) { // コンストラクタ。 
    super(t);

    // コンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout(10,10));

    // エディタペインを作成し、Webページを含ませる。
    JEditorPane ep = new JEditorPane();
    try {
//      ep.setPage("http://www.google.co.jp/");
      ep.setPage("http://localhost/java/isemba/NetWork/j716a/test.html");
      ep.setEditable(false);
    } catch( IOException e ) {
      System.out.println(e);
    }
    // エディタペインを表示するスクロールペインの作成。
    JScrollPane sp = new JScrollPane(ep);

    // エディタペインを表示するスクロールペインをコンテンツペイン内に追加。
    c.add(sp,BorderLayout.CENTER);
  }
}

class j716a {
  public static void main(String[] args) {

    // フレームの作成。
    j716af jf = new j716af("フレーム");

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの大きさ設定。
    jf.setSize(800,600);

    // フレームの表示。
    jf.setVisible(true);
  }
}
