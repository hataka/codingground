// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:45 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win040/win040_3/main.cs
 * url:  msnet/win040/win040_3/main.cs
 * created: Time-stamp: <2017-01-06 12:14:45 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win40.html
 * description: 
 *
 *================================================================*/
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
	Image img;
	public static void Main(string[] args) {
		Application.Run(new WinMain(args));
	}

	public WinMain(string[] file) {
		Image[] img = new Image[file.Length];
		for(int i = 0 ; i  < file.Length ; i++) img[i] = new Bitmap(file[i]);

		ListBox lb = new ListBox();
		lb.Size = new Size(200 , 80);
		lb.Items.AddRange(img);
		lb.Click += new System.EventHandler(_Select);
		Controls.Add(lb);
	}

	public void _Select(object sender , System.EventArgs e) {
		ListBox lb = (ListBox)sender;
		img = (Image)lb.SelectedItem;
		Invalidate();
	}
	override protected void OnPaint(PaintEventArgs e) {
		if (img != null) e.Graphics.DrawImage(img , 0 , 80 , 200 , 200);
	}
}
