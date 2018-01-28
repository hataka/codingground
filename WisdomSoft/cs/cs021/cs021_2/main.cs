// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:10 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs021/cs021_2/main.cs
 * url:  cs/cs021/cs021_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:10 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs21.html
 * description: 
 *
 *================================================================*/
class Test {
	public Test() {
		System.Console.WriteLine("Kitty on your lap");
	}
	public Test(string str) {
		System.Console.WriteLine(str);
	}

	static void Main() {
		Test obj = new Test();
		obj = new Test("Tokyo mew mew");
	}
}
