/*
<!--====================================================================-->
<!-- << g142.htm >>                                                     -->
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
*/
////////////////////////////////////////////////////////////////////////////////
//  << g142.java >>
//
//  グラフィックス（４）：再帰曲線（ヒルベルト曲線）
//
//  つぎの関係式によって決まる矢印の列 RUL(n),DLU(n),LDR(n),URD(n)に
//  したがって描かれる曲線を位数ｎのヒルベルト曲線という．
//
//    RUL(n)=URD(n-1)→RUL(n-1)↑RUL(n-1)←DLU(n-1)
//    DLU(n)=LDR(n-1)↓DLU(n-1)←DLU(n-1)↑RUL(n-1)
//    LDR(n)=DLU(n-1)←LDR(n-1)↓LDR(n-1)→URD(n-1)
//    URD(n)=RUL(n-1)↑URD(n-1)→URD(n-1)↓LDR(n-1)
//    RUL(0)="": DLU(0)="": LDR(0)="": URD(0)=""
//
//  矢印（→←↑↓）は現在の点からの相対移動を意味する．
//
// 　RUL(1)=→↑←, DLU(1)=↓←↑, LDR(1)=←↓→, URD(1)=↑→↓
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

// パネルの定義。
class gp142 extends JPanel {
  static int dx,dy,x,y;
  public void paintComponent(Graphics g) {
    super.paintComponent(g);  
    x = 100; y = 200; // 始点。
    dx = 10; dy = 10; // 増分。
    g.setColor(Color.red);
    RUL(g,4);
  }
  public void RUL(Graphics g, int n) {                                
    if( n > 0 ) {                                                     
      URD(g,n-1); g.drawLine(x,y,x+dx,y); x = x + dx; // →               
      RUL(g,n-1); g.drawLine(x,y,x,y-dy); y = y - dy; // ↑           
      RUL(g,n-1); g.drawLine(x,y,x-dx,y); x = x - dx; // ←           
      DLU(g,n-1);                                                     
    }                                                                 
  }                                                                   
  public void DLU(Graphics g, int n) {                                
    if( n > 0 ) {                                                     
      LDR(g,n-1); g.drawLine(x,y,x,y+dy); y = y + dy; // ↓            
      DLU(g,n-1); g.drawLine(x,y,x-dx,y); x = x - dx; // ←           
      DLU(g,n-1); g.drawLine(x,y,x,y-dy); y = y - dy; // ↑           
      RUL(g,n-1);                                                     
    }                                                                 
  }                                                                   
  public void LDR(Graphics g, int n) {                                
    if( n > 0 ) {                                                     
      DLU(g,n-1); g.drawLine(x,y,x-dx,y); x = x - dx; // ←           
      LDR(g,n-1); g.drawLine(x,y,x,y+dy); y = y + dy; // ↓            
      LDR(g,n-1); g.drawLine(x,y,x+dx,y); x = x + dx; // →               
      URD(g,n-1);                                                     
    }                                                                 
  }                                                                   
  public void URD(Graphics g, int n) {                                
    if( n > 0 ) {                                                     
      RUL(g,n-1); g.drawLine(x,y,x,y-dy); y = y - dy; // ↑           
      URD(g,n-1); g.drawLine(x,y,x+dx,y); x = x + dx; // →               
      URD(g,n-1); g.drawLine(x,y,x,y+dy); y = y + dy; // ↓            
      LDR(g,n-1);                                                     
    }                                                                 
  }                                                                   
}

// フレームの定義。
class gf142 extends JFrame {
  gf142(String t) { // コンストラクタ。
    super(t);
    // フレームのコンテントペインを取得。
    Container c = this.getContentPane();
    // パネルを生成し、フレームに追加。
    gp142 gp = new gp142();
    gp.setBackground(Color.white);
    c.add(gp,BorderLayout.CENTER);
  }
}

class g142 {
  public static void main(String[] args) {
    // フレーム生成。
    gf142 gf = new gf142("ヒルベルト曲線");
    // フレームの大きさを設定
    gf.setSize(400,300);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレーム表示。
    gf.setVisible(true);
  }
}
/*
</pre>

<font size=5 color=blue>実行手順</font><br>

<pre>
% javac g142.java
% java g142
</pre>

<font size=5 color=blue>実行結果</font><br>

<img src="g142.jpg" width=400 height=300>

</body>
</html>
*/
