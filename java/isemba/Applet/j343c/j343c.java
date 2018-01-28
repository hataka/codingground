// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j343c.java 
 * created : Time-stamp: <09/06/30(火) 20:55:05 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j343c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j343c.java >>
//
//  アプレット（４）：イベント処理（マウス操作、MouseAdapterクラス、匿名クラス）
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
//　●匿名クラス
//    内部クラスに名前を付けるのは煩雑である。そこで、名前を付けずに内部クラスを
//　　使える方法が考えられた。
//
//　　    new 親クラス名(引数) {
//          処理                
//        }                     
//
//　　・コンパイルされると、２つのクラスファイルが作成される。
//　　　j343c.class, j343c$1.class
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 

public class j343c extends Applet {

  String s = "";
  int Mx = 0, My = 0; // マウスの最初の位置。

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // イベントリスナを匿名クラスとして定義。
    MouseAdapter ma = new MouseAdapter() {
      // mouseClickedメソッドの定義。
      public void mouseClicked(MouseEvent e) {
        Mx = e.getX(); // クリックした点のx座標を取得する。 
        My = e.getY(); // クリックした点のy座標を取得する。
        s = "Mouse Clicked"; 
        repaint(); // 再描画。
      }
    };

    // イベントリスナの登録。
    this.addMouseListener(ma);

  }

  public void paint(Graphics g) {
    // マウスのイベント操作と位置の表示。
    g.drawString(s,Mx,My);
    String pos = "(" + Mx + "," + My + ")";
    g.drawString(pos,Mx,My+12);
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
<applet code="j343c.class" width="300" height="100">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j343c.class" width="300" height="100">
</applet>

</body>
</html>
*/
