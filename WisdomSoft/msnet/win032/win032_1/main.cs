// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:43 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win032/win032_1/main.cs
 * url:  msnet/win032/win032_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:43 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win32.html
 * description: 
 *
 *================================================================*/
using System;
using System.Windows.Forms;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}

	public void MenuClick(object obj , System.EventArgs e) {
		MenuItem mi = (MenuItem)obj;
		mi.Checked = !mi.Checked;
	}

	public WinMain() {
		MainMenu mm = new MainMenu();
		MenuItem[] mi = {
			new MenuItem("Rena") , new MenuItem("Yuki") ,
			new MenuItem("Mimi")
		};

		for (int i = 0 ; i  < mi.Length ; i++) 
			mi[i].Click += new System.EventHandler(MenuClick);

		mm.MenuItems.Add("Kitty on your lap" , mi);
			
		Menu = mm;
	}
}
