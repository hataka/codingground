// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:15 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs033/cs033_1/main.cs
 * url:  cs/cs033/cs033_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:15 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs33.html
 * description: 
 *
 *================================================================*/
class Test {
	static void Main() {
		System.Int32 i = 10;
		System.Object obj = i;
		GetInt32(obj);
	}
	static void GetInt32(System.Object obj) {
		System.Console.WriteLine((System.Int32)obj);
	}
}
