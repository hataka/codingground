// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:36 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win008/win008_1/main.cs
 * url:  msnet/win008/win008_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:36 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win8.html
 * description: 
 *
 *================================================================*/
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}
	override protected void OnPaint(PaintEventArgs e) {
		Graphics g = e.Graphics;
		Rectangle rect = new Rectangle(10 , 10 , 200 , 100);
		g.FillRectangle(Brushes.Red , rect);
		g.DrawRectangle(Pens.Black , rect);
	}
}
