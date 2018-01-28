/*
<!--====================================================================-->
<!-- << g124b.htm >>                                                    -->
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
// << g124b.java >>
//
//  ＧＵＩ（１）：レイアウトマネージャー（GridBagLayout）
//
//　　GridBagLayoutマネージャーを使うと、異なる大きさの部品を縦横に柔軟に配置
//　　することができる。
//
//　　３個のボタンを横に配置する。
//　　実行すると、これらのボタンは、指定された位置関係を保存しながらウィンドウの
//　　中央に集まる。ウィンドウのサイズを変更しても、ボタンのサイズに変化はなく、
//　　指定された位置関係を保存しながら、ウィンドウの中央に集まる。
//　　デフォルトでは、部品は中央に集まるように表示される。
//
//　●GridBagConstrintsクラスの変数
//    int gridx        部品の位置が左からgridx+1列目であることを指定する。
//　　　　　　　　　　 すなわち、gridx=0が１列目、gridx=1が２列目、・・・。
//                     GridBagConstraints.RELATIVEと指定すると、直前に配置された
//　　　　　　　　　　 部品の右に配置される。
//　　　　　　　　　　 デフォルトは、gridx = 0 である。 
//    int gridy        部品の位置が上からgridy+1行目であることを指定する。
//　　　　　　　　　　 すなわち、gridy=0が１行目、gridy=1が２行目、・・・。
//                     GridBagConstraints.RELATIVEと指定すると、直前に配置された
//　　　　　　　　　　 部品の下に配置される。
//　　　　　　　　　　 デフォルトは、gridy = 0 である。 
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 

class g124b {
 
  g124b() {
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

    // ボタン１を配置する。
    gbc.gridx = GridBagConstraints.RELATIVE;
    gb.setConstraints(b1,gbc);
    f.add(b1);

    // ボタン２を直前の部品の横に配置する。
    gbc.gridx = GridBagConstraints.RELATIVE; // 省略可。
    gb.setConstraints(b2,gbc);
    f.add(b2);
  
    // ボタン３を直前の部品の横に配置する。
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
    g124b g = new g124b();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g124b.java
% java g124b
</pre>

<img src="g124ba.jpg" width=200 height=100><br><br>

<img src="g124bb.jpg" width=300 height=200>

</body>
</html>
*/
