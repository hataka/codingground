// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j373b.java 
 * created : Time-stamp: <09/07/01(水) 09:46:51 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j373b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j373b.java >>
//
//  Ａｐｐｌｅｔ（６）：ＧＵＩ部品（フレーム、閉じるボタン、イベント処理）
//
//　　「フレーム」というタイトルつきのウィンドウを表示する。
//　　閉じるボタンを機能させるには、WindowListenerインターフェースの
//　　windowClosingメソッドを実装する必要がある。
//
//　●イベント処理
//　　イベントソース： Windowクラス
//　　イベントクラス： WindowEventクラス
//　　イベントリスナ： WindowListenerインターフェース
//                     windowClosingメソッド     
//
//　●WindowListenerインターフェースのメソッド
//    WindowListenerインターフェースには、7個のメソッドがある。
//
//　　(1)windowActivated    ウィンドウがアクティブウィンドウに設定されたとき、
//　　　　　　　　　　　　  呼び出される。
//    (2)windowClosed       ウィンドウが閉じられたとき、呼び出される。
//    (3)windowClosing      閉じるボタンをクリックしたとき、呼び出される。
//　　(4)windowDeactivated  ウィンドウがアクティブウィンドウでなくなったとき、
//　　　　　　　　　　　  　呼び出される。
//    (5)windowIconified    最小化ボタンをクリックして、通常の状態から
//                          最小の状態に変更されたとき呼び出される。
//    (6)windowDeiconified  最小化ボタンをクリックして、最小の状態から
//　　　　　　　　　　　　　通常の状態に変更されたとき呼び出される。
//　　(7)windowOpened       ウィンドウが初めて可視状態になったとき呼び出される。
//
//　●java.awt.Windowクラスのメソッド
//　　public void dispose()
//　　　機能：このウィンドウのリソースが破棄され、それらの消費するメモリが
//　　　　　　OSに返される。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;

public class j373b extends Applet implements WindowListener {

  Frame f;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // フレームの作成。
    f = new Frame("フレーム");

    // フレームの大きさを設定。
    f.setSize(300,200);

    // フレームの表示。
    f.setVisible(true);

    // イベントリスナの登録。
    f.addWindowListener(this);

  }

  // WindowListenerインターフェースを定義する。
  // windowClosingメソッドを定義する。
  public void windowClosing(WindowEvent we) {
    f.dispose();
    System.exit(0); // プログラムを終了させるメソッド。
  }
  // 他のメソッドすべてを空メソッドとして定義する必要がある。
  public void windowActivated(WindowEvent e) { }
  public void windowClosed(WindowEvent e) { }
  public void windowDeactivated(WindowEvent e) { }
  public void windowIconified(WindowEvent e) { }
  public void windowDeiconified(WindowEvent e) { }
  public void windowOpened(WindowEvent e) { }

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
<applet code="j373b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j373b.class" width="300" height="100">
</applet>
<br><br>

<img src="j373b.jpg" width=300 height=200>
<br><br>

閉じるボタンをクリックするとフレームは非表示になる

</body>
</html>
*/
