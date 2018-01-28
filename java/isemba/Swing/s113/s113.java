////////////////////////////////////////////////////////////////////////////////
// << s113.java >>
//
//  Ｓｗｉｎｇ（１）：レイアウトマネージャー（GridLayout）
//
//　　　部品を格子状に配置する。
//　　　コンテナのサイズが変わると、部品の大きさも変わるが、どの部品も同じ
//　　　大きさになる。
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
import javax.swing.*;

public class s113 extends JFrame {

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s113(String s) { 

    super(s);

    // フレームからコンテンツペインを取得。
    Container c = this.getContentPane();

    // フレームのレイアウトマネージャをGridLayoutに設定。
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

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレーム１の作成。
    s113 f1 = new s113("フレーム１");
    // フレームの大きさを設定。
    f1.setSize(300,200);
    // フレームの位置を設定。
    f1.setLocation(0,0);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレームの表示。
    f1.setVisible(true);

    // フレーム２の作成。
    s113 f2 = new s113("フレーム２");
    // フレームの大きさを設定。
    f2.setSize(360,240);
    // フレームの位置を設定。
    f2.setLocation(0,300);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレームの表示。
    f2.setVisible(true);
  }
}
