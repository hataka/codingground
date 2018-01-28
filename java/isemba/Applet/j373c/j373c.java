// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j373c.java 
 * created : Time-stamp: <09/07/01(水) 09:47:24 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j373c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j373c.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（フレーム、閉じるボタン、イベント処理）
//
//　　「フレーム」というタイトルつきのウィンドウを表示する。
//　　閉じるボタンをクリックすると終了する。
//
//　　WindowAdapterクラスを内部クラスとして使う。
//
//　●イベント処理
//　　イベントソース： Windowクラス
//　　イベントクラス： WindowEventクラス
//　　イベントリスナ： WindowAdapterクラスを拡張したEventListenerクラス
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;

public class j373c extends Applet {

  Frame f;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // フレームの作成。
    f = new Frame("フレーム");

    // フレームの大きさを設定。
    f.setSize(300,200);

    // フレームの表示。
    f.setVisible(true);

    // イベントリスナーの作成。
    EventListener el = new EventListener();

    // イベントリスナの登録。
    f.addWindowListener(el);

  }

  // windowClosingメソッドを定義する。
  class EventListener extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
      f.dispose();
      System.exit(0); // プログラムを終了させるメソッド。
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
<applet code="j373c.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j373c.class" width="300" height="100">
</applet>
<br><br>

<img src="j373c.jpg" width=300 height=200>
<br><br>

閉じるボタンをクリックするとフレームは非表示になる

</body>
</html>
*/
