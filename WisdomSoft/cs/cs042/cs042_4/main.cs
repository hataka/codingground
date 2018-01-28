// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:18 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs042/cs042_4/main.cs
 * url:  cs/cs042/cs042_4/main.cs
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
enum Kitty : uint { RENA , YUKI , MIMI , IWAO = YUKI }

class Test {
	static void Main() {
		System.Console.WriteLine("RENA = " + (int)Kitty.RENA);
		System.Console.WriteLine("YUKI = " + (int)Kitty.YUKI);
		System.Console.WriteLine("MIMI = " + (int)Kitty.MIMI);
		System.Console.WriteLine("岩男潤子 = " + (int)Kitty.IWAO);
	}
}
