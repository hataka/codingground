// -*- mode: java -*-  Time-stamp: <2017-01-06 12:14:44 kahata>
/*================================================================
 * title: 
 * file: 
 * path; msnet/win035/win035_1/main.cs
 * url:  msnet/win035/win035_1/main.cs
 * created: Time-stamp: <2017-01-06 12:14:44 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/system/msnet/msnet_win35.html
 * description: 
 *
 *================================================================*/
using System;
using System.Windows.Forms;
using System.Drawing;

class WinMain : Form {
        int index = 0;
        ImageList img;
        public static void Main(string[] args) {
                Application.Run(new WinMain(args));
        }

        public WinMain(string[] imgFiles) {
                img = new ImageList();
                img.ImageSize = new Size(100 , 100);
                img.Images.Add(new Bitmap(imgFiles[0]));
                img.Images.Add(new Bitmap(imgFiles[1]));
        }
        override protected void OnPaint(PaintEventArgs e) {
                img.Draw(e.Graphics , 0 , 0 , index);
        }

        override protected void OnMouseEnter(System.EventArgs e)
                index = 1;
                Invalidate();
        }
        override protected void OnMouseLeave(System.EventArgs e)
                index = 0;
                Invalidate();
        }

}
