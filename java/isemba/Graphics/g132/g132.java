////////////////////////////////////////////////////////////////////////////////
//  << g132.java >>
//
//  グラフィックス（３）：応用（点の軌跡）
//  
//　大円の内部を小円が接して回転するとき、小円内の任意の点Pの軌跡を求めよ。
//　最初に接する点の描く曲線はアステロイドと呼ばれる。
//
//　半径Rの大円の中心をA、半径rの小円の中心をB、小円内の点Pの中心からの
//  距離をdとする。
//  最初、小円の中心Bと点Pはx軸上にあるする。
//  小円の中心が大円の中心に対して、tラジアン回転したとする。
//
//　点Cを大円と小円の接点とする。点Bを通りx軸に平行な線BDを引く。
//　中心Bからx軸に垂線をおろし、その足をHとする。点PからBHに垂線をおろし、
//  その足をQとする。
//
//  点Pの座標を(x,y)とする。
//
//    x = AH - PQ
//      = AB*cos(t) + PB*cos(∠PBD)
//      = (R-r)*cos(t) + d*cos(∠PBD)  
//
//　ここで、ラジアンの定義から、R*t = r*(∠PBC)
//
//      = (R-r)*cos(t) + d*cos(∠PBC - t)  
//      = (R-r)*cos(t) + d*cos(R*t/r - t)  
//      
//    y = BH - BQ
//      = AB*sin(t) - PB*sin(∠PBD)
//      = (R-r)*sin(t) - d*sin(∠PBC - t)  
//      = (R-r)*sin(t) - d*sin(R*t/r - t)  
//
//（注意）R=2r,d=rとすると、y=0となる。すなわち、直線を描くことができる。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

// パネルの定義。
class gp132 extends JPanel {

  double R,r,d;

  gp132(double R, double r, double d) { // コンストラクタ。 
    this.R = R; this.r = r; this.d = d;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);  

    double t,x,xmin,xmax,y,ymin,ymax;

    // 図形の範囲を求める。
    // xmin：x座標最小値、xmax：x座標最大値。
    // ymin：y座標最小値、ymax：y座標最大値。
    xmin = 9999.0; xmax = -9999.0;
    ymin = 9999.0; ymax = -9999.0;
    for( t=0; t<=8*Math.PI; t=t+0.01 ) {
      // 点(x,y)の計算。
      x = (R-r)*Math.cos(t) + d*Math.cos(R*t/r-t);
      y = (R-r)*Math.sin(t) - d*Math.sin(R*t/r-t);
      // x,y座標の最小値、最大値の更新。
      if ( x < xmin ) { xmin = x; }
      if ( x > xmax ) { xmax = x; }
      if ( y < ymin ) { ymin = y; }
      if ( y > ymax ) { ymax = y; }
    }

    // フレームの高さと幅を取得。
    int h = this.getHeight();
    int w = this.getWidth();

    // 出力領域(左上隅(gx0,gy0) 幅gw, 高さgh)がフレームに
    // 含まれるように調整する。
    int gx0 = w/10; 
    int gy0 = h/10; 
    int gh = (int)(h*0.9);
    int gw = w;
    while( gx0+gw > w ) { 
      gh = (int)(0.9*gh);
      gw = (int)(gh*(xmax - xmin)/(ymax - ymin));
    }
    // 出力領域の描画。
    g.drawRect(gx0,gy0,gw,gh);

    // 軌跡の描画。
    g.setColor(Color.blue);
    int gx; // グラフィック座標のx座標。
    int gy; // グラフィック座標のy座標。
    for( t=0; t<=8*Math.PI; t=t+0.01 ) {
      // 点(x,y)の計算。
      x = (R-r)*Math.cos(t) + d*Math.cos(R*t/r-t);
      y = (R-r)*Math.sin(t) - d*Math.sin(R*t/r-t);
      // グラフィック座標(gx,gy)に変換。
      gx = gx0 + (int)(gw*(x - xmin)/(xmax - xmin));
      gy = gy0 + gh - (int)(gh*(y - ymin)/(ymax - ymin));
      g.drawLine(gx,gy,gx,gy);
    }

    // パラメータの表示。
    g.drawString("R="+R+" r="+r+" d="+d+" 0≦t≦8π",w/15,h/15);
  }
}

// フレームの定義。
class gf132 extends JFrame {
  gf132(String t, double R, double r, double d) { // コンストラクタ。
    super(t);
    // フレームからコンテントペインを取得。
    Container c = this.getContentPane();
    // パネルを生成し、フレームに追加。
    gp132 gp = new gp132(R,r,d);
    gp.setBackground(Color.white);
    c.add(gp,BorderLayout.CENTER);
  }
}

class g132 {
  public static void main(String[] args) {
    double R,r,d;
    // コマンドラインから入力。
    if( args.length > 0 ) {
      R = Double.parseDouble(args[0]);
      r = Double.parseDouble(args[1]);
      d = Double.parseDouble(args[2]);
    } else {
      R = 1.0; r = 0.5; d = 0.25;
    }
    // フレーム生成。
    gf132 gf = new gf132("点の軌跡",R,r,d);
    // フレームの大きさを設定
    gf.setSize(300,200);
		gf.setLocationRelativeTo(null);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレーム表示。
    gf.setVisible(true);
  }
}
