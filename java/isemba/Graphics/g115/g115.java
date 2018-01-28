// -*- mode: java -*- Time-stamp: <2009-06-18 10:07:05 kahata>
/*====================================================================
 * name: g115.java 
 * created : Time-stamp: <09/06/18(木) 07:16:41 hata>
 * $Id$
 * To compile: javac g115.java
 * To run: java g115
 * links: 
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GRAPHICS/g115.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << g115.java >>
//
//  グラフィックス（１）：基本図形（長方形、楕円）
//  
//　　　長方形や楕円を使って、国旗を描く。
//
//　●Graphicsクラスのメソッド
//　　void drawRect(int x, int y, int width, int height)
//   　 機能：長方形を描く。
//　　　x   　：長方形の左上隅のx座標
//　　　y　   ：長方形尾の左上隅のy座標
//　　　width ：長方形の幅。
//　　　height：長方形の高さ。
//
//　  void drawOval(int x, int y, int width, int height)
//  　  機能：楕円を描く。
//　　　x　 　：楕円がぴったり収まる長方形の左上隅を指定するx座標。
//　　　y 　　：楕円がぴったり収まる長方形の左上隅を指定するy座標。
//　　　width ：楕円の幅。
//　　　height：楕円の高さ
//
//　　void fillRect(int x, int y, int width, int height)
//   　 機能：塗りつぶされた四角形を描く。
//　　　x   　：長方形の左上隅のx座標
//　　　y　   ：長方形尾の左上隅のy座標
//　　　width ：長方形の幅。
//　　　height：長方形の高さ。
//
//　  void fillOval(int x, int y, int width, int height)
//  　  機能：塗りつぶされた楕円を描く。
//　　　x　 　：楕円がぴったり収まる長方形の左上隅を指定するx座標。
//　　　y 　　：楕円がぴったり収まる長方形の左上隅を指定するy座標。
//　　　width ：楕円の幅。
//　　　height：楕円の高さ
//
//　　void copyArea(int x,int y,int width,int height,int dx,int dy)
//      機能　：エリアのコピー。
//　　　x   　：複写元の左上隅のx座標
//　　　y　   ：複写元の左上隅のy座標
//　　　width ：複写元の幅。
//　　　height：複写元の高さ。
//　　　dx　　：x座標の移動量。
//　　　dy　　：y座標の移動量。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

// パネルの定義。
class gp115 extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    // 日本の国旗。
    g.setColor(Color.white); g.fillRect(20,20,80,60);
    g.setColor(Color.red);   g.fillOval(40,30,40,40);
    // 日本の国旗のコピー。
    g.copyArea(20,20,80,60,100,0); // 右へ移動。
    g.copyArea(20,20,80,60,0,80); // 下へ移動。
    g.copyArea(20,20,80,60,100,80); // 右斜め下へ移動。
  }
}

// フレームの定義。
class gf115 extends JFrame{
  gf115(String t) { // コンストラクタ。
    super(t);
    // フレームからコンテントペインを取得。
    Container c = this.getContentPane();
    // パネルを生成し、フレームに追加。
    gp115 gp = new gp115();
    gp.setBackground(Color.lightGray);
    c.add(gp,BorderLayout.CENTER);
  }
}

class g115 {
  public static void main(String[] args) {
    // フレーム生成。
    gf115 gf = new gf115("フレーム"); 
    // フレームウィンドウの大きさを設定
    gf.setSize(300,200);
		gf.setLocationRelativeTo(null);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレーム表示。
    gf.setVisible(true);
  }
}
