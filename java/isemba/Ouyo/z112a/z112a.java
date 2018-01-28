<!--====================================================================-->
<!-- << z112a.htm >>                                                    -->
<!--                                                                    -->
<!--  JAVAプログラミング　　　　　　　　　　　　　　　　　　　　　　　  -->
<!--                                                                    -->
<!--====================================================================-->

<html>
<head>
  <title>JAVAプログラミング</title>
</head>

<body bgcolor="white" text="black">

<pre>
////////////////////////////////////////////////////////////////////////////////
// << z112a.java >>
//
//  応用：電卓(JAppletクラス)
//
//　　電卓のデザイン
//
////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;

public class z112a extends JApplet {

  Container c;
  JLabel lab;
  JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
  int x0,y0,w,h;

  public void init() {

    // アプレットからコンテンツペインを取得。
    c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャのディフォルト設定を解除。
    c.setLayout(null);

    // コンテンツペインの背景色を設定
    c.setBackground(Color.lightGray);

    // パラメータ。
    x0 = 20; // 電卓の左上隅のx座標。
    y0 = 20; // 電卓の左上隅のy座標。
    w = 50;  // 数字キーボタンの幅。
    h = 30;  // 数字キーボタンの高さ。

    // ラベルの作成。
    lab = new JLabel("",SwingConstants.CENTER);
    lab.setBackground(Color.yellow); // ラベルの背景色を設定。
    lab.setForeground(Color.black);  // ラベルの前景色を設定。 
    lab.setOpaque(true);

    // ラベルの配置。
    lab.setBounds(x0,y0,3*w,h);
    c.add(lab);

    // 数字キー、演算キー、＝キー、クリアキーの作成。
    b0 = new JButton("０");
    b1 = new JButton("１");
    b2 = new JButton("２");
    b3 = new JButton("３");
    b4 = new JButton("４");
    b5 = new JButton("５");
    b6 = new JButton("６");
    b7 = new JButton("７");
    b8 = new JButton("８");
    b9 = new JButton("９");
    b10 = new JButton("＋");
    b11 = new JButton("－");
    b12 = new JButton("＝");
    b13 = new JButton("Ｃ");

    // 数字キー、演算キー、＝キー、クリアキーの配置。
    b7.setBounds(x0,y0+h,w,h);
    b8.setBounds(x0+w,y0+h,w,h);
    b9.setBounds(x0+2*w,y0+h,w,h);
    b4.setBounds(x0,y0+2*h,w,h);
    b5.setBounds(x0+w,y0+2*h,w,h);
    b6.setBounds(x0+2*w,y0+2*h,w,h);
    b1.setBounds(x0,y0+3*h,w,h);
    b2.setBounds(x0+w,y0+3*h,w,h);
    b3.setBounds(x0+2*w,y0+3*h,w,h);
    b0.setBounds(x0,y0+4*h,w,h);
    b10.setBounds(x0+w,y0+4*h,w,h);
    b11.setBounds(x0+2*w,y0+4*h,w,h);
    b12.setBounds(x0,y0+5*h,3*w,h);
    b13.setBounds(x0,y0+6*h,3*w,h);
    c.add(b0); c.add(b1); c.add(b2); c.add(b3); c.add(b4);
    c.add(b5); c.add(b6); c.add(b7); c.add(b8); c.add(b9);
    c.add(b10); c.add(b11); c.add(b12); c.add(b13);

    // ＝キーの設定。
    b12.setBackground(Color.green); // ＝キーの背景色を設定。
    b12.setForeground(Color.white); // ＝キーの前景色を設定。

    // クリアキーの設定。
    b13.setBackground(Color.red);   // クリアキーの背景色を設定。
    b13.setForeground(Color.white); // クリアキーの前景色を設定。
  }
}
</pre>

<pre>
<font size=5 color=blue>ＨＴＭＬファイル</font><br>
<html>
<head>
  <title>応用：電卓</title>
</head>
<body bgcolor=white text=black>
<applet code="z112a.class" width="200" height="250">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="z112a.class" width="200" height="250">
</applet>

</body>
</html>
