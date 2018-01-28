////////////////////////////////////////////////////////////////////////////////
//  << g127.java >>
//
//  グラフィックス（２）：曲線（アルキメデスのらせん）
//  
//　●定義
//      r = a*t
//　　  x = r*cos(t)
//      y = r*sin(t)
//          a>0
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

// パネルの定義。
class gp127 extends JPanel {

  double a;

  gp127(double a) { // コンストラクタ。 
    this.a = a; 
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);  

    double t,x,xmin,xmax,y,ymin,ymax;

    // 図形の範囲を求める。
    // xmin：x座標最小値、xmax：x座標最大値。
    // ymin：y座標最小値、ymax：y座標最大値。
    xmin = 9999.0; xmax = -9999.0;
    ymin = 9999.0; ymax = -9999.0;
    for( t=0; t<=4*Math.PI; t=t+0.01 ) {
      // 点(x,y)の計算。
      double r = a*t;
      x = r*Math.cos(t);
      y = r*Math.sin(t);
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

    // アルキメデスのらせん描画。
    g.setColor(Color.blue);
    int gx; // グラフィック座標のx座標。
    int gy; // グラフィック座標のy座標。
    for( t=0; t<=4*Math.PI; t=t+0.01 ) {
      // 点(x,y)の計算。
      double r = a*t;
      x = r*Math.cos(t);
      y = r*Math.sin(t);
      // グラフィック座標(gx,gy)に変換。
      gx = gx0 + (int)(gw*(x - xmin)/(xmax - xmin));
      gy = gy0 + gh - (int)(gh*(y - ymin)/(ymax - ymin));
      g.drawLine(gx,gy,gx,gy);
    }

    // パラメータの表示。
    g.drawString("a="+a+" 0≦t≦4π",w/15,h/15);
  }
}

// フレームの定義。
class gf127 extends JFrame {
  gf127(String t, double a) { // コンストラクタ。
    super(t);
    // フレームからコンテントペインを取得。
    Container c = this.getContentPane();
    // パネルを生成し、フレームに追加。
    gp127 gp = new gp127(a);
    gp.setBackground(Color.white);
    c.add(gp,BorderLayout.CENTER);
  }
}

class g127 {
  public static void main(String[] args) {
    double a;
    // コマンドラインから入力。
    if( args.length > 0 ) {
      a = Double.parseDouble(args[0]);
    } else {
      a = 1.0; 
    }
    // フレーム生成。
    gf127 gf = new gf127("アルキメデスのらせん",a);
    // フレームの大きさを設定
    gf.setSize(300,200);
    gf.setLocationRelativeTo(null);
		// 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレーム表示。
    gf.setVisible(true);
  }
}
