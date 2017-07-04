// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:36 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win009/win009_3/main.cs
 * url:  msnet/win009/win009_3/main.cs
 * created: Time-stamp: <2017-01-06 12:14:36 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win9.html
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
		Font ftBold = new Font("MS Serif" , 20 , FontStyle.Strikeout);
		Font ftItalic = new Font(ftBold , FontStyle.Italic | FontStyle.Underline);
		
		PointF pt = new PointF(0 , 0);
		g.DrawString("Kitty on your lap" , ftBold , Brushes.Black , pt);
		pt.Y += 25;
		g.DrawString("Maiden Breeder" , ftItalic , Brushes.Black , pt);
	}
}
