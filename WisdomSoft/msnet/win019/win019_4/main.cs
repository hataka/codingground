// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:39 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win019/win019_4/main.cs
 * url:  msnet/win019/win019_4/main.cs
 * created: Time-stamp: <2017-01-06 12:14:39 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win19.html
 * description: 
 *
 *================================================================*/
using System;
using System.Windows.Forms;

class WinMain : Form {
	public static void Main(string[] args) {
		WinMain mainWin = new WinMain();
		WinMain subWin = new WinMain();

		mainWin.Text = "This is Main Window";
		subWin.Text = "This is Sub Window";
		subWin.Visible = true;

		Application.Run(mainWin);
	}
}
