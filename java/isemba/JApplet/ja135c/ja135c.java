//  -*- mode: java -*-  Time-stamp: <08/07/16(水) 15:54:01 hata>
/*================================================================
 * プログラム名: ja135c.java
  * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja135c.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（スプリットペイン、配置）
//
//　　表示領域全体を上下に２分割、上部を左右に２分割する。
//
//　●JSplitPaneクラスのコンストラクタ
//    public JSplitPane(int d, Component c1, Component c2)
//    　機能：dで水平または垂直方向の画面分割を指定する。
//    　　　  　HORIZONTAL_SPLIT  水平方向（左右）に分割。
//    　　　  　VERTICAL_SPLIT    垂直方向（上下）に分割。
//　　　　　　c1は左(上)に割り当てられる部品。
//　　　　　　c2は右(下)に割り当てられる部品。
//
//　●JSplitPaneクラスのメソッド
//    void setOneTouchExpandable(boolean b)
//    　機能：trueの場合、ワンタッチ拡張機能が有効になる。
//
////////////////////////////////////////////////////////////////////////////////
//<applet code="ja135c.class" width="300" height="200"></applet>
import java.awt.*; 
import javax.swing.*;

public class ja135c extends JApplet {

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャーをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // ６個のボタンを作成。
    JButton b1 = new JButton("ボタン１");
    JButton b2 = new JButton("ボタン２");
    JButton b3 = new JButton("ボタン３");
    JButton b4 = new JButton("ボタン４");
    JButton b5 = new JButton("ボタン５");
    JButton b6 = new JButton("ボタン６");

    // 左右に分割。
    JSplitPane sp1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    // 連続更新機能を設定。
    sp1.setContinuousLayout(true);
    // 左部にボタンb1を割り当てる。
    sp1.setLeftComponent(b1);
    // 右部にボタンb2,b3を割り当てる。
    JPanel p1 = new JPanel();
    p1.add(b2);
    p1.add(b3);
    sp1.setRightComponent(p1);

    // 上下に分割。
    JSplitPane sp2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    // ワンタッチ拡張機能を設定。
    sp2.setOneTouchExpandable(true);
    // 上部にスプリットペインsp1を割り当てる。
    sp2.setLeftComponent(sp1);
    // 下部にボタンb4,b5,b6を割り当てる。
    JPanel p2 = new JPanel();
    p2.add(b4);
    p2.add(b5);
    p2.add(b6);
    sp2.setRightComponent(p2);
    
    // スプリットペインをコンテンツペイン内に追加。
    c.add(sp2,BorderLayout.CENTER);
  }
}
