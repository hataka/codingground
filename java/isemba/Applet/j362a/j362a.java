// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j362a.java 
 * created : Time-stamp: <09/07/01(水) 08:22:48 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j362a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j362a.java >>
//
//　Ａｐｐｌｅｔ（６）：部品（ボタン、配置）
//
//　　「赤」ボタンと「緑」ボタンをレイアウトマネージャ(FlowLayout)を
//　　使って配置する。
//
//　●java.awt.Buttonクラス
//　　on/offの選択のときにButtonクラスを使う。
//
//  ○Buttonクラスのコンストラクタ
//    public Button(String s)      
//      機能：文字列sを表示するボタンを生成する。
//　　
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j362a extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをFlowLayoutに設定。
    this.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));

    // ボタンの作成。
    Button b1 = new Button("赤");
    Button b2 = new Button("緑");

    // ボタンをアプレット内に追加。
    this.add(b1);
    this.add(b2);

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
<applet code="j362a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j362a.class" width="300" height="100">
</applet>

</body>
</html>
*/
