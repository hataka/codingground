// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:31 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs068/cs068_1/main.cs
 * url:  cs/cs068/cs068_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:31 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs68.html
 * description: 
 *
 *================================================================*/
unsafe class Test {
	public static void Main() {
		int * iIndex = stackalloc int [2];
		*iIndex = 0x10;
		*(iIndex + 1) = 0x100;

		System.Console.WriteLine(*iIndex + "\n" + *(iIndex + 1));
	}
}
