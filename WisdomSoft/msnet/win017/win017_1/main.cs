// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:38 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win017/win017_1/main.cs
 * url:  msnet/win017/win017_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:38 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win17.html
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
		g.PageUnit = GraphicsUnit.Millimeter;
		g.DrawLine(Pens.Black , 0 , 5 , 30 , 5);
		g.DrawLine(Pens.Black , 0 , 10 , 50 , 10);
		g.DrawLine(Pens.Black , 0 , 15 , 70 , 15);
	}
}
