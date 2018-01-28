//  -*- mode: java -*-  Time-stamp: <2009-06-21 05:12:18 kahata>
/*================================================================
 * プログラム名: j138b.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j318b.htm
 *  説明:
 *================================================================*/
/////////////////////////////////////////////////////////////////////////////
//  << j138b.java >>
//  アプレット（１）：グラフィックス（曲線：アステロイド）
//　  大円の内部を小円が接して回転するとき、小円内の任意の点Pの軌跡を求めよ。
//　  最初に接する点の描く曲線はアステロイドと呼ばれる。					 
//																		   
//　  半径Rの大円の中心をA、半径rの小円の中心をB、小円内の点Pの中心からの	
//	距離をhとする。														
//	最初、小円の中心Bと点Pはx軸上にあるとする。							
//	小円の中心が大円の中心に対して、tラジアン回転したとする。			  
//																		   
//　  点Cを大円と小円の接点とする。点Bを通りx軸に平行な線BDを引く。		  
//　  中心Bからx軸に垂線をおろし、その足をHとする。点PからBHの延長に垂線を   
//　  おろし、その足をQとする。											  
//																		   
//	点Pの座標を(x,y)とする。											   
//																		   
//	  x = AH - PQ														  
//		= AB*sin(t) - PB*sin(∠PBQ)										
//		= (R-r)*sin(t) - h*sin(∠PBQ)									  
//																		   
//　  ここで、ラジアンの定義から、R*t = r*(∠PBQ+t)						  
//																		   
//		= (R-r)*sin(t) - h*sin(R*t/r - t)								  
//		= (R-r)*sin(t) - h*sin(R*t/r - t)								  
//																		   
//	  y = BH + BQ														  
//		= AB*cos(t) + PB*cos(∠PBQ)										
//		= (R-r)*cos(t) + h*cos(R*t/r - t)								  
//		= (R-r)*cos(t) + h*cos(R*t/r - t)								  
//																		   
//　　（注意）R=2r,h=rとすると、y=0となる。すなわち、直線を描くことができる。
/////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.net.URL;

public class j138b extends JApplet {
  JPanel pane;

  private boolean inAnApplet = true;

	//Hack to avoid ugly message about system event access check.
	public j138b() {
		this(true);
	}

	public j138b(boolean inAnApplet) {
		this.inAnApplet = inAnApplet;
		if (inAnApplet) {
			getRootPane().putClientProperty("defeatSystemEventQueueCheck",
											Boolean.TRUE);
		}
	}

  public void init() {
	// アプレットからコンテンツペインを取得。
	Container c = this.getContentPane();

	// コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
	c.setLayout(new BorderLayout(0,0));

	// パネルの作成。
	j138bp p = new j138bp();
	p.setBackground(Color.white);
	p.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));

	// アプレットの背景色を白色に設定。
	this.setBackground(Color.white);


	// パネルをコンテンツペイン内に追加。
	c.add(p,BorderLayout.CENTER);

//	内部クラス使用のため取り外す
//	Add Components to a JPanel, using the default FlowLayout.
//	pane.add(p,BorderLayout.CENTER);
//	pane.setBackground(new Color(255,255,204));
//	pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//	setContentPane(pane);
 	resize(800,600);
  }

  // パネルの定義(内部クラス)。
  class j138bp extends JPanel {
	public void paintComponent(Graphics g) {
	  super.paintComponent(g);
// form here
	int x1,y1;
	double t;
	int x0,y0,R,r,h;

	// 初期設定。
	x0 = 150; y0 = 150; // 円の中心。
	R = (int)(0.6*y0);  // 大円の半径。
	r = (int)(0.2*y0);  // 小円の半径。
	h = r;

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
// to here
	}
  }

	/* One day, JApplet will make this method obsolete. */
	protected URL getURL(String filename) {
		URL codeBase = getCodeBase();
		URL url = null;
		try {
			url = new URL(codeBase, filename);
		} catch (java.net.MalformedURLException e) {
			System.out.println("Couldn't create image: badly specified URL");
			return null;
		}
		return url;
	}

	 protected URL getURL(URL codeBase, String filename) {
		URL url = null;
		try {
			url = new URL(codeBase, filename);
		} catch (java.net.MalformedURLException e) {
			System.out.println("Couldn't create image: badly specified URL");
			return null;
		}
		return url;
   }

	public static void main(String[] args) {
		Frame frame = new Frame("グラフィックス(曲線:アステロイド)");
				//frame.setDefaultCloseOperation(Frame.DISPOSE_ON_CLOSE);
				
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
				
		j138b applet = new j138b(false);
		applet.init();
		frame.add(applet, BorderLayout.CENTER);
		frame.pack();
 		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
