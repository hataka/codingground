<!--====================================================================-->
<!-- << z121a.htm >>                                                    -->
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
// << z121a.java >>
//
//  応用：ジャンケン(Appletクラス)
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class z121a extends Applet implements ActionListener {

  int bnum,flag,rand;
  Button b0,b1,b2,b3;

  public void init() {

    // レイアウトマネージャのディフォルト設定を解除。
    this.setLayout(null);

    // アプレットの背景色を設定
    this.setBackground(Color.orange);

    // ボタンの作成と位置の決定。
    b0 = new Button("グー");
    b0.setBounds(50,20,50,30);
    b1 = new Button("チョキ");
    b1.setBounds(110,20,50,30);
    b2 = new Button("パー");
    b2.setBounds(170,20,50,30);
    b3 = new Button("開始");
    b3.setBounds(230,20,50,30);

    // ボタンの配置。
    this.add(b0);
    this.add(b1);
    this.add(b2);
    this.add(b3);

    // 初期設定。
    flag = 0; // 開始ボタンがクリックされる前は0、クリック後の1になる。

    // イベントリスナの登録。
    b0.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
  }

  // ActionListenerインターフェースのメソッド。 
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == b0 ) { bnum = 0; }
    if( e.getSource() == b1 ) { bnum = 1; }
    if( e.getSource() == b2 ) { bnum = 2; }
    if( e.getSource() == b3 ) { bnum = 3; }
    repaint();
  }

  public void paint(Graphics g) {

    // 表示色とフォントの変更。
    g.setColor(Color.white);
    g.setFont(new Font("Serif",Font.BOLD,20));

    // じゃんけん開始メッセージと初期設定。
    if( bnum == 3 ) {
      g.drawString("じゃんけん・開始",20,100);
      flag = 1;
    }

    // ユーザ側の手の表示。
    if( (flag == 1)&&(bnum == 0) ) { g.drawString("あなたはグー　　",20,70); }
    if( (flag == 1)&&(bnum == 1) ) { g.drawString("あなたはチョキ　",20,70); }
    if( (flag == 1)&&(bnum == 2) ) { g.drawString("あなたはパー　　",20,70); }

    // コンピュータ側の手の表示。
    if( (flag == 1)&&(bnum != 3) ) {
      rand = (int)(Math.random()*3);
      if( rand == 0 ) { g.drawString("コンピュータはグー",20,90); }
      if( rand == 1 ) { g.drawString("コンピュータはチョキ",20,90); }
      if( rand == 2 ) { g.drawString("コンピュータはパー",20,90); }

      // 表示色とフォントの変更。
      g.setColor(Color.red);
      g.setFont(new Font("SansSerif",Font.BOLD,24));

      // 勝負の判定と結果の表示。
      if( rand == bnum ) {
        g.drawString("あいこ",20,120);
      } else if( (rand == 0)&&(bnum == 2)||
                 (rand == 1)&&(bnum == 0)||
                 (rand == 2)&&(bnum == 1) ) {
        g.drawString("あなたの勝ち",20,120);
      } else {
        g.drawString("あなたの負け",20,120);
      }
    }
  }
}
</pre>

<pre>
<font size=5 color=blue>ＨＴＭＬファイル</font><br>
<html>
<head>
  <title>応用：じゃんけん</title>
</head>
<body bgcolor=white text=black>
<applet code="z121a.class" width="300" height="150">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="z121a.class" width="300" height="150">
</applet>

</body>
</html>
