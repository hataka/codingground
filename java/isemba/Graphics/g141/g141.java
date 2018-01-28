/*
<!--====================================================================-->
<!-- << g141.htm >>                                                     -->
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
//  << g141.java >>
//
//  グラフィックス（４）：再帰曲線（ドラゴン曲線）
//
//  初期状態（↓→）に次の４つの変換を繰り返すことにより得られる曲線をいう。
//
//  変換（１）：　↓　=>　↓→ 　
//  変換（２）：　↑　=>　↑←
//  変換（３）：　→　=>　↑→
//  変換（４）：　←　=>　↓←
//
//  ↓は下方向に，↑は上方向に，←は左方向に，→は右方向に一定距離進むことを
//  意味する．
//
//  初期状態で描く曲線を１次のドラゴン曲線といい，つぎの状態で描く曲線を
//  ２次のドラゴン曲線という．以下同様にしてｎ次のドラゴン曲線が決まる．
//
//  １次のドラゴン曲線：　↓→
//  ２次のドラゴン曲線：　↓→↑→
//  ３次のドラゴン曲線：　↓→↑→↑←↑→
//
//　ドラゴン曲線（３次の場合）の生成過程はつぎのような木で表現できる。
//
//　　　深さ０　　　　　　　　　　　　　　　根
//            　　　　　　      ┌─────┴─────┐
//　　　深さ１　　　　　　　　　↓                      →
//　　　　　　            ┌──┴──┐          ┌──┴──┐
//　　　深さ２　　　　　　↓          →          ↑          ←
//　　　　　　        ┌─┴─┐  ┌─┴─┐  ┌─┴─┐  ┌─┴─┐
//　　　深さ３        ↓      →  ↑      →  ↑      ←  ↑      →
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

// パネルの定義。
class gp141 extends JPanel {
  static int dx,dy,x,y;
  public void paintComponent(Graphics g) {
    super.paintComponent(g);  
    x = 200; y = 150; // 始点。
    dx = 20; dy = 20; // 増分。
    g.setColor(Color.red);
    dragon(g,'d',6);
  }
  public void dragon(Graphics g, char c, int n) {        
    if( n == 0 ) {                                                             
      if( c == 'u' ) {                                                         
        g.drawLine(x,y,x,y-dy); y = y - dy; // ↑           
      } else if( c == 'd' ) {                                                  
        g.drawLine(x,y,x,y+dy); y = y + dy; // ↓              
      } else if( c == 'l' ) {                                                
        g.drawLine(x,y,x-dx,y); x = x - dx; // ←          
      } else if( c == 'r' ) {                                       
        g.drawLine(x,y,x+dx,y); x = x + dx; // →                 
      }                                                                        
    } else {                                                                   
      if( c == 'd' ) { dragon(g,'d',n-1); dragon(g,'r',n-1); }
      if( c == 'u' ) { dragon(g,'u',n-1); dragon(g,'l',n-1); }
      if( c == 'r' ) { dragon(g,'u',n-1); dragon(g,'r',n-1); }
      if( c == 'l' ) { dragon(g,'d',n-1); dragon(g,'l',n-1); }
    }                                                                          
  }
}

// フレームの定義。
class gf141 extends JFrame {
  gf141(String t) { // コンストラクタ。
    super(t);
    // フレームのコンテントペインを取得。
    Container c = this.getContentPane();
    // パネルを生成し、フレームに追加。
    gp141 gp = new gp141();
    gp.setBackground(Color.white);
    c.add(gp,BorderLayout.CENTER);
  }
}

class g141 {
  public static void main(String[] args) {
    // フレーム生成。
    gf141 gf = new gf141("ドラゴン曲線");
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
% javac g141.java
% java g141
</pre>

<font size=5 color=blue>実行結果</font><br>

<img src="g141.jpg" width=400 height=300>

</body>
</html>
*/
