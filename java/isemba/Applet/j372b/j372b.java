// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j372b.java 
 * created : Time-stamp: <09/07/01(水) 09:45:20 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j372b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j372b.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（ポップアップメニュー、配置、イベント処理）
//
//　　ポップアップメニューを作成し表示する。
//　　項目「赤」「青」「黄」を選択すると、アプレットの背景色が変わる。
//
//　●イベント処理
//　　イベントソース：マウスクラス
//　　イベントクラス：MouseEventクラス、ActionEventクラス
//　　イベントリスナ：MouseListenerインターフェース
//　　　　　　　　　　mouseClickedメソッド、その他
//                    ActionListenerインターフェース
//                    actionPerformedメソッド
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
  
public class j372b extends Applet implements ActionListener,MouseListener {

  PopupMenu pm;
  MenuItem mi1,mi2,mi3;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをFlowLayoutに設定。
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // ポップアップメニューの作成。
    pm = new PopupMenu();

    // ポップアップメニューをアプレット内に追加。
    this.add(pm); 

    // メニュー項目の作成。
    mi1 = new MenuItem("赤"); 
    mi2 = new MenuItem("黄"); 
    mi3 = new MenuItem("青"); 

    // メニュー項目をポップアップメニューに追加。
    pm.add(mi1);  
    pm.add(mi2); 
    pm.add(mi3); 

    // イベントリスナの登録。
    mi1.addActionListener(this);
    mi2.addActionListener(this);
    mi3.addActionListener(this);
    this.addMouseListener(this);

  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent ae) {
    if( ae.getSource() == mi1 ) { this.setBackground(Color.red); }
    if( ae.getSource() == mi2 ) { this.setBackground(Color.yellow); }
    if( ae.getSource() == mi3 ) { this.setBackground(Color.blue); }
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
<applet code="j372b.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j372b.class" width="300" height="160">
</applet>

</body>
</html>
*/
