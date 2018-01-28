// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j352c.java 
 * created : Time-stamp: <09/07/01(水) 07:19:30 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j352c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j352c.java >>
//
//  アプレット（５）：スレッド（ディジタル時計、匿名クラス）
//  
//    ディジタル時計を１秒ごとに変える。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.util.Date;

public class j352c extends Applet {

  Thread th;

  // 初期設定処理。
  public void init() {
    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);
  }

  // 開始処理。
  public void start() {
    // スレッドの本体。                                              
    Thread th = new Thread() {                                       
      public void run() {                                            
        while( true ) {                                              
          try {                                                      
            repaint(); // 再描画。
            Thread.sleep(1000); // 1000ミリ秒間スリープする。        
          } catch ( InterruptedException e ) { }                      
        }                                                            
      }                                                              
    };                                                               
    th.start(); // スレッドの開始。
  }

  // 停止処理。
  public void stop() {
    th = null;
  }

  // 時刻の表示。
  public void paint(Graphics g) {
    Date t = new Date();
    g.drawString(t.toString(),40,50);
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
<applet code="j352c.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font>
<br> 

<applet code="j352c.class" width="300" height="100">
</applet>

</body>
</html>
*/
