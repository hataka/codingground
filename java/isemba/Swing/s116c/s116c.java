/*
<!--====================================================================-->
<!-- << s116c.htm >>                                                    -->
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
// << s116c.java >>
//
//  Ｓｗｉｎｇ（１）：レイアウトマネージャー（GridBagLayout）
//
//　　２個のボタンを配置する。これらのボタンは、指定された位置関係を保存しながら
//　　表示される。
//
//　●GridBagConstraintsクラスの変数
//    double weightx   ウィンドウの大きさが大きくなったとき、余分の水平領域が
//　　　　　　　　　　 部品に設定されたweightxの割合によって分配される。
//　　　　　　　　　　 0に設定すると初期サイズに固定される。
//    double weighty   ウィンドウの大きさが大きくなったとき、余分の垂直領域が
//　　　　　　　　　　 部品に設定されたweightyの割合によって分配される。
//　　　　　　　　　　 0に設定すると初期サイズに固定される。
//　　int fill         部品の表示領域が部品のサイズより大きくなったとき、
//　　　　　　　　　　 どのようにするか指定する。
//                     GridBagConstraints.BOTH        部品を水平・垂直の両方向
//                                                    一杯に拡張する。
//                     GridBagConstraints.HORIZONTAL  部品を水平方向一杯に
//                                                    拡張する。
//                     GridBagConstraints.VERTICAL    部品を垂直方向一杯に
//                                                    拡張する。
//                     GridBagConstraints.NONE        なにもしない。
//　
////////////////////////////////////////////////////////////////////////////////


import java.awt.*; 
import javax.swing.*;

class s116c extends JFrame {

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s116c(String s) {

    super(s);

    // フレームからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをGridBagLayoutに設定。
    GridBagLayout gb = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    c.setLayout(gb);

    // ボタンの作成。
    JButton b1 = new JButton("ボタン１");
    JButton b2 = new JButton("ボタン２");

    // ボタン１を(0,0)から(1,1)に配置する。
    gbc.gridx = 0; gbc.gridy = 0;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.VERTICAL;
    gb.setConstraints(b1,gbc);
    c.add(b1);

    // ボタン２を(1,1)から(2,2)に配置する。
    gbc.gridx = 1; gbc.gridy = 1;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    gb.setConstraints(b2,gbc);
    c.add(b2);
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレーム１の作成。
    s116c f1 = new s116c("フレーム１");
    // フレームの大きさを設定。
    f1.setSize(300,200);
    // フレームの位置を設定。
    f1.setLocation(0,0);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレームの表示。
    f1.setVisible(true);

    // フレーム２の作成。
    s116c f2 = new s116c("フレーム２");
    // フレームの大きさを設定。
    f2.setSize(360,240);
    // フレームの位置を設定。
    f2.setLocation(0,300);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレームの表示。
    f2.setVisible(true);
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font><br>

<pre>
% javac s116c.java
% java s116c
</pre>

フレーム１<br>
<img src="s116ca.jpg" width=300 height=200><br><br>

フレーム２<br>
<img src="s116cb.jpg" width=360 height=240>

</body>
</html>
*/
