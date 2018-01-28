// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: g111a.java 
 * created : Time-stamp: <09/06/30(火) 09:21:27 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GUI/g111a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << g111a.java >>
//
//  ＧＵＩ（１）：フレームウィンドウ（生成、表示、非表示）
//
//　　フレームと呼ばれるウィンドウ(タイトルなし)を表示する。
//
//  ●Frameクラス
//　　フレームウィンドウは、ウィンドウ周囲の枠、タイトルバー、最大化ボタン、
//　　最小化ボタン、閉じるボタンを持つ。
//    Frameクラスを使って、フレームは作成される。
//
//    ・アプリケーションを終了するには、Ctrlキーとcを同時に押す。
//    ・フレームにおいて、デフォルトのレイアウトマネージャーは
//　　　BorderLayoutである。
//　　・Frameクラスのクラス階層
//　　　java.lang.Object --> java.awt.Component --> java.awt.Container --> 
//      java.awt.Window --> java.awt.Frame
//
//  ●Frameクラスのコンストラクタ
//    Frame()
//      機能：タイトルなし、非表示のFrameオブジェクトを生成する。
//
//  ●Componentクラス
//　　部品の大きさ、部品の背景色、表示位置など、部品の表示に関する操作を
//　　メソッドとして持つ。
//
//  ●Componentクラスのメソッド
//    void setSize(int w, int h)
//      機能：フレームの幅をh、高さをhにする。
//　　void setVisible(boolean x)
//      機能：xがtrueの場合、表示する。
//            xがfalseの場合、非表示にする。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

class g111a {

	public static void createAndShowGUI() {
		try {
			//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) { ex.printStackTrace();}
	    // フレームの作成。
	    JFrame f = new JFrame("g111a: フレームウィンドウ（生成、表示、非表示）");
	   	//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   	f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		//f.getContentPane().add(new s112());
	    // フレームの位置を設定。
	    //f.setLocation(0,0);
			//frame1.pack();
			//frame1.setLocationRelativeTo(null);
	    // フレームの大きさを設定。
	    //f.setSize(300,200);
	    f.setSize(640,480);
		f.setLocationRelativeTo(null);

	    // フレームの表示。
	    f.setVisible(true);
	}
 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override public void run() {
				createAndShowGUI();
			}
		});
  }
}
