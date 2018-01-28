// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:08 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs016/cs016_3/main.cs
 * url:  cs/cs016/cs016_3/main.cs
 * created: Time-stamp: <2016-10-03 06:15:08 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs16.html
 * description: 
 *
 *================================================================*/
class Kitty {
	public string name;
}

class Test {
	static void Main() {
		Kitty rena = new Kitty();
		Kitty yuki = new Kitty();
		Kitty mimi = new Kitty();

		rena.name = "RENA";
		yuki.name = "YUKI";
		mimi.name = "MIMI";

		System.Console.WriteLine(rena.name);
		System.Console.WriteLine(yuki.name);
		System.Console.WriteLine(mimi.name);
	}
}
