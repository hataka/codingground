/*
<!--====================================================================-->
<!-- << g137a.htm >>                                                    -->
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
// << g137a.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（テキストフィールド）
//
//　　テキストフィールドを作成し表示する。
//
//  ●TextFieldクラス
//    ユーザからの入力（文字列）用の欄で、１行分の編集するとき、TextFieldクラス
//　　を使う。
//
//  ●TextFieldクラスのコンストラクタ
//    Textfield(int c)                       
//      機能：c桁分の欄を作成する。
//    Textfield(String s)                       
//      機能：文字列分の欄に文字列sを表示する。
//    Textfield(String s, int c)                       
//      機能：c桁分の欄を用意し、文字列sを表示する。
//
//  ●TextFieldクラスのメソッド
//    public void setEchoChar(char c)                       
//      機能：エコー文字cを設定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class g137a {

  // コンストラクタ。
  g137a() {
    // フレームの作成。
    //Frame f = new Frame("フレーム");
    // フレームの作成。
    final Frame f = new Frame("g137a: フレーム ＧＵＩ部品（テキストフィールド）");
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			f.dispose();//System.exit(0);
		}
	});    // フレームの作成。
    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // テキストフィールドの作成。
    TextField t1 = new TextField("Good Morning おはよう",30);
    TextField t2 = new TextField(30);
    t2.setEchoChar('*'); // エコーされる文字を*に設定。

    // テキストフィールドをフレーム内に追加。
    f.add(t1); 
    f.add(t2);

    // フレームの大きさを設定。
    f.setSize(640,480);
	f.setLocationRelativeTo(null);

   // フレームを表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g137a g = new g137a();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g137a.java
% java g137a
</pre>

<img src="g137aa.jpg" width=300 height=200>
<br><br>
上段のテキストフィールドから文字列(Good Morning)を削除<br>
<img src="g137ab.jpg" width=300 height=200>
<br><br>
下段のテキストフィールドに文字列(abc)を挿入<br>
<img src="g137ac.jpg" width=300 height=200>

</body>
</html>
*/
