// -*- mode: java -*- Time-stamp: <2009-06-21 20:44:47 kahata>
/*====================================================================
 * name: j319a.java 
 * created : Time-stamp: <09/06/20(土) 15:52:08 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j319a.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j319a.java >>
//
//  アプレット（１）：グラフィックス（再帰曲線：ドラゴン曲線）
//
//    初期状態（↓→）に次の４つの変換を繰り返すことにより得られる曲線をいう。
//                                                                            
//    変換（１）：　↓　=>　↓→ 　                                           
//    変換（２）：　↑　=>　↑←                                              
//    変換（３）：　→　=>　↑→                                              
//    変換（４）：　←　=>　↓←                                              
//                                                                            
//    ↓は下方向に，↑は上方向に，←は左方向に，→は右方向に一定距離進むことを
//    意味する．                                                              
//                                                                            
//    初期状態で描く曲線を１次のドラゴン曲線といい，つぎの状態で描く曲線を    
//    ２次のドラゴン曲線という．以下同様にしてｎ次のドラゴン曲線が決まる．    
//                                                                            
//    １次のドラゴン曲線：　↓→                                              
//    ２次のドラゴン曲線：　↓→↑→                                          
//    ３次のドラゴン曲線：　↓→↑→↑←↑→                                  
//                                                                            
//　  ドラゴン曲線（３次の場合）の生成過程はつぎのような木で表現できる。      
//                                                                            
//　  　　深さ０　　　　　　　　　　　　　　　根                              
//              　　　　　　      ┌─────┴─────┐                  
//　  　　深さ１　　　　　　　　　↓                      →                  
//　  　　　　　            ┌──┴──┐          ┌──┴──┐            
//　  　　深さ２　　　　　　↓          →          ↑          ←            
//　  　　　　　        ┌─┴─┐  ┌─┴─┐  ┌─┴─┐  ┌─┴─┐        
//　  　　深さ３        ↓      →  ↑      →  ↑      ←  ↑      →        
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class j319a extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int n,dx,dy,x,y;

  public void init() { 

    // アプレットの背景色を白色に設定。
    this.setBackground(Color.white);

    // 初期設定。
    n = 6;            // 次数。
    x = 200; y = 100; // 始点。
    dx = 20; dy = 20; // 増分。

  }

  public void paint(Graphics g) {

    g.setColor(Color.red);
    dragon(g,'d',n);

  }

  // ドラゴン曲線の描画。
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
/*
<!-- ＨＴＭＬファイル -->
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j319a.class" width="400" height="200">
</applet>
</body>
</html>
*/
