// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:34 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win005/win005_2/main.cs
 * url:  msnet/win005/win005_2/main.cs
 * created: Time-stamp: <2017-01-06 12:14:34 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win5.html
 * description: 
 *
 *================================================================*/
using System;
using System.Windows.Forms;
using System.Drawing;
using System.Drawing.Drawing2D;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}
	override protected void OnPaint(PaintEventArgs e) {
		Graphics g = e.Graphics;
		Rectangle rect = new Rectangle(10 , 10 , 200 , 100);
		Brush myBrush = new LinearGradientBrush(
			rect , Color.FromArgb(0xFF , 0 , 0) ,
			Color.FromArgb(0 , 0 , 0xFF) , 45.0f
		);

		g.FillRectangle(myBrush , rect);
	}
}
