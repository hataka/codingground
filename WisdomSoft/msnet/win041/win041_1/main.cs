// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:45 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win041/win041_1/main.cs
 * url:  msnet/win041/win041_1/main.cs
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
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}

	public WinMain() {
		TextBox txt = new TextBox();
		txt.Size = new Size(200 , 20);
		txt.KeyUp+= new KeyEventHandler(_KeyUp);

		Controls.Add(txt);
	}

	public void _KeyUp(object sender , KeyEventArgs e) {
		Text = ((Control)sender).Text;
	}
}
