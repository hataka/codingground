// -*- mode: java -*-  Time-stamp: <2010-04-16 18:16:27 kahata>
/*================================================================
 * file: s114b.java
 * path; F:\java\isemba\Swing\s114b\s114b.java
 * url:  http://localhost/java/isemba/Swing/s114b/s114b.java
 * created: Time-stamp: <2010-04-16 18:16:27 kahata>
 * $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: 
 * link: 
 * description: 
 *
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << s114b.java >>
//
//  Ｓｗｉｎｇ（１）：レイアウトマネージャー（BoxLayout）
//
//　　部品は左から右へ(または上から下へ)配置される。
//　　フレームの大きさが変わっても配置は変わらない。
//
//　●BoxLayoutクラスのコンストラクタ
//    public BoxLayout(Container target, int axis)
//      機能：部品を方向axisに配置するレイアウトマネージャを作成する。
//            target： 設定するコンテナ。
//            BoxLayout.X_AXIS： 左から右へ。
//            BoxLayout.Y_AXIS： 上から下へ。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

class s114b extends JFrame {

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s114b(String s) {

    super(s);

    // フレームからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBoxLayoutに設定。
    c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

    // ボタンとラベルの作成。
    JButton b1 = new JButton("ボタン１");
    JButton b2 = new JButton("ボタン２");
    JButton b3 = new JButton("ボタン３");

    // ボタンをコンテンツペイン内に追加。
    c.add(b1);
    c.add(b2);
    c.add(b3);
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレーム１の作成。
    s114b f1 = new s114b("フレーム１");
    // フレームの大きさを設定。
    f1.setSize(300,200);
    // フレームの位置を設定。
    f1.setLocation(0,0);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    //f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    // フレームの表示。
    f1.setVisible(true);

    // フレーム２の作成。
    s114b f2 = new s114b("フレーム２");
    // フレームの大きさを設定。
    f2.setSize(360,240);
    // フレームの位置を設定。
    f2.setLocation(0,300);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    // フレームの表示。
    f2.setVisible(true);
  }
}
