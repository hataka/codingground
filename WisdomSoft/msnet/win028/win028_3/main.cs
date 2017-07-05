// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:41 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win028/win028_3/main.cs
 * url:  msnet/win028/win028_3/main.cs
 * created: Time-stamp: <2017-01-06 12:14:41 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win28.html
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

	override protected void OnMouseDown(MouseEventArgs e) {
		int x = Location.X + (Width / 2);
		int y = Location.Y + (Height - ClientRectangle.Height) / 2 ;
		Cursor.Position = new Point(x , y);
	}
}
