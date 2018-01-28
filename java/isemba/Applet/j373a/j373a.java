// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j373a.java 
 * created : Time-stamp: <09/07/01(水) 09:46:17 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j373a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j373a.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（フレーム、配置）
//
//　　フレームと呼ばれるウィンドウ(タイトルなし)を表示する。
//
//　　フレームにおいて、最大化ボタン、最小化ボタンはクリックして機能するが、
//　　閉じるボタンは機能しない。
//
//　●java.awt.Frameクラス
//    Frameクラスで、タイトルとボーダを持つトップレベルウィンドウを作成する。 
//    java.lang.Object --> java.awt.Conponent --> java.awt.Container -->
//    java.awt.Window --> java.awt.Frame
//
//　○Frameクラスのコンストラクタ
//　　public Frame() throws HeadlessException
//　　　機能：Frameオブジェクトを作成する。
//　　　　　　初期状態で可視ではない。
//　　　　　　Frameのタイトルは空である。
//    public Frame(String s) throws HeadlessException
//　　　機能：タイトルsのついたFrameオブジェクトを作成する。
//　　　　　　初期状態で可視ではない。
//
//　●java.awt.Componentクラスのメソッド
//    public void setSize(int w, int h)
//　　　機能：部品のサイズを幅wおよび高さhに設定する。
//　　public void setVisible(boolean b)
//　　　機能：bがtrueの場合、表示、falseの場合、非表示にする。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
  
public class j373a extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // フレームの作成。
    Frame f = new Frame();

    // フレームの大きさを設定。
    f.setSize(300,200);

    // フレームの表示。
    f.setVisible(true);

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
<applet code="j373a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j373a.class" width="300" height="100">
</applet>
<br><br>

<img src="j373a.jpg" width=300 height=200>

</body>
</html>
*/
