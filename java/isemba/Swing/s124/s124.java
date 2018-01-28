// -*- mode: java -*-  Time-stamp: <2014-04-29 10:45:11 kahata>
/*================================================================
 * title: 
 * file: s124.java
 * path: F:\java\isemba\Swing\s124\s124.java
 * url:  http://hata2/java/isemba/Swing/s124/s124.java
 * created: Time-stamp: <2014-04-29 10:45:11 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: 
 * description: 
 *================================================================*/

////////////////////////////////////////////////////////////////////////////////
// << s124.java >>
//
//  Ｓｗｉｎｇ（２）：部品（チェックボックス、イベント処理）
//
//　　「赤」項目をチェックすると、ラベルに赤という文字が表示される。
//　　「黄」項目をチェックすると、ラベルに黄という文字が表示される。
//　　「青」項目をチェックすると、ラベルに青という文字が表示される。
//    　複数の項目を選択できる。
//
//  ●javax.swing.JCheckBoxクラス
//    複数項目の中から複数の選択をするとき、JCheckBoxクラスを使う。
//
//  ●JCheckBoxクラスのコンストラクタ
//    public JCheckBox(String s, boolean b)                       
//      機能：文字列sを項目に加える。bがtrueのときチェックされている状態、
//　　　　　　falseのときチェックされていない状態に設定される。
//
//  ●javax.swing.AbstractButtonクラスから継承したメソッド
//    public boolean isSelected()
//      機能：ボタンの状態を返す。選択されている場合true、選択されていない場合
//　　　　　　false。
//    public void setSelected(boolean b)   
//      機能：ボタンの状態をbに設定する。  
//　　　　　　ボタンが選択されている場合は true、そうでない場合は false
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class s124 extends JFrame implements ActionListener {

  JCheckBox c1,c2,c3;
  boolean b1,b2,b3; 
  JLabel lab = new JLabel(" ");
  Container c;

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s124() {};
	s124(String s) { 

    super(s);

    // フレームからコンテンツペインを取得。
    c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをFlowLayoutに設定。
    c.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));

    // チェックボックスボタンの作成。
    c1 = new JCheckBox("赤");
    c2 = new JCheckBox("青");
    c3 = new JCheckBox("黄");

    // チェックボックスボタンをコンテンツペイン内に追加。
    c.add(c1);
    c.add(c2);
    c.add(c3);
    c.add(lab);

    // イベントリスナの登録。
    c1.addActionListener(this);
    c2.addActionListener(this);
    c3.addActionListener(this);
  }

  //////////////////////////////////////////////
  // ActionListenerインターフェースのメソッド //
  //////////////////////////////////////////////
  public void actionPerformed(ActionEvent e) {

    String s="";
    if( c1.isSelected() ) s = s + "　赤　";
    if( c2.isSelected() ) s = s + "　青　";
    if( c3.isSelected() ) s = s + "　黄　";
    lab.setText(s);
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレームの作成。
    s124 f = new s124("フレーム");

    // フレームの大きさを設定。
    f.setSize(300,200);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // フレーム表示。
    f.setVisible(true);
  }
}
