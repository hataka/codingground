// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:39 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win020/win020_2/main.cs
 * url:  msnet/win020/win020_2/main.cs
 * created: Time-stamp: <2017-01-06 12:14:39 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win20.html
 * description: 
 *
 *================================================================*/
using System;
using System.Windows.Forms;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}
	override protected void OnMouseMove(MouseEventArgs e) {
		Text = "X = " + e.X + " : Y = " + e.Y;
	}
}
