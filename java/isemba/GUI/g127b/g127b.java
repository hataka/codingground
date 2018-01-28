/*
<!--====================================================================-->
<!-- << g127b.htm >>                                                    -->
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
// << g127b.java >>
//
//  ＧＵＩ（１）：レイアウトマネージャー（GridBagLayout）
//
//　　６個のボタンを配置する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class g127b {
 
  g127b() {
    // フレームの作成。
    final Frame f = new Frame("フレーム");
    f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			f.dispose();
			//System.exit(0);
		}
	});
	//Frame f = new Frame("フレーム");

    // フレームのレイアウトマネージャをGridBagLayoutに設定。
    GridBagLayout gb = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    f.setLayout(gb);

    // ボタンの作成。
    Button b1 = new Button("ボタン１");
    Button b2 = new Button("ボタン２");
    Button b3 = new Button("ボタン３");
    Button b4 = new Button("ボタン４");
    Button b5 = new Button("ボタン５");
    Button b6 = new Button("ボタン６");

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

    // ボタン４を第３列・上段に配置する。
    gbc.gridheight = 1; // デフォルトに戻す。
    gb.setConstraints(b4,gbc);
    f.add(b4);

    // ボタン５を第３列・中段に配置する。
    gb.setConstraints(b5,gbc);
    f.add(b5);

    // ボタン６を第３列・下段に配置する。
    gbc.gridheight = GridBagConstraints.REMAINDER;
    gb.setConstraints(b6,gbc);
    f.add(b6);

    // フレームの背景色を設定。
    f.setBackground(Color.yellow);
    // フレームの大きさを設定。
    f.pack();
    // フレームの表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g127b g = new g127b();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g127b.java
% java g127b
</pre>

<img src="g127ba.jpg" width=200 height=100><br><br>

<img src="g127bb.jpg" width=300 height=200>

</body>
</html>
*/