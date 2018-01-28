// -*- mode:  -*-  Time-stamp: <2014-04-30 19:47:37 kahata>
/*================================================================
 * title: 
 * file: 
 * path: 
 * url:  
 * created: Time-stamp: <2014-04-30 19:47:37 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: 
 * description: 
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << s111b.java >>
//
//  Ｓｗｉｎｇ（１）：レイアウトマネージャー(FlowLayout、フレームの自動設定）
//
//　　GUI部品を表示するために、フレームサイズを最適なサイズで自動的に設定する。
//
//　●java.awt.Windowクラスのメソッド
//　　public void pack()
//　　　機能：部品及びレイアウトに合わせて、フレームサイズを変更する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;

//class s111b extends JFrame {
class s111b extends JPanel {

  ////////////////////
  // コンストラクタ //
  ////////////////////
  //s111b(String s) { 
  s111b() { 

    //super(s);
   super();

   // フレームからコンテンツペインを取得。
    //Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをFlowLatoutに設定。
     this.setLayout(new FlowLayout(FlowLayout.LEFT,40,20));

    // ボタンの作成。
    JButton b1 = new JButton("ボタン１");
    JButton b2 = new JButton("ボタン２");
    JButton b3 = new JButton("ボタン３");
    JButton b4 = new JButton("ボタン４");
    JButton b5 = new JButton("ボタン５");

    // ボタンをコンテンツペイン内に追加。
    this.add(b1);
    this.add(b2);
    this.add(b3);
    this.add(b4);
    this.add(b5);
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) { ex.printStackTrace();}
		
		JFrame frame = new JFrame("s111b: フレーム");
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.getContentPane().add(new s111b());
		frame.pack();
		//frame.setSize(640,480);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
/*
    // フレームの作成。
    //s111b f = new s111b("フレーム");
 
    // フレームの大きさを設定。
    f.pack();


    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの表示。
    f.setVisible(true);
*/  
  }
}
