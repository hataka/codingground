// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:41 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win028/win028_7/main.cs
 * url:  msnet/win028/win028_7/main.cs
 * created: Time-stamp: <2017-01-06 12:14:41 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win28.html
 * description: 
 *
 *================================================================*/
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}

	override protected void OnResize(System.EventArgs e) {
		Invalidate();
	}
	override protected void OnPaint(PaintEventArgs e) {
		Graphics g = e.Graphics;
		Cursors.Hand.DrawStretched(g , ClientRectangle);
	}
}
