// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j345a.java 
 * created : Time-stamp: <09/07/01(水) 06:44:50 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j345a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j345a.java >>
//
//  アプレット（４）：イベント処理（キー操作、KeyListenerインターフェース）
//
//　●操作
//　　押されたキーを文字列として表示する。
//
//　●イベント処理
//　　イベントソース： キー操作
//　　イベントクラス： KeyEventクラス
//　　イベントリスナ： KeyListenerインターフェース
//                  　 keyPressed,keyReleased,keyTypedメソッド
//
//　●KeyListenerインターフェースのメソッド
//    public void keyPressed(KeyEvent e)
//　　　機能：キーが押されたときの処理。
//    public void keyReleased(KeyEvent e)
//　　　機能：キーが離されたときの処理。
//    public void keyTyped(KeyEvent e)
//　　　機能：キーが入力されたときの処理。
//
//  ●KeyEventクラスのメソッド
//　　public char getKeyChar()
//      機能：入力された文字を取得する。
//
//  ●Componentクラスのメソッド
//　　public boolean requestFocusInWindow()
//      機能：フォーカスを要求する。
//　
//　・キー入力を有効にするには、アプレットが操作可能になっている必要がある。
//　　部品（アプレット）を操作可能にすることを、「フォーカスを与える」という。
//　　また、操作可能になっている部品のことを「フォーカスを持っている」という。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 

public class j345a extends Applet implements KeyListener {

  Font f;
  String s = "";

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // フォントの設定。
    f = new Font("Courier", Font.BOLD, 48);

    // イベントリスナの登録。 
    this.addKeyListener(this);
    this.requestFocusInWindow(); // アプレットがキー入力を受理するには
                                 // フォーカスを持っていなければならない。
  }

  public void paint(Graphics g) {
    g.setColor(Color.green);
    g.setFont(f);
    g.drawString(s,50,50);
  }

  // KeyListenerインターフェースのメソッド。
  public void keyTyped(KeyEvent e) {
    s = s + e.getKeyChar();
    repaint(); // 再描画。
  }

  // 残りのメソッドも定義する必要がある。
  public void keyPressed(KeyEvent e) { }
  public void keyReleased(KeyEvent e) { }

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
<applet code="j345a.class" width="300" height="100">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j345a.class" width="300" height="100">
</applet>

</body>
</html>
*/
