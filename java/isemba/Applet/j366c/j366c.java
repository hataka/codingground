// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j366c.java 
 * created : Time-stamp: <09/07/01(水) 08:35:56 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j366c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j366c.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（リスト、配置、イベント処理）
//
//　　複数の項目から複数の項目を選択するリストを作成し表示する。
//    リストから複数項目を選択し、選択ボタンをクリックすると、選択された項目が
//　　ラベルに表示される。
//
//　●イベント処理
//　　イベントソース：Buttonクラス
//　　イベントクラス：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//  　　　　　　  　　actionPerformedメソッド
//
//  ●Listクラスのメソッド
//    public String a[] getSelectedItems()
//      機能：現在選択されている項目を配列aとして返す。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 
import java.awt.event.*;

public class j366c extends Applet implements ActionListener {

  List list;
  Button b;
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

    // ボタンの作成
    b = new Button("選択"); 

    // ボタンをアプレット内に追加。
    this.add(b);

    // 表示用ラベルの作成。
    lab = new Label("　　　　　　　　　　　　　　　　　　　　");
    lab.setBackground(Color.yellow);
    // ラベルをアプレット内に追加。
    this.add(lab);

    // イベントリスナを登録。
    b.addActionListener(this);

  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent ae) {
    if( ae.getSource() == b ) {
      String s[] = list.getSelectedItems();
      String t = "";
      for( int i=0; i<s.length; i++ ) {
        t = t + s[i];
      }
      lab.setText(t);
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
<applet code="j366c.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j366c.class" width="300" height="160">
</applet>

</body>
</html>
*/
