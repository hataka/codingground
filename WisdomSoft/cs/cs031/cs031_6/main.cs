// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:14 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs031/cs031_6/main.cs
 * url:  cs/cs031/cs031_6/main.cs
 * created: Time-stamp: <2016-10-03 06:15:14 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs31.html
 * description: 
 *
 *================================================================*/
struct Kitty {
	public string str;
	public Kitty(Kitty obj) {
		this = obj;
		str = this.str;
	}
	public Kitty(string str) {
		this.str = str;
	}
}

class Test {
	static void Main() {
		Kitty tmp = new Kitty("Kitty on your lap");
		Kitty obj = new Kitty(tmp);
		System.Console.WriteLine(obj.str);
	}
}
