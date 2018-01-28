// -*- mode: java -*- Time-stamp: <2009-06-21 06:14:55 kahata>
/*====================================================================
 * name: g116.java 
 * created : Time-stamp: Time-stamp: <09/06/21(日) 06:08:26 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GRAPHICS/g116.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << g116.java >>
//
//  グラフィックス（１）：基本図形（表札作成）
//  
//　　　楕円などを使って表札を描く。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

// パネルの定義。
class gp116 extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    // フォントと文字列を設定。
    Font f = new Font("Serif", Font.PLAIN, 60);
    String s = "Semba Laboratory";
    // 表札の色。
    g.setColor(Color.white);
    g.fillOval(10,10,580,100); 
    // 表札の縁取り。
    g.setColor(Color.red);
    g.drawOval(10,10,580,100); 
    g.drawOval(9,9,582,102); 
    g.drawOval(8,8,584,104); 
    g.drawOval(8,8,586,106); 
    // 文字列。
    g.setColor(Color.green);
    g.setFont(f);
    g.drawString(s,50,80);
  }
}

// フレームの定義。
class gf116 extends JFrame{
  gf116(String t) { // コンストラクタ。
    super(t);
    // フレームからコンテントペインを取得。
    Container c = this.getContentPane();
    // パネルを生成し、フレームに追加。
    gp116 gp = new gp116();
    gp.setBackground(Color.lightGray);
    c.add(gp,BorderLayout.CENTER);
  }
}

class g116 {
  public static void main(String[] args) {
    // フレーム生成。
    gf116 gf = new gf116("フレーム"); 
    // フレームウィンドウの大きさを設定
    gf.setSize(600,200);
		gf.setLocationRelativeTo(null);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレーム表示。
    gf.setVisible(true);
  }
}
