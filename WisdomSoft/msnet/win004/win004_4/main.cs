// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:34 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win004/win004_4/main.cs
 * url:  msnet/win004/win004_4/main.cs
 * created: Time-stamp: <2017-01-06 12:14:34 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win4.html
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
		Pen myPen = new Pen(Color.FromArgb(0 , 0 , 0) , 1);
		
		g.DrawArc(myPen , 10 , 10 , 200 , 200 , 0 , -270);
		g.DrawPie(myPen , 210 , 10 , 200 , 200 , 0 , -270);
	}
}
