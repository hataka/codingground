// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:39 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win019/win019_3/main.cs
 * url:  msnet/win019/win019_3/main.cs
 * created: Time-stamp: <2017-01-06 12:14:39 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win19.html
 * description: 
 *
 *================================================================*/
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	public static void Main(string[] args) {
		WinMain win = new WinMain();
		win.Font = new Font(args[0] , 30);
		Application.Run(win);
	}

	override protected void OnPaint(PaintEventArgs e) {
		Graphics g = e.Graphics;
		Brush brush = new SolidBrush(ForeColor);
		g.DrawString("Kitty on your lap" , Font , brush , 0 , 0);
	}
}
