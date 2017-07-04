// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:34 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win003/win003_3/main.cs
 * url:  msnet/win003/win003_3/main.cs
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
		Application.Run(new WinMain());
	}
	override protected void OnPaint(PaintEventArgs e) {
		Graphics g = e.Graphics;
		Pen myPen = new Pen(Color.FromArgb(0 , 0 , 0) , 1);
		Point[] pt = {
			new Point(10 , 10) , new Point(110 , 100) ,
			new Point(210 , 100) , new Point(310 , 10) ,
			new Point(150 , 50) , new Point(310 , 100) ,
			new Point(400 , 10)
		};

		g.DrawCurve(myPen , pt , 0 , 3 , 0.5f);

		myPen = new Pen(Color.FromArgb(0xFF , 0 , 0) , 1);
		g.DrawCurve(myPen , pt , 3 , 3 , 1.0f);
	}
}
