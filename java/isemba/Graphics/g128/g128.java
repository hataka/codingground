// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: g128.java 
 * created : Time-stamp: <09/07/02(木) 21:05:49 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/g128.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << g128.java >>
//
//  グラフィックス（２）：曲線（双曲らせん）
//  
//　●定義
//      r = a/t
//　　  x = r*cos(t)
//      y = r*sin(t)
//          a>0
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

// パネルの定義。
class gp128 extends JPanel {

  double a;

  gp128(double a) { // コンストラクタ。 
    this.a = a; 
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);  

    double t,x,xmin,xmax,y,ymin,ymax;

    // 図形の範囲を求める。
    // xmin：x座標最小値、xmax：x座標最大値。
    // ymin：y座標最小値、ymax：y座標最大値。
    xmin = 9999.0; xmax = -9999.0;
    ymin = 9999.0; ymax = -9999.0;
    for( t=1.0; t<=4*Math.PI; t=t+0.01 ) {
      // 点(x,y)の計算。
      double r = a/t;
      x = r*Math.cos(t);
      y = r*Math.sin(t);
      // x,y座標の最小値、最大値の更新。
      if ( x < xmin ) { xmin = x; }
      if ( x > xmax ) { xmax = x; }
      if ( y < ymin ) { ymin = y; }
      if ( y > ymax ) { ymax = y; }
    }

    // フレームの高さと幅を取得。
    int h = this.getHeight();
    int w = this.getWidth();

    // 出力領域(左上隅(gx0,gy0) 幅gw, 高さgh)がフレームに
    // 含まれるように調整する。
    int gx0 = w/10; 
    int gy0 = h/10; 
    int gh = (int)(h*0.9);
    int gw = w;
    while( gx0+gw > w ) { 
      gh = (int)(0.9*gh);
      gw = (int)(gh*(xmax - xmin)/(ymax - ymin));
    }
    // 出力領域の描画。
    g.drawRect(gx0,gy0,gw,gh);

    // 双曲らせん描画。
    g.setColor(Color.blue);
    int gx; // グラフィック座標のx座標。
    int gy; // グラフィック座標のy座標。
    for( t=1.0; t<=4*Math.PI; t=t+0.01 ) {
      // 点(x,y)の計算。
      double r = a/t;
      x = r*Math.cos(t);
      y = r*Math.sin(t);
      // グラフィック座標(gx,gy)に変換。
      gx = gx0 + (int)(gw*(x - xmin)/(xmax - xmin));
      gy = gy0 + gh - (int)(gh*(y - ymin)/(ymax - ymin));
      g.drawLine(gx,gy,gx,gy);
    }

    // パラメータの表示。
    g.drawString("a="+a+" 1.0≦t≦4π",w/15,h/15);
  }
}

// フレームの定義。
class gf128 extends JFrame {
  gf128(String t, double a) { // コンストラクタ。
    super(t);
    // フレームからコンテントペインを取得。
    Container c = this.getContentPane();
    // パネルを生成し、フレームに追加。
    gp128 gp = new gp128(a);
    gp.setBackground(Color.white);
    c.add(gp,BorderLayout.CENTER);
  }
}

class g128 {
  public static void main(String[] args) {
    double a;
    // コマンドラインから入力。
    if( args.length > 0 ) {
      a = Double.parseDouble(args[0]);
    } else {
      a = 1.0; 
    }
    // フレーム生成。
    gf128 gf = new gf128("双曲らせん",a);
    // フレームの大きさを設定
    gf.setSize(300,200);
    gf.setLocationRelativeTo(null);
		// 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレーム表示。
    gf.setVisible(true);
  }
}
/*
</pre>

<font size=5 color=blue>実行手順</font><br>

<pre>
% javac g128.java
% java g128
</pre>

<font size=5 color=blue>実行結果</font>
<br><br>

% java g128<br>
<img src="g128.jpg" width=300 height=200>

</body>
</html>
*/
