/*
<!--====================================================================-->
<!-- << g126b.htm >>                                                    -->
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
// << g126b.java >>
//
//  ＧＵＩ（１）：レイアウトマネージャー（GridBagLayout）
//
//　　２個のボタンを市松模様に配置する。
//    見栄えを少しよくするために、部品の回りに余白を付ける。
//
//　●Insetsクラス
//　　部品の周りに余白を作るには、Insetsクラスを使う。
//
//　●Insetsクラスのコンストラクタ
//　　Insets(int top, int left, int bottom, int right)
//      機能：部品の外側の余白を作る。
//            デフォルトは、0,0,0,0。
//
//  ●GridBagLayoutクラスの変数
//　　Insets insets
//      機能：部品の外側の余白を指定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 

class g126b {
 
  g126b() {
    // フレームの作成。
    Frame f = new Frame("フレーム");

    // フレームのレイアウトマネージャをGridBagLayoutに設定。
    GridBagLayout gb = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    f.setLayout(gb);

    // ボタンの作成。
    Button b1 = new Button("ボタン１");
    Button b2 = new Button("ボタン２");

    // ボタン１を(1,0)から(2,1)に配置する。
    gbc.gridx = 1;
    gbc.gridy = 0;
    gb.setConstraints(b1,gbc);
    f.add(b1);

    // ボタン２を(0,1)から(1,2)に配置する。
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.insets = new Insets(10,10,10,10);
    gbc.weightx = 1.0;
    gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    gb.setConstraints(b2,gbc);
    f.add(b2);

    // フレームの背景色を設定。
    f.setBackground(Color.yellow);
    // フレームの大きさを設定。
    f.pack();
    // フレームの表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g126b g = new g126b();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g126b.java
% java g126b
</pre>

<img src="g126ba.jpg" width=200 height=130><br><br>

<img src="g126bb.jpg" width=300 height=200>

</body>
</html>
*/
