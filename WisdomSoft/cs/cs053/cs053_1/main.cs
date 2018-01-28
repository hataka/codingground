// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:25 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs053/cs053_1/main.cs
 * url:  cs/cs053/cs053_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:25 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs53.html
 * description: 
 *
 *================================================================*/
class Test {
	static void Main() {
		try {
			byte x = 255;
			x = checked((byte)(x * 4));
		}
		catch (System.OverflowException err) {
			System.Console.WriteLine(err.Message);
		}
	}
}
