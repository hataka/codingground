//  -*- mode: java -*-  Time-stamp: <08/06/19(木) 21:51:15 hata>
/*================================================================
 * プログラム名: ja129e.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja129e.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja129e.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（パネル、イベント処理）
//
//　　パネルの背景色をランダムに変化させる。
//
//　●イベント処理
//　　イベントソース：Timerクラス
//　　イベント      ：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
//　●javax.swing.Timerクラス
//    1 つ以上のアクションイベントを、指定された遅延時間の経過後に
//　　イベントリスナに通知する。
//
//　●javax.swing.Timerクラスのコンストラクタ
//    public Timer(int delay,  ActionListener listener)
//　　　機能：delay(ミリ秒単位)ごとにリスナーへ通知するTimer を生成する。
//
//　●javax.swing.Timerクラスのメソッド
//    public void start()
//      機能：Timer を起動し、リスナーへのアクションイベントの送信を開始する。
//    public void stop()
//　　　機能：Timer を停止し、リスナーへのアクションイベントの送信を停止する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.event.*;
import java.net.URL;

public class ja129e extends JApplet implements ActionListener {
  JPanel p;
  Timer timer;
  JPanel pane;

  private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public ja129e() {
        this(true);
    }

    public ja129e(boolean inAnApplet) {
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
    c.setLayout(new BorderLayout(20,20));

    // パネルの作成。
    p = new JPanel();
    p.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
 
    // パネルをコンテンツペイン内に追加。
    c.add(p,BorderLayout.CENTER);

    // タイマーの作成。
    timer = new Timer(2000, this);

//    内部クラス使用のため取り外す
//    Add Components to a JPanel, using the default FlowLayout. 
//    pane.add(p,BorderLayout.CENTER);
//    pane.setBackground(new Color(255,255,204));
//    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    Color color = new Color((int)(Math.random()*256),
                            (int)(Math.random()*256),
                            (int)(Math.random()*256));
    p.setBackground(color);
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
        Frame frame = new Frame("Application: ja129e");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja129e applet = new ja129e(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
