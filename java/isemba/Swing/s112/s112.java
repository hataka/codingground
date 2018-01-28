// -*- mode: java -*- Time-stamp: <2009-06-20 15:28:11 kahata>
/*====================================================================
 * name: s112.java 
 * created : Time-stamp: <09/06/20(土) 08:29:15 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/SWING/s112.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << s112.java >>
//
//  Ｓｗｉｎｇ（１）：レイアウトマネージャー（BorderLayout）
//
//　　BorderLayoutを使うと、部品を東西南北・中央の位置に配置できる。
//
//　　　　North（ウインドウの上部を意味する）
//　　　　South（ウインドウの下部を意味する）
//　　　　West（ウインドウの左部を意味する）
//　　　　East（ウインドウの右部を意味する）
//　　　　Center（ウインドウの中央部を意味する）
//
//　　フレームの大きさに応じて、フレームに格納された部品の大きさも変わる。
//
//　●BorderLayoutクラスのコンストラクタ
//　　public BorderLayout()
//　　　機能：部品間に間隔を設けず、上、下、左、右、中央に配置する。
//　　public BorderLayout(int h, int v)
//　　　機能：部品を、上、下、左、右、中央に配置する。
//　　　　　　各部品の間隔は均等。
//　　　　　　部品数は最大５個まで。
//      hは部品間の水平間隔、vは部品間の垂直間隔。
//
//　●Containerクラスのメソッド
//　　public Component add(Component c, 位置)
//　　　機能：部品cをこのコンテナの指定された位置に追加する。
//            位置 NORTH,SOUTH,WEST,EAST,CENTER
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

//class s112 extends JFrame {
public class s112 extends JPanel {
  /////////////////// 
  // コンストラクタ //
  /////////////////// 
  //s112(String s) { 
  //  super(s);
  s112() { 
    super();

    // フレームからコンテンツペインを取得。
    //Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    this.setLayout(new BorderLayout(10,10));

    // ボタンの作成。
    JButton b1 = new JButton("ボタン１");
    JButton b2 = new JButton("ボタン２");
    JButton b3 = new JButton("ボタン３");
    JButton b4 = new JButton("ボタン４");
    JButton b5 = new JButton("ボタン５");

    // ボタンをコンテンツペイン内に追加。
    this.add(b1,BorderLayout.NORTH);  // 上に配置。
    this.add(b2,BorderLayout.SOUTH);  // 下に配置。
    this.add(b3,BorderLayout.WEST);   // 左に配置。
    this.add(b4,BorderLayout.EAST);   // 右に配置。
    this.add(b5,BorderLayout.CENTER); // 中央に配置。
  }


	public static void createAndShowGUI() {
		try {
			//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) { ex.printStackTrace();}
		
		
		JFrame frame1 = new JFrame("フレーム１");
		frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame1.getContentPane().add(new s112());
    frame1.setSize(300,200);
    // フレームの位置を設定。
    frame1.setLocation(0,0);
		//frame1.pack();
		//frame1.setLocationRelativeTo(null);
		frame1.setVisible(true);
	
		JFrame frame2 = new JFrame("フレーム２");
		frame2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame2.getContentPane().add(new s112());
    frame2.setSize(360,240);
    // フレームの位置を設定。
    frame2.setLocation(0,300);
		//frame2.pack();
		//frame2.setLocationRelativeTo(null);
		frame2.setVisible(true);
	
	}
  	
  	
  	//////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override public void run() {
				createAndShowGUI();
			}
		});
  	/*
    // フレーム１の作成。
    s112 f1 = new s112("フレーム１");
    // フレームの大きさを設定。
    f1.setSize(300,200);
    // フレームの位置を設定。
    f1.setLocation(0,0);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレームの表示。
    f1.setVisible(true);

    // フレーム２の作成。
    s112 f2 = new s112("フレーム２");
    // フレームの大きさを設定。
    f2.setSize(360,240);
    // フレームの位置を設定。
    f2.setLocation(0,300);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレームの表示。
    f2.setVisible(true);
	*/
  }
}
