//  -*- mode: java -*-  Time-stamp: <08/06/19(木) 15:52:17 hata>
/*================================================================
 * プログラム名: ja123.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja24.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja125.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（ラジオボタン、配置、イベント処理）
//
//　　「赤」項目をチェックすると、ラベルに「赤」の文字が表示される。
//　　「青」項目をチェックすると、ラベルに「青」の文字が表示される。
//　　「黄」項目をチェックすると、ラベルに「黄」の文字が表示される。
//　    複数の項目の中から１つだけが選択される。
//
//　●イベント処理
//　　イベントソース：JRadioButtonクラス
//　　イベント      ：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
//　●JRadioButtonクラス、ButtonGroupクラス
//    複数の項目の中でいつも１つだけがonとなるとき、JRadioButtonクラス、
//　　ButtonGroupクラスを使う。
//
//    ・ButtonGroupクラスは、JRadioButtonの動作を制御する。すなわち、いつも
//　　　１つがtrueとなる。表示したときにまとめるにはパネルを使って、パネルに
//　　　追加する必要がある。
//
//  ●ButtonGroupクラスのコンストラクタ
//    public ButtonGroup()                       
//      機能：ボタングループを作成。
//
//  ●ButtonGroupクラスのメソッド
//　  public void add(AbstractButton b)
//　　　機能：ボタングループにボタンを追加する。 
//
//  ●JRadioButtonクラスのコンストラクタ
//    JRadioButton(String s, boolean b)     
//      機能：文字列sのラジオボタンを作り状態をbに設定する。
//
//  ●JPanelクラスのコンストラクタ
//    public JPanel()
//　　　機能：JPanelを作成する。
//
////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class ja125 extends JApplet implements ActionListener {

   Container c;
  JPanel pane;
   ButtonGroup bg;
  JRadioButton r1,r2,r3; 
  JLabel lab;
  JPanel p;

   private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public ja125() {
        this(true);
    }

    public ja125(boolean inAnApplet) {
        this.inAnApplet = inAnApplet;
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {
    // アプレットからコンテンツペインを取得。
    c = this.getContentPane();
    // パネルの作成。
    pane = new JPanel();
    // パネルの作成。
    p = new JPanel();

    // アプレットのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout(10,10));

    // パネルのレイアウトマネージャをFlowLayoutに設定。
    p.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
    p.setBackground(Color.green);

    // ラベルの作成。
    lab = new JLabel("ここに表示される");

    // パネルとラベルをコンテンツペイン内に追加。
    c.add("North",p);
    c.add("Center",lab);

    // ラジオボタンの作成。
    r1 = new JRadioButton("赤",true);
    r2 = new JRadioButton("青",false);
    r3 = new JRadioButton("黄",false);

    // ボタングループの作成。
    bg = new ButtonGroup();
    // ラジオボタンをボタングループに登録。
    bg.add(r1);
    bg.add(r2);
    bg.add(r3);

    // ラジオボタンをパネルに追加。
    p.add(r1);
    p.add(r2);
    p.add(r3);

    // イベントリスナの登録。
    r1.addActionListener(this);
    r2.addActionListener(this);
    r3.addActionListener(this);

    //Add Components to a JPanel, using the default FlowLayout. 
    pane.add("North",p);
    pane.add("Center",lab);
    pane.setBackground(new Color(255,255,204));
    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));

    setContentPane(pane);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == r1 ) { lab.setText("赤");p.setBackground(Color.red); }
    if( e.getSource() == r2 ) { lab.setText("青");p.setBackground(Color.blue); }
    if( e.getSource() == r3 ) { lab.setText("黄");p.setBackground(Color.yellow); }
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
        Frame frame = new Frame("Application: ja125");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja125 applet = new ja125(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
