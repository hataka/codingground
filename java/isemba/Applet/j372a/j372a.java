// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j372a.java 
 * created : Time-stamp: <09/07/01(水) 09:44:45 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j372a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j372a.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（ポップアップメニュー、配置、イベント処理）
//
//　　ポップアップメニューを作成し表示する。
//
//　●イベント処理
//　　イベントソース：マウスクラス
//　　イベントクラス：MouseEventクラス
//　　イベントリスナ：MouseListenerインターフェース
//　　　　　　　　　　mouseClickedメソッド、その他
//
//　●java.awt.PopupMeuuクラス
//    ポップアップメニューを利用するとき、PopupMenuクラスを使う。
//
//　○PopupMenuのコンストラクタ
//　　PopupMenu(String s)
//      機能：タイトルsのポップアップメニューを生成する。
//
//　○PopupMenuクラスのメソッド
//　　public void show(Component c, int x, int y)
//      機能：位置(x,y)にポップアップメニューを表示する。
//
//  ●MenuItemクラスのコンストラクタ
//　　MenuItem(String s)
//      機能：メニュー項目sを作成する。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
  
public class j372a extends Applet implements MouseListener {

  PopupMenu pm;
  MenuItem mi1,mi2,mi3;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをFlowLayoutに設定。
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // ポップアップメニューの作成とアプレット内に追加。
    pm = new PopupMenu();
    this.add(pm); 

    // メニュー項目の作成とポップアップメニューに追加。
    mi1 = new MenuItem("赤"); 
    mi2 = new MenuItem("黄"); 
    mi3 = new MenuItem("青"); 
    pm.add(mi1);  
    pm.add(mi2); 
    pm.add(mi3); 

    // イベントリスナの登録。
    this.addMouseListener(this);

  }

  // MouseListenerインターフェースのメソッド。
  public void mouseClicked(MouseEvent me) { 
    pm.show(this, me.getX(), me.getY()); 
  }
  public void mousePressed(MouseEvent me) { }
  public void mouseReleased(MouseEvent me) { }
  public void mouseEntered(MouseEvent me) { }
  public void mouseExited(MouseEvent me) { }

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
<applet code="j372a.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j372a.class" width="300" height="160">
</applet>

</body>
</html>
*/
