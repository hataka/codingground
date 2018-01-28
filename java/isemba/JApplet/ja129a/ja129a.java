//  -*- mode: java -*-  Time-stamp: <08/06/19(木) 20:29:01 hata>
/*================================================================
 * プログラム名: ja129a.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja129a.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja129a.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（パネル、文字の描画）
//
//　　文字や図形の描画は、パネルというコンポーネントに行う。
//　　パネルは、コンテンツペインに追加される。
//　　パネルはコンテナであり、文字や図形を描画できるコンポーネントでもある。
//
//  ●JPanelクラス
//    部品をグループ分けして、各グループごとに異なるレイアウトマネージャーを
//　　指定するとき、JPanelクラスが使われる。
//    ディフォルトレイアウトマネージャーは、FlowLayoutである。
//
//　●JComponentクラスのメソッド
//　　void paintComponent(Graphics g)
//    　機能：このメソッドをオーバーライドして、描画処理を書く。
//            親クラスに対して、super.paintComponent() を実行する必要がある。
//
////////////////////////////////////////////////////////////////////////////////
//<applet code="ja129a.class" width="640" height="480"></applet>
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import java.net.URL;

public class ja129a extends JApplet {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel pane;

  //Hack to avoid ugly message about system event access check.
    public ja129a() {
        this(true);
    }

    public ja129a(boolean inAnApplet) {
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
    ja129ap p = new ja129ap();
    p.setBackground(Color.yellow);
 
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
  class ja129ap extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawString("こんにちは",50,50);
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
//      Frame frame = new Frame("Application: ja129a");
        JFrame frame = new JFrame("Application: ja129a");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
/*
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
*/
        ja129a applet = new ja129a(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
    	frame.setBounds(100, 100, 400,280);
        frame.setVisible(true);
    }
}
