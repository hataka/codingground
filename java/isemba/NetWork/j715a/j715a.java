// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j715a.java 
 * created : Time-stamp: <09/07/03(金) 10:44:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVE/NETWORK/j715a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j715a.java >>
//
//  ネットワーク（１）：JEditorPaneクラス(プレーンテキストの表示）
//
//　　JEditorPaneクラスの基本的な機能(プレーンテキストの表示)を示す。
//
//　●JEditorPaneクラス
//    プレーンテキスト、HTMLテキスト、RTFテキストの表示・編集ができるクラス。
//    ・RTF(Rich Text Format)
//    　ワードパッドで読み書きすることができる文書形式で、テキスト以外に、
//　　　文字の大きさやフォントなどの情報が埋め込まれている。
//
//　●JEditorPaneクラスのコンストラクタ
//    public JEditorPane(String type, String text)
//　　　機能：コンテンツタイプtypeを指定して、テキストtextを含むエディタペインを
//　　　　　　作成する。
//　　　　　　plain/text：プレーンテキスト
//　　　　　　text/html ：HTMLテキスト
//　　　　　　text/rtf  ：RTFテキスト
//
//  ●JFrameクラス
//    Frameクラスと異なり、JFrameクラスにはユーザがウィンドウを閉じるときの
//　　動作を指定できる。デフォルトでは、フレームを隠す。
//　　変更するには、setDefaultCloseOperationメソッドを使う。
//
//  ●JFrameクラスのコンストラクタ
//    public JFrame(String s) throws HeadlessException
//      機能：タイトルsで、不可視のフレームを作成する。
//
//  ●JFrameクラスのメソッド
//    public void setDefaultCloseOperation(int op)
//      機能：フレームを閉じるときの動作opを設定する。
//　　　　　　EXIT_ON_CLOSE：アプリケーションを終了する。
//
//　●java.awt.Componentクラスから継承したメソッド
//    public void setSize(int w, int h)
//      機能：部品のサイズを、幅w、高さhに変更する。 
//    public void setVisible(boolean b)
//      機能：bがtrueの場合、部品を表示、falseの場合、非表示にする。 
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;

class j715af extends JFrame {

  public j715af(String t) { // コンストラクタ。 
    super(t);

    // コンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout(10,10));

    // エディタペインを作成し、プレーンテキストを含ませる。
    String s1 = "0123456789";
    String s2 = "abcdefg\n";
    String s3 = "日本語";
    JEditorPane ep = new JEditorPane("plain/text",s1+s2+s3);
    // エディタペインをコンテンツペイン内に追加。
    c.add(ep,BorderLayout.CENTER);
  }
}

class j715a {
  public static void main(String[] args) {

    // フレームの作成。
    j715af jf = new j715af("フレーム");

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
% javac j715a.java
% java j715a
</pre>

<font size=5 color=blue>実行結果</font>
<br><br>

実行直後<br>
<img src="j715a.jpg" width=300 height=200>

</body>
</html>
*/
