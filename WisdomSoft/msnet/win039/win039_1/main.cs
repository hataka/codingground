// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:45 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win039/win039_1/main.cs
 * url:  msnet/win039/win039_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:45 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win39.html
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
		string[] kitty = {"Rena" , "Yuki" , "Mimi"};
		string[] taruto = {"Taruto" , "Charlotte" , "Chitose"};

		GroupBox[] gb = {new GroupBox() , new GroupBox()};
		gb[0].Bounds = new Rectangle(10 , 10 , 200 , 130);
		gb[1].Bounds = new Rectangle(220 , 10 , 200 , 130);
		gb[0].Text = "Kitty on your lap";
		gb[1].Text = "Magical nyan nyan TARUTO";

		PutButton(gb[0] , kitty);
		PutButton(gb[1] , taruto);

		foreach(GroupBox ctrl in gb) Controls.Add(ctrl);
	}
	public void PutButton(Control ctrl , string[] text) {
		RadioButton[] bt = new RadioButton[text.Length];
		for(int i = 0 ; i  < bt.Length ; i++) {
			bt[i] = new RadioButton();
			bt[i].Bounds = new Rectangle(20 , 20 + (30 * i) , 150 , 30);
			bt[i].Text = text[i];
			ctrl.Controls.Add(bt[i]);
		}
	}
}
