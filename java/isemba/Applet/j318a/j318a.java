// -*- mode: java -*- Time-stamp: <2009-06-21 05:41:09 kahata>
/*====================================================================
 * name: j318a.java 
 * created : Time-stamp: <09/06/20(土) 15:52:08 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j318a.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j318a.java >>
//
//  アプレット（１）：グラフィックス（曲線：カージオイド）
//  
//　  大円の外部を小円が接して回転するとき、小円内の任意の点Pの軌跡を求めよ。
//　  大円と小円の半径が等しく、最初に接する点の描く曲線はカージオイドと    
//　  呼ばれる。                                                            
//                                                                          
//　  半径Rの大円の中心をA、半径rの小円の中心をB、小円内の点Pの中心からの   
//    距離をhとする。                                                       
//    最初、小円の中心Bと点Pはy軸上にあるとする。                           
//    小円の中心が大円の中心に対して、tラジアン回転したとする。             
//                                                                          
//　  点Bを通りx軸に平行な線を引き、y軸との交点をHとする。                  
//　  点Pを通りx軸に平行な線と、点Bを通りy軸に平行な線の交点をQとする。     
//    すなわち、∠BAH=t, ∠ABP=s, ∠PBH=π/2-t-s                            
//                                                                          
//    点Pの座標を(x,y)とする。                                              
//                                                                          
//      x = BH - PQ                                                         
//        = AB*sin(∠BAH) - PB*cos(∠PBH)                                   
//        = (R+r)*sin(t) - h*cos(π/2-t-s)                                  
//        = (R+r)*sin(t) - h*sin(t+s)                                       
//                                                                          
//　  大円と小円は接しながら回転するので、R*t=r*s が成り立つ。              
//                                                                          
//        = (R+r)*sin(t) - h*sin(t+R*t/s)                                   
//        = (R+r)*sin(t) - h*sin(t+R*t/s)                                   
//                                                                          
//      y = AH - BQ                                                         
//        = AB*cos(∠BAH) - PB*sin(∠PBH)                                   
//        = (R+r)*cos(t) - h*sin(π/2-t-s)                                  
//        = (R+r)*cos(t) - h*cos(t+s)                                       
//        = (R+r)*cos(t) - h*cos(t+R*t/s)                                   
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class j318a extends Applet {

  int x0,y0,R,r,h;

  public void init() { 

    // アプレットの背景色を白色に設定。
    this.setBackground(Color.white);

    // 初期設定。
    x0 = 150; y0 = 150; // 大円の中心。
    R = (int)(0.3*y0);  // 大円の半径。
    r = (int)(0.3*y0);  // 小円の半径。
    h = r;

  }

  public void paint(Graphics g) {

    int x1,y1;
    double t;

    // 大円の描画。
    g.setColor(Color.black);
    g.drawOval(x0-R,y0-R,2*R,2*R);

    // 小円の描画。
    g.setColor(Color.blue);
    g.drawOval(x0-r,y0-R-2*r,2*r,2*r);

    // カージオイドの描画。
    g.setColor(Color.red);
    for( t=0; t<=16*Math.PI; t=t+0.05 ) {
      x1 = (int)((R+r)*Math.sin(t) - h*Math.sin(R*t/r+t));
      y1 = (int)((R+r)*Math.cos(t) - h*Math.cos(R*t/r+t));
      g.drawLine(x0+x1,y0-y1,x0+x1,y0-y1);
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
<applet code="j318a.class" width="300" height="300">
</applet>
</body>
</html>
*/
