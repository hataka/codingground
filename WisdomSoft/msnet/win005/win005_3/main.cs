// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:34 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win005/win005_3/main.cs
 * url:  msnet/win005/win005_3/main.cs
 * created: Time-stamp: <2017-01-06 12:14:34 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win5.html
 * description: 
 *
 *================================================================*/
using System.Windows.Forms;
using System.Drawing;
using System.Drawing.Drawing2D;

class WinMain : Form {
	public static void Main(string[] args) {
		Application.Run(new WinMain());
	}
	override protected void OnPaint(PaintEventArgs e) {
		Graphics g = e.Graphics;
		Rectangle rect = new Rectangle(10 , 10 , 200 , 100);
		LinearGradientMode[] mode = {
			LinearGradientMode.BackwardDiagonal ,
			LinearGradientMode.ForwardDiagonal ,
			LinearGradientMode.Horizontal ,
			LinearGradientMode.Vertical
		};
		for (int i = 0 ; i  < 4 ; i++) {
			Brush myBrush = new LinearGradientBrush(
				rect , Color.FromArgb(0xFF , 0 , 0) ,
				Color.FromArgb(0 , 0 , 0) , mode[i]
			);

			g.FillRectangle(myBrush , rect);
			if (i == 1) { rect.X = 10; rect.Y += 110; }
			else rect.X += 210;
		}
	}
}
