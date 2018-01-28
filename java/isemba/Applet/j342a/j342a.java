// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j342a.java 
 * created : Time-stamp: <09/06/30(火) 20:41:33 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j342a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j342a.java >>
//
//  アプレット（４）：イベント処理（ボタン操作）
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
//  ●java.awt.event.ActionEventクラス
//    　java.lang.Object --> java.util.EventObject --> java.awt.AWTEvent 
//    　--> java.awt.event.ActionEvent
//
//  ●java.awt.Buttonクラス
//    　java.lang.Object --> java.awt.Component --> java.awt.Button
//
//  ○Buttonクラスのコンストラクタ
//    public Button(String s) throws HeadlessException
//      機能：文字列sをもつボタンを作成する。
//
//　●Containerクラスのメソッド
//    public Component add(Component c)  
//      機能：部品c(ボタンやテキストフィールドなど)をコンテナ(部品を保持する)
//　　　　　　内に追加する。
//　　　　　　Containerクラスはコンポーネントを保持できる。アプレットは、
//　　　　　　Containerクラスから派生しておりコンポーネントを保持できる。
//
//　●java.util.EventObjectクラスのメソッド
//　　public Object getSource()
//　　　機能：イベントが発生したオブジェクトを取得する。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class j342a extends Applet implements ActionListener {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Button b1,b2; 

  public void init() {

    // ボタンの作成。
    b1 = new Button("赤");
    b2 = new Button("緑");

    // ボタンをアプレットに追加。
    this.add(b1);
    this.add(b2);

    // イベントリスナの登録。
    b1.addActionListener(this);
    b2.addActionListener(this);

  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {

    // ボタンがクリックされたとき、実行される。
    if( e.getSource() == b1 ) { this.setBackground(Color.red); } 
    if( e.getSource() == b2 ) { this.setBackground(Color.green); } 

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
<applet code="j342a.class" width="640" height="480">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j342a.class" width="640" height="480">
</applet>

</body>
</html>
*/
