// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j363b.java 
 * created : Time-stamp: <09/07/01(水) 08:27:17 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j363b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j363b.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（チョイス、イベント処理）
//
//　　チョイスを作成・表示し、選択した項目（赤、青、黄）でアプレットの背景色を
//　　変更する。
//
//　●イベント処理
//　　イベントソース：Choiceクラス
//　　イベントクラス：ItemEventクラス
//　　イベントリスナ：ItemListenerインターフェース
//　　　　　　　　　　itemStateChangedメソッド
//
//  ●Choiceクラスのメソッド
//    public void add(String s)                       
//      機能：文字列sを項目に加える。
//    public String getSelectedItem()
//      機能：選択された項目を文字列で返す。
//    public int getSelectedIndex()
//      機能：選択された項目の位置を返す。先頭の位置は0。
//
//　●ItemListenerインターフェースのメソッド
//    void itemStateChanged(ItemEvent e)
//      機能：イベントが発生したとき呼び出される。
//      e   ：イベント発生時の状況が記録されている。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 
import java.awt.event.*; 

public class j363b extends Applet implements ItemListener {

  Choice cb;

  public void init() {

   // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをFlowLayoutに設定。
    this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

    // チョイスの作成。
    cb = new Choice();

    // 項目をチョイス内に追加。
    cb.add("赤");
    cb.add("青");
    cb.add("黄");

    // チョイスをアプレット内に追加。
    this.add(cb);

    // イベントリスナの登録。
    cb.addItemListener(this);

  }

  // ItemListenerインターフェースのメソッド。
  public void itemStateChanged(ItemEvent ie) {
    // チョイスからイベントが発生した場合、実行される。   
    if( ie.getSource() == cb ) {
      String s = (String)cb.getSelectedItem();
      if( s.equals("赤") ) { this.setBackground(Color.red); }
      if( s.equals("青") ) { this.setBackground(Color.blue); }
      if( s.equals("黄") ) { this.setBackground(Color.yellow); }
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
<applet code="j363b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j363b.class" width="300" height="100">
</applet>

</body>
</html>
*/
