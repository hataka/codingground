// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j716c.java 
 * created : Time-stamp: <09/07/03(金) 12:39:46 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/NETWORK/j716c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j716c.java >>
//
//  ネットワーク（１）：Webページの表示(イベント処理)
//
//　　JEditorPaneクラスを使うと、URLで指定するWebページを表示できる。
//　　ページ中のリンクをたどるには、HyperlinkListenerインターフェースを実装する
//　　必要がある。
//    HyperlinkListenerインターフェースは、hyperlinkUpdateメソッドだけをもつ。
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

class j716cf extends JFrame implements ActionListener, HyperlinkListener {

  JEditorPane ep;
  JTextField tf;

  public j716cf(String t) { // コンストラクタ。 
    super(t);

    // コンテンツペインを取得。
    Container c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // ラベルの作成。
    JLabel lab = new JLabel("URL");
    // テキストフィールドの作成。 
    tf = new JTextField("http://",30);

    // パネルの作成。
    JPanel p = new JPanel();
    // パネルのレイアウトマネージャをFlowLayoutに設定。
    p.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
    p.setBackground(Color.white);

    // ラベルをパネル内に追加。
    p.add(lab);
    // テキストフィールドをパネル内に追加。
    p.add(tf);

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
  }

  // ActionListenerインターフェースのメソッド
  public void actionPerformed(ActionEvent ae) {
    if( ae.getSource() == tf ) {
      try {
        String url = tf.getText();
        ep.setPage(url);
        ep.setEditable(false);
      } catch( IOException e ) {
        System.out.println(e);
      }
    }
  }

  // HyperlinkListenerインターフェースのメソッド
  public void hyperlinkUpdate(HyperlinkEvent e) {
    if(e.getEventType() != HyperlinkEvent.EventType.ACTIVATED) return;
    String url = e.getURL().toString();
    tf.setText(url);
    try { 
      ep.setPage(url);
    } catch( Exception err ) {
      System.out.println(e);
    }
  }
}

class j716c {
  public static void main(String[] args) {

    // フレームの作成。
    j716cf jf = new j716cf("フレーム");

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
% javac j716c.java
% java j716c
</pre>

<font size=5 color=blue>実行結果</font>
<br><br>

実行直後<br>
<img src="j716c1.jpg" width=600 height=280>
<br><br>

URL指定後<br>
<img src="j716c2.jpg" width=600 height=280>
<br><br>

リンク指定後<br>
<img src="j716c3.jpg" width=600 height=280>

</body>
</html>
*/
