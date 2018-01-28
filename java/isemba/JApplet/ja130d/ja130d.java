//  -*- mode: java -*-  Time-stamp: <08/06/20(金) 17:19:50 hata>
/*================================================================
 * プログラム名: ja130d.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja130d.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja130d.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（メニューの階層構造、イベント処理）
//
//  　メニューの階層構造とイベント処理を組み合わせる。
//
//　●イベント処理
//　　イベントソース：JMenuItemクラス
//　　イベント      ：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;
import java.net.URL;

public class ja130d extends JApplet implements ActionListener {
  /**
	 *  @author kahata
	 */
  private static final long serialVersionUID = 1L;
  Container c;
  JMenuItem jmi1,jmi2,jmi3;
//  JPanel pane;
//  private boolean inAnApplet = true;

  //Hack to avoid ugly message about system event access check.
    public ja130d() {
        this(true);
    }

    public ja130d(boolean inAnApplet) {
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {

    // アプレットのコンテンツペインを取得。
    c = this.getContentPane();

    // メニューバーjmbの作成。
    JMenuBar jmb = new JMenuBar(); 
    // メニューバーjmbをアプレット内に追加。
    this.setJMenuBar(jmb); 

    // メニューjmの作成。
    JMenu jm = new JMenu("メニュー"); 
    // メニューjmをメニューバーjmb内に追加。
    jmb.add(jm); 

    // メニューjmに含まれるメニューjm0,jm1の作成。
    JMenu jm0 = new JMenu("項目なし"); 
    JMenu jm1 = new JMenu("項目あり"); 
    // メニューjm0をメニューjm内に追加。
    jm.add(jm0); 
    // セパレータをメニューjm内に追加。
    jm.addSeparator(); 
    // メニューjm1をメニューjm内に追加。
    jm.add(jm1); 

    // メニュー項目jmi1,jmi2,jmi3の作成。
    jmi1 = new JMenuItem("赤"); 
    jmi2 = new JMenuItem("黄"); 
    jmi3 = new JMenuItem("青"); 
    // メニュー項目jmi1,jmi2,jmi3をメニューjm1内に追加。
    jm1.add(jmi1);  
    jm1.add(jmi2); 
    jm1.add(jmi3); 

    // イベントリスナの登録。
    jmi1.addActionListener(this);
    jmi2.addActionListener(this);
    jmi3.addActionListener(this);
//    Add Components to a JPanel, using the default FlowLayout. 
//     pane.setLayout(new GridLayout(2,1));
//    super.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == jmi1 ) { c.setBackground(Color.red); }
    if( e.getSource() == jmi2 ) { c.setBackground(Color.yellow); }
    if( e.getSource() == jmi3 ) { c.setBackground(Color.blue); }
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
        Frame frame = new Frame("Application: ja130d");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        ja130d applet = new ja130d(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(300, 200);
        frame.setVisible(true);
        applet.start();
    }
}
