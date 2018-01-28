// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j374b.java 
 * created : Time-stamp: <09/07/01(水) 10:05:16 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j374b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j374b.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（フレーム、メニュー、イベント処理）
//
//　　メニューの赤を選択すると背景色が赤になる。
//　　メニューの黄を選択すると背景色が黄になる。
//　　メニューの青を選択すると背景色が青になる。
//
//　●イベント処理
//　　イベントソース： MenuItemクラス
//　　イベントクラス： ActionEventクラス
//　　イベントリスナ： ActionListenerインターフェース
//　　　　　　　　　　 actionPerformedメソッド
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
  
public class j374b extends Applet implements ActionListener {

  Frame f;
  MenuItem mi1,mi2,mi3;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // フレームの作成。
    f = new Frame();
    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームの表示。
    f.setVisible(true);

    // メニューバーmbの作成とフレーム内に追加。
    MenuBar mb = new MenuBar();
    f.setMenuBar(mb);

    // メニューmの作成とメニューバー内に追加。
    Menu m = new Menu("メニュー");
    mb.add(m);

    // メニュー項目の作成とメニュー内に追加。
    mi1 = new MenuItem("赤");
    mi2 = new MenuItem("黄");
    mi3 = new MenuItem("青");
    m.add(mi1);
    m.add(mi2);
    m.add(mi3);

    // イベントリスナの登録。
    mi1.addActionListener(this);
    mi2.addActionListener(this);
    mi3.addActionListener(this);

  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == mi1 ) { f.setBackground(Color.red); }
    if(e.getSource() == mi2 ) { f.setBackground(Color.yellow); }
    if(e.getSource() == mi3 ) { f.setBackground(Color.blue); }
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
<applet code="j374b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j374b.class" width="300" height="100">
</applet>
<br><br>

<img src="j374b.jpg" width=300 height=200>

</body>
</html>
*/
