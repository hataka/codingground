//  -*- mode: java -*-  Time-stamp: <08/06/19(木) 19:48:39 hata>
/*================================================================
 * プログラム名: ja127.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja127.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja127.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（テキストフィールド、配置、イベント処理）
//
//　　テキストフィールドを使ってデータを入力できる。
//　　テキストフィールドを２つ作成する。
//　　前者は固定した幅、後者は入力された文字列に応じて幅を変更する。
//
//　●イベント処理
//　　イベントソース：JTextFieldクラス
//　　イベント      ：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
//  ●JTextFieldクラス
//    ユーザからの入力(文字列)用の欄で、１行分の編集するとき、JTextFieldクラス
//　　を使う。
//
//  ●JTextFieldクラスのコンストラクタ
//    public JTextField(int c)                       
//      機能：c文字分の欄を作成する。
//    public JTextField(String s, int c)                       
//      機能：c文字分の欄を用意し、文字列sを表示する。
//
//  ●JTextComponentクラスのメソッド
//    public String getText()                       
//      機能：テキストコンポーネントの文字列を取得する。
//    public void setText(String s)                       
//      機能：テキストコンポーネントに文字列sを設定する。
//
//  ●java.awt.Containerクラスから継承したメソッド
//    public void validate()                       
//      機能：コンテナが格納している部品が追加または変更されたとき、再配置を行う。
//
//　●クラスの階層関係
//　　javax.swing.txt.JTextComponent --> javax.swing.JTextField
//
//  ●Stringクラスのメソッド
//    String trim()            
//      機能：元の文字列の前後から空白を取り除く。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.event.*;
import java.net.URL;

public class ja127 extends JApplet implements ActionListener {

  Container c;
  JPanel pane;
  JTextField t1,t2; 
  JLabel lab;

   private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public ja127() {
        this(true);
    }

    public ja127(boolean inAnApplet) {
        this.inAnApplet = inAnApplet;
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {
    // アプレットからコンテンツペインを取得。
    c = this.getContentPane();
    pane = new JPanel();

    // コンテンツペインのレイアウトマネージャをFlowLayoutに設定。
    c.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));

    // テキストフィールドの作成。
    t1 = new JTextField("固定幅：Good Morning おはよう",20);
    t2 = new JTextField("可変幅：",20);

    // テキストフィールドをコンテンツペイン内に追加。
    c.add(t1,BorderLayout.NORTH); 
    c.add(t2,BorderLayout.CENTER);

    // ラベルの作成。
    lab = new JLabel("ここに表示する");

    // ラベルをコンテンツペイン内に追加。
    c.add(lab,BorderLayout.SOUTH); 

    // イベントリスナの登録。
    t1.addActionListener(this);
    t2.addActionListener(this);

    //Add Components to a JPanel, using the default FlowLayout. 
    pane.add(t1,BorderLayout.NORTH); 
    pane.add(t2,BorderLayout.CENTER);
    pane.add(lab,BorderLayout.SOUTH); 
    pane.setBackground(new Color(255,255,204));
    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
    setContentPane(pane);
  }

  // ActionListenerインターフェースのメソッド
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == t1 ) { 
      String s1 = t1.getText(); lab.setText(s1); 
    }
    if( e.getSource() == t2 ) {
      String s2 = t2.getText().trim(); 
      int len = s2.length();
      t2.setColumns(len+2); // 2文字余分に確保。
      c.validate();
      lab.setText(s2);
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
        Frame frame = new Frame("Application: ja127");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja127 applet = new ja127(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
