// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j368b.java 
 * created : Time-stamp: <09/07/01(水) 09:23:13 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j368b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j368b.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（テキストエリア、配置、イベント処理）
//
//　　２つのテキストエリアと「複写」ボタン、「消去」ボタンを作る。
//　　テキストエリア内で編集ができる。
//　　複写ボタンをクリックすると、他のテキストエリアにテキストエリア内文字列が
//　　複写される。
//　　削除ボタンをクリックすると、他のテキストエリアの文字列が削除される。
//
//　　テキストエリアに表示しきれないテキストが入力されると自動的にスクロールバー
//　　が現れる。テキストエリアにすべてのテキストが表示できるようになるとスクロー
//　　ルバーは消える。
//　　他の部品（ボタンなど）と組み合わせて使う。
//
//　●イベント処理
//　　イベントソース：TextAreaクラス
//　　イベントクラス：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*; 

public class j368b extends Applet implements ActionListener {

  TextArea ta1,ta2; 
  Button b1,b2;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをFlowLayoutに設定。
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // テキストエリアの作成。
    ta1 = new TextArea("こんにちは",3,30,TextArea.SCROLLBARS_BOTH);
    ta2 = new TextArea(3,30);

    // テキストエリアをアプレット内に追加。
    this.add(ta1);
    this.add(ta2);

    // ボタンの作成。
    b1 = new Button("複写");
    b2 = new Button("消去");

    // ボタンをアプレット内に追加。
    this.add(b1);
    this.add(b2);

    // イベントリスナの登録。
    b1.addActionListener(this);
    b2.addActionListener(this);

  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent ae) {
    if( ae.getSource() == b1 ) {
      String s = ta1.getText();
      ta2.setText(s);
    }
    if( ae.getSource() == b2 ) {
      String s = " ";
      ta2.setText(s);
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
<applet code="j368b.class" width="300" height="240">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j368b.class" width="300" height="240">
</applet>

</body>
</html>
*/
