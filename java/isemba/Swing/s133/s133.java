////////////////////////////////////////////////////////////////////////////////
// << s133.java >>
//
//  Ｓｗｉｎｇ（３）：フレーム（ツールバー、ツールチップ、イベント処理）
//
//　　ツールバー（複数のボタンを含むバー）はフレームの任意の場所に移動できる。
//　　ツールチップを使うと、カーソルがコンポーネントの上に置かれるときだけ、
//　　指定された文字列が表示される。コンポーネントの簡明な説明に使われる。
//
//　●javax.swing.JToolBarクラス
//    ツールバーを作成するクラス。
//
//　●JToolBarクラスのコンストラクタ
//　　public JToolBar()
//      機能：ツールバーを作成する。
//　　public JToolBar(String s)
//      機能：タイトルsをもつツールバーを作成する。
//　　public JToolBar(String s, int d)
//      機能：タイトルs、方向dをもつツールバーを作成する。
//            水平方向：SwingConstants.HORIZONTAL (デフォルト)
//            垂直方向：SwingConstants.VERTICAL
//
//　●JToolBarクラスのメソッド
//　　public void addSeparator()
//      機能：セパレータを追加する。
//
//　●javax.swing.JComponentクラスから継承したメソッド
//　　public void setToolTipText(String s)
//      機能：ツールチップのテキストとして、表示される文字列sを設定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

class s133 extends JFrame implements ActionListener {

  JToolBar tb;
  JButton b1,b2,b3;
  Container c;

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s133(String t) { 

    super(t);

    // フレームのコンテンツペインを取得。
    c = this.getContentPane();

    // ツールバーtbの作成。
    tb = new JToolBar("ツールバー"); 
    c.add(tb,BorderLayout.NORTH);

    // ボタンb1,b2,b3の作成。
    b1 = new JButton("赤"); 
    b1.setToolTipText("フレームを赤にする");
    b2 = new JButton("黄"); 
    b2.setToolTipText("フレームを黄にする");
    b3 = new JButton("青"); 
    b3.setToolTipText("フレームを青にする");
    // ボタンb1,b2,3とセパレータをツールバーに追加。
    tb.add(b1); 
    tb.add(b2);
    tb.addSeparator();
    tb.add(b3); 

    // イベントリスナの登録。
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
  }

  //////////////////////////////////////////////
  // ActionListenerインターフェースのメソッド //
  //////////////////////////////////////////////
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == b1 ) { c.setBackground(Color.red); }
    if( e.getSource() == b2 ) { c.setBackground(Color.yellow); }
    if( e.getSource() == b3 ) { c.setBackground(Color.blue); }
  }
    
  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレームの作成。
    s133 f = new s133("ツールバー付きフレーム");

    // フレームの大きさを設定。
    //f.setSize(300,200);
    f.setSize(640,480);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの表示。
    f.setVisible(true);
  }
}
