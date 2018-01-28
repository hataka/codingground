// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:18 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs042/cs042_3/main.cs
 * url:  cs/cs042/cs042_3/main.cs
 * created: Time-stamp: <2016-10-03 06:15:18 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs42.html
 * description: 
 *
 *================================================================*/
enum Kitty : int { RENA , YUKI = 10 , MIMI }

class Test {
	static void Main() {
		System.Console.WriteLine("RENA = " + (int)Kitty.RENA);
		System.Console.WriteLine("YUKI = " + (int)Kitty.YUKI);
		System.Console.WriteLine("MIMI = " + (int)Kitty.MIMI);
	}
}
