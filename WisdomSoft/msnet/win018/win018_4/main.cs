// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:38 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win018/win018_4/main.cs
 * url:  msnet/win018/win018_4/main.cs
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
		Font ft = new Font("MS Serif" , 12);

		g.DrawString("Created = " + Created , ft , Brushes.Black , 0 , 0);
		g.DrawString("Disposing = " + Disposing , ft , Brushes.Black , 0 , 15);
		g.DrawString("Enabled = " + Enabled , ft , Brushes.Black , 0 , 30);
		g.DrawString("Focused = " + Focused , ft , Brushes.Black , 0 , 45);
	}
}
