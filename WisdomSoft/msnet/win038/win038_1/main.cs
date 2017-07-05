// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:44 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win038/win038_1/main.cs
 * url:  msnet/win038/win038_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:44 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win38.html
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
		RadioButton[] bt = new RadioButton[3];
		string[] txt = {"Rena" , "Yuki" , "Mimi"};
		for(int i = 0 ; i  < bt.Length ; i++) {
			bt[i] = new RadioButton();
			bt[i].Bounds = new Rectangle(0 , 30 * i , 200 , 30);
			bt[i].Text = txt[i];
			Controls.Add(bt[i]);
		}
	}
}
