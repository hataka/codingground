// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:45 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win041/win041_3/main.cs
 * url:  msnet/win041/win041_3/main.cs
 * created: Time-stamp: <2017-01-06 12:14:45 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win41.html
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
		TextBox txt = new TextBox();
		txt.Size = new Size(200 , 20);
		txt.ReadOnly = true;
		txt.TextAlign = HorizontalAlignment.Center;
		txt.Text = "Kitty on your lap";

		Controls.Add(txt);
	}
}
