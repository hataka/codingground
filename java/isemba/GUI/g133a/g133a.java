/*
<!--====================================================================-->
<!-- << g133a.htm >>                                                    -->
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
// << g133a.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（チョイスボタン）
//
//　　チョイスボタンを表示する。
//
//　●Choiceクラス
//　　複数の項目からひとつ選ぶとき、Choiceクラスを使う。
//
//  ●Choiceクラスのメソッド
//    public void add(String s)                       
//      機能：文字列sを項目に加える。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class g133a {

  // コンストラクタ。
  g133a() {
    // フレームの作成。
    final Frame f = new Frame("フレーム");
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			f.dispose();
			//System.exit(0);
		}
	});    // フレームの作成。

    // チョイスボタンの作成。
    Choice cb = new Choice();

    // 項目を追加。
    cb.addItem("アントラーズ");
    cb.addItem("ジュビロ");
    cb.addItem("サンガ");

    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // チョイスボタンをフレーム内に追加。
    f.add(cb);

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームを表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g133a g = new g133a();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g133a.java
% java g133a
</pre>

<img src="g133aa.jpg" width=300 height=200>
<br><br>
▼ボタンをクリック後<br>
<img src="g133ab.jpg" width=300 height=200>

</body>
</html>
*/
