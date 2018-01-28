// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:10 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs021/cs021_1/main.cs
 * url:  cs/cs021/cs021_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:10 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs21.html
 * description: 
 *
 *================================================================*/
class Test {
	static void Main() {
		int x = 0;
		Kitty("Magical nyan nyan");
		Kitty(ref x);
		Kitty(x);
		Kitty();
	}
	static void Kitty(string str) {
		System.Console.WriteLine(str);
	}
	static void Kitty(ref int x) {
		System.Console.WriteLine("Kitty on your lap");
	}
	static void Kitty(int x) {
		System.Console.WriteLine("Tokyo mew mew");
	}
	static void Kitty() {
		System.Console.WriteLine("Di Gi Charat");
	}
}
