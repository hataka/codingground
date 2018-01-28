// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:20 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs045/cs045_1/main.cs
 * url:  cs/cs045/cs045_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:20 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs45.html
 * description: 
 *
 *================================================================*/
interface KittyStandard {
	void WriteName();
}

class Kitty : KittyStandard {
	private string name;
	public Kitty(string name) {
		this.name = name;
	}
	public void WriteName() {
		System.Console.WriteLine(name);
	}
}

class Test {
	static void Main() {
		Kitty rena = new Kitty("RENA");
		rena.WriteName();
	}
}
