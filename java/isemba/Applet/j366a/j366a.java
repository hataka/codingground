// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j366a.java 
 * created : Time-stamp: <09/07/01(水) 08:33:57 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j366a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j366a.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（リスト、配置）
//
//　　複数の項目から複数の項目を選択するリストを作成し表示する。
//
//  ●java.awt.Listクラス
//    多数の項目から複数の項目を選択するとき、Listクラスを使う。
//
//  ○Listクラスのコンストラクタ
//    List(int r, boolean b)                       
//      機能：r行分のリストを作成する。bがtrueの場合、複数項目選択が可能となる。
//            bがfalseの場合、複数選択が不可。
//
//  ○Listクラスのメソッド
//    public void add(String s)
//　　　機能：文字列sをリストの最後に追加する。  
//　　public void add(String s, int n)
//　　　機能：文字列sをリストの位置nに追加する。nは0以上。
//　　　　　　nが0未満またはリスト内項目数以上の場合は、リストの末尾に追加される。 
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 

public class j366a extends Applet {

  List list;

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
<applet code="j366a.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j366a.class" width="300" height="160">
</applet>

</body>
</html>
*/
