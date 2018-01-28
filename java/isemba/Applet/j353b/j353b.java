// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j353b.java 
 * created : Time-stamp: <09/07/01(水) 07:22:06 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j353b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j353b.java >>
//
//  アプレット（５）：スレッド（２個のディジタル時計、JARファイル）
//  
//　　j353a.javaと同じ処理。
//
//　●JARファイル
//　　複数のファイルを圧縮して、ひとつのファイルにしたものをJARファイルという。
//　　アプレットの実行に必要なファイルをJARファイルにしておき、、appletタグで
//　　archive指定をすると、Webサーバからのダウンロードが１回で済み、効率が
//　　よくなる。
//
//　●手順
//　　手順(1) % javac j353b.java
//            3個のファイル j353b.class, j353b$INj353b1.class, 
//            j353b$INj353b2.class が作られる。
//  　手順(2) % jar cf j353b.jar j353b.class j353b$INj353b1.class 
//                               j353b$INj353b2.class
//            JARファイル(j353b.jar)を作る。
//    手順(3) HTMLファイル中にarchiveパラメータを指定する。
//            <applet code="j353b.class"
//                    archive="j353b.jar" width="300" height="100">
//            </applet>
//               
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.util.Date;

public class j353b extends Applet {

  Thread th1,th2;
  int x,y,x1,y1,x2,y2;

  // 初期設定処理。
  public void init() {
    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);
    x1 = 40; y1 = 30;
    x2 = 40; y2 = 60;
  }

  // 開始処理。
  public void start() {
    th1 = new INj353b1();
    th2 = new INj353b2();
    th1.start();
    th2.start();
  }

  // 停止処理。
  public void stop() {
    th1 = null;
    th2 = null;
  }

  // スレッドの本体。
  class INj353b1 extends Thread {
    public void run() {
      while( true ) {
        try {
          x = x1; y = y1;
          repaint(); // 再描画。
          Thread.sleep(1000); // 1000ミリ秒間スリープする。
        } catch ( InterruptedException e ) { }
      }
    }
  }

  class INj353b2 extends Thread {
    public void run() {
      while( true ) {
        try {
          x = x2; y = y2;
          repaint(); // 再描画。
          Thread.sleep(10000); // 10000ミリ秒間スリープする。
        } catch ( InterruptedException e ) { }
      }
    }
  }

  // 時刻の表示。
  public void update(Graphics g) {
    Date t = new Date();
    g.clearRect(x,y-20,300-x,20);
    g.drawString(t.toString(),x,y);
  }

}
/*
</pre>

<pre>
<font size=5 color=blue>ＨＴＭＬファイル</font><br>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j353b.class" archive="j353b.jar" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font>
<br> 

<applet code="j353b.class" archive="j353b.jar" width="300" height="100">
</applet>

</body>
</html>
*/
