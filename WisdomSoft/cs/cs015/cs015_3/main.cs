// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:08 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs015/cs015_3/main.cs
 * url:  cs/cs015/cs015_3/main.cs
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
		for (int i = 1 ; ; i++) {
			for (int j = 1 ; ; j++) {
				System.Console.WriteLine("第二層 " + j);
				if (j >= 5) break;
			}
			System.Console.WriteLine("第一層" + i);
			if (i >= 5) break;
		}
				
	}
}
