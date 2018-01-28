// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:30 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs067/cs067_2/main.cs
 * url:  cs/cs067/cs067_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:30 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs67.html
 * description: 
 *
 *================================================================*/
struct Location {
	public int x , y;
}

struct Size {
	int width , height;
	public void Write() {
		System.Console.WriteLine(width + "\n" + height);
	}
}

unsafe class Test {
	public static void Main() {
		Location lt = new Location();
		lt.x = 100; lt.y = 200;

		Size *sz = (Size *)&amp;lt;
		sz->Write();
	}
}
