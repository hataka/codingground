// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:43 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win034/win034_5/main.cs
 * url:  msnet/win034/win034_5/main.cs
 * created: Time-stamp: <2017-01-06 12:14:43 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win34.html
 * description: 
 *
 *================================================================*/
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}

	public WinMain() {
		ClientSize = new Size(400 , 300);

		Control ctrl = new Control();
		ctrl.BackColor = Color.Red;
		ctrl.Height = 30;
		ctrl.Dock = DockStyle.Bottom;
		Controls.Add(ctrl);
	}
}
