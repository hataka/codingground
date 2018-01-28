<!--====================================================================-->
<!-- << z122a.htm >>                                                    -->
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
// << z122a.java >>
//
//  応用：ジャンケン(JAppletクラス)
//
////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class z122a extends JApplet implements ActionListener {

  int bnum,flag,rand;
  JButton b0,b1,b2,b3;

  public void init() {

    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // パネルの作成。
    z122ap p = new z122ap();

    // パネルの背景色を設定
    p.setBackground(Color.orange);

    // パネルのレイアウトマネージャのディフォルト設定を解除。
    p.setLayout(null);

    // パネルをコンテンツペイン内に追加。
    c.add(p,BorderLayout.CENTER);

    // ボタンの作成と位置の決定。
    b0 = new JButton("グー");
    b0.setBounds(20,20,90,30);
    b1 = new JButton("チョキ");
    b1.setBounds(110,20,90,30);
    b2 = new JButton("パー");
    b2.setBounds(200,20,90,30);
    b3 = new JButton("開始");
    b3.setBounds(290,20,90,30);

    // ボタンをパネル内に追加。
    p.add(b0);
    p.add(b1);
    p.add(b2);
    p.add(b3);

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

  // パネルの定義(内部クラス)。
  class z122ap extends JPanel {
    public void paintComponent(Graphics g) {                                
      super.paintComponent(g);                                              
                                                                            
      // 表示色とフォントの変更。                                           
      g.setColor(Color.white);                                              
      g.setFont(new Font("Serif",Font.BOLD,20));                            
                                                                            
      // じゃんけん開始メッセージと初期設定。                               
      if( bnum == 3 ) {                                                     
        g.drawString("じゃんけん・開始",20,100);                            
        flag = 1;                                                           
      }                                                                     
                                                                            
      // ユーザ側の手の表示。                                               
      if( (flag==1)&&(bnum==0) ) { g.drawString("あなたはグー　　",20,70); }
      if( (flag==1)&&(bnum==1) ) { g.drawString("あなたはチョキ　",20,70); }
      if( (flag==1)&&(bnum==2) ) { g.drawString("あなたはパー　　",20,70); }
                                                                            
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
}
</pre>

<pre>
<font size=5 color=blue>ＨＴＭＬファイル</font><br>
<html>
<head>
  <title>応用：じゃんけん</title>
</head>
<body bgcolor=white text=black>
<applet code="z122a.class" width="400" height="150">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet code="z122a.class" width="400" height="150">
</applet>

</body>
</html>
