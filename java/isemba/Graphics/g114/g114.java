// -*- mode: java -*- Time-stamp: <2009-06-18 10:07:05 kahata>
/*====================================================================
 * name: g114.java 
 * created : Time-stamp: <09/06/18(木) 07:16:41 hata>
 * $Id$
 * To compile: javac g114.java
 * To run: java g114
 * links: 
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GRAPHICS/g114.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << g114.java >>
//
//  グラフィックス（１）：基本図形（直線）
//  
//　　　直線を使って図形を描く。

//　●Graphicsクラスのメソッド
// 　 void drawLine(int x0, int y0, int x1, int y1)
//  　  機能：点(x0,y0)と(x1,y1)を直線で結ぶ。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

// パネルの定義。
class gp114 extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int x0,y0,x1,y1,rx,ry;
    x0 = 40; y0 = 40; x1 = x0; y1 = y0; rx = 150; ry = 100;
    for( int i=0; i<=31; i++ ) {
      if( i%4 == 0 ) { x1 = x0 + rx; rx = (int)(0.9*rx); }
      if( i%4 == 1 ) { y1 = y0 + ry; ry = (int)(0.9*ry); }
      if( i%4 == 2 ) { x1 = x0 - rx; rx = (int)(0.9*rx); }
      if( i%4 == 3 ) { y1 = y0 - ry; ry = (int)(0.9*ry); }
      g.drawLine(x0,y0,x1,y1);
      x0 = x1; y0 = y1;
    }
  }
}

// フレームの定義。
class gf114 extends JFrame{
  gf114(String t) { // コンストラクタ。
    super(t);
    // フレームからコンテントペインを取得。
    Container c = this.getContentPane();
    // パネルを生成し、フレームに追加。
    gp114 gp = new gp114();
    gp.setBackground(Color.white);
    c.add(gp,BorderLayout.CENTER);
  }
}

public class g114 {
  public static void main(String[] args) {
    // フレーム生成。
    gf114 gf = new gf114("フレーム"); 
    // フレームウィンドウの大きさを設定
    gf.setSize(300,200);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレーム表示。
    gf.setVisible(true);
  }
}
