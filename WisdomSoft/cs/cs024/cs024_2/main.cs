// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:11 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs024/cs024_2/main.cs
 * url:  cs/cs024/cs024_2/main.cs
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
	public string str = "Tokyo mew mew";
	static void Main() {
		TokyoMM obj = new TokyoMM();
		System.Console.WriteLine(obj.str);
	}
}
