// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:34 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win003/win003_1/main.cs
 * url:  msnet/win003/win003_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:34 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win3.html
 * description: 
 *
 *================================================================*/
using System;
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	public static void Main(string[] args) {
		WinMain win = new WinMain();
		Application.Run(win);
	}
	override protected void OnPaint(PaintEventArgs e) {
		Graphics g = e.Graphics;
		Pen myPen = new Pen(Color.FromArgb(0 , 0 , 0) , 1);
		Point[] pt = {
			new Point(10 , 10) , new Point(110 , 100) ,
			new Point(210 , 100) , new Point(310 , 10)
		};

		g.DrawBezier(myPen , pt[0] , pt[1] , pt[2] , pt[3]);
		g.DrawLines(myPen , pt);
	}
}
