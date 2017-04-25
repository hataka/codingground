// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:47 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win045/win045_2/main.cs
 * url:  msnet/win045/win045_2/main.cs
 * created: Time-stamp: <2017-01-06 12:14:47 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win45.html
 * description: 
 *
 *================================================================*/
using System;
using System.Drawing;
using System.Windows.Forms;
 
public class WinMain : Form {
	NumericUpDown numericUpDown1 = new NumericUpDown();
	public static void Main() {
		Application.Run(new WinMain());
	}

	public WinMain() {
		BackColor = Color.Black;
		numericUpDown1.Bounds = new Rectangle(10 , 10 , 200 , 20);
		numericUpDown1.Maximum = 255;
		numericUpDown1.ValueChanged += new EventHandler(_ValueChanged);
		
		Controls.Add(numericUpDown1);
	}

	private void _ValueChanged(object sender , EventArgs e) {
		int color = (int)numericUpDown1.Value;
		BackColor = Color.FromArgb(color , color , color);
	}
}
