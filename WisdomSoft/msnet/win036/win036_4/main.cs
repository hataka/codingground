// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:44 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win036/win036_4/main.cs
 * url:  msnet/win036/win036_4/main.cs
 * created: Time-stamp: <2017-01-06 12:14:44 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win36.html
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

	public WinMain() {
		Button bt = new Button();
		bt.Size = new Size(200 , 30);
		bt.Text = "Kitty on your lap";
		bt.TextAlign = ContentAlignment.MiddleLeft;
		Controls.Add(bt);
	}
}
