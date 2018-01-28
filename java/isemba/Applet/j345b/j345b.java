// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j345b.java 
 * created : Time-stamp: <09/07/01(水) 06:47:46 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j345b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j345b.java >>
//
//  アプレット（４）：イベント処理（キー操作、KeyAdapterクラス、内部クラス）
//
//　●操作
//　　押されたキーを文字列として表示する。
//
//　●イベント処理
//　　イベントソース： キー操作
//　　イベントクラス： KeyEventクラス
//　　イベントリスナ： KeyAdapterクラスを拡張したクラス
//
//　●アダプタクラス
//　　イベントリスナは、KeyListenerインターフェースのすべてのメソッドを
//    定義しなければならない。これをさけるためアダプタクラス呼ばれるクラスが
//    準備されている。
//　　適当なアダプタクラスを使うと、必要なメソッドのみオーバーライドするだけで
//　　よい。
//    ・アダプタクラスは、KeyListenerインターフェースのメソッドを空のメソッド
//      として定義しただけである。
//  　・コンパイルすると２つのクラスファイルが生成される。
//　　　j345b.class, j345b$EventListener.class
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 

public class j345b extends Applet {

  Font f;
  String s = "";

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    f = new Font("Courier", Font.BOLD, 48);

    // イベントリスナの作成。
    EventListener el = new EventListener();

    // イベントリスナの登録。
    this.addKeyListener(el);

    // アプレットにフォーカスを与える。
    this.requestFocusInWindow(); 

  }

  public void paint(Graphics g) {
    g.setColor(Color.green);
    g.setFont(f);
    g.drawString(s,50,50);
  }

  // アダプタクラスを内部クラスとして定義。
  class EventListener extends KeyAdapter {
    // 残りのメソッド(keyPressed,keyReleased)の定義が省略できる。  
    // keyTypedメソッドの定義。
    public void keyTyped(KeyEvent e) {
      s = s + e.getKeyChar();
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
<applet code="j345b.class" width="300" height="100">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>実行結果</font><br>



</body>
</html>
*/
