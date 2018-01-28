// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j343b.java 
 * created : Time-stamp: <09/06/30(火) 20:52:18 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j343b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j343b.java >>
//
//  アプレット（４）：イベント処理（マウス操作、MouseAdapterクラス、内部クラス）
//
//　●操作
//　　マウスボタンをクリックすると、その位置に"Mouse Clicked"と位置座標を
//　　表示する。
//
//　●イベント処理
//　　イベントソース： マウス
//　　イベントクラス： MouseEventクラス
//　　イベントリスナ： MouseAdapterクラスを拡張したクラス
//
//　●アダプタクラス
//　　イベントリスナは、MouseListenerインターフェースのすべてのメソッドを
//    定義しなければならない。これをさけるためアダプタクラス呼ばれるクラスが
//    準備されている。
//　　適当なアダプタクラスを使うと、必要なメソッドのみオーバーライドするだけで
//　　よい。
//    ・アダプタクラスはMouseListenerインターフェースのメソッドを空のメソッド
//      として定義しただけである。
//  　・コンパイルすると２つのクラスファイルが生成される。
//　　　j343b.class, j343b$EventListener.class
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 

public class j343b extends Applet {

  String s = "";
  int Mx = 0, My = 0; // マウスの最初の位置。

  public void init() {

   // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // イベントリスナの作成。
    EventListener el = new EventListener();

    // イベントリスナの登録。
    this.addMouseListener(el);

  }

  public void paint(Graphics g) {
    // マウスのイベント操作と位置の表示。
    g.drawString(s,Mx,My);
    String pos = "(" + Mx + "," + My + ")";
    g.drawString(pos,Mx,My+12);
  }

  // イベントリスナを内部クラスとして定義。
  class EventListener extends MouseAdapter {
    // 残りのメソッド(mouseReleased,mousePressed,mouseEntered,mouseExited)の
    // 定義が省略できる。  
    // mouseClickedメソッドの定義。
    public void mouseClicked(MouseEvent e) {
      Mx = e.getX(); // クリックした点のx座標を取得する。 
      My = e.getY(); // クリックした点のy座標を取得する。
      s = "Mouse Clicked"; 
      repaint(); // 再描画。
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
<applet code="j343b.class" width="640" height="480">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<!--applet code="j343b.class" width="300" height="100"-->
<!--/applet-->

</body>
</html>
*/
