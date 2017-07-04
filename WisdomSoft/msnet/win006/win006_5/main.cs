// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:35 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win006/win006_5/main.cs
 * url:  msnet/win006/win006_5/main.cs
 * created: Time-stamp: <2017-01-06 12:14:35 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win6.html
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
		Point[] pt = {
			new Point(10 , 60) , new Point(110 , 10) ,
			new Point(210 , 60) , new Point(110 , 110)
		};
		Brush myBrush = new SolidBrush(Color.FromArgb(0xFF , 0 , 0));
		Pen myPen = new Pen(Color.FromArgb(0 , 0 , 0));

		g.FillClosedCurve(myBrush , pt);
		g.DrawClosedCurve(myPen , pt);
	}
}
