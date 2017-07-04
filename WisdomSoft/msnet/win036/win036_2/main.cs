// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:44 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win036/win036_2/main.cs
 * url:  msnet/win036/win036_2/main.cs
 * created: Time-stamp: <2017-01-06 12:14:44 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win36.html
 * description: 
 *
 *================================================================*/
using System;
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}

	public WinMain() {
		Button bt = new Button();
		bt.Image = new Bitmap("test.jpg");
		bt.Bounds = new Rectangle(0 , 0 , 400, 200);
		bt.MouseUp += new MouseEventHandler(OnButton);
		Controls.Add(bt);
	}
	public void OnButton(object sender , MouseEventArgs e) {
		MessageBox.Show("Kitty on your lap");
	}
}
