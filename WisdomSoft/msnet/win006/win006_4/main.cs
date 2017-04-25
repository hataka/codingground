// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:35 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win006/win006_4/main.cs
 * url:  msnet/win006/win006_4/main.cs
 * created: Time-stamp: <2017-01-06 12:14:35 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win6.html
 * description: 
 *
 *================================================================*/
using System.Windows.Forms;
using System.Drawing;
using System.Drawing.Drawing2D;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}
	override protected void OnPaint(PaintEventArgs e) {
		Graphics g = e.Graphics;
		Point[] pt = {
			new Point(10 , 50) , new Point(150 , 50) ,
			new Point(150 , 150) , new Point(50 , 150) ,
			new Point(50 , 10) , new Point(200 , 10) ,
			new Point(200 , 125) , new Point(10 , 125)
		};
		g.FillPolygon(new SolidBrush(Color.FromArgb(0xFF , 0 , 0)) , pt);

		for (int i = 0 ; i  < pt.Length ; i++) pt[i].X += 200;
		g.FillPolygon(
			new SolidBrush(Color.FromArgb(0xFF , 0 , 0)) ,
			pt , FillMode.Winding
		);
	}
}
