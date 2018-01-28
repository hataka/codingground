// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:10 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs020/cs020_4/main.cs
 * url:  cs/cs020/cs020_4/main.cs
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
		int x = 0 , y = 0;
		getLocation(ref x , ref y);
		System.Console.WriteLine("x = " + x + " : y = " + y);
	}
	static void getLocation(ref int x , ref int y) {
		x = 100;
		y = 20;
	}
}
