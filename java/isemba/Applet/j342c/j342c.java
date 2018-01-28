// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j342c.java 
 * created : Time-stamp: <09/06/30(火) 20:46:11 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j342c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j342c.java >>
//
//  アプレット（４）：イベント処理（ボタン操作、匿名クラス）
//
//　●操作
//　　赤と書かれたボタンをクリックすると背景色が赤になる。
//　　緑と書かれたボタンをクリックすると背景色が緑になる。
//
//　●イベント処理
//　　イベントソース： Buttonクラス
//　　イベントクラス： ActionEventクラス
//　　イベントリスナ： ActionListenerインターフェース
//
//　●匿名クラス
//    内部クラスに名前を付けるのは煩雑である。そこで、名前を付けずに内部クラスを
//　　使える方法が考えられた。
//
//　　    new 親クラス名(引数) {
//          処理                
//        }                     
//
//　　・コンパイルされると、２つのクラスファイルが作成される。
//　　　j342c.class, j342c$1.class
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class j342c extends Applet {

  Button b1,b2; 

  public void init() {

    // ボタンの作成。
    b1 = new Button("赤");
    b2 = new Button("緑");

    // ボタンをアプレットに追加。
    this.add(b1);
    this.add(b2);

    // イベントリスナを匿名クラスとして定義。
    ActionListener al = new ActionListener() {

      // actionPerformedメソッドの定義。
      public void actionPerformed(ActionEvent e) {
      // ボタンがクリックされたとき、実行される。
        if( e.getSource() == b1 ) { setBackground(Color.red); } 
        if( e.getSource() == b2 ) { setBackground(Color.green); } 
      }
    };                                              

    // イベントリスナの登録。
    b1.addActionListener(al); 
    b2.addActionListener(al); 

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
<applet code="j342c.class" width="300" height="100">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j342c.class" width="300" height="100">
</applet>

</body>
</html>
*/
