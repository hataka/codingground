//  -*- mode: java -*-  Time-stamp: <08/06/17(火) 17:23:11 hata>
/*================================================================
 * プログラム名: ja112.java
 * 作成日: Time-stamp: Time-stamp: <08/06/17(火) 16:58:05 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja112.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja112.java >>
//
//  ＪＡｐｐｌｅｔ（１）：レイアウトマネージャー(FlowLayout）
//
//　　部品の配置を、左から右へ並べるよう指定する。
//    並べられなくなれば、つぎの行に配置する。各部品の間隔は均等。
//
//　●FlowLayoutクラス
//    コンポーネント（ボタンやテキストフィールドなどの部品）を左から右へ
//　　行ごとに配置する。
//    java.awt.FlowLayout
//
//　●FlowLayoutクラスのコンストラクタ   
//    public FlowLayout()
//　　　機能：部品の配置を、左から右へ順に並べるよう指定する。
//　　　　　　水平間隔と垂直間隔は5、中央揃え。
//    public FlowLayout(int align, int h, int v)
//　　　機能：部品の配置を、左から右へ順に並べるよう指定する。各部品の間隔は均等。
//            位置alignの指定は次のようになる。
//　　　　　　　左寄せ  FlowLayout.LEFT
//　　　　　　　中央    FlowLayout.CENTER
//            　右寄せ  FlowLayout.RIGHT
//            hはコンポーネント間の水平間隔、vはコンポーネント間の垂直間隔。
//
//　●JButtonクラスのコンストラクタ
//　　public JButton(String s)
//      機能：テキストsをもつボタンを生成する。
//
//　●Containerクラスのメソッド     
//    public Component add(Component comp)
//      機能：部品compをコンテナの最後に追加する。 
//    public void setLayout(LayoutManager lm)
//      機能：コンテナのレイアウトマネージャをlmに設定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

//<applet code="ja112.class" width="480" height="60"></applet>

public class ja112 extends JApplet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // アプレットのレイアウトマネージャをFlowLatoutに設定。
    c.setLayout(new FlowLayout(FlowLayout.LEFT,10,5));

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
        JFrame frame = new JFrame("ja112");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
                }
        });

        JApplet applet = new ja112();
        applet.init();
        frame.add(applet);
        frame.setSize(400, 200);
        frame.setVisible(true);
        applet.start();
    }
}
