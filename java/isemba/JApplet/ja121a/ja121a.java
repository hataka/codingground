////////////////////////////////////////////////////////////////////////////////
// << ja121a.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（ラベル）
//
//　　短い文字列を表示する。
//
//　●JLabelクラス
//　　文字列やイメージを表示するときにJLabelクラスを使う。
//
//　●JLabelクラスのコンストラクタ
//    public JLabel()
//    　機能：空の文字列を表示する。後で、文字列が設定されると、
//　　　　　　水平方向は左揃え、垂直方向に中央揃えされる。
//    public JLabel(String s)
//    　機能：文字列sを表示する。
//            水平方向は左揃え、垂直方向に中央揃えされる。 
// aaaaa試験
//　●JLabelクラスのメソッド
//    public void setText(String s)
//    　機能：表示する文字列sを設定する。
//            親クラスは、javax.swing.JComponentクラスである。
//
////////////////////////////////////////////////////////////////////////////////

//<applet code="ja121a.class" width="300" height="200"></applet>

import java.awt.*;
import javax.swing.*;

public class ja121a extends JApplet {

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout(10,10));

    // ラベル１の作成。
    JLabel lab1 = new JLabel();
    lab1.setText("ラベル１");

    // ラベル２の作成。
    JLabel lab2 = new JLabel("ラベル２");

    // ラベルをコンテンツペイン内に追加。
    c.add(lab1,BorderLayout.NORTH);
    c.add(lab2,BorderLayout.CENTER);
  }
}
