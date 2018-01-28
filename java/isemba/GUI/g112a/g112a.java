/*
<!--====================================================================-->
<!-- << g112a.htm >>                                                    -->
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
// << g112a.java >>
//
//  ＧＵＩ（１）：フレームウィンドウ（生成、表示、非表示）
//
//　　フレームと呼ばれるウィンドウ(タイトル付き)を表示する。
//
//  ●Frameクラスのコンストラクタ
//    Frame(String s)
//      機能：タイトルsをもつ非表示のFrameオブジェクトを生成する。
//
//  ●Frameクラスのメソッド
//    void setTitle(String s)  
//      機能：文字列sをタイトルとする。
//
//  ●Componentクラスのメソッド
//    void setForeground(Color c)
//      機能：コンポーネントのフォアグラウンドの色をcに設定。
//    void setBackground(Color c)
//      機能：コンポーネントのバックグラウンドの色をcに設定。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 

class g112a {

  // コンストラクタ。
  g112a() {
    // フレームの作成。
    Frame f = new Frame("フレーム");
    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームの背景色を設定。
    f.setBackground(Color.red);
    // フレームを表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g112a g = new g112a();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g112a.java
% java g112a
</pre>

<img src="g112a.jpg" width=300 height=200>

</body>
</html>
*/
