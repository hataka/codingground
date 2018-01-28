/*
<!--====================================================================-->
<!-- << g128.htm >>                                                     -->
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
// << g128.java >>
//
//  ＧＵＩ（１）：レイアウトマネージャー（CardLayout）
//
//  　部品を重ねて配置する。カードをめくるようにして表示する。
//    一度に 1 枚のカードだけを表示する。
//
//  ●CardLayoutクラスのコンストラクタ　
//    CardLayout(int h, int v)
//      機能：カードレイアウトマネージャーを生成する。
//　　　　　　hは水平間隔、vは垂直間隔。
//      ・CardLayoutオブジェクトに最初に追加される部品は、コンテナが最初に
//　　　　表示されるとき、可視部品となる。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class g128 {
 
  g128() {
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
    // フレームのレイアウトマネージャをCardLayoutに設定。
    CardLayout cl = new CardLayout(20,40);
    f.setLayout(cl);

    // ボタンの作成。
    Button b1 = new Button("ボタン１");
    Button b2 = new Button("ボタン２");
    Button b3 = new Button("ボタン３");

    // ボタンをフレーム内に追加。
    f.add("button2",b2); 
    f.add("button3",b3); 
    f.add("button1",b1); 

    // フレームの背景色を設定。
    f.setBackground(Color.yellow);
    // フレームの大きさを設定。
    f.pack();
    // フレームの表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g128 g = new g128();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g128.java
% java g128
</pre>

<img src="g128.jpg" width=200 height=150>

</body>
</html>
*/
