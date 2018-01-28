//  -*- mode: java -*-  Time-stamp: <08/06/19(木) 21:06:41 hata>
/*================================================================
 * プログラム名: ja129b.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja129b.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja129b.java >>
//
//  ＪＡｐｐｌｅｔ(２)：部品(パネル、フォント)
//
//フォントを変えてパネルに文字を描画する。
//
//●Fontクラスのコンストラクタ
//    public Font(String name, int style, int size)
//      機能 ：Fontオブジェクトを作成する。
//       name ：フォント名(Serif, SansSerif, Monospced, Dialog, 
//                               DialogInput)
//       style：スタイル(Font.PLAIN, Font.BOLD, Font.ITALIC,
//                             Font.BOLD+Font.ITALIC)
//       size ：大きさ(ピクセル値)
//
//●Graphicsクラスのメソッド
//  public void setFont(Font font)
//    機能：以降に表示する文字をfontに設定する。
//      font：設定するフォント。Fontオブジェクトで指定。
//        フォント名(Serif, SansSerif, Monospced, Dialog, DialogInput)
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 
import javax.swing.event.*;
import java.net.URL;

public class ja129b extends JApplet {
  JPanel pane;

  private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public ja129b() {
        this(true);
    }

    public ja129b(boolean inAnApplet) {
        this.inAnApplet = inAnApplet;
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
//    pane = new JPanel();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // パネルの作成。
    ja129bp p = new ja129bp();
    p.setBackground(Color.yellow);
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
  class ja129bp extends JPanel {
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
        Frame frame = new Frame("Application: ja129b");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja129b applet = new ja129b(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
