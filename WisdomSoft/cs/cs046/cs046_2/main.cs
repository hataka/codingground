// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:20 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs046/cs046_2/main.cs
 * url:  cs/cs046/cs046_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:20 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs46.html
 * description: 
 *
 *================================================================*/
class A {}
class B {}

class Test {
	static void Main() {
		System.Object obj = new A();
		Check(obj);
		obj = new B();
		Check(obj);
	}
	static void Check(System.Object obj) {
		if (obj is B) System.Console.WriteLine("This is B");
		else System.Console.WriteLine("This is not B");
	}
}
