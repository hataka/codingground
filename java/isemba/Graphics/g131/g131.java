// -*- mode: java -*- Time-stamp: <2009-07-02 21:19:22 kahata>
/*====================================================================
 * name: g131.java 
 * created : Time-stamp: <09/07/02(木) 21:18:39 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GRAPHICS/g131.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << g131.java >>
//
//  グラフィックス（３）：応用（円上の角速度の異なる２つの動点を結ぶ）
//  
//    円上を異なる角速度(比１：２)で移動する２つの動点を結ぶ直線を求める。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

// パネルの定義。
class gp131 extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);  
    int x0,y0,x1,y1,x2,y2;
    double r,t; // t:角度。
    x0 = 150; y0 = 90; // 円の中心。
    r = y0 * 0.7; // 円の半径。
    g.setColor(Color.red);
    for( t=0; t<=2*Math.PI; t=t+0.1 ) {
      x1 = (int)(r*Math.cos(t)); y1 = (int)(r*Math.sin(t));
      x2 = (int)(r*Math.cos(2*t)); y2 = (int)(r*Math.sin(2*t));
      g.drawLine(x0+x1,y0-y1,x0+x2,y0-y2);
    }
  }
}

// フレームの定義。
class gf131 extends JFrame {
  gf131(String t) { // コンストラクタ。
    super(t);
    // フレームからコンテントペインを取得。
    Container c = this.getContentPane();
    // パネルを生成し、フレームに追加。
    gp131 gp = new gp131();
    gp.setBackground(Color.white);
    c.add(gp,BorderLayout.CENTER);
  }
}

class g131 {
  public static void main(String[] args) {
    // フレーム生成。
    gf131 gf = new gf131("フレーム");
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
% javac g131.java
% java g131
</pre>

<font size=5 color=blue>実行結果</font><br>

<img src="g131.jpg" width=300 height=200>

</body>
</html>
*/
