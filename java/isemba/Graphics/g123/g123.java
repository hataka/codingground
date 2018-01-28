
/*
///////////////////////////////////////////////////////////////////////////////
//  << g123.java >>
//
//  グラフィックス（２）：曲線（リサージュ図形）
//  
//　●定義
//　　  x = cos(a*t)
//      y = sin(b*t)
//          a>0, b>0, 0≦t≦2π
//
///////////////////////////////////////////////////////////////////////////////
*/

import java.awt.*; 
import javax.swing.*;

// パネルの定義。
class gp123 extends JPanel {

  double a,b;

  gp123(double a, double b) { // コンストラクタ。 
    this.a = a; this.b = b;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);  

    double t,x,xmin,xmax,y,ymin,ymax;

    // 図形の範囲を求める。
    // xmin：x座標最小値、xmax：x座標最大値。
    // ymin：y座標最小値、ymax：y座標最大値。
    xmin = 9999.0; xmax = -9999.0;
    ymin = 9999.0; ymax = -9999.0;
    for( t=0; t<=2*Math.PI; t=t+0.01 ) {
      // 点(x,y)の計算。
      x = Math.cos(a*t);
      y = Math.sin(b*t);
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

    // リサージュ図形の描画。
    g.setColor(Color.blue);
    int gx; // グラフィック座標のx座標。
    int gy; // グラフィック座標のy座標。
    for( t=0; t<=2*Math.PI; t=t+0.01 ) {
      // 点(x,y)の計算。
      x = Math.cos(a*t);
      y = Math.sin(b*t);
      // グラフィック座標(gx,gy)に変換。
      gx = gx0 + (int)(gw*(x - xmin)/(xmax - xmin));
      gy = gy0 + gh - (int)(gh*(y - ymin)/(ymax - ymin));
      g.drawLine(gx,gy,gx,gy);
    }

    // パラメータの表示。
    g.drawString("a="+a+" b="+b+" 0≦t≦2π",w/15,h/15);

  }
}

// フレームの定義。
class gf123 extends JFrame {
  gf123(String t, double a, double b) { // コンストラクタ。
    super(t);
    // フレームからコンテントペインを取得。
    Container c = this.getContentPane();
    // パネルを生成し、フレームに追加。
    gp123 gp = new gp123(a,b);
    gp.setBackground(Color.white);
    c.add(gp,BorderLayout.CENTER);
  }
}

class g123 {
  public static void main(String[] args) {
    double a,b;
    // コマンドラインから入力。
    if( args.length > 0 ) {
      a = Double.parseDouble(args[0]);
      b = Double.parseDouble(args[1]);
    } else {
      a = 1.0; b = 1.0;
    }

    // フレーム生成。
    gf123 gf = new gf123("リサージュ図形",a,b);
    // フレームの大きさを設定
    gf.setSize(300, 200);
		gf.setLocationRelativeTo(null);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレーム表示。
    gf.setVisible(true);
  }
}
/** 
% javac g123.java
% java g123

% java g123
<img src="g123a.jpg" width=300 height=200>

% java g123 2.0 3.0
<img src="g123b.jpg" width=300 height=200>

% java g123 3.0 5.0
<img src="g123c.jpg" width=300 height=200>
**/
