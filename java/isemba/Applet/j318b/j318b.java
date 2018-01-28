// -*- mode: java -*- Time-stamp: <2009-06-21 05:30:42 kahata>
/*====================================================================
 * name: j318b.java 
 * created : Time-stamp: <09/06/20(土) 15:52:08 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j318b.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j318b.java >>
//
//  アプレット（１）：グラフィックス（曲線：アステロイド）
//  
//　  大円の内部を小円が接して回転するとき、小円内の任意の点Pの軌跡を求めよ。
//　  最初に接する点の描く曲線はアステロイドと呼ばれる。                     
//                                                                           
//　  半径Rの大円の中心をA、半径rの小円の中心をB、小円内の点Pの中心からの    
//    距離をhとする。                                                        
//    最初、小円の中心Bと点Pはx軸上にあるとする。                            
//    小円の中心が大円の中心に対して、tラジアン回転したとする。              
//                                                                           
//　  点Cを大円と小円の接点とする。点Bを通りx軸に平行な線BDを引く。          
//　  中心Bからx軸に垂線をおろし、その足をHとする。点PからBHの延長に垂線を   
//　  おろし、その足をQとする。                                              
//                                                                           
//    点Pの座標を(x,y)とする。                                               
//                                                                           
//      x = AH - PQ                                                          
//        = AB*sin(t) - PB*sin(∠PBQ)                                        
//        = (R-r)*sin(t) - h*sin(∠PBQ)                                      
//                                                                           
//　  ここで、ラジアンの定義から、R*t = r*(∠PBQ+t)                          
//                                                                           
//        = (R-r)*sin(t) - h*sin(R*t/r - t)                                  
//        = (R-r)*sin(t) - h*sin(R*t/r - t)                                  
//                                                                           
//      y = BH + BQ                                                          
//        = AB*cos(t) + PB*cos(∠PBQ)                                        
//        = (R-r)*cos(t) + h*cos(R*t/r - t)                                  
//        = (R-r)*cos(t) + h*cos(R*t/r - t)                                  
//                                                                           
//　　（注意）R=2r,h=rとすると、y=0となる。すなわち、直線を描くことができる。 
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class j318b extends Applet {

  /**
   * 
   */
private static final long serialVersionUID = 1L;

int x0,y0,R,r,h;

  public void init() { 

    // アプレットの背景色を白色に設定。
    this.setBackground(Color.white);

    // 初期設定。
    x0 = 150; y0 = 150; // 円の中心。
    R = (int)(0.6*y0);  // 大円の半径。
    r = (int)(0.2*y0);  // 小円の半径。
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
    g.drawOval(x0-r,y0-R,2*r,2*r);

    // アステロイドの描画。
    g.setColor(Color.red);
    for( t=0; t<=16*Math.PI; t=t+0.05 ) {
      x1 = (int)((R-r)*Math.sin(t) - h*Math.sin(R*t/r-t));
      y1 = (int)((R-r)*Math.cos(t) + h*Math.cos(R*t/r-t));
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
<applet code="j318b.class" width="300" height="300">
</applet>
</body>
</html>
*/
