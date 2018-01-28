// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j342d.java 
 * created : Time-stamp: <09/06/30(火) 20:48:13 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j342d.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j342d.java >>
//
//  アプレット（４）：イベント処理（ボタン操作、外部クラス）
//
//　●操作
//　　赤と書かれたボタンをクリックすると背景色が赤になる。
//　　緑と書かれたボタンをクリックすると背景色が緑になる。
//
//　●イベント処理
//　　イベントソース： Buttonクラス
//　　イベントクラス： ActionEventクラス
//　　イベントリスナ： ActionListenerインターフェース
//　　　　　　　　　　 actionPerformedメソッド
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class j342d extends Applet {

  Button b1,b2; 

  public void init() {

    // ボタンの作成。
    b1 = new Button("赤");
    b2 = new Button("緑");

    // ボタンをアプレットに追加。
    this.add(b1);
    this.add(b2);

    // イベントリスナの登録。
    EventListener342d el = new EventListener342d(this);
    b1.addActionListener(el);
    b2.addActionListener(el);

  }

}

class EventListener342d implements ActionListener {

  j342d obj;

  public EventListener342d(j342d obj) { // コンストラクタ。*/
    this.obj = obj;
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    // ボタンがクリックされたとき、実行される。
    if( e.getSource() == obj.b1 ) { obj.setBackground(Color.red); } 
    if( e.getSource() == obj.b2 ) { obj.setBackground(Color.green); } 

  }

}
/*
</pre>

<pre>
<font size=5 color=blue>ＨＴＭＬファイル</font><br>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j342d.class" width="300" height="100">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j342d.class" width="300" height="100">
</applet>

</body>
</html>
*/
