// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:41 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win027/win027_3/main.cs
 * url:  msnet/win027/win027_3/main.cs
 * created: Time-stamp: <2017-01-06 12:14:41 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win27.html
 * description: 
 *
 *================================================================*/
using System;
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	public static void Main(string[] args) {
		Icon ico = new Icon(args[0]);
		WinMain win = new WinMain();
		win.BackgroundImage = ico.ToBitmap();
		Application.Run(win);
	}
}
