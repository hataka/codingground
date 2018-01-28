// 
/*================================================================
 * プログラム名: ja114a.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja114a.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja114a.java >>
//
//  ＪＡｐｐｌｅｔ（１）：レイアウトマネージャー（BoxLayout）
//
//　　部品は左から右へ(または上から下へ)配置される。
//　　アプレットの大きさが変わっても配置は変わらない。
//
//　●BoxLayoutクラスのコンストラクタ
//    public BoxLayout(Container target, int axis)
//      機能：部品を方向axisに配置するレイアウトマネージャを作成する。
//            BoxLayout.X_AXIS： 左から右へ。
//            BoxLayout.Y_AXIS： 上から下へ。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

//<applet code="ja114a.class" width="640" height="480"></applet>

public class ja114a extends JApplet {

   /**
	  * 
	  */
	private static final long serialVersionUID = 1L;
	private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public ja114a() {
        this(true);
    }

    public ja114a(boolean inAnApplet) {
        this.inAnApplet = inAnApplet;
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {
    // アプレットのコンテンツペインを取得。
    Container c = getContentPane();
    // コンテンツペインのレイアウトマネージャをBoxLayoutに設定。
    c.setLayout(new BoxLayout(c,BoxLayout.X_AXIS));

    // ボタンの作成。
    JButton b1 = new JButton("ボタン１");
    JButton b2 = new JButton("ボタン２");
    JButton b3 = new JButton("ボタン３");

    // ボタンをコンテンツペイン内に追加。
    c.add(b1);
    c.add(b2);
    c.add(b3);

        //Add Components to a JPanel, using the default FlowLayout. 
        JPanel pane = new JPanel();
        pane.add(b1);
        pane.add(b2);
        pane.add(b3);
        pane.setBackground(new Color(255,255,204));
        pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));

        setContentPane(pane);


  }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ja114a");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
                }
        });

        JApplet applet = new ja114a(false);
        applet.init();
        frame.add(applet);
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
//        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
