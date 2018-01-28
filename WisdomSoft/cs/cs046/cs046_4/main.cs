// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:20 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs046/cs046_4/main.cs
 * url:  cs/cs046/cs046_4/main.cs
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
class C : B {}

class Test {
	static void Main() {
		System.Object objA = new A();
		System.Object objC = new C();

		B objB = objA as B;
		Check(objB);

		objB = objC as B;
		Check(objB);
	}
	static void Check(System.Object obj) {
		if (obj == null) System.Console.WriteLine("this can't cast B type");
		else System.Console.WriteLine("Success");
	}
}
