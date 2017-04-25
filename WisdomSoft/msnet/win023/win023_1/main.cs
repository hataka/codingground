// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:40 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win023/win023_1/main.cs
 * url:  msnet/win023/win023_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:40 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win23.html
 * description: 
 *
 *================================================================*/
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	Image img;
	public static void Main(string[] args) {
		WinMain win = new WinMain();
		win.img = new Bitmap(args[0]);

		win.AutoScroll = true;
		win.AutoScrollMinSize = new Size(win.img.Width , win.img.Height);
		Application.Run(win);
	}

	override protected void OnPaint(PaintEventArgs e) {
		Point pt = AutoScrollPosition;
		e.Graphics.DrawImage(img , pt.X , pt.Y);
		Text = "X = " + pt.X + " : Y = " + pt.Y;
	}
}
