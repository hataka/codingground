// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:46 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win042/win042_3/main.cs
 * url:  msnet/win042/win042_3/main.cs
 * created: Time-stamp: <2017-01-06 12:14:46 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win42.html
 * description: 
 *
 *================================================================*/
using System;
using System.Drawing;
using System.Windows.Forms;
 
public class WinMain : Form {
	RichTextBox textBox1 = new RichTextBox();

	public static void Main() {
		Application.Run(new WinMain());
	}

	public WinMain() {
		textBox1.Dock = DockStyle.Fill;
		textBox1.LoadFile("test.rtf");
		Controls.Add(textBox1);
	}
}
