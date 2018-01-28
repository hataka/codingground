// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j343a.java 
 * created : Time-stamp: <09/06/30(火) 20:49:54 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j343a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j343a.java >>
//
//  アプレット（４）：イベント処理（マウス操作、MouseListenerインターフェース）
//
//　●操作
//　　マウスボタンを押すと、その位置に"Mouse Down"と表示する。
//　　マウスボタンを離すと、その位置に"Mouse Up"と表示する。
//　　マウスボタンをクリックすると、その位置に"Mouse Clicked"と表示する。
//    マウスカーソルがウィンドウ内に入ると、背景色が赤になる。
//    マウスカーソルがウィンドウ外に出ると、背景色が緑になる。
//
//  ●MouseListenerインターフェース
//　　マウス操作に関するインターフェース。
//    ５個のメソッドすべてを定義する必要がある。
//
//   　 mousePressed   : マウスボタンを押すと呼び出される。
//    　mouseReleased  : マウスボタンを離すと呼び出される。
//    　mouseCliced    : マウスボタンをクリックすると呼び出される。
//    　mouseEntered   : ウインドウ内にマウスカーソルが入ると呼び出される。
//    　mouseExited    : ウインドウ外にマウスカーソルが出ると呼び出される。
//
//　●イベント処理
//　　イベントソース： マウス
//　　イベントクラス： MouseEventクラス
//　　イベントリスナ： MouseListenerインターフェース
//                  　 mousePressed,mouseReleased,mouseCliced,mouseEntered,
//                     mouseExitedメソッド
//
//　●Componentクラスのメソッド
//　　public int getX()
//      機能：コンポーネントの現在のx座標を返す。
//　　public int getY()
//      機能：コンポーネントの現在のy座標を返す。
//　　public viod repaint()
//      機能：updateメソッドを呼び出す。
//　　　　　　updateメソッドが実行されると、描画領域が背景色で塗りつぶされ、
//　　　　　　その後、paintメソッドが呼び出され、描画される。したがって、
//　　　　　　前に描画されていた図形は消えることになる。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 

public class j343a extends Applet implements MouseListener {

  String s = "";
  int Mx = 0,My = 0; // マウスの最初の位置。

  public void init() {
    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);
    // イベントリスナの登録。
    this.addMouseListener(this);
  }

  public void paint(Graphics g) {
    // マウスのイベント操作と位置の表示。
    g.drawString(s,Mx,My);
    String pos = "(" + Mx + "," + My + ")";
    g.drawString(pos,Mx,My+12);
  }

  // MouseListenerインターフェースのメソッド。
  public void mousePressed(MouseEvent e) {
    Mx = e.getX(); // MouseEventオブジェクトからマウスの現在位置(x座標)を取得する。
    My = e.getY(); // MouseEventオブジェクトからマウスの現在位置(y座標)を取得する。
    s = "Mouse Down"; // 文字列表示。
    repaint(); // 再描画。
  }

  public void mouseReleased(MouseEvent e) {
    Mx = e.getX(); My = e.getY(); 
    s = "Mouse Up";
    repaint(); // 再描画。
  }

  public void mouseClicked(MouseEvent e) { 
    Mx = e.getX(); My = e.getY(); 
    s = "Mouse Clicked";
    repaint(); // 再描画。
  }

  public void mouseEntered(MouseEvent e) { 
    this.setBackground(Color.red);
  }

  public void mouseExited(MouseEvent e) { 
    this.setBackground(Color.green);
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
<applet code="j343a.class" width="640" height="480">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<!-- applet code="j343a.class" width="640" height="480" -->
<!--/applet -->

</body>
</html>
*/
