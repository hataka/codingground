// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:14 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs031/cs031_3/main.cs
 * url:  cs/cs031/cs031_3/main.cs
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
	public Kitty(string str) {
		this.str = str;
	}
}

class Test {
	static void Main() {
		Kitty obj1 = new Kitty("Kitty on your lap");
		Kitty obj2 = obj1;
		obj2.str = "Silver gene";
		System.Console.WriteLine(obj1.str);
		System.Console.WriteLine(obj2.str);
	}
}
