// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j368a.java 
 * created : Time-stamp: <09/07/01(水) 08:41:04 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j368a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j368a.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（テキストエリア、配置）
//
//　　２つのテキストエリアを作る。
//　　テキストエリア内では編集ができる。
//
//　　テキストエリアに表示しきれないテキストが入力されると自動的にスクロールバー
//　　が現れる。テキストエリアにすべてのテキストが表示できるようになるとスクロー
//　　ルバーは消える。
//　　他の部品（ボタンなど）と組み合わせて使う。
//
//  ●java.awt.TextAreaクラス
//    ユーザからの入力（文字列）用の欄（複数行分ある）で、編集するとき、TextArea
//　　クラスを使う。
//    水平スクロールバー、垂直スクロールバーを設定できる。
//
//  ○TextAreaクラスのコンストラクタ
//    TextArea(int r, int c)                       
//      機能：r行、c列のテキストエリアを作成する。
//    TextArea(String s, int r, int c)                       
//      機能：文字列sを表示するr行c列のテキストエリアを作成する。
//    TextArea(String s, int r, int c, int scr)                       
//      機能：文字列sを表示するr行c列のテキストエリアを作成する。
//            static int SCROLLBARS_BOTH  水平・垂直スクロールバーを設定
//            static int SCROLLBARS_HORIZONTAL_ONLY  水平スクロールバーを設定
//            static int SCROLLBARS_VERTICAL_ONLY  垂直スクロールバーを設定
//            static int SCROLLBARS_NONE  スクロールバーを設定しない
//
//  　・TextAreaクラスのクラス階層
//　　　java.lang.Object --> java.awt.Component --> java.awt.TextComponent -->
//    　java.awt.TextArea
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j368a extends Applet {

  TextArea ta1,ta2; 

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをFlowLayoutに設定。
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // テキストエリアの作成。
    ta1 = new TextArea("こんにちは",3,30,TextArea.SCROLLBARS_BOTH);
    ta2 = new TextArea(3,30);

    // テキストエリアをアプレット内に追加。
    this.add(ta1);
    this.add(ta2);

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
<applet code="j368a.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j368a.class" width="300" height="200">
</applet>

</body>
</html>
*/
