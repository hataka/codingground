// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:37 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win014/win014_1/main.cs
 * url:  msnet/win014/win014_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:37 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win14.html
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
		Image img = new Bitmap("test.jpg");
		Point[] pt = {
			new Point(img.Width , 0) , new Point(0 , 0) ,
			new Point(img.Width , img.Height)
		};
		g.DrawImage(img , pt);
	}
}
