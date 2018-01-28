// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:12 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs025/cs025_3/main.cs
 * url:  cs/cs025/cs025_3/main.cs
 * created: Time-stamp: <2016-10-03 06:15:12 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs25.html
 * description: 
 *
 *================================================================*/
class Kitty {
	public Kitty() : this("Kitty on your lap") {
		System.Console.WriteLine("End of default constructor");
	}
	public Kitty(string str) {
		System.Console.WriteLine(str);
	}
}

class Test {
	static void Main() {
		Kitty obj = new Kitty();
	}
}
