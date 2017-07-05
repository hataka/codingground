// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:45 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win040/win040_4/main.cs
 * url:  msnet/win040/win040_4/main.cs
 * created: Time-stamp: <2017-01-06 12:14:45 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win40.html
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
		string[] kitty = {"Rena" , "Yuki" , "Mimi"};
		CheckedListBox lb = new CheckedListBox();
		lb.Size = new Size(200 , 80);
		lb.Items.AddRange(kitty);

		Controls.Add(lb);
	}
}
