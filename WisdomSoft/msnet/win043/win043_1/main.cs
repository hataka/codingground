// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:46 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win043/win043_1/main.cs
 * url:  msnet/win043/win043_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:46 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win43.html
 * description: 
 *
 *================================================================*/
using System;
using System.Drawing;
using System.Windows.Forms;
 
public class WinMain : Form {
	public static void Main() {
		Application.Run(new WinMain());
	}

	public WinMain() {
		ToolTip tip = new ToolTip();
		tip.SetToolTip(this , "Kitty on your lap");
	}
}
