// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:20 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs045/cs045_3/main.cs
 * url:  cs/cs045/cs045_3/main.cs
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

enum KittyName { RENA , YUKI , MIMI }

class Kitty : KittyStandard {
	private string name;
	public Kitty(KittyName name) {
		this.name = name.ToString();
	}
	public void WriteName() {
		System.Console.WriteLine("Kitty on your lap");
	}
	void KittyStandard.WriteName() {
		System.Console.WriteLine(name);
	}
}

class Test {
	static void Main() {
		Kitty kitty = new Kitty(KittyName.YUKI);
		kitty.WriteName();
		((KittyStandard)kitty).WriteName();
	}
}
