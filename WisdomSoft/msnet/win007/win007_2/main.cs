// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:35 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win007/win007_2/main.cs
 * url:  msnet/win007/win007_2/main.cs
 * created: Time-stamp: <2017-01-06 12:14:35 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win7.html
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
		Pen myPen = new Pen(Color.FromArgb(0 , 0 , 0) , 5);
		DashStyle[] ds = {
			DashStyle.Dash , DashStyle.DashDot ,
			DashStyle.DashDotDot , DashStyle.Dot , DashStyle.Solid
		};
		for (int i = 0 , y = 10 ; i  < ds.Length ; i++ , y += 20) {
			myPen.DashStyle = ds[i];
			g.DrawLine(myPen , 10 , y , 200 , y);
		}
	}
}
