// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:26 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs054/cs054_2/main.cs
 * url:  cs/cs054/cs054_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:26 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs54.html
 * description: 
 *
 *================================================================*/
delegate void KittyCallback();

class Kitty {
	private string str;
	public Kitty(string str) {
		this.str = str;
	}
	public void Write() {
		System.Console.WriteLine(str);
	}
}

class Test {
	static void Main() {
		Kitty obj = new Kitty("Kitty on your lap");
		KittyCallback write = new KittyCallback(obj.Write);
		write();
	}
}
