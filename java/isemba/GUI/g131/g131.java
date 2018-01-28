/*
<!--====================================================================-->
<!-- << g131.htm >>                                                     -->
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
// << g131.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（ラベル）
//
//　　左揃え、中央揃え、右揃えのラベルを表示する。
//
//　●Labelクラス
//　　１行分の文字情報を表示するときにLabelクラスを使う。
//
//　●Labelクラスのコンストラクタ
//    Label()
//    　機能：空のラベルを生成する。
//    Label(String s)
//    　機能：文字列sをラベルにする。左揃え。
//    Label(String s, Label.LEFT)
//    　機能：文字列sをラベルにする。左揃え。
//    Label(String s, Label.CENTER)
//    　機能：文字列sをラベルにする。中央揃え。
//    Label(String s, Label.RIGHT)
//    　機能：文字列sをラベルにする。右揃え。
//
//　●Labelクラスのメソッド
//    void setAlignment(int k)
//    　機能：ラベルの整列法を指定する。
//            左揃えはLabel.LEFT、中央揃えはLabel.CENTER、右揃えはLabel.RIGHT。
//    void setText(String s)
//    　機能：ラベルに文字列sを設定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class g131 {

  // コンストラクタ。
  g131() {
    // フレームの作成。
    //Frame f = new Frame("フレーム");
    // フレームの作成。
    final Frame f = new Frame("フレーム");
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			f.dispose();
			//System.exit(0);
		}
	});
    // ラベルの作成。
    Label lab1 = new Label("左揃え");
    lab1.setBackground(Color.red);
    Label lab2 = new Label("中央揃え",Label.CENTER);
    lab2.setBackground(Color.green);
    Label lab3 = new Label();
    lab3.setAlignment(Label.RIGHT);
    lab3.setText("右揃えのラベルです");
    lab3.setBackground(Color.yellow);

    // フレームにレイアウトマネージャFlowLayoutを設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

    // ラベルをフレーム内に追加。
    f.add(lab1);
    f.add(lab2);
    f.add(lab3);

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームを表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g131 g = new g131();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g131.java
% java g131
</pre>

<img src="g131.jpg" width=300 height=200>

</body>
</html>
*/
