// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:41 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win028/win028_2/main.cs
 * url:  msnet/win028/win028_2/main.cs
 * created: Time-stamp: <2017-01-06 12:14:41 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win28.html
 * description: 
 *
 *================================================================*/
using System;
using System.Windows.Forms;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}

	override protected void OnMouseEnter(System.EventArgs e) {
		Cursor.Hide();
	}
	override protected void OnMouseLeave(System.EventArgs e) {
		Cursor.Show();
	}
}
