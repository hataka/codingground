// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j373e.java 
 * created : Time-stamp: <09/07/01(水) 09:48:37 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j373e.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j373e.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（フレーム、応用）
//
//　　フレームと呼ばれるウィンドウ(タイトル：「フレーム」)を表示する。
//　　閉じるボタンをクリックすると終了する。
//    フレーム内に部品（ラベル）を追加する。
//    フレームのデフォルトレイアウトマネージャ－は、BorderLayoutである。
//
//　　WindowAdapterクラスを内部クラスとして使う。
//
//　●java.awt.Componentクラスのメソッド
//    public void setLocation(int x, int y)
//　　　機能：部品の左上隅が親部品のx座標、y座標に位置するように設定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;

public class j373e extends Applet {

  Frame f;
  Label lab1,lab2,lab3;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // フレームの作成。
    f = new Frame("フレーム");

    // フレームの大きさを設定。
    f.setSize(300,200);

    // ラベルの作成。
    lab1 = new Label("ラベル１"); lab1.setBackground(Color.red);
    lab2 = new Label("ラベル２"); lab2.setBackground(Color.green);
    lab3 = new Label("ラベル３"); lab3.setBackground(Color.yellow);

    // ラベルをフレーム内に追加。
    f.add(lab1,BorderLayout.NORTH);
    f.add(lab2,BorderLayout.WEST);
    f.add(lab3,BorderLayout.EAST);

    // フレームの表示位置を設定。
    f.setLocation(300,300);

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
<applet code="j373e.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j373e.class" width="300" height="100">
</applet>
<br><br>

<img src="j373e.jpg" width=300 height=200>
<br><br>

</body>
</html>
*/
