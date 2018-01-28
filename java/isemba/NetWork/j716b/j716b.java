// -*- mode: java -*- Time-stamp: <2009-07-03 11:53:37 kahata>
/*====================================================================
 * name: j716b.java 
 * created : Time-stamp: <09/07/03(金) 11:52:10 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/NETWORK/j716b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j716b.java >>
//
//  ネットワーク（１）：Webページの表示(イベント処理)
//
//　　JEditorPaneクラスを使うと、URLで指定するWebページを表示できる。
//
//　●JEditorPaneクラスのメソッド
//    public final void setContentType(String type)
//      　機能：コンテンツタイプtypeを設定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class j716bf extends JFrame implements ActionListener {

  JEditorPane ep;
  JTextField tf;

  public j716bf(String t) { // コンストラクタ。 
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
}

class j716b {
  public static void main(String[] args) {

    // フレームの作成。
    j716bf jf = new j716bf("フレーム");

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの大きさ設定。
    jf.setSize(800,600);

    // フレームの表示。
    jf.setVisible(true);
  }
}
/*
</pre>

<font size=5 color=blue>実行手順</font><br>

<pre>
% javac j716b.java
% java j716b
</pre>

<font size=5 color=blue>実行結果</font>
<br><br>

実行直後<br>
<img src="j716b1.jpg" width=600 height=300>
<br><br>

URL指定後<br>
<img src="j716b2.jpg" width=600 height=300>

</body>
</html>
*/
