/*
<!--====================================================================-->
<!-- << g136a.htm >>                                                    -->
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
// << g136a.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（リスト）
//
//　　複数の項目から複数の項目を選択するリストを作成し表示する。
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
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class g136a {

  // コンストラクタ。
  g136a() {
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
    List list = new List(3,true);      
    list.add("項目１"); 
    list.add("項目２");
    list.add("項目３");
    list.add("項目４"); 
    list.add("項目５");

    // リストをフレーム内に追加。
    f.add(list);

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームを表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g136a g = new g136a();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g136a.java
% java g136a
</pre>

<img src="g136aa.jpg" width=300 height=200>
<br><br>
▼ボタンをクリック後<br>
<img src="g136ab.jpg" width=300 height=200>

</body>
</html>
*/
