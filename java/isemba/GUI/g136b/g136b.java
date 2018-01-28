/*
<!--====================================================================-->
<!-- << g136b.htm >>                                                    -->
<!--                                                                    -->
<!--  JAVAプログラミング　　　　　　　　　　　　　　　　　　　　　　　  -->
<!--                                                                    -->
<!--====================================================================-->

<html>
<head>
  <title>JAVAプログラミング</title>
</head>

<body bgcolor="white" text="black">

<pre>
*/
////////////////////////////////////////////////////////////////////////////////
// << g136b.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（リスト、イベント処理）
//
//　　複数の項目から複数の項目を選択するリストを作成し表示する。
//    選択ボタンをクリックすると、選択された項目をラベルに表示する。
//
//  ●Listクラス
//    多数の項目から複数の項目を選択するとき、Listクラスを使う。
//
//  ●Listクラスのコンストラクタ
//    List(int r, boolean b)                       
//      機能：r行分のリストを作成する。bがtrueの場合、複数項目選択が可能となる。
//            bがfalseの場合、複数選択が不可。
//
//  ●Listクラスのメソッド
//    public void add(String s)
//　　　機能：文字列sをリストの最後に追加する。
//    public String getSelectedItem()
//      機能：現在選択されている項目を返す。
//            選択されている項目がない場合、nullを返す。
//    public int getSelectedIndex()
//      機能：現在選択されている項目のインデックスを返す。
//            選択されている項目がない場合、-1を返す。
//    public String a[] getSelectedItems()
//      機能：現在選択されている項目を配列aとして返す。
//
//　●ItemListenerインターフェースのメソッド
//    void itemStateChanged(ItemEvent e)
//      機能：イベントが発生したとき呼び出される。
//      e   ：イベント発生時の状況が記録されている。
//
//　●ActionListenerインターフェースのメソッド
//    void actionPerformed(ActionEvent e)
//      機能：イベントが発生したとき呼び出される。
//      e   ：イベント発生時の状況が記録されている。
//
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class g136b implements ItemListener,ActionListener {

  List list;
  Button b;
  Label lab;

  // コンストラクタ。
  g136b() {
    // フレームの作成。
    //Frame f = new Frame("フレーム");
    // フレームの作成。
    final Frame f = new Frame("フレーム");
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			f.dispose();//System.exit(0);
		}
	});    // フレームの作成。
    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // リストの作成。
    list = new List(3,true);      
    list.add("項目１"); 
    list.add("項目２");
    list.add("項目３");
    list.add("項目４"); 
    list.add("項目５");
    // リストをフレーム内に追加。
    f.add(list);

    // ボタンの作成
    b = new Button("選択"); 
    // ボタンをフレーム内に追加。
    f.add(b);

    // 表示用ラベルの作成。
    lab = new Label("　　　　　　　　　　　　　　　　　　　　");
    lab.setBackground(Color.yellow);
    // ラベルをフレーム内に追加。
    f.add(lab);

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームを表示。
    f.setVisible(true);

    // イベントリスナを登録。
    list.addItemListener(this);
    b.addActionListener(this);
  }

  // ItemListenerインターフェースのメソッド。
  public void itemStateChanged(ItemEvent e) {
    if( e.getSource() == list ) {
      String x = list.getSelectedItem();
      int i = list.getSelectedIndex();
      lab.setText("選択された項目：" + x + " インデックス：" + i);
    }
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == b ) {
      String x[] = list.getSelectedItems();
      String y = "選択された項目：";
      for( int i=0; i<x.length; i++ ) { y = y + " " + x[i]; }
      lab.setText(y);
    }
  }

  public static void main(String[] args) {
    g136b g = new g136b();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g136b.java
% java g136b
</pre>

<img src="g136ba.jpg" width=300 height=200>
<br><br>
項目１と項目３を選択し、選択ボタンをクリック後<br>
<img src="g136bb.jpg" width=300 height=200>
<br><br>
▼ボタンで項目５を表示・選択し、選択ボタンをクリック後<br>
<img src="g136bc.jpg" width=300 height=200>

</body>
</html>
*/
