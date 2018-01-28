// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:21 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs047/cs047_2/main.cs
 * url:  cs/cs047/cs047_2/main.cs
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

class Kitty : A , B {
	void A.Write() {
		System.Console.WriteLine("Kitty on your lap");
	}
	void B.Write() {
		System.Console.WriteLine("Di Gi Charat");
	}
}

class Test {
	static void Main() {
		System.Object obj = new Kitty();
		((A)obj).Write();
		((B)obj).Write();
	}
}
