/*
<!--====================================================================-->
<!-- << g132b.htm >>                                                    -->
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
// << g132b.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（ボタン、イベント処理）
//
//　　ボタン１をクリックすると、メッセージ(ボタン１がクリックされた)が表示される。
//　　ボタン２をクリックすると、メッセージ(ボタン２がクリックされた)が表示される。
//
//　●EventObjectクラスのメソッド
//    public Object getSource()
//      機能:イベントが発生したオブジェクトを返す。
//
//　●ActionEventクラス
//    java.util.EventObject --> java.awt.AWTEvent --> java.awt.event.ActionEvent
//
//　●ActionListenerインターフェースのメソッド
//    void actionPerformed(ActionEvent e)
//      機能：イベントが発生したとき呼び出される。
//            eにイベント発生時の状況が記録されている。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class g132b implements ActionListener {

  final Frame f;
  Button b1,b2;
  Label lab;

  // コンストラクタ。
  g132b() {
    // フレームの作成。
    //f = new Frame("フレーム");
    // フレームの作成。
    f = new Frame("フレーム");
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			f.dispose();
			//System.exit(0);
		}
	});    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
    // ボタンの作成。
    b1 = new Button("ボタン１");
    b2 = new Button("ボタン２");
    // ボタンをフレーム内に追加。
    f.add(b1);
    f.add(b2);

    // 表示用ラベルの作成。
    lab = new Label("　　　　　　　　　　　　");
    lab.setBackground(Color.yellow);
    // ラベルをフレーム内に追加。
    f.add(lab);

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームを表示。
    f.setVisible(true);

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
    g132b g = new g132b();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g132b.java
% java g132b
</pre>

<img src="g132ba.jpg" width=300 height=200>
<br><br>
ボタン１をクリック後<br>
<img src="g132bb.jpg" width=300 height=200>
<br><br>
ボタン２をクリック後<br>
<img src="g132bc.jpg" width=300 height=200>

</body>
</html>
*/
