// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j345c.java 
 * created : Time-stamp: <09/07/01(水) 06:52:35 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j345c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j345c.java >>
//
//  アプレット（４）：イベント処理（キー操作、KeyAdapterクラス、匿名クラス）
//
//　●操作
//　　押されたキーを文字列として表示する。
//
//　●イベント処理
//　　イベントソース： キー操作
//　　イベントクラス： KeyEventクラス
//　　イベントリスナ： KeyAdapterクラスを拡張したクラス
//
//　●匿名クラス
//    内部クラスに名前を付けるのは煩雑である。そこで、名前を付けずに内部クラスを
//　　使える方法が考えられた。
//
//　　    new 親クラス名(引数) {
//          処理                
//        }                     
//
//　　・コンパイルされると、２つのクラスファイルが作成される。
//　　　j345c.class, j345c$1.class
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 

public class j345c extends Applet {

  Font f;
  String s = "";

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // フォントの設定。
    f = new Font("Courier", Font.BOLD, 48);

    // イベントリスナの定義(匿名クラス)。
    KeyAdapter ka = new KeyAdapter() {
      // keyTypedメソッドの定義。                    
      public void keyTyped(KeyEvent e) {
        s = s + e.getKeyChar();
        repaint(); // 再描画。
      }                                              
    };                                              

    // イベントリスナーの登録。
    this.addKeyListener(ka);

    // アプレットにフォーカスを与える。
    this.requestFocusInWindow();

  }

  public void paint(Graphics g) {
    g.setColor(Color.green);
    g.setFont(f);
    g.drawString(s,50,50);
  }

  public static void main(String[] args) {
		final Frame frame = new Frame("グラフィックス（文字列）");
		//frame.setDefaultCloseOperation(Frame.DISPOSE_ON_CLOSE);
				
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
				//System.exit(0);
			}
		});
				
		j345c applet = new j345c();
		applet.init();
		frame.add(applet, BorderLayout.CENTER);
		frame.pack();
		frame.setSize(300,100);
		frame.setLocationRelativeTo(null);
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
<applet code="j345c.class" width="300" height="100">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="j345c.class" width="300" height="100">
</applet>

</body>
</html>
*/
