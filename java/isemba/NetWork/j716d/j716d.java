// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j716d.java 
 * created : Time-stamp: <09/07/03(金) 12:48:50 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/NETWORK/j716d.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j716d.java >>
//
//  ネットワーク（１）：Webページの表示(イベント処理)
//
//　　JEditorPaneクラスを使うと、URLで指定するWebページを表示できる。
//　　過去にたどったリンクを記憶しておき、戻るボタンで前のリンクに戻る。
//
//　●HyperlinkEventクラス
//    リンクに関して発生したイベントを、関係あるオブジェクトに通知するために使う。
//
//　●HyperlinkEventクラスのメソッド
//    public HyperlinkEvent.EventType getEventType()
//　　　機能：イベントのタイプを取得する。
//    public URL getURL()
//      機能：リンクの参照先のURLを取得する。 
//
//　●HyperlinkEvent.EventTypeクラス
//　　イベント型(ENTERED, EXITED, ACTIVATED)を定義する。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class j716df extends JFrame implements ActionListener, HyperlinkListener {

  JEditorPane ep;
  JTextField tf;
  JButton b;
  String a[] = new String[100]; // URLを保存する配列。
  int k = 0;

  public j716df(String t) { // コンストラクタ。 
    super(t);

    // コンテンツペインを取得。
    Container c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // ラベルの作成。
    JLabel lab = new JLabel("URL");
    // テキストフィールドの作成。 
    tf = new JTextField("http://",30);
    // 戻るボタンの作成。 
    b = new JButton("戻る");

    // パネルの作成。
    JPanel p = new JPanel();
    // パネルのレイアウトマネージャをFlowLayoutに設定。
    p.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
    p.setBackground(Color.white);

    // ラベルをパネル内に追加。
    p.add(lab);
    // テキストフィールドをパネル内に追加。
    p.add(tf);
    // 戻るボタンをパネル内に追加。
    p.add(b);

    // パネルをコンテンツペイン内に追加。
    c.add(p,BorderLayout.NORTH);
    
    // エディタペインの作成。
    ep = new JEditorPane();
    // エディタペインを表示するスクロールペインの作成。
    JScrollPane sp = new JScrollPane(ep);

    // エディタペインを表示するスクロールペインをコンテンツペイン内に追加。
    c.add(sp,BorderLayout.CENTER);

    // イベントリスナの登録。
    tf.addActionListener(this);
    ep.addHyperlinkListener(this);
    b.addActionListener(this);
  }

  // ActionListenerインターフェースのメソッド
  public void actionPerformed(ActionEvent ae) {
    if( ae.getSource() == tf ) {
      try {
        String url = tf.getText();
        k++; a[k] = url;
        ep.setPage(url);
        ep.setEditable(false);
      } catch( IOException e ) {
        System.out.println(e);
      }
    }
    if( ae.getSource() == b ) {
      String url;
      if( k > 1 ) { 
        url = a[k-1]; k--;
      } else {
        url = a[1];
      } 
      tf.setText(url);
      try {
        ep.setPage(url);
      } catch( IOException e ) {
        System.out.println(e);
      }
    }
  }

  // HyperlinkListenerインターフェースのメソッド
  public void hyperlinkUpdate(HyperlinkEvent he) {
    if( he.getEventType() != HyperlinkEvent.EventType.ACTIVATED ) return;
    String url = he.getURL().toString();
    tf.setText(url);
    k++; a[k] = url;
    try { 
      ep.setPage(url);
    } catch( IOException e ) {
      System.out.println(e);
    }
  }
}

class j716d {
  public static void main(String[] args) {

    // フレームの作成。
    j716df jf = new j716df("フレーム");

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの大きさ設定。
    jf.setSize(600,300);

    // フレームの表示。
    jf.setVisible(true);
  }
}
/*
</pre>

<font size=5 color=blue>実行手順</font><br>

<pre>
% javac j716d.java
% java j716d
</pre>

<font size=5 color=blue>実行結果</font>
<br><br>

実行直後<br>
<img src="j716d1.jpg" width=600 height=280>
<br><br>

URL指定後<br>
<img src="j716d2.jpg" width=600 height=280>
<br><br>

リンク指定後<br>
<img src="j716d3.jpg" width=600 height=280>
<br><br>

戻るボタンクリック後<br>
<img src="j716d4.jpg" width=600 height=280>

</body>
</html>
*/
