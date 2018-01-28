////////////////////////////////////////////////////////////////////////////////
// << s121b.java >>
//
//  Ｓｗｉｎｇ（２）：部品（ラベル）
//
//　　短い文字列を表示する。
//
//　●javax.swing.JComponentクラスから継承したメソッド
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
//　●java.awt.Colorクラス
//　　色のデータや操作が定義されているクラス。
//
//　　・Colorクラスに用意されている色
//　　　magenta：暗い桃色　　 　black：黒　　white：白     yellow：黄
//　　　darkGray：暗い灰色　　　gray：灰色   cyan：空色　  blue：青　
//　　　lightGray：明るい灰色 　red：赤　　  orange：橙　　green：緑　
//　　　pink：明るい桃色        
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;

class s121b extends JFrame {

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s121b(String s) { 

    super(s);

    // フレームからコンテンツペインを取得。
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

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレームの作成。
    s121b f = new s121b("フレーム");

    // フレームの大きさを設定。
    f.setSize(300,200);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの表示。
    f.setVisible(true);
  }
}
