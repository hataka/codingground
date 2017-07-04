// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:37 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win013/win013_4/main.cs
 * url:  msnet/win013/win013_4/main.cs
 * created: Time-stamp: <2017-01-06 12:14:37 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win13.html
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
		Rectangle dest = new Rectangle(0 , 0 , 200 , 200);
		Rectangle src = new Rectangle(100 , 70 , 100 , 100);
		g.DrawImage(img , dest , src , GraphicsUnit.Pixel);
	}
}
