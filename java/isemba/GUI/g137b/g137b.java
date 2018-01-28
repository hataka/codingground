/*
<!--====================================================================-->
<!-- << g137b.htm >>                                                    -->
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
// << g137b.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（テキストフィールド、イベント処理）
//
//　　テキストフィールドを作成し表示する。
//　　テキストフィールドに文字列を入力し、リターンキーを押すと、
//　　文字列がラベル領域に表示される。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*; 

class g137b implements ActionListener {

  TextField t1,t2;
  Label lab;

  // コンストラクタ。
  g137b() {
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
    // テキストフィールドの作成。
    t1 = new TextField("Good Morning おはよう",30);
    t2 = new TextField(30);
    t2.setEchoChar('*'); // エコーされる文字を*に設定。
    // テキストフィールドをフレーム内に追加。
    f.add(t1); 
    f.add(t2);

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
    t1.addActionListener(this);
    t2.addActionListener(this);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == t1 ) {
      String s1 = t1.getText();
      lab.setText(s1);       
    }
    if( e.getSource() == t2 ) {
      String s2 = t2.getText();
      lab.setText(s2);       
    }
  }

  public static void main(String[] args) {
    g137b g = new g137b();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g137b.java
% java g137b
</pre>

<img src="g137ba.jpg" width=300 height=200>
<br><br>
上段のテキストフィールドに文字列(こんにちは)を追加しリターンキーを押す<br>
<img src="g137bb.jpg" width=300 height=200>
<br><br>
下段のテキストフィールドに文字列(12345)を挿入しリターンキーを押す<br>
<img src="g137bc.jpg" width=300 height=200>

</body>
</html>
*/
