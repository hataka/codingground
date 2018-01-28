//  -*- mode: java -*-  Time-stamp: <08/06/17(火) 17:23:11 hata>
/*================================================================
 * プログラム名: ja111.java
 * 作成日: Time-stamp: Time-stamp: <08/06/17(火) 16:58:05 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja111.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja111.java >>
//  ＪＡｐｐｌｅｔ（１）：レイアウトマネージャー（BorderLayout）
//
//　　部品の配置や大きさを決定するクラスをレイアウトマネージャという。
//　　レイアウトマネージャーの種類にはつぎのようなものがある。
//
//    　　FlowLayout       部品を横１列に配置する。
//    　　BorderLayout     部品を上下左右、中央に配置する。
//    　　GridLayout       部品をタイル状に配置する。
//    　　GridBagLayout    異なる大きさの部品をタイル状に配置する。
//    　　CardLayout       部品をカード状に配置する。
//
//　　BorderLayoutを使うと、部品を東西南北・中央の位置に配置できる。
//
//　　　　North（ウインドウの上部を意味する）
//　　　　South（ウインドウの下部を意味する）
//　　　　West（ウインドウの左部を意味する）
//　　　　East（ウインドウの右部を意味する）
//　　　　Center（ウインドウの中央部を意味する）
//
//　　アプレットの大きさに応じて、アプレットに格納された部品の大きさも変わる。
//　　レイアウトマネージャの設定を省略すると、自動的にBorderLayoutが設定される。
//
//　●JAppletクラス
//    javax.swing.JApplet
//
//　●BorderLayoutクラス
//    java.awt.BorderLayout
//    http://java.sun.com/javase/ja/6/docs/ja/api/java/awt/BorderLayout.html
//　●BorderLayoutクラスのコンストラクタ
//　　public BorderLayout()
//　　　機能：部品間に間隔を設けず、上、下、左、右、中央に配置する。
//　　public BorderLayout(int h, int v)
//　　　機能：部品を、上、下、左、右、中央に配置する。
//　　　　　　各部品の間隔は均等。
//　　　　　　部品数は最大５個まで。
//            hは部品間の水平間隔、vは部品間の垂直間隔。
//
//    http://java.sun.com/javase/ja/6/docs/ja/api/java/awt/BorderLayout.html
//     public BorderLayout(int hgap, int vgap)
//    コンポーネント間に間隔を指定して、新しいボーダレイアウトを構築します。
//    水平方向の間隔は hgap によって指定され、垂直方向の間隔は vgap によって指定されます。 //    パラメータ:
//      hgap - 水平方向の間隔  vgap - 垂直方向の間隔
//
//　●Containerクラス
//    java.awt.Container
//
//　●Containerクラスのメソッド      
//    public Component add(Component comp, int index)
//      機能：部品compをこのコンテナの指定された位置に追加する。
//            位置 NORTH,SOUTH,WEST,EAST,CENTER
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

/*
<applet code="ja111.class" width="640" height="480">
</applet>
*/

public class ja111 extends JApplet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // アプレットのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout(10,10));

    // ボタンの作成。
    JButton b1 = new JButton("ボタン１");
    JButton b2 = new JButton("ボタン２");
    JButton b3 = new JButton("ボタン３");
    JButton b4 = new JButton("ボタン４");
    JButton b5 = new JButton("ボタン５");

    // 部品をコンテンツペイン内に追加。
    c.add(b1,BorderLayout.NORTH);  // 上に配置。
    c.add(b2,BorderLayout.SOUTH);  // 下に配置。
    c.add(b3,BorderLayout.WEST);   // 左に配置。
    c.add(b4,BorderLayout.EAST);   // 右に配置。
    c.add(b5,BorderLayout.CENTER); // 中央に配置。
  }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ja111");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
                }
        });

        JApplet applet = new ja111();
        applet.init();
        frame.add(applet);
        frame.setSize(300, 160);
        frame.setVisible(true);
        applet.start();
    }
}
