/*
<!--====================================================================-->
<!-- << s129a.htm >>                                                    -->
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
// << s129a.java >>
//
//  Ｓｗｉｎｇ（３）：フレーム（パネル）
//
//　　フレームはコンテナとして設計されているため、通常、フレームへの文字や
//　　図形の描画は、パネルという部品に行う。
//　　パネルはフレームに追加される。
//　　パネルは、コンテナでもあり、文字や図形を描画できる部品である。
//
//　　フレームのデフォルトレイアウトマネージャはBorderLayoutである。
//
//  ●javax.swing.JPanelクラス
//    コンポーネントをグループ分けして、各グループごとに異なるレイアウト
//　　マネージャーを指定するとき、JPanelクラスが使われる。
//    デフォルトレイアウトマネージャーはFlowLayoutである。
//
//　●javax.swing.JComponentクラスから継承したメソッド
//　　protected void paintComponent(Graphics g)
//    　機能：このメソッドをオーバーライドして、描画処理を行う。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

class s129a extends JFrame{

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s129a(String t) { 

    super(t);

    // フレームのディフォルトレイアウトマネージャはBorderLayout。
    Container c = this.getContentPane();

    // パネルの作成。
    s129ap p = new s129ap();
    p.setBackground(Color.yellow);
 
    // パネルをコンテンツペイン内に追加。
    c.add(p,BorderLayout.CENTER);
  }

  //////////////////////////////
  // パネルの定義(内部クラス) //
  //////////////////////////////
  class s129ap extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawString("こんにちは",50,50);
    }
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			//swingLib.setUIFont(new Font("ＭＳ ゴシック", Font.PLAIN, 24));
			swingLib.setUIFont(new Font("Meiryo UI", Font.PLAIN, 24));
		} catch (ClassNotFoundException | InstantiationException
      | IllegalAccessException | UnsupportedLookAndFeelException ex) {
       ex.printStackTrace();
    }
    // フレームの作成。
    s129a f = new s129a("Ｓｗｉｎｇ（３）：フレーム（パネル）"); 

    // フレームの大きさを設定
    //f.setSize(300,200);
    f.setSize(1200,900);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
    // フレームの表示。
    f.setVisible(true);
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac s129a.java
% java s129a
</pre>

<img src="s129a.jpg" width=300 height=200>

</body>
</html>
*/
