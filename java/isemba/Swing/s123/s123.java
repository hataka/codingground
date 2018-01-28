////////////////////////////////////////////////////////////////////////////////
// << s123.java >>
//
//  Ｓｗｉｎｇ（２）：部品（コンボボックス、イベント処理）
//
//　　「赤」項目をクリックすると、フレームの背景色が赤になる。
//　　「緑」項目をクリックすると、フレームの背景色が緑になる。
//
//　●javax.swing.JComboBoxクラス
//　　複数の項目からひとつ選ぶとき、JComboBoxクラスを使う。
//　　通常は、複数の項目のひとつが表示されているが、コンボボックスをクリック
//　　すると、項目の一覧が表示され任意の項目を選択できる。
//
//  ●JComboBoxクラスのメソッド
//    public void addItem(Object obj)                       
//      機能：項目リストの最後に項目objを加える。
//    public void insertItemAt(Object obj, int p)                       
//      機能：項目リストの指定された位置pに項目objを挿入する。0が先頭。
//    public void removeItem(Object obj)                       
//      機能：項目リストから項目objを削除する。
//    public void removeItemAt(int p)                       
//      機能：項目リストの位置pから項目を削除する。
//    public Object getSelectedItem()
//      機能：現在選択されている項目を返す。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

class s123 extends JFrame implements ActionListener {

  Container c;
  JComboBox cb;

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s123(String s) { 

    super(s);

    // フレームからコンテンツペインを取得。
    c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをFlowLayoutに設定。
    c.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

    // コンボボックスの作成。
    cb = new JComboBox();

    // 項目を追加。
    cb.addItem("赤");
    cb.addItem("緑");

    // コンボボックスをコンテンツペイン内に追加。
    c.add(cb);

    // イベントリスナの登録。
    cb.addActionListener(this);
  }

  //////////////////////////////////////////////
  // ActionListenerインターフェースのメソッド //
  //////////////////////////////////////////////
  public void actionPerformed(ActionEvent e) {

    // コンボボックスからイベントが発生した場合、実行される。   
    if( e.getSource() == cb ) {
      String s = (String)cb.getSelectedItem();
      if( s.equals("赤") ) { c.setBackground(Color.red); }
      if( s.equals("緑") ) { c.setBackground(Color.green); }
    }
  }

  ///////////////////
  // mainjメソッド //
  ///////////////////
  public static void main(String[] args) {

    // フレームの作成。
    s123 f = new s123("フレーム");

    // フレームの大きさを設定。
    //f.setSize(300,200);
    f.setSize(640,480);
  	f.setLocationRelativeTo(null);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // フレームの表示。
    f.setVisible(true);
  }
}
