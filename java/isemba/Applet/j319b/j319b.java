// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j319b.java 
 * created : Time-stamp: <09/06/30(火) 07:46:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j319b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j319b.java >>
//
//  アプレット（１）：グラフィックス（再帰曲線：ヒルベルト曲線）
//
//    つぎの関係式によって決まる矢印の列 RUL(n),DLU(n),LDR(n),URD(n)に     
//    したがって描かれる曲線を位数ｎのヒルベルト曲線という．               
//                                                                         
//      RUL(n)=URD(n-1)→RUL(n-1)↑RUL(n-1)←DLU(n-1)                      
//      DLU(n)=LDR(n-1)↓DLU(n-1)←DLU(n-1)↑RUL(n-1)                      
//      LDR(n)=DLU(n-1)←LDR(n-1)↓LDR(n-1)→URD(n-1)                      
//      URD(n)=RUL(n-1)↑URD(n-1)→URD(n-1)↓LDR(n-1)                      
//      RUL(0)="": DLU(0)="": LDR(0)="": URD(0)=""                         
//                                                                         
//    矢印（→←↑↓）は現在の点からの相対移動を意味する．                 
//                                                                         
// 　  RUL(1)=→↑←, DLU(1)=↓←↑, LDR(1)=←↓→, URD(1)=↑→↓          
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class j319b extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int n,dx,dy,x,y;

  public void init() {

    // アプレットの背景色を白色に設定。
    this.setBackground(Color.white);

    // 初期設定。
    n = 4;            // 位数。
    x = 100; y = 150; // 始点。
    dx = 10; dy = 10; // 増分。

  }

  public void paint(Graphics g) {

    g.setColor(Color.red);
    RUL(g,n);

  }

  // ヒルベルト曲線の描画。
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
/*
</pre>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j319b.class" width="400" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font> <br>

<applet code="j319b.class" width="400" height="200">
</applet>

</body>
</html>
*/
