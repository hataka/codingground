// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j376a.java 
 * created : Time-stamp: <09/07/01(水) 10:11:53 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j376a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j376a.java >>
//
//　Ａｐｐｌｅｔ（６）：部品（ファイルダイアログ、配置）
//
//　　ファイルダイアログを表示する。このダイアログはモーダルである。
//
//　●java.awt.FileDialogクラス
//　　ディレクトリ内のファイル一覧を表示したり、ファイルを選択するのに、
//　　FileDialogクラスを使う。
//
//　○FileDialogクラスのコンストラクタ
//    FileDialog(Frame f, String s)
//      機能：ファイルをロードするためのファイルダイアログをタイトルs付きで作成する。
//　　　　　　現在のディレクトリのファイルが表示される。
//    FileDialog(Frame f, String s, int m)
//      機能：ファイルをロードまたは保存するためのファイルダイアログをタイトルs付きで
//　　　　　　作成する。現在のディレクトリのファイルが表示される。
//　　　　　  mの値がLOADの場合、読み込み用となり、mの値がSAVEの場合、書き込み用となる。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
  
public class j376a extends Applet {

  public void init() {
    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // ファイルダイアログの作成。
    FileDialog fd = new FileDialog(new Frame(),"ファイルダイアログ"); 

    // ファイルダイアログの大きさを設定。
    fd.setSize(300,200);

    // ダイアログの表示位置を設定。
    fd.setLocation(0,0);

    // ファイルダイアログを可視状態に設定。
    fd.setVisible(true);
  }
	public static void main(String[] args) {
			JFrame frame = new JFrame("ファイルダイアログ");
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			/*
			Frame frame = new Frame("ファイルダイアログ");
			frame.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
							System.exit(0);
					}
			});
			*/
			j376a applet = new j376a();
			applet.init();
			frame.add(applet, BorderLayout.CENTER);
			frame.pack();
			frame.setSize(640,480);
			frame.setVisible(true);
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
<applet code="j376a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j376a.class" width="300" height="100">
</applet>

</body>
</html>
*/
