// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:22 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs048/cs048_3/main.cs
 * url:  cs/cs048/cs048_3/main.cs
 * created: Time-stamp: <2016-10-03 06:15:22 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs48.html
 * description: 
 *
 *================================================================*/
class Test {
	static void Main() {
		try {
			int zero = 0;
			System.Console.WriteLine(10 / zero);
		}
		catch(System.DivideByZeroException err) {
			System.Console.WriteLine(err.Message);
		}
	}
}
