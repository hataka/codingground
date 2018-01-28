//  -*- mode: java -*-  Time-stamp: <08/06/19(木) 13:58:18 hata>
/*================================================================
 * プログラム名: ja124.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja24.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja124.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（チェックボックス、配置、イベント処理）
//
//　　「赤」項目をチェックすると、ラベルの背景色が赤になる。
//　　「黄」項目をチェックすると、ラベルの背景色が黄になる。
//　　「青」項目をチェックすると、ラベルの背景色が青になる。
//　　 複数の項目を選択できる。
//
//　●イベント処理
//　　イベントソース：JCheckBoxクラス
//　　イベント      ：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
//  ●JCheckBoxクラス
//    複数項目の中から複数の選択をするとき、JCheckBoxクラスを使う。
//
//  ●JCheckBoxクラスのコンストラクタ
//    JCheckBox(String s, boolean b)                       
//      機能：文字列sを項目に加える。bがtrueのときチェックされている状態、
//　　　　　　falseのときチェックされていない状態に設定される。
//
//  ●JCheckBoxクラスのメソッド
//    boolean isSelected()                       
//      機能：チェック状態を返す。trueまたはfalse。
//    void setSelected(boolean b)                       
//      機能：チェックボックスをbに設定する。
//
////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
/*
<applet code="ja124.class" width="640" height="480">
</applet>
*/

public class ja124 extends JApplet implements ActionListener {

  Container c;
  JCheckBox c1,c2,c3;
  JLabel lab1,lab2,lab3;

    private boolean inAnApplet = true;
//    private boolean inAnApplet = false;

    //Hack to avoid ugly message about system event access check.
    public ja124() {
        this(true);
    }

    public ja124(boolean inAnApplet) {


        this.inAnApplet = inAnApplet;
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }
  public void init() {
    // アプレットからコンテンツペインを取得。
    c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをGridLayoutに設定。
    c.setLayout(new GridLayout(2,3,10,10));

    // チェックボックスボタンの作成。
    c1 = new JCheckBox("赤");
    c2 = new JCheckBox("青");
    c3 = new JCheckBox("黄");
    // チェックボックスボタンをコンテンツペインに追加。
    c.add(c1);
    c.add(c2);
    c.add(c3);

    // ラベルの作成。
    lab1 = new JLabel("ラベル１");
    lab2 = new JLabel("ラベル２");
    lab3 = new JLabel("ラベル３");
    // ラベルをコンテンツペインに追加。
    c.add(lab1);
    c.add(lab2);
    c.add(lab3);

    // イベントリスナの登録。
    c1.addActionListener(this);
    c2.addActionListener(this);
    c3.addActionListener(this);

    //Add Components to a JPanel, using the default FlowLayout. 
    JPanel pane = new JPanel();
    pane.setLayout(new GridLayout(2,3,10,10));
    pane.add(c1);
    pane.add(c2);
    pane.add(c3);
    pane.add(lab1);
    pane.add(lab2);
    pane.add(lab3);
    pane.setBackground(new Color(255,255,204));
    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));

    setContentPane(pane);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    if( c1.isSelected() ) { 
      lab1.setBackground(Color.red); lab1.setOpaque(true);
    } else {
      lab1.setBackground(Color.lightGray); lab1.setOpaque(true);
    }
    if( c2.isSelected() ) { 
      lab2.setBackground(Color.blue); lab2.setOpaque(true);
    } else {
      lab2.setBackground(Color.lightGray); lab2.setOpaque(true);
    }
    if( c3.isSelected() ) { 
      lab3.setBackground(Color.yellow); lab3.setOpaque(true);
    } else {
      lab3.setBackground(Color.lightGray); lab3.setOpaque(true);
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
        Frame frame = new Frame("Application: ja124");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja124 applet = new ja124(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
