// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:14 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs030/cs030_1/main.cs
 * url:  cs/cs030/cs030_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:14 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs30.html
 * description: 
 *
 *================================================================*/
class Kitty {
	public override string ToString() {
		return "Kitty on your lap";
	}
}

class Test {
	static void Main() {
		Kitty temp = new Kitty();
		System.Object obj = temp;
		System.Console.WriteLine(obj);
	}
}
