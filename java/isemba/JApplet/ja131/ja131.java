//  -*- mode: java -*-  Time-stamp: <08/06/20(金) 18:02:01 hata>
/*================================================================
 * プログラム名: ja131.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja131.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja131.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（ポップアップメニュー、イベント処理）
//
//　●操作
//　　アプレット内で右ボタンをクリック(ポップアップトリガーという)したとき、
//　　その位置にポップアップメニューを表示する。
//
//　●イベント処理
//　　イベントソース：マウス操作
//　　イベント　　　：MouseEventクラス
//　　イベントリスナ：MouseListenerインターフェース
//　　　　　　　　　　mousePressed, mouseReleased, mouseClicked, mouseEntered,
//　　　　　　　　　  mouseExited メソッド
//                    ActionListenerインターフェース
//                    actionPerformedメソッド
//
//　●JPopupMeuuクラス
//    ポップアップメニューを利用するとき、JPopupMenuクラスを使う。
//
//　●JPopupMenuのコンストラクタ
//　　public JPopupmenu(String s)
//      機能：タイトルsのポップアップメニューを作成する。
//
//　●JPopupMenuクラスのメソッド
//　　public void show(Component c, int x, int y)
//      機能：部品cの位置(x,y)にポップアップメニューを表示する。
//
//　●MouseEventクラスのメソッド
//　　public boolean isPopupTrigger()
//      機能：イベントがポップアップトリガーならtrue、他の場合false。
//
//　●java.awt.event.ComponentEventクラスから継承したメソッド 
//　　public Component getComponent()
//      機能：イベントソースを取得する。
// 
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import java.net.URL;

public class ja131 extends JApplet implements ActionListener, MouseListener {
  /**
	 *  @author kahata
	 */
  private static final long serialVersionUID = 1L;
  Container c;
  JPopupMenu pm;
  JMenuItem jmi1,jmi2,jmi3;
//  JPanel pane;
//  private boolean inAnApplet = true;

  //Hack to avoid ugly message about system event access check.
    public ja131() {
        this(true);
    }

    public ja131(boolean inAnApplet) {
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }


  public void init() {
    // アプレットのコンテントペインを取得。
    c = this.getContentPane();

    // ポップアップメニューpmの作成。
    pm = new JPopupMenu();
    
    // メニュー項目jmi1,jmi2,jmi3の作成。
    jmi1 = new JMenuItem("赤"); 
    jmi2 = new JMenuItem("黄"); 
    jmi3 = new JMenuItem("青"); 
    // メニュー項目jmi1,jmi2,jmi3をポップアップメニューpm内に追加。
    pm.add(jmi1);  
    pm.add(jmi2);  
    pm.add(jmi3);  

    // イベントリスナの登録。
    jmi1.addActionListener(this);
    jmi2.addActionListener(this);
    jmi3.addActionListener(this);
    this.addMouseListener(this);
//    Add Components to a JPanel, using the default FlowLayout. 
//     pane.setLayout(new GridLayout(2,1));
//    super.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
  }

  // ActionListenerインターフェースのメソッド(メニューのイベント処理)。
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == jmi1 ) { c.setBackground(Color.red); }
    if( e.getSource() == jmi2 ) { c.setBackground(Color.yellow); }
    if( e.getSource() == jmi3 ) { c.setBackground(Color.blue); }
  }

  // MouseListenerインターフェースのメソッド(マウスのイベント処理)。
  public void mouseReleased(MouseEvent e) {
    if(e.isPopupTrigger()) {
      pm.show(e.getComponent(), e.getX(), e.getY());
    } 
  }
  public void mousePressed(MouseEvent e) { }
  public void mouseClicked(MouseEvent e) { }
  public void mouseEntered(MouseEvent e) { }
  public void mouseExited(MouseEvent e) { }

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
        Frame frame = new Frame("Application: ja131");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        ja131 applet = new ja131(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(300, 200);
        frame.setVisible(true);
        applet.start();
    }
}
