// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:39 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win021/win021_1/main.cs
 * url:  msnet/win021/win021_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:39 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win21.html
 * description: 
 *
 *================================================================*/
using System;
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	int x = 0 , y = 0;
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}
	override protected void OnPaint(PaintEventArgs e) {
		Graphics g = e.Graphics;
		g.DrawString("X = " + x + " : Y = " + y , Font , Brushes.Black , 0 , 0);
	}

	override protected void OnMouseMove(MouseEventArgs e) {
		x = e.X ; y = e.Y;
		Invalidate();
	}
}
