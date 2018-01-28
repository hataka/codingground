//  -*- mode: java -*-  Time-stamp: <08/06/17(火) 18:50:33 hata>
/*================================================================
 * プログラム名: ja113.java
 * 作成日: Time-stamp: Time-stamp: <08/06/17(火) 16:58:05 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja113.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja113.java >>
//
//  ＪＡｐｐｌｅｔ（１）：レイアウトマネージャー（GridLayout）
//
//　　　部品を格子状に配置する。
//　　　コンテナのサイズが変わると、部品の大きさも変わるが、どの部品も同じ
//　　　大きさになる。
//
//　●GridLayoutクラス
//　　java.awt.GridLayout
//
//　●GridLayoutクラスのコンストラクタ
//　　public GridLayout(int r, int c, int h, int v)
//　　　機能：部品を、格子状に配置する。
//            r：行の数。
//            c：列の数。
//            h：部品間の水平間隔（単位はピクセル）。
//            v：部品間の垂直間隔（単位はピクセル）。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

//<applet code="ja113.class" width="640" height="480"></applet>

public class ja113 extends JApplet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // アプレットのレイアウトマネージャをGridLayoutに設定。
    c.setLayout(new GridLayout(2,3,10,10));

    // ボタンの作成。
    JButton b1 = new JButton("ボタン１");
    JButton b2 = new JButton("ボタン２");
    JButton b3 = new JButton("ボタン３");
    JButton b4 = new JButton("ボタン４");
    JButton b5 = new JButton("ボタン５");

    // ボタンをコンテンツペイン内に追加。
    c.add(b1);
    c.add(b2);
    c.add(b3);
    c.add(b4);
    c.add(b5);
  }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ja113");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
                }
        });

        JApplet applet = new ja113();
        applet.init();
        frame.add(applet);
        frame.setSize(400, 200);
        frame.setVisible(true);
        applet.start();
    }
}
