// -*- mode: java -*- Time-stamp: <2009-06-18 09:47:14 kahata>
/*====================================================================
 * name: g111JApplet.java 
 * created : Time-stamp: <09/06/18(木) 07:16:41 hata>
 * $Id$
 * To compile:
 * To run:
 * links: http://localhost/wiki/ 
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << g111.java >>
//
//  グラフィックス（１）：文字の描画
//
/////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.event.*;
import javax.swing.event.*;
import java.net.URL;

public class g111JApplet extends JApplet {
  JPanel pane;

  private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public g111JApplet() {
        this(true);
    }

    public g111JApplet(boolean inAnApplet) {
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
    g111JAppletp p = new g111JAppletp();
    p.setBackground(Color.yellow);
    p.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));

    // パネルをコンテンツペイン内に追加。
    c.add(p,BorderLayout.CENTER);
  }

  // パネルの定義(内部クラス)。
  class g111JAppletp extends JPanel {
    public void paint(Graphics g) {
    	super.paintComponent(g);
    	g.drawString("こんにちは",0,10);
    	g.drawString("こんにちは",200,100);
    	g.drawString("こんにちは",100,150);
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
        Frame frame = new Frame("Application: g111JApplet");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        g111JApplet applet = new g111JApplet(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
 		frame.setSize(300,200);
        frame.setVisible(true);
    }
}
