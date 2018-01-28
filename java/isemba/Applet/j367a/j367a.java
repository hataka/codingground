// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j367a.java 
 * created : Time-stamp: <09/07/01(水) 08:37:27 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j367a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j367a.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（テキストフィールド、配置）
//
//　　テキストフィールドを使ってデータを入力できる。
//　　テキストフィールドを５つ作成する。
//
//  ●java.awt.TextFieldクラス
//    ユーザからの入力(文字列)用の欄で、１行分の編集するとき、TextFieldクラス
//　　を使う。
//
//  ○TextFieldクラスのコンストラクタ
//    public TextField() throws HeadlessException                      
//      機能：テキストフィールドを作成する。
//    public TextField(String s) throws HeadlessException                       
//      機能：テキストフィールドを作成し、文字列sを表示する。
//    public TextField(int n) throws HeadlessException                       
//      機能：n文字分のテキストフィールドを作成する。
//    public TextField(String s, int c) throws HeadlessException                       
//      機能：c文字分のテキストフィールドを作成し、文字列sを表示する。
//
//  ●java.awt.TextComponentクラスのメソッド
//    テキストの編集を可能にするすべての部品の親クラス。 
//
//  ●TextComponentクラスのメソッド
//    public void setText(String s)                       
//      機能：テキストコンポーネントに文字列sを設定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 

public class j367a extends Applet {

  TextField t1,t2,t3,t4,t5; 

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをFlowLayoutに設定。
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // テキストフィールドの作成。
    t1 = new TextField();
    t2 = new TextField("テキスト２");
    t3 = new TextField(20);
    t4 = new TextField("テキスト４",20);
    t5 = new TextField();
    t5.setText("テキスト５");

    // テキストフィールドをアプレット内に追加。
    this.add(t1); 
    this.add(t2);
    this.add(t3);
    this.add(t4);
    this.add(t5);

  }

}
/*
</pre>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j367a.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j367a.class" width="300" height="160">
</applet>

</body>
</html>
*/
