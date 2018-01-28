// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:10 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs020/cs020_2/main.cs
 * url:  cs/cs020/cs020_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:10 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs20.html
 * description: 
 *
 *================================================================*/
class Test {
	string str;

	static void Main() {
		Test obj = new Test();
		Test tmp = obj;
		tmp.str = "Kitty on your lap";
		System.Console.WriteLine(obj.str);
	}
}
