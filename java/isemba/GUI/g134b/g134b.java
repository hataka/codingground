/*
<!--====================================================================-->
<!-- << g134b.htm >>                                                    -->
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
// << g134b.java >>
//
//  ＧＵＩ（２）：ＧＵＩ部品（チェックボックスボタン、イベント処理）
//
//  ●Checkboxクラス
//    複数の項目のon/offを選択するとき、Checkboxクラスを使う。
//
//  ●Checkboxクラスのコンストラクタ
//    Checkbox(文字列)                       
//      機能：文字列を項目に加える。項目はチェックされていない状態に設定される。
//
//  ●Checkboxクラスのメソッド
//    String getLabel()                       
//      機能：設定されているラベルを返す。
//    boolean getState()                       
//      機能：チェック状態を返す。trueまたはfalse。
//
//　●ItemListenerインターフェースのメソッド
//    void itemStateChanged(ItemEvent e)
//      機能：イベントが発生したとき呼び出される。
//            eにイベント発生時の状況が記録されている。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class g134b implements ItemListener {

  Checkbox c1,c2,c3;
  Label lab;

  // コンストラクタ。
  g134b() {
    // フレームの作成。
    final Frame f = new Frame("フレーム");
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			f.dispose();//System.exit(0);
		}
	});    // フレームの作成。
   // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
    // チェックボックスボタンの作成。
    c1 = new Checkbox("アントラーズ");
    c2 = new Checkbox("ジュビロ");
    c3 = new Checkbox("サンガ");
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
    g134b g = new g134b();
  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g134b.java
% java g134b
</pre>

<img src="g134ba.jpg" width=300 height=200>
<br><br>
アントラーズを選択<br>
<img src="g134bb.jpg" width=300 height=200>
<br><br>
ジュビロを選択<br>
<img src="g134bc.jpg" width=300 height=200>

</body>
</html>
*/
