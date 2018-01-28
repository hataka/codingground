/*
<!--====================================================================-->
<!-- << g135a.htm >>                                                    -->
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
// << g135a.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（ラジオボタン）
//
//　　３個の項目のからなるラジオボタンを作成し表示する。
//
//　●Checkboxクラス、CheckboxGroupクラス
//    複数の項目の中でいつも１つだけがonとなるとき、Checkboxクラス、
//　　CheckboxGroupクラスを使う。
//
//  ●CheckboxGroupクラスのコンストラクタ
//    CheckboxGroup()                       
//      機能：チェックボックスのグループを生成。
//
//  ●Checkboxクラスのコンストラクタ
//    Checkbox(文字列,trueまたはfalse,チェックボックスグループ名)     
//      機能：チェックボックスグループ内にチェックボックスを作り状態を
//            設定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class g135a {

  // コンストラクタ。
  g135a() {
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

    // チェックボックスグループの作成。
    CheckboxGroup cg = new CheckboxGroup();

    // チェックボックスボタンの作成。
    Checkbox c1 = new Checkbox("アントラーズ",true,cg);
    Checkbox c2 = new Checkbox("ジュビロ",false,cg);
    Checkbox c3 = new Checkbox("サンガ",false,cg);

    // チェックボックスボタンをフレーム内に追加。
    f.add(c1);
    f.add(c2);
    f.add(c3);

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームを表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g135a g = new g135a();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g135a.java
% java g135a
</pre>

<img src="g135aa.jpg" width=300 height=200>
<br><br>
ジュビロを選択<br>
<img src="g135ab.jpg" width=300 height=200>
<br><br>
サンガを選択<br>
<img src="g135ac.jpg" width=300 height=200>

</body>
</html>
*/