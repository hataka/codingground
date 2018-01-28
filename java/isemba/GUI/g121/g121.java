/*
<!--====================================================================-->
<!-- << g121.htm >>                                                     -->
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
// << g121.java >>
//
//  ＧＵＩ（２）：レイアウトマネージャー(FlowLayout）
//
//　　部品の配置を、左から右へ並べるよう指定する。
//    並べられなくなればつぎの行に配置する。各部品の間隔は均等。
//
//  ●レイアウトマネージャーの種類にはつぎのようなものがある。
//
//    ・FlowLayout       部品を横１列に配置する。
//    ・BorderLayout     部品を上下左右、中央に配置する。
//    ・GridLayout       部品をタイル状に配置する。
//    ・GridBagLayout    異なる大きさの部品をタイル状に配置する。
//    ・CardLayout       部品をカード状に配置する。
//
//　●FlowLayoutクラス
//    コンポーネント（ボタンやテキストフィールドなどの部品）を左から右へ
//　　行ごとに配置する。
//
//　●FlowLayoutクラスのコンストラクタ
//　　FlowLayout(位置, int h, int v)
//　　　機能：部品の配置を、左から右へ順に並べるよう指定する。各部品の間隔は均等。
//      位置：左寄せ  FlowLayout.LEFT
//　　　　　　中央    FlowLayout.CENTER
//            右寄せ  FlowLayout.RIGHT
//      hはコンポーネント間の水平間隔、vはコンポーネント間の垂直間隔。
//
//　●Buttonクラスのコンストラクタ
//　　Button(String s)
//      機能：ラベルsをもつボタンを生成する。
//
//　●Containerクラスのメソッド
//    Component add(Compoment c)  
//      機能：コンポーネントcをこのコンテナ内に追加する。
//    void setLayout(LayoutManager mgr)
//      機能：このコンテナのレイアウトマネージャをmgrに設定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;

class g121 {

  // コンストラクタ。
  g121() {
    // フレームの作成。
    Frame f = new Frame("フレーム");

    // ボタンの作成。
    Button b1 = new Button("ボタン１");
    Button b2 = new Button("ボタン２");
    Button b3 = new Button("ボタン３");
    Button b4 = new Button("ボタン４");
    Button b5 = new Button("ボタン５");

    // フレームのレイアウトマネージャをFlowLatoutに設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,60,30));

    // ボタンをフレーム内に追加。
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームを表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g121 g = new g121();
  }

}
/*
	</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g121.java
% java g121
</pre>

<img src="g121.jpg" width=300 height=200>

</body>
</html>
	*/
