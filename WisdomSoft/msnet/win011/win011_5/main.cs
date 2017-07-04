// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:37 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win011/win011_5/main.cs
 * url:  msnet/win011/win011_5/main.cs
 * created: Time-stamp: <2017-01-06 12:14:37 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win11.html
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
		GraphicsPath gp = new GraphicsPath();
		Point pt = new Point(0 , 0);
		FontFamily ff = new FontFamily("Balmoral LET");
		
		gp.AddString("Kitty on your lap" , ff , (int)FontStyle.Bold , 120 , pt ,
			new StringFormat(StringFormatFlags.DisplayFormatControl)
		);
		g.DrawPath(Pens.Black , gp);
	}
}
