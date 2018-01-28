// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:10 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs020/cs020_5/main.cs
 * url:  cs/cs020/cs020_5/main.cs
 * created: Time-stamp: <2016-10-03 06:15:10 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs20.html
 * description: 
 *
 *================================================================*/
class Test {
	static void Main() {
		int x , y;
		getLocation(out x , out y);
		System.Console.WriteLine("x = " + x + " : y = " + y);
	}
	static void getLocation(out int x , out int y) {
		x = 100;
		y = 20;
	}
}
