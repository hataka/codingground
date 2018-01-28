// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j370c.java 
 * created : Time-stamp: <09/07/01(水) 09:29:26 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j370c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j370c.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（キャンバス、配置、イベント処理）
//
//    キャンバス全体をアプレット内で移動する。
//　　マウスでクリックした位置にキャンバスを移動する。
//
//　●イベント処理
//　　イベントソース：マウス
//　　イベントクラス：MouseEventクラス
//　　イベントリスナ：MouseAdapterを拡張したクラス
//
//　●java.awt.Componentクラスのメソッド
//　　public Dimension getSize()
//　　　機能：部品のサイズを、Dimensionオブジェクトとして返す。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

class Canvasj370c extends Canvas {

  public void paint(Graphics g) {
    Dimension d = this.getSize(); // キャンバスの幅、高さを取得。
    g.drawRect(0,0,d.width,d.height); // 長方形を描画。
    g.drawString("キャンバス",20,40);
  }

}
  
public class j370c extends Applet {

  Canvasj370c c;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットにレイアウトマネージャを設定しない。
    this.setLayout(null);

    // キャンバスの作成。
    c = new Canvasj370c();

    // キャンバスの大きさを設定。
    c.setSize(100,60);

    // キャンバスの位置を初期設定。
    c.setLocation(0,0);

    // キャンバスの背景色を黄色に設定。
    c.setBackground(Color.yellow);

    // キャンバスをアプレット内に追加。
    this.add(c);

    // イベントリスナの作成。
    EventListener el = new EventListener();

    // イベントリスナの登録。
    this.addMouseListener(el);

  }

  // イベントリスナを内部クラスとして定義。
  class EventListener extends MouseAdapter {
    public void mouseClicked(MouseEvent me) {
      int Mx = me.getX(); // クリックした点のx座標を取得する。 
      int My = me.getY(); // クリックした点のy座標を取得する。
      c.setLocation(Mx,My);
      c.repaint(); // 再描画。
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
<applet code="j370c.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j370c.class" width="300" height="160">
</applet>

</body>
</html>
*/
