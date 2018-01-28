////////////////////////////////////////////////////////////////////////////////
// << s126.java >>
//
//  Ｓｗｉｎｇ（２）：部品（リスト、イベント処理）
//
//　　リスト中の複数項目を選択し、ラベルに表示する。
//　　項目をクリックして複数の項目を選択する。
//
//    ・クリックした項目から、Shiftキーを押しながらクリックした項目までが
//　　　連続して選択される。
//　　・Cntlキーを押しながら選択した項目が飛び飛びに選択される。
//
//  ●javax.swing.JListクラス
//    多数の項目から複数の項目を選択するとき、JListクラスを使う。
//　
//  ●JListクラスのコンストラクタ
//    public JList(Object[] item)                       
//      機能：配列itemの要素を表示するリストを作成する。
//
//  ●JListクラスのメソッド
//    public Object[] getSelectedValues()                       
//      機能：選択されている項目をすべて返す。
//    public void setVisibleRowCount(int r)                       
//      機能：項目がr個以内の場合、スクロールバーは表示されない。r個を越えると、
//　　　　　　スクロールバーが表示される。
// 
//  ●javax.swing.JScrollPaneクラス
//    部品をスクロールためのクラスで、部品に含まれる多数のデータを
//　　表示するときに使われる。
//
//  ●JScrollPaneクラスのコンストラクタ
//　  public JScrollPane(Component v)
//      機能：部品vのデータを表示するJScrollPaneを作成する。
//　　　　　　部品のデータが多く、表示領域を超える場合、水平および垂直
//　　　　　　スクロールバーの両方が表示される。
//
//　●javax.swing.event.ListSelectionListenerインターフェースのメソッド
//    void valueChanged(ListSelectionEvent e)
//      機能：イベントが発生したとき呼び出される。
//            ListSelectionEventクラスのオブジェクトeにイベントの状況が
//　　　　　　記録されている。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class s126 extends JFrame implements ListSelectionListener {

  JLabel lab;
  JList list;

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s126(String t) { 

    super(t);
 
    // フレームからコンテンツペインを取得。
    Container c = this.getContentPane(); 

    // リストの生成。
    String a[] = new String[8];
    a[0] = "項目１"; a[1] = "項目２"; a[2] = "項目３"; a[3] = "項目４";
    a[4] = "項目５"; a[5] = "項目６"; a[6] = "項目７"; a[7] = "項目８";
    list = new JList(a);  
    list.setVisibleRowCount(5);                 

    // スクロールペインの作成。
    // リストは自動的にスクロールしないので、リストをスクロールペインに入れる。
    JScrollPane sp = new JScrollPane(list);

    // ラベルの生成。
    lab = new JLabel("ここに表示される");

    // スクロールペインとラベルをコンテンツペイン内に追加。
    c.add(sp, BorderLayout.NORTH);
    c.add(lab, BorderLayout.CENTER);

    // イベントリスナの登録。
    list.addListSelectionListener(this);
  }

  /////////////////////////////////////////////////////
  // ListSelectionListenerインターフェースのメソッド //
  /////////////////////////////////////////////////////
  public void valueChanged(ListSelectionEvent e) {

    Object[] item = list.getSelectedValues();
    String t = "";
    for( int i=0; i<item.length; i++ ) {
      String s = (String)item[i];
      t = t + "　" + s;
    }
    lab.setText(t);
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
    s126 f = new s126("Ｓｗｉｎｇ（２）：部品（リスト、イベント処理）");

    // フレームの大きさを設定。
    f.setSize(800,600);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
    // フレームの表示。
    f.setVisible(true);
  }
}
