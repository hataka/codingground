// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:07 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs013/cs013_2/main.cs
 * url:  cs/cs013/cs013_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:07 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs13.html
 * description: 
 *
 *================================================================*/
class Test {
	static void Main() {
		goto inner;
		{
			inner: System.Console.WriteLine("Kitty on your lap");
		}
	}
}
