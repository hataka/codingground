// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:11 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs024/cs024_4/main.cs
 * url:  cs/cs024/cs024_4/main.cs
 * created: Time-stamp: <2016-10-03 06:15:11 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs24.html
 * description: 
 *
 *================================================================*/
class Kitty {
	public string str = "Kitty on your lap";
}

class TokyoMM : Kitty {
	new public string str = "Tokyo mew mew";
	public void Write() {
		System.Console.WriteLine(base.str);
		System.Console.WriteLine(str);
	}
	static void Main() {
		TokyoMM obj = new TokyoMM();
		obj.Write();
	}
}
