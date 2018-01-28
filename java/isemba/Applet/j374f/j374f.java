// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j374f.java 
 * created : Time-stamp: <09/06/30(火) 17:53:27 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j374f.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j374f.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（フレーム、チェック付きメニュー、イベント処理）
//
//　　メニュー内にチェック付きメニュー項目を作成する。
//    チェックなし項目をクリックすると、チェックがつき項目名がアプレット内に
//　　表示される。
//    チェック付き項目をクリックすると、チェックが消えるだけ。
//
//　●イベント処理
//　　イベントソース： CheckboxMenuItemクラス
//　　イベントクラス： ItemEventクラス
//　　イベントリスナ： ItemListenerインターフェース
//　　　　　　　　　　 itemStateChangedメソッド
//
//　●CheckboxMenuItemクラスのメソッド
//　　public boolean getState()
//　　　機能：チェックボックスメニュー項目の状態がtrueかfalseか取得する。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
  
public class j374f extends Applet implements ItemListener {

  Frame f;
  CheckboxMenuItem mi1,mi2,mi3;
  Label lab;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // フレームの作成。
    f = new Frame("フレーム");
    // フレームの大きさを設定。
    f.setSize(300,200);

    // ラベルの作成とフレーム内に追加。
    lab = new Label("ここに表示",Label.CENTER);
    lab.setBackground(Color.yellow);
    f.add(lab,BorderLayout.SOUTH);

    // フレームの表示。
    f.setVisible(true);

    // メニューバーmbの作成とフレーム内に追加。
    MenuBar mb = new MenuBar();
    f.setMenuBar(mb);

    // メニューmの作成とメニューバーmb内に追加。
    Menu m = new Menu("メニュー");
    mb.add(m);

    // メニュー項目の作成とメニューm2内に追加。
    mi1 = new CheckboxMenuItem("赤");
    mi2 = new CheckboxMenuItem("黄");
    mi2.setEnabled(false);
    mi3 = new CheckboxMenuItem("青",true);
    m.add(mi1);
    m.add(mi2);
    m.add(mi3);

    // イベントリスナの登録。
    mi1.addItemListener(this);
    mi2.addItemListener(this);
    mi3.addItemListener(this);

  }

  // ItemListenerインターフェースのメソッド。
  public void itemStateChanged(ItemEvent ie) {
    if( (ie.getSource() == mi1)&&(mi1.getState() == true) ) { 
      lab.setText("赤の選択"); 
    }
    if( (ie.getSource() == mi2)&&(mi2.getState() == true) ) { 
      lab.setText("黄の選択"); 
    }
    if( (ie.getSource() == mi3)&&(mi3.getState() == true) ) { 
      lab.setText("青の選択"); 
    }
  }

}
/*
ＨＴＭＬファイル
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j374f.class" width="300" height="100">
</applet>
</body>
</html>
*/
