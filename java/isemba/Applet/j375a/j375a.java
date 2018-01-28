// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j375a.java 
 * created : Time-stamp: <09/07/01(水) 10:10:19 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j375a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j375a.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（ダイアログ、配置）
//
//　　ユーザからの入力を受け付けるための一時的なウィンドウをダイアログという。
//　　ダイアログを作成し表示する。
//
//　●モーダルダイアログとモードレスダイアログ
//　　ダイアログには、モーダルダイアログとモードレスダイアログがある。
//    モーダルダイアログでは、ダイアログへの入力が完了するまで他の
//　　アプリケーションの入力を阻止する。
//　　モードレスダイアログでは、ダイアログへの入力と独立に他のアプリケーション
//　　は実行される。
//
//　●java.awt.Dialogクラスのコンストラクタ
//    Dialog(Frame f, boolean b)
//      機能：ダイアログを作成する。最初は表示されない。
//　　　　　　fはこのダイアログを呼び出したフレーム。
//　　　　　　trueはモーダル指定、falseはモードレス指定。
//    Dialog(Frame f, String s, boolean b)
//      機能：タイトルs付きのダイアログを作成する。最初は表示されない。
//　　　　　　fはこのダイアログを呼び出したフレーム。
//　　　　　　文字列sはタイトル。
//　　　　　　trueはモーダル指定、falseはモードレス指定。
//
//    ・ダイアログを作成するには、作成するダイアログを呼び出すフレームまたは
//　　　他のダイアログが必要である。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
  
public class j375a extends Applet {

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
<applet code="j375a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j375a.class" width="300" height="100">
</applet>
<br><br>

<img src="j375a.jpg" width=300 height=200>

</body>
</html>
*/
