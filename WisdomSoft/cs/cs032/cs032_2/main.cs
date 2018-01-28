// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:14 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs032/cs032_2/main.cs
 * url:  cs/cs032/cs032_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:14 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs32.html
 * description: 
 *
 *================================================================*/
struct Kitty {
	public string str;
	public Kitty(string str) {
		this.str = str;
	}
	public override string ToString() {
		return str;
	}
}

class Test {
	static void Main() {
		System.Object box = new Kitty("Kitty on your lap");
		Kitty unbox = (Kitty)box;
		unbox.str = "Silver Gene";

		System.Console.WriteLine(box);
		System.Console.WriteLine(unbox);
	}
}
