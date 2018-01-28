// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:07 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs013/cs013_1/main.cs
 * url:  cs/cs013/cs013_1/main.cs
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
		int count = 0;

		start: count++;
		if (count > 100) goto end;
		System.Console.WriteLine("count = " + count);
		goto start;

		end: System.Console.WriteLine("End of goto loop");
	}
}
