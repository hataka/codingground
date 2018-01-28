// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j366b.java 
 * created : Time-stamp: <09/07/01(水) 08:35:06 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j366b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j366b.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（リスト、配置、イベント処理）
//
//　　複数の項目から複数の項目を選択するリストを作成し表示する。
//    リスト内の選択された項目をラベルに表示する。
//　　項目が選択されていない場合や複数の項目が選択されている場合、nullを返す。
//
//　●イベント処理
//　　イベントソース：Listクラス
//　　イベントクラス：ItemEventクラス
//　　イベントリスナ：ItemListenerインターフェース
//                    itemStateChangedメソッド
//
//  ●Listクラスのメソッド
//    public String getSelectedItem()
//      機能：現在選択されている項目を返す。
//            項目が選択されていない場合や複数の項目が選択されている場合、nullを返す。
//    public int getSelectedIndex()
//      機能：現在選択されている項目のインデックスを返す。
//            項目が選択されていない場合や複数の項目が選択されている場合、-1を返す。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 
import java.awt.event.*;

public class j366b extends Applet implements ItemListener {

  List list;
  Label lab;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをFlowLayoutに設定。
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // リストの作成。
    list = new List(3,true);      
    list.add("項目１"); 
    list.add("項目２");
    list.add("項目４"); 
    list.add("項目３",2);
    list.add("項目５");

    // リストをアプレット内に追加。
    this.add(list);

    // 表示用ラベルの作成。
    lab = new Label("　　　　　　　　　　　　　　　　　　　　");
    lab.setBackground(Color.yellow);
    // ラベルをアプレット内に追加。
    this.add(lab);

    // イベントリスナを登録。
    list.addItemListener(this);

  }

  // ItemListenerインターフェースのメソッド。
  public void itemStateChanged(ItemEvent e) {
    if( e.getSource() == list ) {
      String s = list.getSelectedItem();
      int i = list.getSelectedIndex();
      lab.setText("選択された項目：" + s + " インデックス：" + i);
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
<applet code="j366b.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j366b.class" width="300" height="160">
</applet>

</body>
</html>
*/
