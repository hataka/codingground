// -*- mode: java -*- Time-stamp: <2009-06-30 09:31:14 kahata>
/*====================================================================
 * name: g111b.java 
 * created : Time-stamp: <09/06/30(火) 09:29:16 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GUI/g111b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << g111b.java >>
//
//  ＧＵＩ（１）：フレームウィンドウ（生成、表示、非表示）
//
//　　フレームと呼ばれるウィンドウ(タイトルなし)を表示する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

class g111b {

  // コンストラクタ。
  g111b() {
    // フレームの作成。
    JFrame f = new JFrame("g111b:フレームと呼ばれるウィンドウ(タイトルなし)を表示する");

   	//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   // フレームの大きさを設定。
    //f.setSize(300,200);
    f.setSize(640,480);
	f.setLocationRelativeTo(null);

    // フレームの表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g111b g = new g111b();
  }
  
}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g111b.java
% java g111b
</pre>

<img src="g111b.jpg" width=300 height=200>

</body>
</html>
*/
