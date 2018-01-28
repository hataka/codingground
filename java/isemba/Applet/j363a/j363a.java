// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j363a.java 
 * created : Time-stamp: <09/07/01(水) 08:26:07 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j363a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j363a.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（チョイス、配置）
//
//　　「赤」、「青」、「黄」の項目をもつチョイスを表示する。
//
//　●java.awt.Choiceクラス
//　　複数の項目からひとつ選ぶとき、Choiceクラスを使う。
//
//  ○Choiceクラスのメソッド
//    public void add(String s)                       
//      機能：文字列sを項目に加える。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 

public class j363a extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをFlowLayoutに設定。
    this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

    // チョイスの作成。
    Choice cb = new Choice();

    // 項目を追加。
    cb.add("赤");
    cb.add("青");
    cb.add("黄");

    // チョイスをアプレット内に追加。
    this.add(cb);

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
<applet code="j363a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j363a.class" width="300" height="100">
</applet>

</body>
</html>
*/
