// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:19 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs044/cs044_2/main.cs
 * url:  cs/cs044/cs044_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:19 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs44.html
 * description: 
 *
 *================================================================*/
class Kitty {
	public string str;
	public Kitty(string str) {
		this.str = str;
	}
	public static explicit operator Kitty(string str) {
		System.Console.WriteLine("Kitty に変換");
		return new Kitty(str);
	}
}

class Test {
	static void Main() {
		Kitty obj = (Kitty)"Kitty on your lap";
		System.Console.WriteLine(obj.str);
	}
}
