//  -*- mode: java -*-  Time-stamp: <08/06/20(金) 04:21:57 hata>
/*================================================================
 * プログラム名: ja129f.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja129f.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja129f.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（パネル、イベント処理）
//
//　　文字列を移動する。
//
//　●イベント処理
//　　イベントソース：Timerクラス
//　　イベント      ：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
////////////////////////////////////////////////////////////////////////////////
/* <applet code="ja129f.class" width="640" height="480"></applet> */

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import java.net.URL;

public class ja129f extends JApplet implements ActionListener {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

  j129fp p;
  Timer timer;
  int x,y;
  Dimension d;
  String str="JAVAアプレット";
  Font f;
 JPanel pane;

  //Hack to avoid ugly message about system event access check.
    public ja129f() {
        this(true);
    }

    public ja129f(boolean inAnApplet) {
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
    c.setLayout(new BorderLayout(20,20));

    // パネルの作成。
    p = new j129fp();
    p.setBackground(Color.yellow);
 
    // パネルをコンテンツペイン内に追加。
    c.add(p,BorderLayout.CENTER);

    // タイマーの作成。
    timer = new Timer(500, this);         

    // アプレットの大きさの取得。
    d = this.getSize();
    x = d.width;
    y = d.height/2;

    // 文字のフォント、スタイル、大きさを設定。
    f = new Font("Serif",Font.BOLD,30);

//    内部クラス使用のため取り外す
//    Add Components to a JPanel, using the default FlowLayout. 
//    pane.add(p,BorderLayout.CENTER);
//    pane.setBackground(new Color(255,255,204));
//    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
  }

  // パネルの作成(内部クラス)。
  class j129fp extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public void paintComponent(Graphics g) {
      super.paintComponent(g);    
      x = x - 5;
      if( x < 0 ) { x = d.width; }
      g.setFont(f);
      g.setColor(Color.black);
      g.drawString(str,x,y);
    }
  } 

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    repaint();
  }

  public void start() {
    timer.start();
  }

  public void stop() {
    timer.stop();
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
        Frame frame = new Frame("Application: ja129f");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja129f applet = new ja129f(false);
        applet.init();
//        applet.start();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        applet.start();
    }
}
