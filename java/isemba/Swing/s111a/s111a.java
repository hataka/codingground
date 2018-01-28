// -*- mode: java -*- Time-stamp: <2009-06-20 14:31:33 kahata>
/*====================================================================
 * name: s111a.java 
 * created : Time-stamp: <09/06/20(土) 08:29:15 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/SWING/s111a.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << s111a.java >>
//
//  Ｓｗｉｎｇ（１）：レイアウトマネージャー(FlowLayout）
//
//　　部品の配置や大きさを決定するクラスをレイアウトマネージャという。
//　　レイアウトマネージャーの種類にはつぎのようなものがある。
//
//    　　FlowLayout       部品を横１列に配置する。
//    　　BorderLayout     部品を上下左右、中央に配置する。
//    　　GridLayout       部品をタイル状に配置する。
//    　　GridBagLayout    異なる大きさの部品をタイル状に配置する。
//    　　CardLayout       部品をカード状に配置する。
//
//
//　　FlowLayoutを設定すると、部品を左から右へ並べるように配置できる。
//    並べられなくなれば、つぎの行に配置する。各部品の間隔は均等。
//
//　●java.awt.FlowLayoutクラス
//    部品(ボタンやテキストフィールドなど)を左から右へ行ごとに配置する。
//
//　●FlowLayoutクラスのコンストラクタ
//　　public FlowLayout(位置, int h, int v)
//　　　機能：部品の配置を、左から右へ順に並べるよう指定する。各部品の間隔は均等。
//      位置：左寄せ  FlowLayout.LEFT
//　　　　　　中央    FlowLayout.CENTER
//            右寄せ  FlowLayout.RIGHT
//      hは部品間の水平間隔、vは部品間の垂直間隔。
//
//　●JButtonクラスのコンストラクタ
//　　public Button(String s)
//      機能：ラベルsをもつボタンを生成する。
//
//　●Containerクラスのメソッド
//    public Component add(Compoment c)  
//      機能：部品cをこのコンテナ内に追加する。
//    public void setLayout(LayoutManager lm)
//      機能：コンテナのレイアウトマネージャをlmに設定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.UIManager;

//class s111a extends JFrame {
class s111a extends JPanel {

  ////////////////////
  // コンストラクタ //
  ////////////////////
  //s111a(String s) { 
  s111a() { 

    //super(s);

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
		swingLib.setUIFont(new Font("Meiryo UI", Font.PLAIN, 24));
	} catch (Exception ex) { ex.printStackTrace();}
	
	JFrame frame1 = new JFrame("フレーム１");
	frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	frame1.getContentPane().add(new s111a());
	//frame.pack();
	frame1.setSize(400,300);
	frame1.setLocation(0,0);
	//frame.setLocationRelativeTo(null);
	frame1.setVisible(true);

	JFrame frame2 = new JFrame("フレーム２");
	frame2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	frame2.getContentPane().add(new s111a());
	//frame.pack();
	frame2.setSize(400,300);
	//frame2.setLocation(0,300);
	frame2.setLocationRelativeTo(null);
	frame2.setVisible(true);
    
/*
 	 // フレーム１の作成。

    s111a f1 = new s111a("フレーム１");
    // フレームの大きさを設定。
    f1.setSize(300,200);
    // フレームの位置を設定。
    f1.setLocation(0,0);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレームの表示。
    f1.setVisible(true);

    // フレーム２の作成。
    s111a f2 = new s111a("フレーム２");
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
