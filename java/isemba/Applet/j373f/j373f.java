// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j373f.java 
 * created : Time-stamp: <09/07/01(水) 09:49:17 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j373f.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j373f.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（フレーム、応用）
//
//　　アプレット内の「表示ボタン」と「非表示ボタン」をクリックすることで
//　　フレームの表示と非表示を切り替える。
//
//　　WindowAdapterクラスを匿名クラスとして使う。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;

public class j373f extends Applet implements ActionListener {

  Frame f;
  Button b1,b2;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // ボタンの作成とアプレット内へ追加。
    b1 = new Button("表示");
    b2 = new Button("非表示");
    this.add(b1);
    this.add(b2);

    // フレームの作成。
    f = new Frame("フレーム");
    f.setBackground(Color.green);

    // フレームの大きさを設定。
    f.setSize(300,200);

    // フレームの表示。
    f.setVisible(false);

    // イベントリスナの作成と登録。
    f.addWindowListener( new WindowAdapter() {
      // windowClosingメソッドを定義する。
      public void windowClosing(WindowEvent e) {
        f.dispose();
        System.exit(0); // プログラムを終了させるメソッド。
      }
    });

    // イベントリスナーの登録。
    b1.addActionListener(this);
    b2.addActionListener(this);

  }

  public void actionPerformed(ActionEvent ae) {
    if( ae.getSource() == b1 ) {
      f.setVisible(true);
    }
    if( ae.getSource() == b2 ) {
      f.setVisible(false);
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
<applet code="j373f.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j373f.class" width="300" height="100">
</applet>
<br><br>
表示ボタンをクリックすると表示される
<br><br>
<img src="j373f.jpg" width=300 height=200>
<br><br>
非表示ボタンをクリックすると非表示になる
</body>
</html>
*/
