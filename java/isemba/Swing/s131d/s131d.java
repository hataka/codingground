// -*- mode: java -*- Time-stamp: <2009-06-19 16:26:18 kahata>
/*====================================================================
 * name: s131d.java 
 * created : Time-stamp: <09/06/19(金) 16:24:27 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links:
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/SWING/s131d.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << s131d.java >>
//
//  Ｓｗｉｎｇ（３）：フレーム（メニューの階層構造、イベント処理）
//
//　　メニューの階層構造とイベント処理を組み合わせる。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

class s131d extends JFrame implements ActionListener {

  JMenuBar mb;
  JMenu m,m0,m1;
  JMenuItem mi1,mi2,mi3;
  Container c;

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s131d(String t) { 

    super(t);

    // フレームのコンテンツペインを取得。
    c = this.getContentPane();

    // メニューバーmbの作成。
    mb = new JMenuBar(); 
    // メニューバーmbをフレーム内に追加。
    this.setJMenuBar(mb); 

    // メニューmの作成。
    m = new JMenu("メニュー"); 
    // メニューmをメニューバーmbに追加。
    mb.add(m); 

    // メニューm0,m1の作成。
    m0 = new JMenu("項目なし"); 
    m1 = new JMenu("項目あり"); 
    // メニューm0をメニューmに追加。
    m.add(m0); 
    // セパレータをメニューjmに追加。
    m.addSeparator(); 
    // メニューm1をメニューmに追加。
    m.add(m1); 

    // メニュー項目mi1,mi2,mi3の作成。
    mi1 = new JMenuItem("赤"); 
    mi2 = new JMenuItem("黄"); 
    mi3 = new JMenuItem("青"); 
    // メニュー項目mi1,mi2,mi3をメニューm1に追加。
    m1.add(mi1);  
    m1.add(mi2); 
    m1.add(mi3); 

    // イベントリスナの登録。
    mi1.addActionListener(this);
    mi2.addActionListener(this);
    mi3.addActionListener(this);
  }

  //////////////////////////////////////////////
  // ActionListenerインターフェースのメソッド //
  //////////////////////////////////////////////
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == mi1 ) { c.setBackground(Color.red); }
    if( e.getSource() == mi2 ) { c.setBackground(Color.yellow); }
    if( e.getSource() == mi3 ) { c.setBackground(Color.blue); }
  }
    
  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレームの作成。
    s131d f = new s131d("メニュー付きフレーム");

    // フレームウィンドウの大きさを設定。
    //f.setSize(300,200);
    f.setSize(800,600);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの表示。
    f.setVisible(true);
  }
}
