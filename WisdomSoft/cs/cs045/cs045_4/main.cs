// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:20 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs045/cs045_4/main.cs
 * url:  cs/cs045/cs045_4/main.cs
 * created: Time-stamp: <2016-10-03 06:15:20 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs45.html
 * description: 
 *
 *================================================================*/
interface A {
	void WriteA();
}

interface B {
	void WriteB();
}

interface C : A , B {}

class Kitty : C {
	public void WriteA() {
		System.Console.WriteLine("Kitty on your lap");
	}
	public void WriteB() {
		System.Console.WriteLine("Silver Gene");
	}
}

class Test {
	static void Main() {
		Kitty obj = new Kitty();
		obj.WriteA();
		obj.WriteB();
	}
}
