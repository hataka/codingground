// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:38 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win015/win015_1/main.cs
 * url:  msnet/win015/win015_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:38 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win15.html
 * description: 
 *
 *================================================================*/
using System;
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	Bitmap img;
	public static void Main(string[] args) {		
		Application.Run(new WinMain());
	}
	public WinMain() {
		img = new Bitmap("test.jpg");
		for (int i = 0 ; i  < img.Height ; i++) {
			for (int j = 0 ; j  < img.Width ; j++) {
				int px = ~(img.GetPixel(j , i)).ToArgb();
				img.SetPixel(j , i , Color.FromArgb(px));
			}
		}
	}
				
	override protected void OnPaint(PaintEventArgs e) {
		Graphics g = e.Graphics;
		g.DrawImage(img , 0 , 0);
	}
}
