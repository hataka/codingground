// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j355.java 
 * created : Time-stamp: <09/07/01(水) 07:28:10 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j355.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j355.java >>
//
//  アプレット（５）：スレッド（文字列の移動）
//
//　　画面上を文字列が移動する。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j355 extends Applet implements Runnable {

  Thread th;
  String s = "<==="; // 移動する文字列。
  Dimension d;
  int x=0,y=0; // 文字列の位置座標。

  // 初期設定処理。
  public void init() { 
    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);
    // アプレットのサイズを取得。
    d = this.getSize();
    x = d.width;
    y = d.height/2;
  }

  // 開始処理。
  public void start() {
    th = new Thread(this); 
    th.start();
  }

  // 停止処理。
  public void stop() {
    th = null; 
  }

  // スレッドの本体。
  public void run() {
    while( true ) {
      try {
        repaint(); // 再描画。
        x = x - 5;
        if( x < 0 ) { x = d.width; }
        Thread.sleep(200); // 200ミリ秒間スリープする。
      } catch ( InterruptedException e ) { }
    }
  }

  // 文字列の表示。
  public void paint(Graphics g) {
    g.setColor(Color.cyan);
    g.setFont(new Font("Serif",Font.BOLD,48));
    g.drawString(s,x,y);
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
<applet code="j355.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j355.class" width="300" height="100">
</applet>

</body>
</html>
*/
