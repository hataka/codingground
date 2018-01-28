//  -*- mode: java -*-  Time-stamp: <08/06/20(金) 08:21:18 hata>
/*================================================================
 * プログラム名: ja129h.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja129h.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja129h.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（パネル、イベント処理、タイマー）
//
//　　タイマーを作成する。
//
//　●イベント処理
//　　イベントソース：Timerクラス
//　　イベント      ：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;

public class ja129h extends JApplet implements ActionListener {
  /**
	 *  @author kahata
	 */
	private static final long serialVersionUID = 1L;

  JButton b1,b2,b3;
  JLabel lab;
  boolean running = false;
  int n = 0;
  Timer timer = new Timer(1000,this);
  JPanel pane;
//  private boolean inAnApplet = true;

  //Hack to avoid ugly message about system event access check.
    public ja129h() {
        this(true);
    }

    public ja129h(boolean inAnApplet) {
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
    pane = new JPanel();
    // コンテンツペインのレイアウトマネージャをGridLayoutに設定。
    c.setLayout(new GridLayout(2,1));

    // ボタンとラベルとパネルの作成。
    b1 = new JButton("起動");
    b2 = new JButton("停止");
    b3 = new JButton("リセット");
    lab = new JLabel();
    JPanel p = new JPanel();
    // ボタンをパネル内に追加。
    p.add(b1);
    p.add(b2);
    p.add(b3);
    // パネルとラベルをコンテンツペイン内に追加。
    c.add(p);
    c.add(lab);

    // イベントリスナの登録。
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

    // 文字のフォント、大きさを設定。
    Font f = new Font("Serif", Font.BOLD, 40); 
    lab.setFont(f);        

//    Add Components to a JPanel, using the default FlowLayout. 
    pane.setLayout(new GridLayout(2,1));
    pane.add(p);
    pane.add(lab);
    pane.setBackground(new Color(255,255,204));
    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
    setContentPane(pane);
  }

  // ActionListenerインターフェースのメソッド。            
  public void actionPerformed(ActionEvent e) {             
    if( running ) {
      n++; lab.setText("タイマー： " + n);   
    }                     
    if( e.getSource() == b1 ) { running = true; }      
    if( e.getSource() == b2 ) { running = false; }        
    if( e.getSource() == b3 ) { 
      n = 0; lab.setText("タイマー： " + n); 
      running = true;
    }        
  }

  public void start() { timer.start(); }

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
        Frame frame = new Frame("Application: ja129h");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        ja129h applet = new ja129h(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(300, 130);
        frame.setVisible(true);
        applet.start();
    }
}
