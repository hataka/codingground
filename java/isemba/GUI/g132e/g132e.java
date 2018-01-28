/*
<!--====================================================================-->
<!-- << g132e.htm >>                                                    -->
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
// << g132e.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（ボタン、イベント処理）
//
//　　ボタン１をクリックすると、メッセージ(ボタン１がクリックされた)が表示される。
//　　ボタン２をクリックすると、メッセージ(ボタン２がクリックされた)が表示される。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class g132e extends Frame implements ActionListener {

  Button b1,b2;
  Label lab;

  // コンストラクタ。
  g132e() {
    // フレームの作成。
    super("フレーム");
    
    // フレームの作成。
    //final Frame f = new Frame("フレーム");
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			dispose();
			//System.exit(0);
		}
	});   
    
    // ボタンの作成。
    b1 = new Button("ボタン１");
    b2 = new Button("ボタン２");
    // ボタンをフレーム内に追加。
    this.add(b1);
    this.add(b2);
    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

 
    
    // 表示用ラベルの作成。
    lab = new Label("　　　　　　　　　　　　");
    lab.setBackground(Color.yellow);
    // ラベルをフレーム内に追加。
    this.add(lab);

    // フレームの大きさを設定。
    this.setSize(300,200);
    // フレームを表示。
    this.setVisible(true);

    // イベントリスナを登録。
    b1.addActionListener(this);
    b2.addActionListener(this);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    // ボタンがクリックされたとき、実行される。
    if( e.getSource() == b1 ) {
      lab.setText("ボタン１がクリックされた");
    } 
    if( e.getSource() == b2 ) {
      lab.setText("ボタン２がクリックされた");
    }
  }

  public static void main(String[] args) {
    g132e g = new g132e();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g132e.java
% java g132e
</pre>

<img src="g132ea.jpg" width=300 height=200>
<br><br>
ボタン１をクリック後<br>
<img src="g132eb.jpg" width=300 height=200>
<br><br>
ボタン２をクリック後<br>
<img src="g132ec.jpg" width=300 height=200>

</body>
</html>
*/
