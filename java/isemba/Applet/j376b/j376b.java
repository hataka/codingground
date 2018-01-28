// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j376b.java 
 * created : Time-stamp: <09/07/01(水) 10:12:34 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j376b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j376b.java >>
//
//　Ａｐｐｌｅｔ（６）：部品（ファイルダイアログ、イベント処理）
//
//　　フレーム内の「ファイルダイアログ表示」ボタンをクリックすると、
//　　ファイルダイアログが表示される。
//　　ファイルダイアログ内のファイルを選択し、「開く」ボタンをクリックすると、
//　　選択されたファイル名がフレーム内のラベルに表示される。
//
//　●イベント処理
//　　イベントソース：Buttonクラス
//　　イベントクラス：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
//　●FileDialogクラスのメソッド
//    String getFile()
//      機能：ファイルダイアログ内で選択されたファイル名を取得する。
//    String getDirectory()
//      機能：ファイルダイアログ内で選択されたディレクトリ名を取得する。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
  
public class j376b extends Applet implements ActionListener {

  Button b;
  Label lab1,lab2;
  FileDialog fd;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // ボタンの作成とアプレット内に追加。
    b = new Button("ファイルダイアログ表示");
    this.add(b);

    // ラベルの作成とアプレット内に追加。
    lab1 = new Label("ここにディレクトリ名が表示される");
    lab2 = new Label("ここにファイル名が表示される");
    this.add(lab1);
    this.add(lab2);

    // イベントリスナの登録。
    b.addActionListener(this);

  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent ae) {
    // ボタンがクリックされたときの処理（ファイルダイアログの表示）。
    if( ae.getSource() == b ) {
      fd = new FileDialog(new Frame(),"ファイルダイアログ"); 
      fd.setSize(300,200); // ファイルダイアログの大きさを設定。
      fd.setLocation(0,0); // ダイアログの表示位置を設定。
      fd.setVisible(true); // ファイルダイアログを可視状態に設定。
      // ファイルダイアログで選択した、ディレクトリとファイルを
      // 呼び出し側ウィンドウのラベルに設定。
      lab1.setText("ディレクトリ：" + fd.getDirectory());
      lab2.setText("ファイル　　：" + fd.getFile());
    }
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
			j376b applet = new j376b();
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
<applet code="j376b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j376b.class" width="300" height="100">
</applet>

</body>
</html>
*/
