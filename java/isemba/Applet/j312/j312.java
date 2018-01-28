// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j312.java 
 * created : Time-stamp: <09/06/20(土) 15:52:08 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j318b.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j312.java >>
//
//  アプレット（１）：グラフィックス（色）
//  
//　　色の設定には、Colorクラスを使う。
//
//　●Colorクラス
//　　色のデータや操作が定義されているクラス。
//    java.awtパッケージに含まれる。
//
//　○Colorクラスのコンストラクタ
//    Color(int r, int g, int b)
//      機能：色の合成。
//            r：赤の成分の強さ(0-255)
//            g：緑の成分の強さ(0-255)
//            b：青の成分の強さ(0-255)
//
//　　・Colorクラスに用意されている色
//　　　magenta：暗い桃色　　 　black：黒　　white：白     yellow：黄
//　　　darkGray：暗い灰色　　　gray：灰色   cyan：空色　  blue：青　
//　　　lightGray：明るい灰色 　red：赤　　  orange：橙　　green：緑　
//　　　pink：明るい桃色        
//
//　●Graphicsクラスのメソッド
// 　 public abstract void setColor(Color c)
//  　  機能：以降に表示する色cを設定。
//
//  ●Componentクラスのメソッド
//    public void setBackground(Color c)
//      機能：背景色cを設定。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Color; 
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class j312 extends Applet {

  Color red,green,blue;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // 色の定義。
    red   = new Color(255,0,0); // Colorクラスのオブジェクト(red)を定義。
    green = new Color(0,255,0); // Colorクラスのオブジェクト(green)を定義。
    blue  = new Color(0,0,255); // Colorクラスのオブジェクト(blue)を定義。

  }

  public void paint(Graphics g) {

    // 色をred(赤)に設定し描画。
    g.setColor(red); 
    g.drawString("赤　赤　赤",50,50);

    // 色をgreen(緑)に設定し描画。
    g.setColor(green);
    g.drawString("緑　緑　緑",50,100);

    // 色をblue(青)に設定し描画。
    g.setColor(blue);
    g.drawString("青　青　青",50,150);
  }

  public static void main(String[] args) {
	  final Display display = new Display();
	  final Shell shell = new Shell(display);
	  shell.setText("SWT and Swing/AWT Example");
	  shell.setSize(300,200);
	  
	  Composite c = new Composite(shell, SWT.EMBEDDED); 

	  c.setBounds(0,0,300,200);
	    
	  final java.awt.Frame frame = SWT_AWT.new_Frame(c);
	  frame.addWindowListener(new WindowAdapter() {
	  public void windowClosing(WindowEvent e) {
				frame.dispose();
				//System.exit(0);
			}
	  });
	    
	    j312 applet = new j312();
		applet.init();
		frame.add(applet, BorderLayout.CENTER);
		frame.pack();
 		frame.setSize(300,200);
		frame.setVisible(true);
	    
	    shell.open();
	    while (!shell.isDisposed()) {
	      if (!display.readAndDispatch())
	        display.sleep();
	    }
	    display.dispose();
	  }

}
/*
<!-- ＨＴＭＬファイル -->
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j312.class" width="300" height="200">
</applet>
</body>
</html>
*/
