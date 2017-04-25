// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:33 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win002/win002_4/main.cs
 * url:  msnet/win002/win002_4/main.cs
 * created: Time-stamp: <2017-01-06 12:14:33 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win2.html
 * description: 
 *
 *================================================================*/
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	public static void Main(string[] args) {
		WinMain win = new WinMain();
		Application.Run(win);
	}
	override protected void OnPaint(PaintEventArgs e) {
		Graphics g = e.Graphics;
		Pen myPen = new Pen(Color.FromArgb(0 , 0 , 0) , 1);
		Point[] pt = {
			new Point(110 , 10) , new Point(210 , 100) ,
			new Point(10 , 100)
		};

		g.DrawPolygon(myPen , pt);
	}
}
