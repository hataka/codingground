// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j375b.java 
 * created : Time-stamp: <09/07/01(水) 10:11:08 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j375b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j375b.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（ダイアログ、配置、イベント処理）
//
//　　ダイアログを作成し表示する。
//    閉じるボタンを機能させるため、WindowListenerインターフェースの
//　　windowClosingメソッドを実装する必要がある。
//
//　●イベント処理
//　　イベントソース： Windowクラス
//　　イベントクラス： WindowEventクラス
//　　イベントリスナ： WindowAdapterクラスを拡張したクラス
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
  
public class j375b extends Applet {

  Dialog d;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // モードレスダイアログの作成。
    Frame f = new Frame();
    d = new Dialog(f,"モードレスダイアログ",false);    

    // ダイアログの大きさを設定。
    d.setSize(300,200);

    // ダイアログの表示位置を設定。
    d.setLocation(0,0);

    // モードレスダイアログを表示。
    d.setVisible(true);

    // 閉じるボタンを押すとダイアログが閉じる。
    d.addWindowListener( new WindowAdapter() {
      // windowClosingメソッドを定義する。
      public void windowClosing(WindowEvent e) {
        d.dispose();
        System.exit(0);
      }
    });

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
<applet code="j375b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j375b.class" width="300" height="100">
</applet>
<br><br>
閉じるボタンをクリックすると非表示になる
<br><br>
<img src="j375b.jpg" width=300 height=200>

</body>
</html>
*/
