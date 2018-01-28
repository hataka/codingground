// -*- mode: java -*-  Time-stamp: <2014-04-26 15:32:42 kahata>
/*================================================================
 * title: 
 * file: s117.java
 * path: F:\java\isemba\Swing\s117\s117.java
 * url:  http://hata2/java/isemba/Swing/s117/s117.java
 * created: Time-stamp: <2014-04-26 15:32:42 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: 
 * description: 
 *================================================================*/

////////////////////////////////////////////////////////////////////////////////
// << s117.java >>
//
//  Ｓｗｉｎｇ（１）：レイアウトマネージャー（絶対位置指定）
//
//　　部品を任意の大きさで、任意の位置に配置する。
//
//　　レイアウトマネージャを使わないことを宣言する。
//
//　　　　setLayout(null)
//
//　●java.awt.Componentクラスから継承したメソッド
//　　public void setBounds(int x, int y, int width, int height)
//　　　機能：部品を配置する。
//            x：ｘ座標。
//            y：ｙ座標。
//            width：幅。
//            height：高さ。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

class s117 extends JFrame {

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s117(String s) {

    super(s);

    // フレームからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャを不使用に設定。
    c.setLayout(null);

    // ボタンの作成と位置設定。
    JButton b1 = new JButton("ボタン１");
    b1.setBounds(20,40,100,20);
    JButton b2 = new JButton("ボタン２");
    b2.setBounds(160,40,100,40);
    JButton b3 = new JButton("ボタン３");
    b3.setBounds(60,100,80,60);

    // ボタンをコンテンツペイン内に追加。
    c.add(b1);
    c.add(b2);
    c.add(b3);
  }

  public void main2(String[] args) {
  //void main(String[] args) {

    // フレームの作成。
    s117 f = new s117("フレーム");

    // フレームの大きさを設定。
    f.setSize(300,200);

    // フレームの位置を設定。
    f.setLocation(0,0);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの表示。
    f.setVisible(true);
  } 
	
	
	
	//////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {
  //void main(String[] args) {

    // フレームの作成。
    s117 f = new s117("フレーム");

    // フレームの大きさを設定。
    f.setSize(300,200);

    // フレームの位置を設定。
    f.setLocation(0,0);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの表示。
    f.setVisible(true);
  }
}
