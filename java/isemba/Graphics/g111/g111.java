// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: g111.java 
 * created : Time-stamp: <09/06/18(木) 07:16:41 hata>
 * $Id$
 * To compile: javac g111.java
 * To run: java g111
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GRAPHICS/g111.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << g111.java >>
//
//  グラフィックス（１）：文字の描画
//
/////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

// パネルの定義。
class gp111 extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawString("こんにちは",0,10);
    g.drawString("こんにちは",200,100);
    g.drawString("こんにちは",100,150);
  }
}

// フレームの定義。
class gf111 extends JFrame{
  gf111(String t) { // コンストラクタ。
    super(t);    
    // フレームからコンテントペインを取得。
    Container c = this.getContentPane();
    // パネルを生成し、フレームに追加。
    gp111 gp = new gp111();
    gp.setBackground(Color.yellow);
    c.add(gp,BorderLayout.CENTER);
  }
}

class g111 {
  public static void main(String[] args) {
    // フレーム生成。
    gf111 gf = new gf111("フレーム"); 
    // フレームウィンドウの大きさを設定
    gf.setSize(300,200);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレーム表示。
    gf.setVisible(true);
  }
}
