// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:09 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs019/cs019_1/main.cs
 * url:  cs/cs019/cs019_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:09 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs19.html
 * description: 
 *
 *================================================================*/
class Kitty {
	public static string str;
	public void Write() {
		System.Console.WriteLine(str);
	}
}

class Test {
	static void Main() {
		Kitty rena = new Kitty();
		Kitty yuki = new Kitty();

		Kitty.str = "Kitty on your lap";

		rena.Write();
		yuki.Write();
	}
}
