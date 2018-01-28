/*
<!--====================================================================-->
<!-- << g133b.htm >>                                                    -->
<!--                                                                    -->
<!--  JAVAプログラミング　　　　　　　　　　　　　　　　　　　　　　　  -->
<!--                                                                    -->
<!--====================================================================-->

<html>
<head>
  <META http-equiv=Content-Type content="text/html; charset=shift_jis">
  <title>JAVAプログラミング</title>
</head>

<body bgcolor="white" text="black">

<pre>
*/
////////////////////////////////////////////////////////////////////////////////
// << g133b.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（チョイスボタン、イベント処理）
//
//　　チョイスボタンを表示し、選択した項目をラベルに表示する。
//
//　●Choiceクラス
//　　複数の項目からひとつ選ぶとき、Choiceクラスを使う。
//
//  ●Choiceクラスのメソッド
//    public void add(String s)                       
//      機能：文字列sを項目に加える。
//    public String getSelectedItem()
//      機能：選択された項目を文字列で返す。
//    public int getSelectedIndex()
//      機能：選択された項目の位置を返す。先頭の位置は0。
//
//　●ItemListenerインターフェースのメソッド
//    void itemStateChanged(ItemEvent e)
//      機能：イベントが発生したとき呼び出される。
//      e   ：イベント発生時の状況が記録されている。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class g133b implements ItemListener {

  Frame f;
  Choice cb;
  Label lab;

  // コンストラクタ。
  g133b() {
    // フレームの作成。
    f = new Frame("フレーム");
    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
    // チョイスボタンの作成。
    cb = new Choice();
    // 項目を追加。
    cb.addItem("アントラーズ");
    cb.addItem("ジュビロ");
    cb.addItem("サンガ");
    // チョイスボタンをフレーム内に追加。
    f.add(cb);

    // 表示用ラベルの作成。
    lab = new Label("　　　　　　　　　　　　　　　　　");
    lab.setBackground(Color.yellow);

    // ラベルをフレームに追加。
    f.add(lab);

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームを表示。
    f.setVisible(true);

    // イベントリスナを登録。
    cb.addItemListener(this);
  }

  // ItemListenerインターフェースのメソッド。
  public void itemStateChanged(ItemEvent e) {
    // チョイスボタンからイベントが発生した場合、実行される。   
    if( e.getSource() == cb ) {
      String s = cb.getSelectedItem();
      int k = cb.getSelectedIndex();
      lab.setText(k + "番目の項目(" + s + ")が選択された");
    }
  }

  public static void main(String[] args) {
    g133b g = new g133b();
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g133b.java
% java g133b
</pre>

<img src="g133ba.jpg" width=300 height=200>
<br><br>
▼ボタンをクリック後、サンガを選択<br>
<img src="g133bb.jpg" width=300 height=200>
<br><br>
<img src="g133bc.jpg" width=300 height=200>

</body>
</html>
*/
