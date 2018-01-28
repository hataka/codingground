// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:20 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs045/cs045_2/main.cs
 * url:  cs/cs045/cs045_2/main.cs
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

class Kitty_On_Your_Lap : KittyStandard {
	private string name;
	public Kitty_On_Your_Lap(KittyName name) {
		this.name = name.ToString();
	}
	public void WriteName() {
		System.Console.WriteLine(name);
	}
}

class Di_Gi_Charat : KittyStandard {
	private const string name = "Di Gi Charat";
	public void WriteName() {
		System.Console.WriteLine(name);
	}
}

class Test {
	static void Main() {
		KittyStandard kitty = new Kitty_On_Your_Lap(KittyName.RENA);
		kitty.WriteName();

		kitty = new Di_Gi_Charat();
		kitty.WriteName();
	}
}
