// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:39 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win020/win020_1/main.cs
 * url:  msnet/win020/win020_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:39 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win20.html
 * description: 
 *
 *================================================================*/
using System.Windows.Forms;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}
	override protected void OnMouseDown(MouseEventArgs e) {
		Text = "Event = MouseDown";
	}
	override protected void OnMouseUp(MouseEventArgs e) {
		Text = "Event = MouseUp";
	}
	override protected void OnMouseEnter(System.EventArgs e) {
		Text = "Event = MouseEnter";
	}
	override protected void OnMouseLeave(System.EventArgs e) {
		Text = "Event = MouseLeave";
	}
}
