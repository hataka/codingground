// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:46 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win044/win044_2/main.cs
 * url:  msnet/win044/win044_2/main.cs
 * created: Time-stamp: <2017-01-06 12:14:46 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win44.html
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
		ComboBox comboBox1 = new ComboBox();
		comboBox1.DropDownStyle = ComboBoxStyle.Simple;
		comboBox1.Size = new Size(200 , 100);
		comboBox1.Items.AddRange(new object[] {
			"Kitty on your lap" , "The forever that you wish"
		});
		Controls.Add(comboBox1);
	}
}
