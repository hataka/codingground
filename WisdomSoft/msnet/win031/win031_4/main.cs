// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:42 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win031/win031_4/main.cs
 * url:  msnet/win031/win031_4/main.cs
 * created: Time-stamp: <2017-01-06 12:14:42 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win31.html
 * description: 
 *
 *================================================================*/
using System;
using System.Windows.Forms;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}

	public WinMain() {
		MainMenu mm = new MainMenu();
		mm.MenuItems.Add("Kitties(&K)");

		MenuItem mi = mm.MenuItems[0];
		MenuItem[] kitty = {
			new MenuItem("Rena") , new MenuItem("Yuki") ,
			new MenuItem("Mimi")
		};
		MenuItem[] maiden = {
			new MenuItem("Sakura") , new MenuItem("Forte") ,
			new MenuItem("Silva") , new MenuItem("Kaguya")
		};

		mi.MenuItems.Add("Kitty on your lap(&K)" , kitty);
		mi.MenuItems.Add("Maiden☆Breeder(&M)" , maiden);
		Menu = mm;
	}
}
