/*
<!--====================================================================-->
<!-- << g139a.htm >>                                                    -->
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
// << g139a.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（パネル）
//
//　　パネルを作成し表示する。
//
//  ●Panelクラス
//    部品をグループ分けして、各グループごとに異なるレイアウトマネージャーを
//　　指定するとき、Panelクラスを使う。
//
//  ●Panelクラスのコンストラクタ　
//    Panel()
//      機能：デフォルトのレイアウトマネージャーを使ってパネル
//　　　　　　（部品を搭載するコンテナ）を作成する。
//    Panel(LayoutManager lm)
//      機能：指定のレイアウトマネージャーlmを使ってパネル
//　　　　　　（部品を搭載するコンテナ）を作成する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class g139a {

  // コンストラクタ。
  g139a() {
    // フレームの作成。
    //Frame f = new Frame("フレーム");
    // フレームの作成。
    final Frame f = new Frame("フレーム");
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			f.dispose();//System.exit(0);
		}
	});    // フレームの作成。
    // フレームのレイアウトマネージャをBorderLayoutに設定。
    f.setLayout(new BorderLayout());

    // パネル(p1)の作成。
    Panel p1 = new Panel();

    // パネル(p1)のレイアウトマネージャをFlowLayoutに設定。
    p1.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

    // ボタンの作成。
    Button b1 = new Button("ボタン１");
    Button b2 = new Button("ボタン２");

    // ボタンをパネル(p1)内に追加。
    p1.add(b1); p1.add(b2);

    // パネル(p2)の作成。
    // パネル(p2)のレイアウトマネージャをGridLayoutに設定。
    Panel p2 = new Panel(new GridLayout());

    // ボタンの作成。
    Button b3 = new Button("ボタン３");
    Button b4 = new Button("ボタン４");

    // ボタンをパネル(p2)内に追加。
    p2.add(b3); 
    p2.add(b4);

    // パネル(p1,p2)をフレーム内に追加。
    f.add("North",p1);
    f.add("South",p2);

    // ボタンをフレーム内に追加。
    f.add("Center",new Button("中央ボタン"));

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームを表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g139a g = new g139a();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g139a.java
% java g139a
</pre>

<img src="g139a.jpg" width=300 height=200>

</body>
</html>
*/
