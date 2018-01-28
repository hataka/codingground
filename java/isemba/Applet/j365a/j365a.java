// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j365a.java 
 * created : Time-stamp: <09/07/01(水) 08:31:09 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j365a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j365a.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（ラジオボタン、配置）
//
//　　３つの項目（赤、青、黄）をもつラジオボタンを作成・表示する。
//　　複数の項目の中から１つだけが選択される。
//    チェックボックスをグループにし、１つしか選択できないようにしたものを
//　　ラジオボタンという。
//
//　●java.awt.Checkboxクラス、java.awt.CheckboxGroupクラス
//    複数の項目の中でいつも１つだけがonとなるとき、Checkboxクラス、
//　　CheckboxGroupクラスを使う。
//
//  ○CheckboxGroupクラスのコンストラクタ
//    CheckboxGroup()                       
//      機能：チェックボックスのグループを生成。
//
//  ○Checkboxクラスのコンストラクタ
//    Checkbox(String s, boolean b, CheckboxGroup cg)     
//      機能：チェックボックスグループ内にチェックボックスを作り状態を
//            設定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j365a extends Applet {

  Checkbox c1,c2,c3;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをGridLayoutに設定。
    this.setLayout(new GridLayout(1,3,10,10));

    // チェックボックスグループの作成。
    CheckboxGroup cg = new CheckboxGroup();

    // ラジオボタンの作成。
    c1 = new Checkbox("赤",true,cg);
    c2 = new Checkbox("青",false,cg);
    c3 = new Checkbox("黄",false,cg);

    // ラジオボタンをアプレット内に追加。
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
<applet code="j365a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j365a.class" width="300" height="100">
</applet>

</body>
</html>
*/
