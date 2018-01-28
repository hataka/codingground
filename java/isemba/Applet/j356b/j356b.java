// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j356b.java 
 * created : Time-stamp: <09/07/01(水) 07:30:39 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j356b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j356b.java >>
//
//  アプレット（５）：スレッド（変化する直線、ダブルバッファリング）
//  
//    j356a.javaではちらつきが気になる。ちらつきを軽減する手法として、
//　　ダブルバッファリングがある。
//    ちらつきの原因は、画面を更新するときに呼び出されるupdateメソッドで
//　　描画画面を一度クリアしてpaintメソッドを呼び出すことにある。
//　　クリアしてから再描画するまでに時間がかかるのである。
//　　そこで、クリアすることをやめ、代わりに別の画面を用意しそこに描画しておき、
//　　画面にコピーすることでちらつきを軽減する。
//
//　　手順１：Imageクラスのオブジェクトimgを作成する。
//            getGraphicsメソッドでimgを描画できるように設定する。
//　　　　　　( gimg = img.getGraphics() )
//　　手順２：領域全体を背景色で塗りつぶす。
//　　　　　　updateメソッド内で、gimgに描画する。
//　　　　　　drawImageメソッドでgimgを画面にコピーする。
//            ( g.drawImage(img,0,0,this) )
//
//  ●Componentクラスのメソッド
//　　Image createImage(int width, int height)
//      機能：幅width、高さheightのImageオブジェクトを取得する。
//
//  ●Imageクラスのメソッド
//　　Graphics getGraphics()
//      機能：Graphicsオブジェクトを取得する。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.*;
import java.awt.*;

public class j356b extends Applet implements Runnable {

  Dimension d;
  int x0,y0,x1,y1; // 直線の両端の点(x0,y0),(x1,y1)。 
  int dx0,dx1,dy0,dy1; // x,yの増分。
  Thread th;
  Image img;     // <-- 追加。
  Graphics gimg; // <-- 追加。

  // 初期設定処理。
  public void init() {
   // アプレットの背景色を灰色に設定。
   this.setBackground(Color.lightGray);
    d = this.getSize();
    img = createImage(d.width,d.height); // <-- 追加。
    gimg = img.getGraphics();            // <-- 追加。
    x0 = 0; y0 = 0; // 点０の座標(x0,y0)。
    x1 = 0; y1 = 0; // 点１の座標(x1,y1)。
    dx0 = 2; dy0 = 3; // 点０の増分。
    dx1 = 4; dy1 = 5; // 点１の増分。
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

  public void run() {
    while( true ) {
      try {
        repaint();// 再描画。
        Thread.sleep(100);
      } catch( Exception e) { }
      if( (x0 < 0)||(x0 > d.width) ) { dx0 = -dx0; }
      if( (y0 < 0)||(y0 > d.height) ) { dy0 = -dy0; }
      if( (x1 < 0)||(x1 > d.width) ) { dx1 = -dx1; }
      if( (y1 < 0)||(y1 > d.height) ) { dy1 = -dy1; }
    }
  }

  public void update(Graphics g) {
    gimg.setColor(Color.lightGray);      // <-- 追加。
    gimg.fillRect(0,0,d.width,d.height); // <-- 追加。
    gimg.setColor(Color.red);            // <-- 変更。
    x0 = x0 + dx0; y0 = y0 + dy0;
    x1 = x1 + dx1; y1 = y1 + dy1;
    gimg.drawLine(x0,y0,x1,y1); // <-- 変更。
    g.drawImage(img,0,0,this);  // <-- 追加。
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
<applet code="j356b.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font>
<br> 

<applet code="j356b.class" width="300" height="160">
</applet>

</body>
</html>
*/
