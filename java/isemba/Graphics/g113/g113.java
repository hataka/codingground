// -*- mode: java -*- Time-stamp: <2009-06-18 10:07:05 kahata>
/*====================================================================
 * name: g113.java 
 * created : Time-stamp: <09/06/18(木) 07:16:41 hata>
 * $Id$
 * To compile: javac g113.java
 * To run: java g113
 * links: 
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GRAPHICS/g113.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << g113.java >>
//
//  グラフィックス（１）：色
//  
//　　　色の設定や表示には、Colorクラスを使う。
//
//　●Colorクラス
//　　色のデータや操作が定義されているクラス。
//    java.awtパッケージに含まれる。
//
//　●Colorクラスのコンストラクタ
//    Color(int r, int g, int b)
//      機能：色の生成。
//      r   ：赤の成分の強さ(0-255)
//      g   ：緑の成分の強さ(0-255)
//      b   ：青の成分の強さ(0-255)
//
//　　・Colorクラスに用意されている色
//　　　magenta：暗い桃色　　 　black：黒　　white：白     yellow：黄
//　　　darkGray：暗い灰色　　　gray：灰色   cyan：空色　  blue：青　
//　　　lightGray：明るい灰色 　red：赤　　  orange：橙　　green：緑　
//　　　pink：明るい桃色        
//
//　●Graphicsクラスのメソッド
// 　 void setColor(Color c)
//  　  機能：以降に表示するグラフィックスの色をcに設定。
//　　　c 　：設定する色。Colorオブジェクトで指定。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

// パネルの定義。
class gp113 extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setFont(new Font("Serif",Font.BOLD,48));
    g.setColor(new Color(255,0,0)); // 色を赤に設定。
    g.drawString("赤",50,50);
    g.setColor(Color.blue); // 色を青に設定。
    g.drawString("青",50,100);
    g.setColor(Color.yellow); // 色を黄に設定。
    g.drawString("黄",50,150);
  }
}

// フレームの定義。
class gf113 extends JFrame{
  gf113(String t) { // コンストラクタ。
    super(t);
    // フレームからコンテントペインを取得。
    Container c = this.getContentPane();
    // パネルを生成し、フレームに追加。
    gp113 gp = new gp113();
    gp.setBackground(Color.white);
    c.add(gp,BorderLayout.CENTER);
  }
}

class g113 {
  public static void main(String[] args) {
    // フレーム生成。
    gf113 gf = new gf113("フレーム"); 
    // フレームウィンドウの大きさを設定
    gf.setSize(300,200);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレーム表示。
    gf.setVisible(true);
  }
}
