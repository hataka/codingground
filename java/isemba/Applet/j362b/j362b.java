// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j362b.java 
 * created : Time-stamp: <09/07/01(水) 08:24:26 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j362b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j362b.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（ボタン、配置、イベント処理）
//
//　　「赤」ボタンをクリックすると、アプレットの背景色が赤になる。
//　　「緑」ボタンをクリックすると、アプレットの背景色が緑になる。
//
//　●イベント処理
//　　イベントソース：Buttonクラス
//　　イベントクラス：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class j362b extends Applet implements ActionListener {

  Button b1,b2; // initメソッドとactionPerformedメソッドで使われるため、
                // インスタンス変数にする。

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをFlowLayoutに設定。
    this.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));

    // ボタンの作成。
    b1 = new Button("赤");
    b2 = new Button("緑");

    // ボタンをアプレット内に追加。
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

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j362b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j362b.class" width="300" height="100">
</applet>

</body>
</html>
*/
