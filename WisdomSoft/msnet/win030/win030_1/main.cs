// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:42 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win030/win030_1/main.cs
 * url:  msnet/win030/win030_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:42 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win30.html
 * description: 
 *
 *================================================================*/
using System.Windows.Forms;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}

	public WinMain() {
		MainMenu mm = new MainMenu();
		mm.MenuItems.Add("Rena(&R)");
		mm.MenuItems.Add("Yuki(&Y)");
		mm.MenuItems.Add("Mimi(&M)");

		Menu = mm;
	}
}
