// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j370a.java 
 * created : Time-stamp: <09/07/01(水) 09:26:21 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j370a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j370a.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（キャンバス、配置）
//
//　　キャンバスを作成し表示する。
//    キャンバスはCanvasクラスを継承して定義する。
//
//　●java.awt.Canvasクラス
//    矩形の描画領域を提供する。
//　　・Canvasクラスのクラス階層
//　　　java.lang.Object --> java.awt.Component --> java.awt.Canvas
//
//　○Canvasクラスのメソッド
//    public void paint(Graphics g)
//      機能：キャンバスに描画する。
//
//　●java.awt.Componentクラスのメソッド
//　　public void setSize(int width, int height)
//　　　機能：サイズを、幅width、高さheight に設定する。
//　　public void setLocation(int x, int y)
//　　　機能：部品の左上隅は、(x,y)に指定する。単位はピクセル。 
// 
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

class Canvasj370a extends Canvas {

  // キャンバスへの描画。
  public void paint(Graphics g) {
    g.drawString("キャンバス",20,40);
 }

}
  
public class j370a extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットにレイアウトマネージャ(FlowLayout)を設定。
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // キャンバスの作成。
    Canvasj370a c = new Canvasj370a();

    // キャンバスの大きさを設定。
    c.setSize(100,80);

    // キャンバスの位置を設定。
    c.setLocation(10,10);

    // キャンバスの背景色を黄色に設定。
    c.setBackground(Color.yellow);

    // キャンバスをアプレット内に追加。
    this.add(c);

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
<applet code="j370a.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j370a.class" width="300" height="160">
</applet>

</body>
</html>
*/
