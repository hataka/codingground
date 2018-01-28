/*
<!--====================================================================-->
<!-- << g135b.htm >>                                                    -->
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
// << g135b.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（ラジオボタン、イベント処理）
//
//　　３個の項目のからなるラジオボタンを作成し表示する。
//
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class g135b implements ItemListener {

  Checkbox c1,c2,c3;
  Label lab;

  // コンストラクタ。
  g135b() {
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
    c1 = new Checkbox("アントラーズ",true,cg);
    c2 = new Checkbox("ジュビロ",false,cg);
    c3 = new Checkbox("サンガ",false,cg);
    // チェックボックスボタンをフレーム内に追加。
    f.add(c1);
    f.add(c2);
    f.add(c3);

    // 表示用ラベルの作成。
    lab = new Label("　　　　　　　　　　　　　　　　　　　　");
    lab.setBackground(Color.yellow);

    // ラベルをフレーム内に追加。
    f.add(lab);

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームを表示。
    f.setVisible(true);

    // イベントリスナの登録。
    c1.addItemListener(this);
    c2.addItemListener(this);
    c3.addItemListener(this);

  }

  // ItemListenerインターフェースのメソッド。
  public void itemStateChanged(ItemEvent e) {
    String s1 = c1.getLabel();
    boolean b1 = c1.getState();
    String s2 = c2.getLabel();
    boolean b2 = c2.getState();
    String s3 = c3.getLabel();
    boolean b3 = c3.getState();
    lab.setText(s1 + ":" + b1 + " " + s2 + ":" + b2 + " " + s3 + ":" + b3);
  }

  public static void main(String[] args) {
    g135b g = new g135b();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g135b.java
% java g135b
</pre>

<img src="g135ba.jpg" width=300 height=200>
<br><br>
ジュビロを選択<br>
<img src="g135bb.jpg" width=300 height=200>
<br><br>
サンガを選択<br>
<img src="g135bc.jpg" width=300 height=200>

</body>
</html>
*/
