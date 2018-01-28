/*
<!--====================================================================-->
<!-- << g129.htm >>                                                     -->
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
// << g129.java >>
//
//  ＧＵＩ（１）：レイアウトマネージャー（絶対位置指定）
//
//　　部品を任意の大きさで、任意の位置に配置する。
//
//　　レイアウトマネージャを使わないことを宣言する。
//
//　　　　setLayout(null)
//
//　●Componentクラスのメソッド
//　　void setBounds(int x, int y, int width, int height)
//　　　機能：部品を配置する。
//      x     ：ｘ座標。
//      y     ：ｙ座標。
//      width ：幅。
//      height：高さ。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class g129 {
 
  g129() {
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
    // フレームにレイアウトマネージャの不使用設定。
    f.setLayout(null);

    // ボタンの作成と配置。
    Button b1 = new Button("ボタン１");
    b1.setBounds(20,40,100,20);
    Button b2 = new Button("ボタン２");
    b2.setBounds(160,40,100,40);
    Button b3 = new Button("ボタン３");
    b3.setBounds(60,100,80,60);

    // ボタンをフレーム内に追加。
    f.add(b1);
    f.add(b2);
    f.add(b3);

    // フレームの背景色を設定。
    f.setBackground(Color.yellow);
    // フレームの大きさを設定。
    f.pack();
    // フレームの表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g129 g = new g129();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g129.java
% java g129
</pre>

<img src="g129a.jpg" width=100 height=40><br><br>

<img src="g129b.jpg" width=300 height=300>

</body>
</html>
*/
