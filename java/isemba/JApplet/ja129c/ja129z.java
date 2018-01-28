// -*- mode: java -*- Time-stamp: <2009-06-19 13:31:33 kahata>
/*====================================================================
 * name: ja129c.java 
 * created : Time-stamp: <09/06/19(金) 13:29:27 hata>
 * $Id: ja129c.java,v 1.2 2009/06/19 04:31:42 kazuhiko Exp kazuhiko $
 * Programmed by kahata
 * To compile:
 * To run:
 * links: 
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja129c.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << ja129c.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（パネル、文字の色）
//
//　　色の設定や表示には、Colorクラスを使う。
//
//　●Colorクラス
//　　色のデータや操作が定義されているクラス。
//
//　●Colorクラスのコンストラクタ
//    public Color(int r, int g, int b)
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
//    public abstract void setFont(Font font)
//  　  機能：以降に表示するグラフィックスのフォントをfontに設定。
//
/////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 
import javax.swing.event.*;
import java.net.URL;

public class ja129c extends JApplet {
  JPanel pane;

  private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public ja129c() {
        this(true);
    }

    public ja129c(boolean inAnApplet) {
        this.inAnApplet = inAnApplet;
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  	public void init() {
    	// アプレットからコンテンツペインを取得。
    	Container c = this.getContentPane();

    	// コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    	c.setLayout(new BorderLayout(0,0));

    	// パネルの作成。
    	ja129cp p = new ja129cp();
    	p.setBackground(Color.lightGray);
    	p.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
 
    	// パネルをコンテンツペイン内に追加。
    	c.add(p,BorderLayout.CENTER);

	//    内部クラス使用のため取り外す
//    Add Components to a JPanel, using the default FlowLayout. 
//    pane.add(p,BorderLayout.CENTER);
//    pane.setBackground(new Color(255,255,204));
//    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
  }

  // パネルの定義(内部クラス)。
  class ja129cp extends JPanel {
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

    /* One day, JApplet will make this method obsolete. */
    protected URL getURL(String filename) {
        URL codeBase = getCodeBase();
        URL url = null;
        try {
            url = new URL(codeBase, filename);
        } catch (java.net.MalformedURLException e) {
            System.out.println("Couldn't create image: badly specified URL");
            return null;
        }
        return url;
    }

	 protected URL getURL(URL codeBase, String filename) {
        URL url = null;
        try {
            url = new URL(codeBase, filename);
        } catch (java.net.MalformedURLException e) {
            System.out.println("Couldn't create image: badly specified URL");
            return null;
        }
        return url;
   }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Application: ja129c");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ja129c applet = new ja129c(false);
        applet.init();

        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
    	frame.setBounds(100, 100, 640, 480);
        frame.setVisible(true);
    }
}
