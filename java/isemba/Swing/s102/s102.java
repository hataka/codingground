// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: s102.java 
 * created : Time-stamp: <09/06/20(土) 08:29:15 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/SWING/s102.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << s102.java >>
//
//	Ｓｗｉｎｇ（０）：フレーム（作成、表示、非表示）
//
//　　トップレベルのウィンドウ(他に含まれないウィンドウ)をフレームという。
//
//	●javax.swing.JFrameクラス
//		JFrameクラスを使って、フレームは作成される。
//　　フレームは、ウィンドウ周囲の枠、タイトルバー、「最小化」、「最大化」、
//　　「閉じる」ボタンをもつ。
//		「閉じる」ボタンをクリックすると、フレームは非表示になるが、プログラムは
//　　終了していない。プログラムを終了するには、
//			　　f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//　　と書く必要がある。fはJFrameクラスのオブジェクト。
//
//　　・JFrameクラスのクラス階層
//　　　java.lang.Object --> java.awt.Component --> java.awt.Container --> 
//			java.awt.Window --> java.awt.Frame --> javax.swing.JFrame
//
//	●JFrameクラスのコンストラクタ
//		public JFrame() throws HeadlessException
//			機能：初期状態で不可視の新しいフレームを作成する。
//		public JFrame(String s) throws HeadlessException
//			機能：指定されたタイトルsで、初期状態で不可視の新しいフレームを作成する。
//
//	●java.awt.Frameクラスから継承したメソッド
//		public void setTitle(String s)	
//			機能：文字列sをタイトルとする。
//
//	●java.awt.Componentクラスから継承したメソッド	
//		public void setSize(int w, int h)
//			機能：フレームの幅をh、高さをhに変更する。
//		public void setForeground(Color c)
//			機能：部品のフォアグラウンドの色をcに設定。
//		public void setBackground(Color c)
//			機能：部品のバックグラウンドの色をcに設定。
//　　public void setVisible(boolean x)
//			機能：xがtrueの場合表示、xがfalseの場合非表示にする。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

//class s102 extends JFrame {
class s102 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	s102() { // コンストラクタ。	
		//super(new BorderLayout());
		//Container c = getParent();//.getContentPane();
		// フレームの背景色を赤に設定。
		setBackground(Color.red);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) { ex.printStackTrace();}
		
		JFrame frame = new JFrame("s102: フレーム（作成、表示、非表示）");
		swingLib.setUIFont(new Font("Meiryo UI", Font.PLAIN, 24));
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.getContentPane().add(new s102());
		frame.pack();
		frame.setSize(640,480);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		/*
		// フレームの作成。
		s102 f = new s102();
		// フレームの大きさを設定。
//	f.setSize(300,200);
	 	f.setBounds(100, 100, 300,200);
		// 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// フレームの表示。
		f.setVisible(true);
	*/
	}
}
