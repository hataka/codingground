// -*- mode: java -*- Time-stamp: <2009-06-18 10:07:05 kahata>
/*====================================================================
 * name: g112.java 
 * created : Time-stamp: <09/06/18(木) 07:16:41 hata>
 * $Id$
 * To compile:
 * To run:javac g112.java
 * links: java g112
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GRAPHICS/g112.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
//  << g112.java >>
//
//  グラフィックス（１）：フォント
//
//　Fontクラスのコンストラクタ
//    Font(String name, int style, int size)
//      機能 ：Fontオブジェクトを作成するコンストラクタ
//　　　name ：フォント名（Serif, SansSerif, Monospced, Dialog, DialogInput）
//　　　style：スタイル（Font.PLAIN, Font.BOLD, Font.ITALIC,
//                       Font.BOLD+Font.ITALIC）
//　　　size ：大きさ（ピクセル値）
//
//　Graphicsクラスの主なメソッド
// 　 public void setFont(Font font)
//  　  機能：以降に表示する文字をfontに設定。
//　　　font：設定するフォント。Fontオブジェクトで指定。
//  　　フォント名（Serif, SansSerif, Monospced, Dialog, DialogInput）
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

// パネルの定義。
class gp112 extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Font f1 = new Font("Serif",Font.PLAIN,24);
    Font f2 = new Font("SansSerif",Font.PLAIN,24);
    Font f3 = new Font("Monospaced",Font.PLAIN,24);
    Font f4 = new Font("Dialog",Font.PLAIN,24);
    Font f5 = new Font("DialogInput",Font.PLAIN,24);
    g.setFont(f1); 
    g.drawString("Serif",50,30);
    g.setFont(f2); 
    g.drawString("SansSerif",50,60);
    g.setFont(f3); 
    g.drawString("Monospaced",50,90);
    g.setFont(f4); 
    g.drawString("Dialog",50,120);
    g.setFont(f5); 
    g.drawString("DialogInput",50,150);
  }
}

// フレームの定義。
class gf112 extends JFrame{
  gf112(String t) { // コンストラクタ。
    super(t);
    // フレームからコンテントペインを取得。
    Container c = this.getContentPane();
    // パネルを生成し、フレームに追加。
    gp112 gp = new gp112();
    gp.setBackground(Color.white);
    c.add(gp,BorderLayout.CENTER);
  }
}

public class g112 {
  public static void main(String[] args) {
    // フレーム生成。
    gf112 gf = new gf112("フレーム"); 
    // フレームウィンドウの大きさを設定
    gf.setSize(300,200);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレーム表示。
    gf.setVisible(true);
  }
}
