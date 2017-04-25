// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:38 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win016/win016_1/main.cs
 * url:  msnet/win016/win016_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:38 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win16.html
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
		Image img = new Bitmap("test.jpg");
		Rectangle rect = new Rectangle(100 , 100 , 100 , 50);
		Brush myBrush = new TextureBrush(img , WrapMode.TileFlipXY , rect);
		g.FillRectangle(myBrush , 0 , 0 , 400 , 200);
	}
}
