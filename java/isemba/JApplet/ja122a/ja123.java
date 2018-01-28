//  -*- mode: java -*-  Time-stamp: <08/06/19(木) 14:47:43 hata>
/*================================================================
 * プログラム名: ja123.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja24.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja123.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（コンボボックス、配置、イベント処理）
//
//　　「赤に設定」項目をクリックすると、アプレットの背景色が赤になる。
//　　「緑に設定」項目をクリックすると、アプレットの背景色が緑になる。
//
//　●イベント処理
//　　イベントソース：JComboBoxクラス
//　　イベント      ：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
//　●JComboBoxクラス
//　　複数の項目からひとつ選ぶとき、JComboBoxクラスを使う。
//　　通常は、複数の項目のひとつが表示されているが、コンボボックスをクリック
//　　すると、項目の一覧が表示され任意の項目を選択できる。
//
//  ●JComboBoxクラスのメソッド
//    public void addItem(Object obj)                       
//      機能：項目リストの最後に項目objを加える。
//    public void insertItemAt(Object obj, int p)                       
//      機能：項目リストの指定された位置pに項目objを挿入する。0が先頭。
//    public void removeItem(Object obj)                       
//      機能：項目リストから項目objを削除する。
//    public void removeItemAt(int p)                       
//      機能：項目リストの位置pから項目を削除する。
//    public Object getSelectedItem()
//      機能：現在選択されている項目を返す。
//
////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
/*
<applet code="ja123.class" width="640" height="480">
</applet>
*/

public class ja123 extends JApplet implements ActionListener {

  JComboBox cb;
  Container c;
  JPanel pane;
  
   private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public ja123() {
        this(true);
    }

    public ja123(boolean inAnApplet) {
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
    c.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

    // コンボボックスの作成。
    cb = new JComboBox();
    // 項目をコンボボックス内に追加。
    cb.addItem("赤に設定");
    cb.addItem("緑に設定");

    // コンボボックスをコンテンツペイン内に追加。
    c.add(cb);

    // イベントリスナの登録。
    cb.addActionListener(this);

    //Add Components to a JPanel, using the default FlowLayout. 
    pane.add(cb);
    pane.setBackground(new Color(255,255,204));
    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));

    setContentPane(pane);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    // コンボボックスからイベントが発生した場合、実行される。   
    if( e.getSource() == cb ) {
      String s = (String)cb.getSelectedItem();
//      if( s.equals("赤に設定") ) { c.setBackground(Color.red); }
//      if( s.equals("緑に設定") ) { c.setBackground(Color.green); }
      if( s.equals("赤に設定") ) { pane.setBackground(Color.red); }
      if( s.equals("緑に設定") ) { pane.setBackground(Color.green); }
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
        Frame frame = new Frame("Application: ja123");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja123 applet = new ja123(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
