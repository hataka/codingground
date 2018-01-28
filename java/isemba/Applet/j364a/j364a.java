// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j364a.java 
 * created : Time-stamp: <09/07/01(水) 08:28:42 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j364a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j364a.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（チェックボックス、配置）
//
//　　３つの項目（赤、青、黄）をもつチェックボックスを作成・表示する。
//　　複数の項目を選択できる。
//
//  ●java.awt.Checkboxクラス
//    複数項目の中から複数の選択をするとき、Checkboxクラスを使う。
//
//  ○Checkboxクラスのコンストラクタ
//    Checkbox(String s)                       
//      機能：文字列sを項目に加える。チェックされていない状態に設定される。
//    Checkbox(String s, boolean b)                       
//      機能：文字列sを項目に加える。bがtrueのときチェックされている状態、
//　　　　　　falseのときチェックされていない状態に設定される。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j364a extends Applet {

  Checkbox c1,c2,c3;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをGridLayoutに設定。
    this.setLayout(new GridLayout(1,3,10,10));

    // チェックボックスボタンの作成。
    c1 = new Checkbox("赤");
    c2 = new Checkbox("青",true);
    c3 = new Checkbox("黄",false);

    // チェックボックスボタンをアプレット内に追加。
    this.add(c1);
    this.add(c2);
    this.add(c3);

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
<applet code="j364a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j364a.class" width="300" height="100">
</applet>

</body>
</html>
*/
