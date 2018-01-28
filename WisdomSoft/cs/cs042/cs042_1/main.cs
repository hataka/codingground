// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:18 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs042/cs042_1/main.cs
 * url:  cs/cs042/cs042_1/main.cs
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
enum Kitty : uint { RENA , YUKI , MIMI }

class Test {
	static void Main() {
		GetKitty(Kitty.RENA);
		GetKitty(Kitty.YUKI);
		GetKitty((Kitty)2);
	}
	static void GetKitty(Kitty em) {
		switch(em) {
		case Kitty.RENA:
			System.Console.WriteLine("This is RENA");
			break;
		case Kitty.YUKI:
			System.Console.WriteLine("This is YUKI");
			break;
		case Kitty.MIMI:
			System.Console.WriteLine("This is MIMI");
			break;
		}
	}
}
