<!--====================================================================-->
<!-- << z111b.htm >>                                                    -->
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
// << z111b.java >>
//
//  応用：電卓(Appletクラス)
//
//　　電卓のデザインにイベント処理(キーのクリック時にキーの文字を表示欄に
//　　表示する)を追加。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class z111b extends Applet implements ActionListener {

  Label lab;
  Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
  int x0,y0,w,h;

  public void init() {
 
    // レイアウトマネージャのディフォルト設定を解除。
    this.setLayout(null);

    // アプレットの背景色を設定
    this.setBackground(Color.lightGray);

    // パラメータ。
    x0 = 20; // 電卓の左上隅のx座標。
    y0 = 20; // 電卓の左上隅のy座標。
    w = 50;  // 数字キーボタンの幅。
    h = 30;  // 数字キーボタンの高さ。

    // ラベルの作成。
    lab = new Label("",Label.RIGHT);
    lab.setBackground(Color.yellow); // ラベルの背景色を設定。
    lab.setForeground(Color.black);  // ラベルの前景色を設定。

    // ラベルの配置。
    lab.setBounds(x0,y0,3*w,h);
    this.add(lab);

    // 数字キー、演算キー、＝キー、クリアキーの作成。
    b0 = new Button("０");
    b1 = new Button("１");
    b2 = new Button("２");
    b3 = new Button("３");
    b4 = new Button("４");
    b5 = new Button("５");
    b6 = new Button("６");
    b7 = new Button("７");
    b8 = new Button("８");
    b9 = new Button("９");
    b10 = new Button("＋");
    b11 = new Button("－");
    b12 = new Button("＝");
    b13 = new Button("Ｃ");

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
    this.add(b0); this.add(b1); this.add(b2); this.add(b3); this.add(b4);
    this.add(b5); this.add(b6); this.add(b7); this.add(b8); this.add(b9);
    this.add(b10); this.add(b11); this.add(b12); this.add(b13);

    // ＝キーの設定。
    b12.setBackground(Color.green); // ＝キーの背景色を設定。
    b12.setForeground(Color.white); // ＝キーの前景色を設定。

    // クリアキーの設定。
    b13.setBackground(Color.red);   // クリアキーの背景色を設定。
    b13.setForeground(Color.white); // クリアキーの前景色を設定。

    // イベントリスナの登録。
    b0.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b10.addActionListener(this);
    b11.addActionListener(this);
    b12.addActionListener(this);
    b13.addActionListener(this);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == b0 ) { lab.setText("０"); }
    if( e.getSource() == b1 ) { lab.setText("１"); }
    if( e.getSource() == b2 ) { lab.setText("２"); }
    if( e.getSource() == b3 ) { lab.setText("３"); }
    if( e.getSource() == b4 ) { lab.setText("４"); }
    if( e.getSource() == b5 ) { lab.setText("５"); }
    if( e.getSource() == b6 ) { lab.setText("６"); }
    if( e.getSource() == b7 ) { lab.setText("７"); }
    if( e.getSource() == b8 ) { lab.setText("８"); }
    if( e.getSource() == b9 ) { lab.setText("９"); }
    if( e.getSource() == b10 ) { lab.setText("＋"); }
    if( e.getSource() == b11 ) { lab.setText("－"); }
    if( e.getSource() == b12 ) { lab.setText("＝"); }
    if( e.getSource() == b13 ) { lab.setText("Ｃ"); }
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
<applet code="z111b.class" width="200" height="250">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="z111b.class" width="200" height="250">
</applet>

</body>
</html>
