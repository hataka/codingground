// -*- mode: java -*- Time-stamp: <2009-06-19 14:43:02 kahata>
/*====================================================================
 * name: g123.java 
 * created : Time-stamp: <09/06/19(金) 14:38:52 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://localhost/wiki/ 
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << g123.java >>
//
//  ＧＵＩ（２）：レイアウトマネージャー（GridLayout）
//
//　　部品を格子状に配置する。
//
//　●GridLayoutクラスのコンストラクタ
//　　GridLayout(int r, int c, int h, int v)
//　　　機能：部品を、格子状に配置する。
//      r   ：行の数。
//      c   ：列の数。
//      h   ：部品間の水平間隔。
//      v   ：部品間の垂直間隔。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class g123 extends JPanel {

  // コンストラクタ。
    public g123() {
    // フレームの作成。

    // ボタンの作成。
    Button b1 = new Button("ボタン１");
    Button b2 = new Button("ボタン２");
    Button b3 = new Button("ボタン３");
    Button b4 = new Button("ボタン４");
    Button b5 = new Button("ボタン５");

    // フレームのレイアウトマネージャをGridLayoutに設定。
    setLayout(new GridLayout(2,3,10,10));

    // ボタンをフレーム内に追加。
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("g123");
   	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setContentPane(new g123());
    frame.pack();
    // フレームの大きさを設定。
   	frame.setBounds(100, 100, 300, 200);
//    frame.setSize(300,200);
    // フレームの表示。
    frame.setVisible(true);
  }
}
