/*
<!--====================================================================-->
<!-- << g122.htm >>                                                     -->
<!--                                                                    -->
<!--  JAVAプログラミング　　　　　　　　　　　　　　　　　　　　　　　  -->
<!--                                                                    -->
<!--====================================================================-->

<html>
<head>
  <META http-equiv=Content-Type content="text/html; charset=shift_jis">
  <title>JAVAプログラミング</title>
</head>

<body bgcolor="white" text="black">

<pre>
*/
////////////////////////////////////////////////////////////////////////////////
// << g122.java >>
//
//  ＧＵＩ（２）：レイアウトマネージャー（BorderLayout）
//
//　　North（ウインドウの上部を意味する）、South（ウインドウの下部を意味する）、
//　　West（ウインドウの左部を意味する）、East（ウインドウの右部を意味する）、
//　　Center（ウインドウの中央部を意味する）に部品を配置する。
//
//　　フレームのデフォルト・レイアウトマネージャは、BorderLayoutである。
//
//　●BorderLayoutクラスのコンストラクタ
//　　BorderLayout(int h, int v)
//　　　機能：部品を、上、下、左、右、中央に配置する。
//　　　　　　各部品の間隔は均等。
//　　　　　　部品数は最大５個まで。
//      hは部品間の水平間隔、vは部品間の垂直間隔。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 

class g122 {

  // コンストラクタ。
  g122() { 
    // フレームの作成。
    Frame f = new Frame("フレーム");

    // ボタンの作成。
    Button b1 = new Button("ボタン１");
    Button b2 = new Button("ボタン２");
    Button b3 = new Button("ボタン３");
    Button b4 = new Button("ボタン４");
    Button b5 = new Button("ボタン５");

    // フレームのレイアウトマネージャをBorderLayoutに設定。
    f.setLayout(new BorderLayout(10,10));

    // ボタンをフレーム内に追加。
    f.add("North",b1);  // 上に配置。
    f.add("South",b2);  // 下に配置。
    f.add("West",b3);   // 左に配置。
    f.add("East",b4);   // 右に配置。
    f.add("Center",b5); // 中央に配置。

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームの表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g122 g = new g122();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g122.java
% java g122
</pre>

<img src="g122.jpg" width=300 height=200>

</body>
</html>
*/
