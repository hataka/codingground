// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j371a.java 
 * created : Time-stamp: <09/07/01(水) 09:42:18 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j371a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j371a.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（スクロールバー、配置）
//
//    スクロールバーを表示する。
//
//　●java.awt.Scrollbarクラス
//
//  ○Scrollbarクラスのコンストラクタ
//    public Scrollbar(int d, int v, int w, int min, int max) throws HeadlessException
//　　　機能：方向、初期値、可視量、最小値、最大値を持つスクロールバーを作成する。 
//      　　　スライダーを移動して数値を変化させる。
//　　　　　　dは方向を示す。水平方向：Scrollbar.HORIZONTAL　垂直方向：Scrollbar.VERTICAL
//　　　　　　vは初期値、wはスライダーの幅、minは左端（または上端）の数値、
//　　　　　　maxは右端（または下端）の数値。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
  
public class j371a extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをBorderLayoutに設定。
    this.setLayout(new BorderLayout(10,10));

    // スクロールバーの作成。
    Scrollbar sbh = new Scrollbar(Scrollbar.HORIZONTAL,150,10,0,310);
    Scrollbar sbv = new Scrollbar(Scrollbar.VERTICAL,50,10,0,110);

    // スクロールバーをアプレット内に追加。
    this.add(sbh,BorderLayout.NORTH);
    this.add(sbv,BorderLayout.EAST);

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
<applet code="j371a.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j371a.class" width="300" height="160">
</applet>

</body>
</html>
*/
