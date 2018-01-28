//  -*- mode: java -*-  Time-stamp: <08/06/20(金) 09:15:38 hata>
/*================================================================
 * プログラム名: ja130a.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja130a.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja130a.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（メニュー、配置）
//
//　　アプレットは、メニューバーを含む。
//　　メニューバーは、メニューを含む。
//　　メニューは、メニュー項目を含む。
//
//  ●JAppletクラスのメソッド
//    public void setJMenuBar(JMenuBar menuBar)
//　　　機能：アプレットのメニューバーを設定する。 
//
//  ●JMenuBarクラス、JMenuクラス、JMenuItemクラス
//　　アプレットにメニューバーを追加するのに、JMenuBarクラスを使う。
//　　メニューバーにメニューを追加するのに、JMenuクラスを使う。
//　　メニューにメニュー項目を追加するのに、JMenuItemクラスを使う。
//
//  ●JMenuBarクラスのコンストラクタ
//    JMenuBar()
//　　　機能：メニューバーを作成する。
//
//  ●JMenuBarクラスのメソッド
//　　JMenu add(JMenu m)
//      機能：メニューバーにメニューmを追加。
//
//  ●JMenuクラスのコンストラクタ
//　　JMenu(String s)
//      機能：メニューsを作成する。
//
//  ●JMenuクラスのメソッド
//　　JMenuItem add(JMenuItem m)
//      機能：メニュー項目mをメニューに追加。
//　　void add(String s)
//      機能：メニュー項目sをメニューに追加。
//
//  ●JMenuItemクラスのコンストラクタ
//　　JMenuItem(String s)
//      機能：メニュー項目sを作成する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
// import javax.swing.*;
import java.net.URL;

public class ja130a extends JApplet {
  /**
     * ＪＡｐｐｌｅｔ（２）：部品（メニュー）
     * 
 	 *  @author kahata
	 *  @version 1.0
	 *  
	 */
	private static final long serialVersionUID = 1L;
    JPanel pane;
//  private boolean inAnApplet = true;

  //Hack to avoid ugly message about system event access check.
    public ja130a() {
        this(true);
    }

    public ja130a(boolean inAnApplet) {
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {
    pane = new JPanel();

    // メニューバーjmbの作成。
    JMenuBar jmb = new JMenuBar();
    // メニューバーjmbをアプレット(this)内に追加。
    this.setJMenuBar(jmb);

    // メニューjmの作成。
    JMenu jm = new JMenu("メニュー");
    // メニューjmをメニューバーjmb内に追加。
    jmb.add(jm);

    // メニュー項目の作成。
    JMenuItem jm1 = new JMenuItem("項目１");
    JMenuItem jm2 = new JMenuItem("項目２");
    JMenuItem jm3 = new JMenuItem("項目３");
    // メニュー項目をメニューjm内に追加。
    jm.add(jm1);
    jm.add(jm2);
    jm.add(jm3);

//    Add Components to a JPanel, using the default FlowLayout. 
//     pane.setLayout(new GridLayout(2,1));
//    super.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
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
        Frame frame = new Frame("Application: ja130a");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        ja130a applet = new ja130a(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(300, 200);
        frame.setVisible(true);
        applet.start();
    }
}
