// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:12 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs025/cs025_2/main.cs
 * url:  cs/cs025/cs025_2/main.cs
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
	public Kitty() {
		System.Console.WriteLine("Kitty on your lap");
	}
	public Kitty(string str) {
		System.Console.WriteLine(str);
	}
}

class TokyoMM : Kitty {
	public TokyoMM(string str) : base(str) {
		System.Console.WriteLine("Tokyo mew mew");
	}
	static void Main() {
		TokyoMM obj = new TokyoMM("Di Gi Charat");
	}
}
