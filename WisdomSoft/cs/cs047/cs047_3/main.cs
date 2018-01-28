// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:21 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs047/cs047_3/main.cs
 * url:  cs/cs047/cs047_3/main.cs
 * created: Time-stamp: <2016-10-03 06:15:21 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs47.html
 * description: 
 *
 *================================================================*/
interface A {
	void Write();
}

interface B {
	void Write();
}

interface C : A , B {}

class Kitty : C {
	void A.Write() {
		System.Console.WriteLine("Kitty on your lap");
	}
	void B.Write() {
		System.Console.WriteLine("Di Gi Charat");
	}
}

class Test {
	static void Main() {
		C obj = new Kitty();
		obj.Write();
	}
}
