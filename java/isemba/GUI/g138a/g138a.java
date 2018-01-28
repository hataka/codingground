/*
<!--====================================================================-->
<!-- << g138a.htm >>                                                    -->
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
// << g138a.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（テキストエリア）
//
//　　テキストエリアを作成し表示する。
//
//  ●TextAreaクラス
//    ユーザからの入力（文字列）用の欄（複数行分ある）で、編集するとき、TextArea
//　　クラスを使う。
//    水平スクロールバー、垂直スクロールバーを設定できる。
//
//  ●TextAreaクラスのコンストラクタ
//    TextArea(int r, int c)                       
//      機能：r行、c列のテキストエリアを作成する。
//    TextArea(String s, int r, int c)                       
//      機能：文字列sを表示するr行c列のテキストエリアを作成する。
//    TextArea(String s, int r, int c, int scr)                       
//      機能：文字列sを表示するr行c列のテキストエリアを作成する。
//            static int SCROLLBARS_BOTH  水平・垂直スクロールバーを設定
//            static int SCROLLBARS_HORIZONTAL_ONLY  水平スクロールバーを設定
//            static int SCROLLBARS_VERTICAL_ONLY  垂直スクロールバーを設定
//            static int SCROLLBARS_NONE  スクロールバーを設定しない
//
//  　・TextAreaクラスのクラス階層
//　　　java.lang.Object --> java.awt.Component --> java.awt.TextComponent -->
//    　java.awt.TextArea
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class g138a {

  // コンストラクタ。
  g138a() {
    // フレームの作成。
    //Frame f = new Frame("フレーム");
    // フレームの作成。
    final Frame f = new Frame("フレーム");
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			f.dispose();//System.exit(0);
		}
	});    // フレームの作成。
    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // テキストエリア生成。
    TextArea t1 = new TextArea("こんにちは",3,30,TextArea.SCROLLBARS_BOTH);
    TextArea t2 = new TextArea(3,30);

    // テキストエリアをフレーム内に追加。
    f.add(t1);
    f.add(t2);

    // フレームの大きさを設定。
    f.setSize(300,300);
    // フレームを表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g138a g = new g138a();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g138a.java
% java g138a
</pre>

<img src="g138aa.jpg" width=300 height=300>
<br><br>
上段のテキストエリアに文字列(さようなら)を追加<br>
<img src="g138ab.jpg" width=300 height=300>

</body>
</html>
*/
