// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:45 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win041/win041_4/main.cs
 * url:  msnet/win041/win041_4/main.cs
 * created: Time-stamp: <2017-01-06 12:14:45 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win41.html
 * description: 
 *
 *================================================================*/
using System;
using System.Drawing;
using System.Windows.Forms;
 
public class WinMain : Form {
	MenuItem[] menuItem;
	TextBox textBox1 = new TextBox();

	public static void Main() {
		Application.Run(new WinMain());
	}

	public WinMain() {
		menuItem = new MenuItem[] {
			new MenuItem("切り取り(&T)" , new EventHandler(menuItemClick)) ,
			new MenuItem("コピー(&C)" , new EventHandler(menuItemClick)) ,
			new MenuItem("貼り付け(&P)" , new EventHandler(menuItemClick)) ,
			new MenuItem("削除(&L)" , new EventHandler(menuItemClick)) ,
			new MenuItem("-") ,
			new MenuItem("元に戻す(&U)" , new EventHandler(menuItemClick)) ,
		};
		textBox1.Dock = DockStyle.Fill;
		textBox1.Multiline = true;
		textBox1.ContextMenu = new ContextMenu(menuItem);
		Controls.Add(textBox1);
	}

	private void menuItemClick(object sender , EventArgs e) {
		if(sender == menuItem[0]) textBox1.Cut();
		else if(sender == menuItem[1]) textBox1.Copy();
		else if(sender == menuItem[2]) textBox1.Paste();
		else if(sender == menuItem[3]) textBox1.Clear();

		else if(sender == menuItem[5]) textBox1.Undo();
	}
}
