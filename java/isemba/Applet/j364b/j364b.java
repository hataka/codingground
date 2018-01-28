// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j364b.java 
 * created : Time-stamp: <09/07/01(水) 08:29:57 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j364b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j364b.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（チェックボックス、配置、イベント処理）
//
//　　「赤」項目をチェックすると、ラベルの背景色が赤になる。
//　　「黄」項目をチェックすると、ラベルの背景色が黄になる。
//　　「青」項目をチェックすると、ラベルの背景色が青になる。
//　　 複数の項目を選択できる。
//
//　●イベント処理
//　　イベントソース：Checkboxクラス
//　　イベントクラス：ItemEventクラス
//　　イベントリスナ：ItemListenerインターフェース
//　　　　　　　　　　itemStateChangedメソッド
//
//  ●Checkboxクラスのメソッド
//    public boolean getState()
//　　　機能：チェックボックスが、チェックされている場合true、されていない場合
//　　　　　　falseを返す。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class j364b extends Applet implements ItemListener {

  Checkbox c1,c2,c3;
  Label lab1,lab2,lab3;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをGridLayoutに設定。
    this.setLayout(new GridLayout(2,3,10,10));

    // チェックボックスボタンの作成。
    c1 = new Checkbox("赤");
    c2 = new Checkbox("青",true);
    c3 = new Checkbox("黄",false);

    // チェックボックスボタンをアプレット内に追加。
    this.add(c1);
    this.add(c2);
    this.add(c3);

    // ラベルの作成。
    lab1 = new Label("ラベル１");
    lab2 = new Label("ラベル２");
    lab3 = new Label("ラベル３");

    // ラベルをアプレット内に追加。
    this.add(lab1);
    this.add(lab2);
    this.add(lab3);

    // イベントリスナの登録。
    c1.addItemListener(this);
    c2.addItemListener(this);
    c3.addItemListener(this);

  }

  // ItemListenerインターフェースのメソッド。
  public void itemStateChanged(ItemEvent ie) {
    if( c1.getState() ) { 
      lab1.setBackground(Color.red); 
    } else {
      lab1.setBackground(Color.white);
    }
    if( c2.getState() ) { 
      lab2.setBackground(Color.blue); 
    } else {
      lab2.setBackground(Color.white);
    }
    if( c3.getState() ) { 
      lab3.setBackground(Color.yellow); 
    } else {
      lab3.setBackground(Color.white);
    }
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
<applet code="j364b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j364b.class" width="300" height="100">
</applet>

</body>
</html>
*/
