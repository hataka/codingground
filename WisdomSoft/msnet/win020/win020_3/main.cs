// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:39 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win020/win020_3/main.cs
 * url:  msnet/win020/win020_3/main.cs
 * created: Time-stamp: <2017-01-06 12:14:39 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win20.html
 * description: 
 *
 *================================================================*/
using System.Windows.Forms;

class WinMain : Form {
	public static void Main(string[] args) {
		WinMain win = new WinMain();
		win.MouseMove += new MouseEventHandler(_MouseMove);
		Application.Run(win);
	}

	static protected void _MouseMove(object obj , MouseEventArgs e) {
		((Control)obj).Text = "X = " + e.X + " : Y = " + e.Y;
	}
}
