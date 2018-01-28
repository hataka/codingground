/*================================================================
 *  << g121.java >>
 *
 *   グラフィックス（２）：曲線（アステロイド）
 *   
 * 　●定義
 * 　　  x = a*cos(t)**3
 *      y = a*sin(t)**3
 *          a>0, 0≦t≦2π
 *
 *================================================================*/

import java.awt.*; 
import javax.swing.*;

// パネルの定義。
class gp121 extends JPanel {

  double a;

  gp121(double a) { // コンストラクタ。 
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
    for( t=0; t<=2*Math.PI; t=t+0.01 ) {
      // 点(x,y)の計算。
      double tmp = Math.cos(t);
      x = a*tmp*tmp*tmp;
      tmp = Math.sin(t);
      y = a*tmp*tmp*tmp;
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

    // アステロイドの描画。
    g.setColor(Color.blue);
    int gx; // グラフィック座標のx座標。
    int gy; // グラフィック座標のy座標。
    for( t=0; t<=2*Math.PI; t=t+0.01 ) {
      // 点(x,y)の計算。
      double tmp = Math.cos(t);
      x = a*tmp*tmp*tmp;
      tmp = Math.sin(t);
      y = a*tmp*tmp*tmp;
      // グラフィック座標(gx,gy)に変換。
      gx = gx0 + (int)(gw*(x - xmin)/(xmax - xmin));
      gy = gy0 + gh - (int)(gh*(y - ymin)/(ymax - ymin));
      g.drawLine(gx,gy,gx,gy);
    }

    // パラメータの表示。
    g.drawString("a="+a+" 0≦t≦2π",w/15,h/15);

  }
}

// フレームの定義。
class gf121 extends JFrame {
  gf121(String t, double a) { // コンストラクタ。
    super(t);
    // フレームからコンテントペインを取得。
    Container c = this.getContentPane();
    // パネルを生成し、フレームに追加。
    gp121 gp = new gp121(a);
    gp.setBackground(Color.white);
    c.add(gp,BorderLayout.CENTER);
  }
}

class g121 {
  public static void main(String[] args) {
    double a;
    // コマンドラインから入力。
    if( args.length > 0 ) {
      a = Double.parseDouble(args[0]);
    } else {
      a = 1.0;
    }
    // フレーム生成。
    gf121 gf = new gf121("アステロイド",a);
    // フレームの大きさを設定
    gf.setSize(300,200);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    gf.setLocationRelativeTo(null);
		gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレーム表示。
    gf.setVisible(true);
  }
}
