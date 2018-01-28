//  -*- mode: java -*-  Time-stamp: <08/06/20(金) 16:50:15 hata>
/*================================================================
 * プログラム名: ja130b.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja130b.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja130b.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（メニュー、イベント処理）
//
//　　メニュー項目の「赤」を選択すると、アプレットの背景色が赤になる。
//　　メニュー項目の「緑」を選択すると、アプレットの背景色が緑になる。
//
//　●イベント処理
//　　イベントソース：JMenuItemクラス
//　　イベント      ：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
////////////////////////////////////////////////////////////////////////////////
// <applet codebase = "./" code="ja130b.class" width=800 height=600></applet>

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;

public class ja130b extends JApplet implements ActionListener {
  /**
	 *  @author kahata
	 */
	private static final long serialVersionUID = 1L;
  Container c;
  JMenuItem jm1,jm2;
//  JPanel pane;
//  private boolean inAnApplet = true;

  //Hack to avoid ugly message about system event access check.
    public ja130b() {
        this(true);
    }

    public ja130b(boolean inAnApplet) {
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {

    // コンテンツペインの取得。
    c = this.getContentPane();
//    pane = new JPanel();

    // メニューバーの作成。
    JMenuBar jmb = new JMenuBar();
    // メニューバー(jmb)をアプレット内に追加。 
    this.setJMenuBar(jmb);

    // メニューの作成。
    JMenu jm = new JMenu("背景の色");
    // メニュー(jm)をメニューバー(jmb)内に追加。
    jmb.add(jm); 

    // メニュー項目の作成。
    jm1 = new JMenuItem("赤");
    jm2 = new JMenuItem("緑");
    // メニュー項目(jm1,jm2)をメニュー(jm)内に追加。
    jm.add(jm1);
    jm.add(jm2);

    // イベントリスナの登録。
    jm1.addActionListener(this);
    jm2.addActionListener(this);

//    Add Components to a JPanel, using the default FlowLayout. 
//     pane.setLayout(new GridLayout(2,1));
//    super.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
  }        

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == jm1 ) { c.setBackground(Color.red); }
    if(e.getSource() == jm2 ) { c.setBackground(Color.green); }
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
        Frame frame = new Frame("Application: ja130b");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        ja130b applet = new ja130b(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(300, 200);
        frame.setVisible(true);
        applet.start();
    }
}
