// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j353a.java 
 * created : Time-stamp: <09/07/01(水) 07:20:50 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j353a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j353a.java >>
//
//  アプレット（５）：スレッド（２個のディジタル時計、内部クラス）
//  
//    １秒ごとに変わるディジタル時計と10秒ごと変わるディジタル時計を
//　　同時に動かす。
//
//  ●Graphicsクラスのメソッド
//　　void clearRect(int x, int y, int w, int h)
//      機能：長方形を背景色で塗りつぶす。(x,y)は左上隅の座標。wは幅、hは高さ。
//　　　　　　長方形の座標　(x,y)------(x+w,y)
//                            |             |
//                          (x,y+h)--(x+w,y+h)
//
//　　・drawString("漢",x,y)の場合、漢の左下隅が(x,y)に対応する。
//　　  したがって、x=0,y=0とすると、漢が表示されなくなる。
//      文字の高さ分だけ、yを増加しておく必要がある。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.util.Date;

public class j353a extends Applet {

  Thread th1,th2;
  int x,y,x1,y1,x2,y2;

  // 初期設定。
  public void init() {
    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);
    x1 = 40; y1 = 30;
    x2 = 40; y2 = 60;
  }

  // 開始処理。
  public void start() {
    th1 = new INj353a1();
    th2 = new INj353a2();
    th1.start();
    th2.start();
  }

  // 停止処理。
  public void stop() {
    th1 = null;
    th2 = null;
  }

  // スレッドの本体。
  class INj353a1 extends Thread {
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

  class INj353a2 extends Thread {
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
<applet code="j353a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font>
<br> 

<applet code="j353a.class" width="300" height="100">
</applet>

</body>
</html>
*/
