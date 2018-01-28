////////////////////////////////////////////////////////////////////////////////
// << s129c.java >>
//
//  Ｓｗｉｎｇ（２）：フレーム（パネル、配置）
//
//　　パネルはコンテナでもある。
//　　パネルを組み合わせて複雑なレイアウトを作ることができる。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

class s129c extends JFrame{

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s129c(String t) { 

    super(t);

    // フレームのディフォルトレイアウトマネージャはBorderLayout。
    Container c = this.getContentPane();

    // ボタンの作成
    JButton b1 = new JButton("１");
    JButton b2 = new JButton("２");
    JButton b3 = new JButton("３");
    JButton b4 = new JButton("４");
    JButton b5 = new JButton("５");
    JButton b6 = new JButton("６");
    JButton b7 = new JButton("７");
 
    // パネルの作成。
    JPanel p1 = new JPanel();
    p1.setLayout(new FlowLayout());
    JPanel p2 = new JPanel();
    p2.setLayout(new GridLayout(2,2));

    // ボタンをパネル内に追加。
    p1.add(b1); p1.add(b2); p1.add(b3);
    p2.add(b4); p2.add(b5); p2.add(b6); p2.add(b7);

    // パネルをコンテンツペイン内に追加。
    c.add(p1,BorderLayout.NORTH);
    c.add(p2,BorderLayout.SOUTH);
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレームの作成。
    s129c f = new s129c("フレーム"); 

    // フレームの大きさを設定
    f.setSize(300,200);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの表示。
    f.setVisible(true);
  }
}
