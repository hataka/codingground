/*
<!--====================================================================-->
<!-- << g138b.htm >>                                                    -->
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
// << g138b.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（テキストエリア、イベント処理）
//
//　　テキストエリアを作成し表示する。
//　　テキストエリア内でリターンキーを押してもイベントは発生しない。　
//　　他の部品（ボタンなど）と組み合わせて使う。
//　　複写ボタンをクリックすると、他のテキストエリアにテキストエリア内文字列が
//　　複写される。
//　　削除ボタンをクリックすると、他のテキストエリアの文字列が削除される。
//
//  ●TextComponentクラスのメソッド
//    String getText()                       
//      機能：テキストエリア内のテキストを文字列に読み込む。
//    void setText(String s)                       
//      機能：文字列sをテキストエリア内に読み込む。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*; 

class g138b implements ActionListener {

  TextArea t1,t2; 
  Button b1,b2;

  // コンストラクタ。
  g138b() {
    // フレームの作成。
    Frame f = new Frame("フレーム");
    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
    // テキストエリア生成。
    t1 = new TextArea("こんにちは",3,30,TextArea.SCROLLBARS_BOTH);
    t2 = new TextArea(3,30);
    // テキストエリアをフレーム内に追加。
    f.add(t1);
    f.add(t2);

    // ボタン生成。
    b1 = new Button("複写");
    b2 = new Button("消去");

    // ボタンをフレーム内に追加。
    f.add(b1);
    f.add(b2);

    // フレームの大きさを設定。
    f.setSize(300,300);
    // フレームを表示。
    f.setVisible(true);

    // イベントリスナの登録。
    b1.addActionListener(this);
    b2.addActionListener(this);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == b1 ) {
      String s = t1.getText();
      t2.setText(s);
    }
    if( e.getSource() == b2 ) {
      String s = " ";
      t2.setText(s);
    }
  }

  public static void main(String[] args) {
    g138b g = new g138b();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g138b.java
% java g138b
</pre>

<img src="g138ba.jpg" width=300 height=300>
<br><br>
複写ボタンをクリック<br>
<img src="g138bb.jpg" width=300 height=300>
<br><br>
消去ボタンをクリック<br>
<img src="g138bc.jpg" width=300 height=300>

</body>
</html>
*/
