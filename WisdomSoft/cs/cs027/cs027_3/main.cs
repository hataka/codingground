// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:12 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs027/cs027_3/main.cs
 * url:  cs/cs027/cs027_3/main.cs
 * created: Time-stamp: <2016-10-03 06:15:12 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs27.html
 * description: 
 *
 *================================================================*/
class Kitty {
	public void Write() {
		System.Console.WriteLine("Kitty on your lap");
	}
}

class TokyoMM : Kitty {
	new private void Write() {
		System.Console.WriteLine("Tokyo mew mew");
	}
}

class Test {
	static void Main() {
		TokyoMM obj = new TokyoMM();
		obj.Write();
	}
}
