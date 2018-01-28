/*
<!--====================================================================-->
<!-- << g132a.htm >>                                                    -->
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
// << g132a.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（ボタン）
//
//　　２個のボタンを表示する。
//
//　●Buttonクラス
//　　on/offの選択のときにButtonクラスを使う。
//
//  ●Buttonクラスのコンストラクタ
//    Button(String s)      
//      機能：文字列sをもつボタンを生成する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class g132a {

  // コンストラクタ。
  g132a() {
    // フレームの作成。
    //Frame f = new Frame("フレーム");
    // フレームの作成。
    final Frame f = new Frame("フレーム");
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			f.dispose();
			//System.exit(0);
		}
	});
    // ボタンの作成。
    Button b1 = new Button("ボタン１");
    Button b2 = new Button("ボタン２");

    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // ボタンをフレーム内に追加。
    f.add(b1);
    f.add(b2);

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームを表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g132a g = new g132a();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g132a.java
% java g132a
</pre>

<img src="g132a.jpg" width=300 height=200>

</body>
</html>
*/
