// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:05 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs009/cs009_6/main.cs
 * url:  cs/cs009/cs009_6/main.cs
 * created: Time-stamp: <2016-10-03 06:15:05 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs9.html
 * description: 
 *
 *================================================================*/
class Test {
	static void Main() {
		int var = 0;
		System.Console.WriteLine(false && 5  < (var = 10));
		System.Console.WriteLine(true || 5  < (var = 10));
		System.Console.WriteLine(var);
	}
}
