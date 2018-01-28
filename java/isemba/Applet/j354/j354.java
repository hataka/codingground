// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j354.java 
 * created : Time-stamp: <09/07/01(水) 07:27:04 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j354.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j354.java >>
//
//  アプレット（５）：スレッド（ボタン操作、ディジタル時計、イベント処理）
//
//　●操作
//　　　開始と書かれたボタンをクリックするとディジタル時計が動き、
//　　　停止と書かれたボタンをクリックするとディジタル時計が停止する。
//
//　●スレッドの停止。
//　　スレッドの停止に、Threadクラスのメソッドstop()は、安全でないので使わない
//　　ほうがよい。代わりの方法を示す。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class j354 extends Applet implements ActionListener,Runnable {

  Button b1,b2; 
  Thread th;
  boolean running; // スレッドが動作中はtrue、停止中はfalse。

  // 初期設定処理。
  public void init() {
   // アプレットの背景色を灰色に設定。
   this.setBackground(Color.lightGray);
   // ボタンの作成。
    b1 = new Button("開始");
    b2 = new Button("停止");
    // ボタンをアプレットに追加。
    this.add(b1);
    this.add(b2);
    // イベントリスナの登録。
    b1.addActionListener(this);
    b2.addActionListener(this);
  }

  // 開始処理。
  public void start() {
    // スレッドの作成と開始。
    th = new Thread(this);
    th.start();
    running = true;
  }

  // 停止処理。
  public void stop() {
    th = null;
  }

  // スレッドの本体。
  public void run() {
    while( running ) { // runningがtrueの間、繰り返し実行され、外部からfalseに
                       // 設定されるとループを脱出する。
      try {
        repaint(); // 再描画。
        Thread.sleep(1000); // 1000ミリ秒間スリープする。
      } catch ( InterruptedException e ) { }
    }
    th = null;
  }

  // 時刻の表示。
  public void paint(Graphics g) {
    Date t = new Date();
    g.drawString(t.toString(),40,70);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == b1 ) {
      th = new Thread(this);
      th.start();
      running = true;
    } 
    if( e.getSource() == b2 ) {
      running = false;
    } 
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
<applet code="j354.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j354.class" width="300" height="100">
</applet>

</body>
</html>
*/
