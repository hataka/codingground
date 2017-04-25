// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:46 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win042/win042_4/main.cs
 * url:  msnet/win042/win042_4/main.cs
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
	TextBox textBox1 = new TextBox();
	RichTextBox textBox2 = new RichTextBox();

	public static void Main() {
		Application.Run(new WinMain());
	}

	public WinMain() {
		textBox1.Dock = DockStyle.Top;
		textBox1.Multiline = textBox2.Multiline = true;
		textBox1.TextChanged += new EventHandler(textBox1_TextChanged);
		textBox2.Dock = DockStyle.Bottom;
		textBox2.ReadOnly = true;
		Controls.AddRange(new Control[] {textBox1 , textBox2});
	}
	private void textBox1_TextChanged(object sender , EventArgs e) {
		try {textBox2.Rtf = textBox1.Text;}
		catch(Exception) {}
	}
	override protected void OnLayout(LayoutEventArgs e) {
		textBox1.Height = textBox2.Height = ClientSize.Height / 2;
		base.OnLayout(e);
	}
}
