// -*- mode: java -*- Time-stamp: <2009-06-18 10:11:54 kahata>
/*====================================================================
 * name: g112JApplet.java 
 * created : Time-stamp: <09/06/18(木) 07:16:41 hata>
 * $Id$
 * To compile:
 * To run:
 * links: 
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GRAPHICS/g112.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
//  << g112.java >>
//
//  グラフィックス（１）：フォント
//
//　●Fontクラスのコンストラクタ
//    Font(String name, int style, int size)
//      機能 ：Fontオブジェクトを作成するコンストラクタ
//　　　name ：フォント名（Serif, SansSerif, Monospced, Dialog, DialogInput）
//　　　style：スタイル（Font.PLAIN, Font.BOLD, Font.ITALIC,
//                       Font.BOLD+Font.ITALIC）
//　　　size ：大きさ（ピクセル値）
//
//　●Graphicsクラスの主なメソッド
// 　 public void setFont(Font font)
//  　  機能：以降に表示する文字をfontに設定。
//　　　font：設定するフォント。Fontオブジェクトで指定。
//  　　フォント名（Serif, SansSerif, Monospced, Dialog, DialogInput）
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.event.*;
import javax.swing.event.*;
import java.net.URL;

public class g112JApplet extends JApplet {
  JPanel pane;

  private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public g112JApplet() {
        this(true);
    }

    public g112JApplet(boolean inAnApplet) {
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
    g112JAppletp p = new g112JAppletp();
    p.setBackground(Color.yellow);
    p.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));

    // パネルをコンテンツペイン内に追加。
    c.add(p,BorderLayout.CENTER);
  }

  // パネルの定義(内部クラス)。
  class g112JAppletp extends JPanel {
    public void paint(Graphics g) {
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
        Frame frame = new Frame("Application: g112JApplet");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        g112JApplet applet = new g112JApplet(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
 		frame.setSize(300,200);
        frame.setVisible(true);
    }
}
