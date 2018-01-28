/*
<!--====================================================================-->
<!-- << s116d.htm >>                                                    -->
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
// << s116d.java >>
//
//  Ｓｗｉｎｇ（１）：レイアウトマネージャー（GridBagLayout）
//
//    見栄えを少しよくするために、部品の回りや内部に余白を付ける。
//
//　●Insetsクラス
//　　部品の周りに余白を作るには、Insetsクラスを使う。
//
//　●Insetsクラスのコンストラクタ
//　　public Insets(int top, int left, int bottom, int right)
//      機能：部品の外側の余白を作る。
//            デフォルトは、0,0,0,0。
//
//  ●GridBagLayoutクラスの変数
//　　Insets insets
//      機能：部品の外側の余白を指定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

class s116d extends JFrame {

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s116d(String s) {

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
    gbc.fill = GridBagConstraints.BOTH;
    gbc.insets = new Insets(10,10,10,10);
    gb.setConstraints(b1,gbc);
    c.add(b1);

    // ボタン２を(1,1)から(2,2)に配置する。
    gbc.gridx = 1; gbc.gridy = 1;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.insets = new Insets(10,10,10,10);
    gb.setConstraints(b2,gbc);
    c.add(b2);
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレーム１の作成。
    s116d f1 = new s116d("フレーム１");
    // フレームの大きさを設定。
    f1.setSize(300,200);
    // フレームの位置を設定。
    f1.setLocation(0,0);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレームの表示。
    f1.setVisible(true);

    // フレーム２の作成。
    s116d f2 = new s116d("フレーム２");
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
% javac s116d.java
% java s116d
</pre>

フレーム１<br>
<img src="s116da.jpg" width=300 height=200><br><br>

フレーム２<br>
<img src="s116db.jpg" width=360 height=240>

</body>
</html>
*/