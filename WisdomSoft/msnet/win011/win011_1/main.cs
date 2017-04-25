// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:36 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win011/win011_1/main.cs
 * url:  msnet/win011/win011_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:36 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win11.html
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
			new Point(0 , 50) , new Point(75 , 100) ,
			new Point(140 , 0) , new Point(200 , 50)
		};
		byte[] bt = {
			(byte)PathPointType.Bezier , (byte)PathPointType.Bezier ,
			(byte)PathPointType.Bezier , (byte)PathPointType.Bezier
		};
		GraphicsPath gp = new GraphicsPath(pt , bt);
		
		g.DrawPath(Pens.Blue , gp);
	}
}
