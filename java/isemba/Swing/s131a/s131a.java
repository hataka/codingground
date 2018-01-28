/*
<!--====================================================================-->
<!-- << s131a.htm >>                                                    -->
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
////////////////////////////////////////////////////////////////////////////////
// << s131a.java >>
//
//  Ｓｗｉｎｇ（３）：フレーム（メニュー、表示と非表示）
//
//　　フレームウィンドウは、メニューバーを含む。
//　　メニューバーは、メニューを含む。
//　　メニューは、メニュー項目を含む。
//
//  ●javax.swing.JMenuBarクラス、javax.swing.JMenuクラス、
//    javax.swing.JMenuItemクラス
//　　フレームウィンドウにメニューバーを追加するのに、JMenuBarクラスを使う。
//　　メニューバーにメニューを追加するのに、JMenuクラスを使う。
//　　メニューにメニュー項目を追加するのに、JMenuItemクラスを使う。
//
//  ●javax.swing.JFrameクラスのメソッド
//    public void setJMenuBar(JMenuBar mb)
//　　　機能：メニューバーmbをフレーム内に追加する。
//
//  ●JMenuBarクラスのコンストラクタ
//    public JMenuBar()
//　　　機能：メニューバーを作成する。
//
//  ●JMenuBarクラスのメソッド
//　　public JMenu add(JMenu m)
//      機能：メニューバーの末尾にメニューmを追加する。
//
//  ●JMenuクラスのコンストラクタ
//　　public JMenu(String s)
//      機能：文字列sをテキストとして持つメニューを作成する。 
//
//  ●JMenuクラスのメソッド
//　　public JMenuItem add(JMenuItem m)
//      機能：メニューの最後にメニュー項目mを追加する。
//　　public JMenuItem add(String s)
//      機能：テキストsを持つ新しいメニュー項目を作成して、このメニューの末尾に
//            追加する。 
//
//  ●JMenuItemクラスのコンストラクタ
//　　public JMenuItem(String s)
//      機能：テキストsでメニュー項目を作成する。
//
////////////////////////////////////////////////////////////////////////////////
*/
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

class s131a extends JFrame {

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s131a(String t) { 

    super(t);

    // メニューバーmbの作成。
    JMenuBar mb = new JMenuBar();
    // メニューバーmbをフレーム内に追加。
    this.setJMenuBar(mb);

    // メニューmの作成。
    JMenu m = new JMenu("メニュー");
    // メニューmをメニューバーmb内に追加。
    mb.add(m);

    // メニュー項目の作成。
    JMenuItem mi1 = new JMenuItem("項目１");
    JMenuItem mi2 = new JMenuItem("項目２");
    JMenuItem mi3 = new JMenuItem("項目３");
    // メニュー項目のメニューm内への追加。
    m.add(mi1);
    m.add(mi2);
    m.add(mi3);
  }
    
  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレームの作成。
    s131a f = new s131a("メニュー付きフレームウィンドウ");

    // フレームのサイズを設定。
    f.setSize(300,200);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの表示。
    f.setVisible(true);
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac s131a.java
% java s131a
</pre>

実行直後<br>
<img src="s131aa.jpg" width=300 height=200><br><br>

「メニュー」のクリック後<br>
<img src="s131ab.jpg" width=300 height=200>

</body>
</html>
*/
