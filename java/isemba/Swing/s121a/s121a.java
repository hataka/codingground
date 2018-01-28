////////////////////////////////////////////////////////////////////////////////
// << s121a.java >>
//
//  Ｓｗｉｎｇ（２）：部品（ラベル）
//
//　　短い文字列を表示する。
//
//　●JLabelクラス
//　　１行分の文字情報を表示するときにJLabelクラスを使う。
//
//　●JLabelクラスのコンストラクタ
//    public JLabel()
//    　機能：空のラベルを作成する。後で、文字列が設定されると、
//　　　　　　水平方向は左揃え、垂直方向は中央揃えされる。
//    public JLabel(String s)
//    　機能：ラベルに文字列sを設定する。
//　　　　　　水平方向は左揃え、垂直方向は中央揃えされる。
//    public JLabel(String s, SwingConstants.LEFT)
//    　機能：ラベルに文字列sを設定する。左揃え。
//    public JLabel(String s, SwingConstants.CENTER)
//    　機能：レベルに文字列sを設定する。中央揃え。
//    public JLabel(String s, SwingConstants.RIGHT)
//    　機能：ラベルに文字列sを設定する。右揃え。
//
//　●JLabelクラスのメソッド
//    public void setText(String s)
//    　機能：ラベルに文字列sを設定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;

class s121a extends JFrame {

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s121a(String s) { 
    super(s);

    // フレームからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout(10,10));

    // ラベルの作成。
    JLabel lab1 = new JLabel("左揃え");
    JLabel lab2 = new JLabel("中央揃え",SwingConstants.CENTER);
    JLabel lab3 = new JLabel("右揃え",SwingConstants.RIGHT);

    // ラベルをコンテンツペイン内に追加。
    c.add(lab1,BorderLayout.NORTH);
    c.add(lab2,BorderLayout.CENTER);
    c.add(lab3,BorderLayout.SOUTH);
  }

  // mainメソッド
  public static void main(String[] args) {

    // フレームの作成。
    s121a f = new s121a("フレーム");

    // フレームの大きさを設定。
    f.setSize(300,200);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの表示。
    f.setVisible(true);
  }
}
/**
% javac s121a.java
% java s121a

<img src="s121a.jpg" width=300 height=200>
**/
