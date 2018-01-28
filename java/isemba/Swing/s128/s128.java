// -*- mode: java -*- Time-stamp: <2009-06-20 10:29:20 kahata>
/*====================================================================
 * name: s128.java 
 * created : Time-stamp: <09/06/20(土) 08:29:15 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/SWING/s128.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << s128.java >>
//
//  Ｓｗｉｎｇ（２）：部品（テキストエリア、イベント処理）
//
//　　２つのテキストエリアと「複写」ボタン、「消去」ボタンを作る。
//　　テキストエリア内で編集ができる。
//　　最初のテキストエリアにはスクロールバーを付ける。スクロールバーを付けるには、
//　　テキストエリアをスクロールペインに入れる必要がある。
//　　テキストエリアに表示しきれないテキストが入力されると自動的にスクロールバー
//　　が現れる。テキストエリアにすべてのテキストが表示できるようになるとスクロー
//　　ルバーは消える。
//
//  ●javax.swing.JTextAreaクラス
//    入力(文字列)用の欄(複数行分ある)で、編集するとき、JTextAreaクラスを使う。
//
//  ●JTextAreaクラスのコンストラクタ
//    public JTextArea(int r, int c)                       
//      機能：r行、c列のテキストエリアを作成する。
//    public JTextArea(String s, int r, int c)                       
//      機能：文字列sを表示するr行c列のテキストエリアを作成する。
//
//  ●JTextAreaクラスのメソッド
//    public void append(String s)                       
//      機能：文字列sを既存テキストの末尾に追加する。
//　　
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

class s128 extends JFrame implements ActionListener {

  JTextArea t1,t2; 
  JButton b1,b2;
  Container c;

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s128(String s) { 

    super(s);

    // フレームからコンテンツペインを取得。
    c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをFlowLayoutに設定。
    c.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));

    // テキストエリアの作成。
    t1 = new JTextArea("abc\n123\n日本語\n漢字",3,20);
    JScrollPane sp = new JScrollPane(t1);
    t2 = new JTextArea(3,20);

    // ボタンの作成。
    b1 = new JButton("複写");
    b2 = new JButton("消去");

    // スクロールペイン、ボタン、テキストエリアをコンテンツペイン内に追加。
    c.add(sp);
    c.add(b1);
    c.add(b2);
    c.add(t2);

    // イベントリスナの登録。
    b1.addActionListener(this);
    b2.addActionListener(this);
  }

  //////////////////////////////////////////////
  // ActionListenerインターフェースのメソッド //
  //////////////////////////////////////////////
  public void actionPerformed(ActionEvent e) {
    // 複写。
    if( e.getSource() == b1 ) {
      String s = t1.getText();
      t2.setText(s);
    }
    // 消去。
    if( e.getSource() == b2 ) {
      String s = " ";
      t2.setText(s);
    }
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			//swingLib.setUIFont(new Font("ＭＳ ゴシック", Font.PLAIN, 24));
			swingLib.setUIFont(new Font("Meiryo UI", Font.PLAIN, 24));
		} catch (ClassNotFoundException | InstantiationException
      | IllegalAccessException | UnsupportedLookAndFeelException ex) {
       ex.printStackTrace();
    }
    // フレームの作成。
    s128 f = new s128("Ｓｗｉｎｇ（２）：部品（テキストエリア、イベント処理）");

    // フレームの大きさを設定。
    //f.setSize(300,250);
    f.setSize(1200,900);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
    // フレームの表示。
    f.setVisible(true);
  }
}
