// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:38 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win015/win015_2/main.cs
 * url:  msnet/win015/win015_2/main.cs
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
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	public static void Main(string[] args) {		
		Application.Run(new WinMain());
	}
				
	override protected void OnPaint(PaintEventArgs e) {
		Graphics g = e.Graphics;
		Image img = new Bitmap(400 , 200);
		Graphics buf = Graphics.FromImage(img);

		for (int i = 0 ; i  < 400 ; i += 10)
			buf.DrawLine(Pens.Black , i , 0 , i , 200);

		g.DrawImage(img , 0 , 0);
	}
}
