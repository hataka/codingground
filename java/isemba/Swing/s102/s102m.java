// -*- mode: java -*- Time-stamp: <2009-06-20 09:06:04 kahata>
/*====================================================================
 * name: s102m.java 
 * created : Time-stamp: <09/06/19(金) 13:29:27 hata>
 * $Id: s102m.java,v 1.2 2009/06/19 04:31:42 kazuhiko Exp kazuhiko $
 * Programmed by kahata
 * To compile:
 * To run:
 * links: 
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/s102.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << s102.java >>
//
//  Ｓｗｉｎｇ（０）：フレーム（作成、表示、非表示）
//
//　　トップレベルのウィンドウ(他に含まれないウィンドウ)をフレームという。
//
//  ●javax.swing.JFrameクラス
//    JFrameクラスを使って、フレームは作成される。
//　　フレームは、ウィンドウ周囲の枠、タイトルバー、「最小化」、「最大化」、
//　　「閉じる」ボタンをもつ。
//    「閉じる」ボタンをクリックすると、フレームは非表示になるが、プログラムは
//　　終了していない。プログラムを終了するには、
//      　　f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//　　と書く必要がある。fはJFrameクラスのオブジェクト。
//
//　　・JFrameクラスのクラス階層
//　　　java.lang.Object --> java.awt.Component --> java.awt.Container --> 
//      java.awt.Window --> java.awt.Frame --> javax.swing.JFrame
//
//  ●JFrameクラスのコンストラクタ
//    public JFrame() throws HeadlessException
//      機能：初期状態で不可視の新しいフレームを作成する。
//    public JFrame(String s) throws HeadlessException
//      機能：指定されたタイトルsで、初期状態で不可視の新しいフレームを作成する。
//
//  ●java.awt.Frameクラスから継承したメソッド
//    public void setTitle(String s)  
//      機能：文字列sをタイトルとする。
//
//  ●java.awt.Componentクラスから継承したメソッド  
//    public void setSize(int w, int h)
//      機能：フレームの幅をh、高さをhに変更する。
//    public void setForeground(Color c)
//      機能：部品のフォアグラウンドの色をcに設定。
//    public void setBackground(Color c)
//      機能：部品のバックグラウンドの色をcに設定。
//　　public void setVisible(boolean x)
//      機能：xがtrueの場合表示、xがfalseの場合非表示にする。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 
import javax.swing.event.*;
import java.net.URL;

public class s102m extends JApplet {
  JPanel pane;

  private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public s102m() {
        this(true);
    }

    public s102m(boolean inAnApplet) {
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
    	c.setLayout(new BorderLayout(0,0));
    	c.setBackground(Color.red);

    	// パネルの作成。
    	s102mp p = new s102mp();
    	// パネルの背景色を赤に設定。
//    	p.setBackground(Color.red);
    	p.setBackground(Color.lightGray);
    	p.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
 
    	// パネルをコンテンツペイン内に追加。
    	c.add(p,BorderLayout.CENTER);

	//    内部クラス使用のため取り外す
//    Add Components to a JPanel, using the default FlowLayout. 
//    pane.add(p,BorderLayout.CENTER);
//    pane.setBackground(new Color(255,255,204));
//    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
  }

  // パネルの定義(内部クラス)。
  class s102mp extends JPanel {
    public void paintComponent(Graphics g) {                       
/*
      super.paintComponent(g);                                     
	  g.setBackground(Color.red);
      g.setFont(new Font("Serif",Font.BOLD,48));         
      g.setColor(new Color(255,0,0)); // 色を赤に設定。  
      g.drawString("赤",50,50);                          
      g.setColor(Color.blue); // 色を青に設定。          
      g.drawString("青",50,100);                         
      g.setColor(Color.yellow); // 色を黄に設定。        
      g.drawString("黄",50,150);                         
*/
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
        JFrame frame = new JFrame("Application: s102m");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setBackground(Color.red);

        s102m applet = new s102m(false);
        applet.init();

        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
   		frame.setBounds(100, 100, 300, 200);
        frame.setVisible(true);
    }
}
