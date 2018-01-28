// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j311.java 
 * created : Time-stamp: <09/06/30(火) 06:19:28 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j311.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j311.java >>
//
//  アプレット（１）：グラフィックス（文字列）
//
//　　paintメソッドの引数(Graphicsクラスのオブジェクトg)を介して、
//　　色やフォントの設定、描画、塗込み等を行う。
//　　このオブジェクトgをグラフィックスコンテキストと呼び、仮想的な出力先と
//　　考えることができる。
//
//  ●java.awt.Componentクラス
//    Componentクラスは、Appletクラスの親クラスである。継承の機能により、
//    Componentクラスで定義されているpaintメソッドが使える。
//
//  ○Componentクラスのメソッド
//    public void paint(Graphics g)
//      機能：デフォルトで何もしない。描画処理をオーバーライドする。
//            アプレットが起動されると、自動的にGraphicsクラスの
//　　　　　　オブジェクト(g)が作成されpaint()メソッドに渡される。
//　　　　　　このオブジェクトに描画を行う。
//
//　●java.awt.Graphicsクラス
//　　グラフィックス画面への操作(テキストや線の描画、画像の表示、コピーなど)を
//　　行うためのクラスである。それぞれの操作に対応するのメソッドが定義されている。
//
//　○Graphicsクラスのメソッド
//　  public abstract void drawString(String s, int x, int y)
//  　  機能：文字列sを描く。
//　　　      x：x座標（画面左上隅から右方向が正）。
//　　　      y：y座標（画面左上隅から下方向が正）。
//  
//  ●java.awtパッケージ
//    このパッケージには、ボタンやメニューを作成するクラス（Button,MenuBar）、
//　　これらの配置を決めるクラス（FlowLayout,BorderLayout）、色やフォントの
//　　クラス（Color,Font,Graphics）などが含まれる。
//
////////////////////////////////////////////////////////////////////////////////
//<applet code="j311.class" width="300" height="200"></applet>

import java.awt.*;
//import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet; 
import java.awt.Graphics; 
import java.awt.Color; 

public class j311 extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

  }

  public void paint(Graphics g) { 

    // 文字列を描く。
    g.drawString("(30,60)",30,60);
    g.drawString("(200,100)",200,100);
    g.drawString("(100,150)",100,150);
  } 

  public static void main(String[] args) {
		final Frame frame = new Frame("グラフィックス（文字列）");
				//frame.setDefaultCloseOperation(Frame.DISPOSE_ON_CLOSE);
				
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
				//System.exit(0);
			}
		});
				
		j311 applet = new j311();
		applet.init();
		frame.add(applet, BorderLayout.CENTER);
		frame.pack();
 		frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
 		frame.setVisible(true);
	}

}
