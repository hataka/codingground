// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j342b.java 
 * created : Time-stamp: <09/06/30(火) 20:44:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j342b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j342b.java >>
//
//  アプレット（４）：イベント処理（ボタン操作、内部クラス）
//
//　●操作
//　　赤と書かれたボタンをクリックすると背景色が赤になる。
//　　緑と書かれたボタンをクリックすると背景色が緑になる。
//
//　●イベント処理
//　　イベントソース： Buttonクラス
//　　イベントクラス： ActionEventクラス
//　　イベントリスナ： EventListenerクラス
//
//　●内部クラス
//　　・イベントリスナを内部クラスとして定義する。
//　　　クラスの中にクラスを定義できる（すなわち、クラスを入れ子にできる）。
//　　・内部クラスのメソッドから外部のクラスの変数やメソッドにアクセスできる。
//  　・コンパイルすると２つのクラスファイルが生成される。
//　　　j342b.class, j342b$EventListener.class
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class j342b extends Applet {

  Button b1,b2; 

  public void init() {

    // ボタンの作成。
    b1 = new Button("赤");
    b2 = new Button("緑");

    // ボタンをアプレットに追加。
    this.add(b1);
    this.add(b2);

    // イベントリスナの登録
    EventListener el = new EventListener();
    b1.addActionListener(el); 
    b2.addActionListener(el); 

  }

  // イベントリスナを内部クラスとして定義。
  class EventListener implements ActionListener {

    // actionPerformedメソッドの定義。
    public void actionPerformed(ActionEvent e) {
      // ボタンがクリックされたとき、実行される。
      if( e.getSource() == b1 ) { setBackground(Color.red); } 
      if( e.getSource() == b2 ) { setBackground(Color.green); } 
    }

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
<applet code="j342b.class" width="300" height="100">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j342b.class" width="300" height="100">
</applet>

</body>
</html>
*/
