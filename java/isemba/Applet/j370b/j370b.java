// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j370b.java 
 * created : Time-stamp: <09/07/01(水) 09:28:14 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j370b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j370b.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（キャンバス、配置、イベント処理）
//
//    アプレット内に赤丸ボタン、白丸ボタンを作成する。
//　　赤丸ボタンをクリックすると、赤丸がキャンバスに描画され、
//　　白丸ボタンをクリックすると、白丸がキャンバスに描画される。
//
//　●イベント処理
//　　イベントソース：Buttonクラス
//　　イベントクラス：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
//　●Graphicsクラスのメソッド
//    public abstract void fillOval(int x, int y, int w, int h)
//　　　機能：x,y,w,hで指定される矩形内に塗りつぶされた楕円が描画される。
//            x : 描画される楕円の左上隅の x 座標
//            y : 描画される楕円の左上隅の y 座標
//            w : 描画される楕円の幅
//            h : 描画される楕円の高さ
// 
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

class Canvasj370b extends Canvas {

  Color col;
  public void paint(Graphics g) {
    g.setColor(col);
    g.fillOval(20,20,50,50);
 }

}
  
public class j370b extends Applet implements ActionListener {

  Canvasj370b c;
  Button b1,b2;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをFlowLayoutに設定。
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // キャンバスの作成。
    c = new Canvasj370b();

    // キャンバスの大きさを設定。
    c.setSize(100,80);

    // キャンバスの位置を設定。
    c.setLocation(10,10);

    // キャンバスの背景色を黄色に設定。
    c.setBackground(Color.yellow);

    // キャンバスをアプレット内に追加。
    this.add(c);

    // ボタンの作成。
    b1 = new Button("赤丸");
    b2 = new Button("白丸");

    // ボタンをアプレット内に追加。
    this.add(b1);
    this.add(b2);

    // イベントリスナの登録。
    b1.addActionListener(this);
    b2.addActionListener(this);

  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent ae) {
    // 赤丸ボタンがクリックされたとき。
    if( ae.getSource() == b1 ) { c.col = Color.red; } 
    // 白丸ボタンがクリックされたとき。
    if( ae.getSource() == b2 ) { c.col = Color.white; }
    c.repaint(); // 再描画。
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
<applet code="j370b.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j370b.class" width="300" height="160">
</applet>

</body>
</html>
*/
