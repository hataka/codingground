// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:19 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs044/cs044_1/main.cs
 * url:  cs/cs044/cs044_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:19 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs44.html
 * description: 
 *
 *================================================================*/
class Output {
	public static Output operator  << (Output cout , System.Object obj) {
		System.Console.WriteLine(obj.ToString());
		return cout;
	}
}

class Test {
	static void Main() {
		Output cout = new Output();
		cout  <<= "Kitty on your lap";
	}
}
