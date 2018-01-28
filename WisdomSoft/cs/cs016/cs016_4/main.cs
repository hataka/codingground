// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:08 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs016/cs016_4/main.cs
 * url:  cs/cs016/cs016_4/main.cs
 * created: Time-stamp: <2016-10-03 06:15:08 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs16.html
 * description: 
 *
 *================================================================*/
class B {
	public string str;
}

class A {
	public B objB;
}

class Test {
	static void Main() {
		A objA = new A();
		objA.objB = new B();

		objA.objB.str = "Kitty on your lap";
		System.Console.WriteLine(objA.objB.str);
	}
}
