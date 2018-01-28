// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:31 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs067/cs067_5/main.cs
 * url:  cs/cs067/cs067_5/main.cs
 * created: Time-stamp: <2016-10-03 06:15:31 kahata>
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
		char c = 'C';
		int i = 0x10;

		WritePointer(&amp;c);
		WritePointer(&amp;i);
	}
	public static void WritePointer(void *po) {
		System.Console.WriteLine(*((uint *)po));
	}
}
