// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:43 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win033/win033_1/main.cs
 * url:  msnet/win033/win033_1/main.cs
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
using System.Drawing;

class WinMain : Form {
	ContextMenu cm;
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}

	override protected void OnMouseUp(MouseEventArgs e) {
		if (e.Button != MouseButtons.Right) return;
		cm.Show(this , new Point(e.X , e.Y));
	}

	public WinMain() {
		MenuItem[] mi = {
			new MenuItem("Maiden☆Breeder") ,
			new MenuItem("Magical nyan nyan TARUTO") ,
			new MenuItem("Tokyo mew mew") ,
			new MenuItem("Kitty on your lap")
		};
		cm = new ContextMenu(mi);
	}
}
