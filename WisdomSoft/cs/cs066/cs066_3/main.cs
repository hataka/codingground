// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:30 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs066/cs066_3/main.cs
 * url:  cs/cs066/cs066_3/main.cs
 * created: Time-stamp: <2016-10-03 06:15:30 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs66.html
 * description: 
 *
 *================================================================*/
unsafe class Test {
	public static int param = 10;
	public static void Main() {
		fixed(int *pParam = &amp;param)
			System.Console.WriteLine(*pParam);
	}
}
