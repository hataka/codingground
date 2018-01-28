//  -*- mode: java -*-  Time-stamp: <08/06/20(金) 07:05:48 hata>
/*================================================================
 * プログラム名: ja129g.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja129g.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja129g.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（パネル、配置）
//
//　　パネルはコンテナでもある。
//　　パネルを組み合わせて複雑なレイアウトを作ることができる。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 
import java.net.URL;

public class ja129g extends JApplet {
  /**
	 *  @author kahata
	 */
	private static final long serialVersionUID = 1L;
    JPanel pane;
//  private boolean inAnApplet = true;

  //Hack to avoid ugly message about system event access check.
    public ja129g() {
        this(true);
    }

    public ja129g(boolean inAnApplet) {
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
    pane = new JPanel();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // ボタンの作成
    JButton b1 = new JButton("１");
    JButton b2 = new JButton("２");
    JButton b3 = new JButton("３");
    JButton b4 = new JButton("４");
    JButton b5 = new JButton("５");
    JButton b6 = new JButton("６");
    JButton b7 = new JButton("７");
 
    // パネルの作成。
    JPanel p1 = new JPanel();
    p1.setLayout(new FlowLayout());
    JPanel p2 = new JPanel();
    p2.setLayout(new GridLayout(2,2));

    // ボタンをパネル内に追加。
    p1.add(b1); p1.add(b2); p1.add(b3);
    p2.add(b4); p2.add(b5); p2.add(b6); p2.add(b7);

    // パネルをコンテンツペイン内に追加。
    c.add(p1,BorderLayout.NORTH);
    c.add(p2,BorderLayout.SOUTH);

//    Add Components to a JPanel, using the default FlowLayout. 
      pane.setLayout(new BorderLayout());
      pane.add(p1,BorderLayout.NORTH);
      pane.add(p2,BorderLayout.SOUTH);
      pane.setBackground(new Color(255,255,204));
      pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
      setContentPane(pane);
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
        Frame frame = new Frame("Application: ja129g");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja129g applet = new ja129g(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
