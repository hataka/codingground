// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:46 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win042/win042_2/main.cs
 * url:  msnet/win042/win042_2/main.cs
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
	MenuItem[] menuItem;
	RichTextBox textBox1 = new RichTextBox();

	public static void Main() {
		Application.Run(new WinMain());
	}

	public WinMain() {
		menuItem = new MenuItem[] {
			new MenuItem("色を変える" , new EventHandler(menuItemClick)) ,
			new MenuItem("フォントを変える" , new EventHandler(menuItemClick)) ,
			new MenuItem("保存" , new EventHandler(menuItemClick)) ,
		};
		textBox1.Dock = DockStyle.Fill;
		textBox1.ContextMenu = new ContextMenu(menuItem);
		Controls.Add(textBox1);
	}

	private void menuItemClick(object sender , EventArgs e) {
		if(sender == menuItem[0])
			textBox1.SelectionColor = Color.Red;
		else if(sender == menuItem[1])
			textBox1.SelectionFont = new Font("MS Serif" , 20);
		else if (sender == menuItem[2])
			textBox1.SaveFile("test.rtf" , RichTextBoxStreamType.RichNoOleObjs);
	}
}
