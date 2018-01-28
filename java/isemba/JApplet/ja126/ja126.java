//  -*- mode: java -*-  Time-stamp: <08/06/19(木) 16:29:46 hata>
/*================================================================
 * プログラム名: ja126.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja126.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja126.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（リスト、配置、イベント処理）
//
//　　リスト中の複数項目を選択し、ラベルに表示する。
//　　項目をクリックして複数の項目を選択する。
//
//    ・クリックした項目から、Shiftキーを押しながらクリックした項目までが
//　　　連続して選択される。
//　　・Cntlキーを押しながら選択した項目が飛び飛びに選択される。
//
//　●イベント処理
//　　イベントソース：JListクラス
//　　イベント      ：ListSelectionEventクラス
//　　イベントリスナ：ListSelectionListenerインターフェース
//　　　　　　　　　　valueChangedメソッド
//
//　　　　javax.swing.event.ListSelectionEvent
//　　　　javax.swing.event.ListSelectionListener
//
//  ●JListクラス
//    多数の項目から複数の項目を選択するとき、JListクラスを使う。
//　
//  ●JListクラスのコンストラクタ
//    public JList(Object[] item)                       
//      機能：配列itemの要素を表示するリストを作成する。
//
//  ●JListクラスのメソッド
//    public Object[] getSelectedValues()                       
//      機能：選択されている項目をすべて取得する。
//    public void setVisibleRowCount(int r)                       
//      機能：項目がr個以内の場合、スクロールバーは表示されない。r個を越えると、
//　　　　　　スクロールバーが表示される。
//
//  ●JScrollPaneクラス
//    部品をスクロールためのクラスで、部品に含まれる多数のデータを
//　　表示するときに使われる。
//
//  ●JScrollPaneクラスのコンストラクタ
//　  public JScrollPane(Component v)
//      機能：部品vのデータを表示するJScrollPaneを作成する。
//　　　　　　部品のデータが多く、表示領域を超える場合、水平および垂直
//　　　　　　スクロールバーの両方が表示される。
// 
//　●ListSelectionListenerインターフェースのメソッド
//    void valueChanged(ListSelectionEvent e)
//      機能：イベントが発生したとき呼び出される。
//            ListSelectionEventオブジェクトeにイベントの状況が記録されている。
//
////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.event.*;


public class ja126 extends JApplet implements ListSelectionListener {
  Container c;
  JPanel pane;
  JLabel lab;
  JList lt;
 
   private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public ja126() {
        this(true);
    }

    public ja126(boolean inAnApplet) {
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

    // リストの作成。
    String a[] = new String[8];
    a[0] = "項目１"; a[1] = "項目２"; a[2] = "項目３"; a[3] = "項目４";
    a[4] = "項目５"; a[5] = "項目６"; a[6] = "項目７"; a[7] = "項目８";
    lt = new JList(a);  
    lt.setVisibleRowCount(5);                 

    // スクロールペインを作成。
    // リストは自動的にスクロールしないので、リストをスクロールペインに入れる。
    JScrollPane sp = new JScrollPane(lt);

    // ラベルの作成。
    lab = new JLabel("ここに表示される");

    // スクロールペインとラベルをコンテンツペイン内に追加。
    c.add(sp, BorderLayout.NORTH);
    c.add(lab, BorderLayout.CENTER);

    // イベントリスナの登録。
    lt.addListSelectionListener(this);

    //Add Components to a JPanel, using the default FlowLayout. 
    pane.add(sp, BorderLayout.NORTH);
    pane.add(lab, BorderLayout.CENTER);
    pane.setBackground(new Color(255,255,204));
    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
    setContentPane(pane);
  }

  // ListSelectionListenerインターフェースのメソッド
  public void valueChanged(ListSelectionEvent e) {
    Object[] item = lt.getSelectedValues();
    String t = "";
    for( int i=0; i<item.length; i++ ) {
      String s = (String)item[i];
      t = t + "　" + s;
    }
    lab.setText(t);
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
        Frame frame = new Frame("Application: ja126");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja126 applet = new ja126(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
