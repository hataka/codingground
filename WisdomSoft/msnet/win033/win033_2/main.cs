// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:43 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win033/win033_2/main.cs
 * url:  msnet/win033/win033_2/main.cs
 * created: Time-stamp: <2017-01-06 12:14:43 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win33.html
 * description: 
 *
 *================================================================*/
using System.Windows.Forms;

class WinMain : Form {
	ContextMenu cm;
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}

	public WinMain() {
		MenuItem[] mi = {
			new MenuItem("Maiden☆Breeder") ,
			new MenuItem("Magical nyan nyan TARUTO") ,
			new MenuItem("Tokyo mew mew") ,
			new MenuItem("Kitty on your lap")
		};
		cm = new ContextMenu(mi);
		ContextMenu = cm;
	}
}
