// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:12 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs026/cs026_2/main.cs
 * url:  cs/cs026/cs026_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:12 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs26.html
 * description: 
 *
 *================================================================*/
abstract class Kitty {
	public void Write() {
		System.Console.WriteLine("Kitty on your lap");
	}
}

class TokyoMM : Kitty {
	new public void Write() {
		System.Console.WriteLine("Tokyo mew mew");
	}
	static void Main() {
		Kitty obj = new TokyoMM();
		obj.Write();
	}
}
