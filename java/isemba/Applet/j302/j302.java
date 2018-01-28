// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j302.java
 * created : Time-stamp: <09/06/30(火) 06:12:45 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j302.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j302.java >>
//
//  アプレット（０）：基本動作
//
//  ●Javaコンソール
//　　アプレットの実行時にエラーが発生すると、Javaコンソールにエラーメッセージ
//　　が表示される。また、アプレット中に、System.out.println()メソッドや
//　　System.err.println()メソッドを記述しておくと、Javaコンソールに表示される。
//
//  ●Java2のJavaコンソールの起動
//　　・Internet Explorerの場合
//    　(1)「ツール」をクリック。
//      (2)「SunのJavaコンソール」をクリック。
//　　　タスクバーのJavaアイコンをクリックしてもよい。
////////////////////////////////////////////////////////////////////////////////
// <applet code=j302 width=320 height=240 ></applet>

import java.applet.Applet;
import java.awt.Graphics;

public class j302 extends Applet {

  public void init() {
    System.out.println("init() method");
  }

  public void start() {
    System.out.println("start() method");
  }

  public void stop() {
    System.err.println("stop() method");
  }

  public void destroy() {
    System.err.println("destroy() method");
  }

  public void paint(Graphics g) {
    System.out.println("paint() method");
  }
}
