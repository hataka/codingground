// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: ja116b.java 
 * created : Time-stamp: <09/07/05(日) 16:22:42 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/ja116b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja116b.java >>
//
//  ＪＡｐｐｌｅｔ（１）：レイアウトマネージャー（GridBagLayout）
//
//　　２個のボタンを配置する。これらのボタンは、指定された位置関係を保存しながら
//　　表示される。
//
//　●GridBagConstraintsクラスの変数
//    double weightx   ウィンドウの大きさが大きくなったとき、余分の水平領域が
//　　　　　　　　　　 部品に設定されたweightxの割合によって分配される。
//　　　　　　　　　　 0に設定すると初期サイズに固定される。
//    double weighty   ウィンドウの大きさが大きくなったとき、余分の垂直領域が
//　　　　　　　　　　 部品に設定されたweightyの割合によって分配される。
//　　　　　　　　　　 0に設定すると初期サイズに固定される。
//　　int fill         部品の表示領域が部品のサイズより大きくなったとき、
//　　　　　　　　　　 どのようにするか指定する。
//                     GridBagConstraints.BOTH        部品を水平・垂直の両方向
//                                                    一杯に拡張する。
//                     GridBagConstraints.HORIZONTAL  部品を水平方向一杯に
//                                                    拡張する。
//                     GridBagConstraints.VERTICAL    部品を垂直方向一杯に
//                                                    拡張する。
//                     GridBagConstraints.NONE        なにもしない。
//　
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

public class ja116b extends JApplet {

  public void init() {
    // アプレットのコンテンツペインを取得。
    Container c = getContentPane();
    // コンテンツペインのレイアウトマネージャをGridBagLayoutに設定。
    GridBagLayout gb = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    c.setLayout(gb);

    // ボタンの作成。
    JButton b1 = new JButton("ボタン１");
    JButton b2 = new JButton("ボタン２");

    // ボタン１を(0,0)から(1,1)に配置する。
    gbc.gridx = 0; gbc.gridy = 0;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gb.setConstraints(b1,gbc);
    c.add(b1);

    // ボタン２を(1,1)から(2,2)に配置する。
    gbc.gridx = 1; gbc.gridy = 1;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    gb.setConstraints(b2,gbc);
    c.add(b2);
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
<applet code="ja116b.class" width="200" height="80">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="ja116b.class" width="200" height="80">
</applet>
<br><br>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="ja116b.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="ja116b.class" width="300" height="160">
</applet>

</body>
</html>
*/
