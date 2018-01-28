// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:08 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs015/cs015_2/main.cs
 * url:  cs/cs015/cs015_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:08 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs15.html
 * description: 
 *
 *================================================================*/
class Test {
	static void Main() {
		for (int i = 1 ; i  <= 100 ; i++) {
			if ((i % 2) == 1) continue;
			System.Console.WriteLine(i + "回目のループです");
		}
	}
}
