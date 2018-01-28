//  -*- mode: java -*-  Time-stamp: <08/06/17(火) 19:49:30 hata>
/*================================================================
 * プログラム名: ja121b.java
 * 作成日: Time-stamp: Time-stamp: <08/06/17(火) 16:58:05 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja113.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja121b.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（ラベル）
//
//　　短い文字列を表示する。
//
//　●JComponentクラスのメソッド
//    public void setForeground(Color bg)
//      機能：部品の前景色bgを設定する。
//    public void setBackground(Color bg)
//      機能：部品の背景色bgを設定する。
//    public void setOpaque(boolean isOpaque)
//　　　機能：true の場合、部品はその境界内のすべてのピクセルをペイントする。
//　　　　　　false の場合、部品はピクセルの一部または全部をペイントしないので、
//　　　　　　その下のピクセルが透けて表示される。 
//            デフォルト値は、false。
//
//　●Colorクラス
//　　色のデータや操作が定義されているクラス。
//    java.awt.Color
//
//　　・Colorクラスに用意されている色
//　　　magenta：暗い桃色　　 　black：黒　　white：白     yellow：黄
//　　　darkGray：暗い灰色　　　gray：灰色   cyan：空色　  blue：青　
//　　　lightGray：明るい灰色 　red：赤　　  orange：橙　　green：緑　
//　　　pink：明るい桃色        
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="ja121b.class" width="640" height="480">
</applet>
*/

public class ja121b extends JApplet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout(10,10));

    // ラベル１の作成。
    JLabel lab1 = new JLabel();
    lab1.setText("ラベル１");
    lab1.setForeground(Color.black);
    lab1.setBackground(Color.yellow);
    lab1.setOpaque(true);

    // ラベル２の作成。
    JLabel lab2 = new JLabel("ラベル２");
    lab2.setForeground(Color.red);
    lab2.setBackground(Color.pink);
    lab2.setOpaque(true);

    // ラベルをコンテンツペイン内に追加。
    c.add(lab1,BorderLayout.NORTH);
    c.add(lab2,BorderLayout.CENTER);
  }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ja21b");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
                }
        });

        JApplet applet = new ja121b();
        applet.init();
        frame.add(applet);
        frame.setSize(300, 200);
        frame.setVisible(true);
        applet.start();
    }
}
