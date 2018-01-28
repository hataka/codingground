// -*- mode: java -*- Time-stamp: <2009-07-03 11:43:15 kahata>
/*====================================================================
 * name: j715b.java 
 * created : Time-stamp: <09/07/03(金) 11:41:30 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/NETWORK/j715b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j715b.java >>
//
//  ネットワーク（１）：JEditorPaneクラス(HTMLテキストの表示）
//
//　　JEditorPaneクラスの基本的な機能(HTMLテキストの表示)を示す。
//
//　●JEditorPaneクラスのコンストラクタ
//    public JEditorPane(String type, String text)
//　　　機能：コンテンツタイプtypeを指定して、テキストtextを含むエディタペインを
//　　　　　　作成する。
//　　　　　　plain/text：プレーンテキスト
//　　　　　　text/html ：HTMLテキスト
//　　　　　　text/rtf  ：RTFテキスト
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;

class j715bf extends JFrame {

  public j715bf(String t) { // コンストラクタ。 
    super(t);

    // コンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout(10,10));

    // エディタペインを作成し、HTMLテキストを含ませる。
    String s1 = "<html>";
    String s2 = "<head><title>HTMLテキスト</title></head>";
    String s3 = "<body><font size=7 color=red>日本語</font></body>";
    String s4 = "</html>";
    JEditorPane ep = new JEditorPane("text/html",s1+s2+s3+s4);
    // エディタペインをコンテンツペイン内に追加。
    c.add(ep,BorderLayout.CENTER);
  }
}

class j715b {
  public static void main(String[] args) {

    // フレームの作成。
    j715bf jf = new j715bf("フレーム");

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの大きさ設定。
    jf.setSize(300,200);

    // フレームの表示。
    jf.setVisible(true);
  }
}
/*
</pre>

<font size=5 color=blue>実行手順</font><br>

<pre>
% javac j715b.java
% java j715b
</pre>

<font size=5 color=blue>実行結果</font>
<br><br>

実行直後<br>
<img src="j715b.jpg" width=300 height=200>

</body>
</html>
*/
