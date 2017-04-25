// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:40 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win022/win022_2/main.cs
 * url:  msnet/win022/win022_2/main.cs
 * created: Time-stamp: <2017-01-06 12:14:40 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win22.html
 * description: 
 *
 *================================================================*/
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	string key;
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}
	override protected void OnPaint(PaintEventArgs e) {
		Graphics g = e.Graphics;
		g.DrawString(key , Font , Brushes.Black , 0 , 0);
	}
	override protected void OnKeyPress(KeyPressEventArgs e) {
		key = "OnKeyPress = " + e.KeyChar;
		Invalidate();
	}
}
