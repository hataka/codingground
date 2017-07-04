// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:36 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win010/win010_4/main.cs
 * url:  msnet/win010/win010_4/main.cs
 * created: Time-stamp: <2017-01-06 12:14:36 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win10.html
 * description: 
 *
 *================================================================*/
using System;
using System.Windows.Forms;
using System.Drawing;
using System.Drawing.Text;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}
	override protected void OnPaint(PaintEventArgs e) {
		Graphics g = e.Graphics;
		FontFamily[] ff = (new InstalledFontCollection()).Families;
		for (int i = 0 , y = 0 ; i  < ff.Length ; i++ , y += 15) {
			Font ft = new Font("MS Serif" , 12);
			Point pt = new Point(0 , y);
			g.DrawString(ff[i].Name , ft , Brushes.Black , pt);
		}
	}
}
