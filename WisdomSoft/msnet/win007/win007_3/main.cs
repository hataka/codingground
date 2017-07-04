// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:35 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win007/win007_3/main.cs
 * url:  msnet/win007/win007_3/main.cs
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
using System;
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}
	override protected void OnPaint(PaintEventArgs e) {
		Graphics g = e.Graphics;
		Pen myPen = new Pen(Color.FromArgb(0 , 0 , 0) , 5);
		float[] fDash = { 5.0f , 1.0f , 1.0f , 1.0f , 3.0f , 1.0f};
		myPen.DashPattern = fDash;
		g.DrawLine(myPen , 10 , 10 , 400 , 10);
	}
}
