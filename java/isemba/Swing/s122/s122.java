////////////////////////////////////////////////////////////////////////////////
// << s122.java >>
//
//  Ｓｗｉｎｇ（２）：部品（ボタン、イベント処理）
//
//　　「赤」ボタンをクリックすると、フレームの背景色が赤になる。
//　　「緑」ボタンをクリックすると、フレームの背景色が緑になる。
//
//　●javax.swing.JButtonクラス
//　　on/offの選択のときにJButtonクラスを使う。
//
//  ●JButtonクラスのコンストラクタ
//    public JButton(String s)      
//      機能：文字列sをもつボタンを作成する。
//
//　●java.awt.event.ActionListenerインターフェースのメソッド
//    pulic void actionPerformed(ActionEvent e)
//      機能：イベントが発生したとき呼び出される。
//            ActionEventクラスのオブジェクトeには、イベント発生時の状況が
//　　　　　　記録されている。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class s122 extends JFrame implements ActionListener {

  JButton b1,b2; // コンストラクタとメソッド(actionPerformed)で使われるため、
                 // インスタンス変数にする。
  Container c;   // b1,b2と同様。

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s122(String s) { 

    super(s);

    // フレームからコンテンツペインを取得。
    c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをFlowLayoutに設定。
    c.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));

    // ボタンの作成。
    b1 = new JButton("赤");
    b2 = new JButton("緑");

    // ボタンをコンテンツペイン内に追加。
    c.add(b1);
    c.add(b2);

    // イベントリスナの登録。
    b1.addActionListener(this);
    b2.addActionListener(this);
  }

  //////////////////////////////////////////////
  // ActionListenerインターフェースのメソッド //
  //////////////////////////////////////////////
  public void actionPerformed(ActionEvent e) {

    // ボタンがクリックされたとき、実行される。
    if( e.getSource() == b1 ) { c.setBackground(Color.red); }
    if( e.getSource() == b2 ) { c.setBackground(Color.green); }
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレームの作成。
    s122 f = new s122("フレーム");

    // フレームの大きさを設定。
    f.setSize(300,200);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの表示。
    f.setVisible(true);
  }
}
