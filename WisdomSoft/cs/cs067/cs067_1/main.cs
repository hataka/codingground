// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:30 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs067/cs067_1/main.cs
 * url:  cs/cs067/cs067_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:30 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs67.html
 * description: 
 *
 *================================================================*/
unsafe class Test {
	public static void Main() {
		int i = 0x41;
		char *c = (char *)&amp;i;
		System.Console.WriteLine(*c);
	}
}
