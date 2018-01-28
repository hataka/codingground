/*
<!--====================================================================-->
<!-- << g134a.htm >>                                                    -->
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
// << g134a.java >>
//
//  ＧＵＩ（２）：ＧＵＩ部品（チェックボックスボタン）
//
//　　3個の項目を持つチェックボックスを作成し表示する。
//
//  ●Checkboxクラス
//    複数の項目のon/offを選択するとき、Checkboxクラスを使う。
//
//  ●Checkboxクラスのコンストラクタ
//    Checkbox(文字列)                       
//      機能：文字列を項目に加える。項目はチェックされていない状態に設定される。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class g134a {

  // コンストラクタ。
  g134a() {
    // フレームの作成。
    final Frame f = new Frame("フレーム");
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			f.dispose();
			//System.exit(0);
		}
	});    // フレームの作成。

    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // チェックボックスボタンの作成。
    Checkbox c1 = new Checkbox("アントラーズ");
    Checkbox c2 = new Checkbox("ジュビロ");
    Checkbox c3 = new Checkbox("サンガ");

    // チェックボックスボタンをフレーム内に追加。
    f.add(c1);
    f.add(c2);
    f.add(c3);

    // フレームの大きさを設定。
    f.setSize(300,200);

    // フレームを表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g134a g = new g134a();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g134a.java
% java g134a
</pre>

<img src="g134aa.jpg" width=300 height=200>
<br><br>
アントラーズとジュビロを選択<br>
<img src="g134ab.jpg" width=300 height=200>

</body>
</html>
*/
