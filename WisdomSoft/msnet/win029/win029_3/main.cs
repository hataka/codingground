// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:42 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win029/win029_3/main.cs
 * url:  msnet/win029/win029_3/main.cs
 * created: Time-stamp: <2017-01-06 12:14:42 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win29.html
 * description: 
 *
 *================================================================*/
using System.Windows.Forms;

class WinMain : Form {
	public static void Main(string[] args) {
		switch (MessageBox.Show("Do you know a Hizano Ueno Partner?" , 
			"Kitty on your lap" , MessageBoxButtons.YesNo)) {
		case DialogResult.Yes:
			MessageBox.Show("It has been an interesting game.");
			break;
		case DialogResult.No:
			MessageBox.Show("This is a game that Nekomimi girls appear.");
			break;
		}
	}
}
