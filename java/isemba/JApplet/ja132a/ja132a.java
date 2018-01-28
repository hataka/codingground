// -*- mode: java -*- Time-stamp: <2009-06-19 17:19:59 kahata>
/*====================================================================
 * name: ja132a.java 
 * created : Time-stamp: <09/06/19(金) 17:19:26 hata>
 * $Id: ja132a.java,v 1.2 2009/06/19 08:23:30 kazuhiko Exp kazuhiko $
 * Programmed by kahata
 * To compile:
 * To run: ja132.java geshi表示不具合あり→ja132a.javaに名前変更
 * links: http://localhost/wiki/ 
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja132a.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja132a.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（ツールバー、ツールチップ、イベント処理）
//
//　●操作
//　　ツールバー（複数のボタンを含むバー）はアプレットの任意の場所に移動できる。
//　　ツールチップを使うと、カーソルが部品の上に置かれるときだけ、指定された
//　　文字列が表示される。部品の簡明な説明に使われる。
//
//　●イベント処理
//　　イベントソース：マウス操作
//　　イベント　　　：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//                    actionPerformedメソッド
//
//　●JToolBarクラス
//    ツールバーを生成するクラス。
//
//　●JToolBarクラスのコンストラクタ
//　　public JToolBar()
//      機能：ツールバーを生成する。
//　　public JToolBar(String s)
//      機能：タイトルsをもつツールバーを生成する。
//　　public JToolBar(String s, int d)
//      機能：タイトルs、方向dをもつツールバーを生成する。
//            水平方向：SwingConstants.HORIZONTAL  (デフォルト)
//            垂直方向：SwingConstants.VERTICAL
//
//　●JToolBarクラスのメソッド
//　　public void addSeparator()
//      機能：セパレータを終端に追加する。
//
//　●javax.swing.JComponentクラスから継承したメソッド
//　　public void setToolTipText(String s)
//      機能：ツールチップのテキストとして、表示される文字列sを設定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import java.net.URL;

// フレームの定義。
public class ja132a extends JApplet implements ActionListener {
  /**
	 *  @author kahata
	 */
  private static final long serialVersionUID = 1L;
  JToolBar tb;
  JButton b1,b2,b3;
  Container c;
//  JPanel pane;
//  private boolean inAnApplet = true;

  //Hack to avoid ugly message about system event access check.
    public ja132a() {
        this(true);
    }

    public ja132a(boolean inAnApplet) {
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {
    // フレームのコンテントペインを取得。
    c = this.getContentPane();

    // ツールバーtbの作成。
    tb = new JToolBar("ツールバー"); 
    c.add(tb,BorderLayout.NORTH);

    // ボタンb1,b2,b3の作成。
    b1 = new JButton("赤"); 
    b1.setToolTipText("フレームを赤にする");
    b2 = new JButton("黄"); 
    b2.setToolTipText("フレームを黄にする");
    b3 = new JButton("青"); 
    b3.setToolTipText("フレームを青にする");
    // ボタンb1,b2,b3とセパレータをツールバー内に追加。
    tb.add(b1); 
    tb.add(b2);
    tb.addSeparator();
    tb.add(b3); 

    // イベントリスナの登録。
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

//    Add Components to a JPanel, using the default FlowLayout. 
//     pane.setLayout(new GridLayout(2,1));
//    super.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == b1 ) { c.setBackground(Color.red); }
    if( e.getSource() == b2 ) { c.setBackground(Color.yellow); }
    if( e.getSource() == b3 ) { c.setBackground(Color.blue); }
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
        JFrame frame = new JFrame("Application: ja132a");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ja132a applet = new ja132a(false);
        applet.init();

        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
    	frame.setBounds(100, 100, 640,480);
//        frame.setSize(300, 200);
        frame.setVisible(true);
        applet.start();
    }
}
