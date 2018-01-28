/*
<!--====================================================================-->
<!-- << g132d.htm >>                                                    -->
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
// << g132d.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（ボタン、イベント処理）
//
//　　ボタン１をクリックすると、メッセージ(ボタン１がクリックされた)が表示される。
//　　ボタン２をクリックすると、メッセージ(ボタン２がクリックされた)が表示される。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class a132d implements ActionListener {

  g132d g;

  // コンストラクタ。
  a132d(g132d g) {
    this.g = g;
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    // ボタンがクリックされたとき、実行される。
    if( e.getSource() == g.b1 ) {
      g.lab.setText("ボタン１がクリックされた");
    } 
    if( e.getSource() == g.b2 ) {
      g.lab.setText("ボタン２がクリックされた");
    }
  }
}

class g132d {

  final Frame f;
  Button b1,b2;
  Label lab;

  // コンストラクタ。
  g132d() {
    // フレームの作成。
    //f = new Frame("フレーム");
    // フレームの作成。
    f = new Frame("フレーム");
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			f.dispose();
			//System.exit(0);
		}
	});    // ボタンの作成。
    b1 = new Button("ボタン１");
    b2 = new Button("ボタン２");
    // ボタンをフレーム内に追加。
    f.add(b1);
    f.add(b2);
    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // 表示用ラベルの作成。
    lab = new Label("　　　　　　　　　　　　");
    lab.setBackground(Color.yellow);
    // ラベルをフレーム内に追加。
    f.add(lab);

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームを表示。
    f.setVisible(true);

  }

  public static void main(String[] args) {
    g132d g = new g132d();

    a132d a = new a132d(g);

    // イベントリスナを登録。
    g.b1.addActionListener(a);
    g.b2.addActionListener(a);
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g132d.java
% java g132d
</pre>

<img src="g132da.jpg" width=300 height=200>
<br><br>
ボタン１をクリック後<br>
<img src="g132db.jpg" width=300 height=200>
<br><br>
ボタン２をクリック後<br>
<img src="g132dc.jpg" width=300 height=200>

</body>
</html>
*/
