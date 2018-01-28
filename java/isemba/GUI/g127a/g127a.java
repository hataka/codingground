/*
<!--====================================================================-->
<!-- << g127a.htm >>                                                    -->
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
// << g127a.java >>
//
//  ＧＵＩ（１）：レイアウトマネージャー（GridBagLayout）
//
//　　３個のボタンを配置する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*;

class g127a {
 
  g127a() {
    // フレームの作成。
    final Frame f = new Frame("フレーム");
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			f.dispose();
			//System.exit(0);
		}
	});

    // フレームのレイアウトマネージャをGridBagLayoutに設定。
    GridBagLayout gb = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    f.setLayout(gb);

    // ボタンの作成。
    Button b1 = new Button("ボタン１");
    Button b2 = new Button("ボタン２");
    Button b3 = new Button("ボタン３");

    // ボタン１を第１列に配置する。
    gbc.gridheight = GridBagConstraints.REMAINDER;
    gbc.weightx = 1.0;
    gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    gb.setConstraints(b1,gbc);
    f.add(b1);

    // ボタン２を第２列・上段に配置する。
    gbc.gridheight = 1; // デフォルトに戻す。
    gb.setConstraints(b2,gbc);
    f.add(b2);

    // ボタン３を第２列・下段に配置する。
    gbc.gridheight = GridBagConstraints.REMAINDER;
    gb.setConstraints(b3,gbc);
    f.add(b3);

    // フレームの背景色を設定。
    f.setBackground(Color.yellow);
    // フレームの大きさを設定。
    f.pack();
    // フレームの表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g127a g = new g127a();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g127a.java
% java g127a
</pre>

<img src="g127aa.jpg" width=200 height=100><br><br>

<img src="g127ab.jpg" width=300 height=200>

</body>
</html>
*/
