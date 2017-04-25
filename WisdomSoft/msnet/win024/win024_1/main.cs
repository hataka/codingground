// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:40 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win024/win024_1/main.cs
 * url:  msnet/win024/win024_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:40 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win24.html
 * description: 
 *
 *================================================================*/
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}

	public WinMain() {
		SetStyle(ControlStyles.ResizeRedraw , true);
	}

	override protected void OnPaint(PaintEventArgs e) {
		Graphics g = e.Graphics;
		g.DrawString(Size.ToString() , Font , Brushes.Black , 0 , 0);
	}
}
