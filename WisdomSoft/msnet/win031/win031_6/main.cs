// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:42 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win031/win031_6/main.cs
 * url:  msnet/win031/win031_6/main.cs
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
using System.Windows.Forms;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}

	public WinMain() {
		MainMenu mm = new MainMenu();
		MenuItem[] mi = {
			new MenuItem("Rena") , new MenuItem("Yuki") ,
			new MenuItem("Mimi")
		};
		mi[1].Break = true;
		mi[2].BarBreak = true;

		mm.MenuItems.Add("Kitty on your lap" , mi);
			
		Menu = mm;
	}
}
