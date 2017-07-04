// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:38 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win018/win018_3/main.cs
 * url:  msnet/win018/win018_3/main.cs
 * created: Time-stamp: <2017-01-06 12:14:38 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win18.html
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
		Brush brush = new SolidBrush(DefaultForeColor);
		g.DrawString("Kitty on your lap" , DefaultFont , brush , 0 , 0);
	}
}
