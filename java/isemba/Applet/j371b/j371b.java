// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j371b.java 
 * created : Time-stamp: <09/07/01(水) 09:43:35 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j371b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j371b.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（スクロールバー、配置、イベント処理）
//
//    スライダーをマウスでドラッグして数値を変化させる。
//　　左右の方向ボタンをクリックすると数値が+1,-1変化する。
//    バーのスライダー以外をクリックすると、数値が+10,-10変化する。
//
//　●イベント処理
//　　イベントソース：Scrollbarクラス
//　　イベントクラス：AdustmentEventクラス
//　　イベントリスナ：AdjustmentListenerインターフェース
//　　　　　　　　　　adjustmentValueChangedメソッド
//
//  ●Scrollbarクラスのメソッド
//    public int getValue()
//      機能：スクロールバーの現在値を返す。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*; 
  
public class j371b extends Applet implements AdjustmentListener {

  Scrollbar sbh,sbv;
  Label lab;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをBorderLayoutに設定。
    this.setLayout(new BorderLayout(10,10));

    // スクロールバーの作成。
    sbh = new Scrollbar(Scrollbar.HORIZONTAL,150,10,0,310);
    sbv = new Scrollbar(Scrollbar.VERTICAL,50,10,0,110);

    // スクロールバーをアプレット内に追加。
    this.add(sbh,BorderLayout.NORTH);
    this.add(sbv,BorderLayout.EAST);

    // ラベルの作成。
    lab = new Label("              ");

    // ラベルをアプレット内に追加。
    this.add(lab);

    // イベントリスナの登録。
    sbh.addAdjustmentListener(this);
    sbv.addAdjustmentListener(this);

  }

  // スクロールバーから送られてきたイベントを処理するメソッド。
  public void adjustmentValueChanged(AdjustmentEvent ae) {
    if( ae.getSource() == sbh ) {
      int h = sbh.getValue();
      lab.setText("水平バーの値：h = " + h);
    }
    if( ae.getSource() == sbv ) {
      int v = sbv.getValue();
      lab.setText("垂直バーの値：v = " + v);
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
<applet code="j371b.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j371b.class" width="300" height="160">
</applet>

</body>
</html>
*/
