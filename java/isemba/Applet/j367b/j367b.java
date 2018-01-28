// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j367b.java 
 * created : Time-stamp: <09/07/01(水) 09:21:22 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j367b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j367b.java >>
//
//  Ａｐｐｌｅｔ（６）：部品（テキストフィールド、配置、イベント処理）
//
//　　テキストフィールドを使ってデータを入力し、リターンキーでラベルに表示する
//    １番目のテキストフィールド幅は固定、２番目のテキストフィールドは可変。
//
//　●イベント処理
//　　イベントソース：TextFieldクラス
//　　イベントクラス：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
//  ●TextComponentクラスのメソッド
//    public String getText()                       
//      機能：テキストコンポーネントの文字列を取得する。
//    public void setColumns(int n)
//　　　機能：テキストフィールドを列数nに設定する。
//
//  ●java.awt.Containerクラスから継承したメソッド
//    public void validate()                       
//      機能：コンテナが格納している部品が追加または変更されたとき、再配置を行う。
//
//  ●Stringクラスのメソッド
//    String trim()            
//      機能：元の文字列の前後から空白を取り除く。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 
import java.awt.event.*; 

public class j367b extends Applet implements ActionListener {

  TextField t1,t2; 
  Label lab;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをFlowLayoutに設定。
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // テキストフィールドの作成。
    t1 = new TextField(20);
    t2 = new TextField();

    // テキストフィールドをアプレット内に追加。
    this.add(t1); 
    this.add(t2); 

    // ラベルの作成。
    lab = new Label("ここに表示する");
    lab.setBackground(Color.yellow);

    // ラベルをアプレット内に追加。
    this.add(lab); 

    // イベントリスナの登録。
    t1.addActionListener(this);
    t2.addActionListener(this);

  }

  // ActionListenerインターフェースのメソッド
  public void actionPerformed(ActionEvent ae) {
    if( ae.getSource() == t1 ) { 
      String s = t1.getText(); lab.setText(s); 
    }
    if( ae.getSource() == t2 ) {
      String s2 = t2.getText().trim(); 
      int len = s2.length();
      t2.setColumns(len+2); // 2文字余分に確保。
      lab.setText(s2);
      this.validate();
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
<applet code="j367b.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j367b.class" width="300" height="160">
</applet>

</body>
</html>
*/
