/*
<!--====================================================================-->
<!-- << g125c.htm >>                                                    -->
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
// << g125c.java >>
//
//  ＧＵＩ（１）：レイアウトマネージャー（GridBagLayout）
//
//　　５個のボタンを配置する。
//　　実行すると、これらのボタンは、指定された位置関係を保存しながらウィンドウの
//　　中央に集まる。ウィンドウのサイズを変更しても、ボタンのサイズに変化はなく、
//　　指定された位置関係を保存しながら、ウィンドウの中央に集まる。
//　　デフォルトでは、部品は中央に集まるように表示される。
//
//　●GridBagConstrintsクラスの変数
//    double weightx   余分の水平領域を分配する割合を指定する。デフォルトは0。
//    double weighty   余分の垂直領域を分配する割合を指定する。デフォルトは0。
//　　int fill         部品の表示領域が部品のサイズより大きくなったとき、
//　　　　　　　　　　 どのようにするか指定する。
//                     BOTHは、部品を水平・垂直の両方向一杯に拡張する。
//                     HORIZONTALは、部品を水平方向のみ一杯に拡張する。
//                     VERTICALは、部品を垂直方向のみ一杯に拡張する。
//                     NONEは、なにもしない。
//                     デフォルトは、NONE。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 

class g125c {
 
  g125c() {
    // フレームの作成。
    Frame f = new Frame("フレーム");

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

    // ボタン１を配置する。
    f.add(b1);

    // ボタン２を行の最後まで配置する。
    gbc.gridwidth = GridBagConstraints.REMAINDER;
    gbc.weightx = 1;
    gbc.fill = GridBagConstraints.BOTH;
    gb.setConstraints(b2,gbc);
    f.add(b2);
  
    // ボタン３を次の行の先頭に配置する。
    gbc.gridx = GridBagConstraints.RELATIVE;
    gbc.gridwidth = 1; // デフォルトに戻す。
    gbc.weightx = 0; // デフォルトに戻す。
    gbc.fill = GridBagConstraints.NONE; // デフォルトに戻す。
    gb.setConstraints(b3,gbc);
    f.add(b3);

    // ボタン４を直前の部品の横に配置する。
    gb.setConstraints(b4,gbc);
    f.add(b4);

    // ボタン５を行の最後まで配置する。
    gbc.gridwidth = GridBagConstraints.REMAINDER;
    gb.setConstraints(b5,gbc);
    f.add(b5);

    // フレームの背景色を設定。
    f.setBackground(Color.yellow);
    // フレームの大きさを設定。
    f.pack();
    // フレームの表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g125c g = new g125c();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g125c.java
% java g125c
</pre>

<img src="g125ca.jpg" width=200 height=100><br><br>

<img src="g125cb.jpg" width=300 height=200>

</body>
</html>
*/