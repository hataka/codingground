// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:37 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win011/win011_4/main.cs
 * url:  msnet/win011/win011_4/main.cs
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
		Rectangle rect = new Rectangle(10 , 10 , 200 , 200);

		gp.AddArc(rect , 0 , -200);
		rect.X += 210;
		gp.AddPie(rect , 0 , 270);
		
		g.DrawPath(Pens.Blue , gp);
	}
}
