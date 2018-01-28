// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:12 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs026/cs026_4/main.cs
 * url:  cs/cs026/cs026_4/main.cs
 * created: Time-stamp: <2016-10-03 06:15:12 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs26.html
 * description: 
 *
 *================================================================*/
class A {
	public virtual void M() {
		System.Console.WriteLine("Kitty on your lap");
	}
}

class B : A {
	public override void M() {
		System.Console.WriteLine("Tokyo mew mew");
	}
}

class C : B {
	new public virtual void M() {
		System.Console.WriteLine("Chobits");
	}
}

class D : C {
	public override void M() {
		System.Console.WriteLine("Di Gi Charat");
	}
	static void Main() {
		C objC = new D();
		A objA = new D();

		objC.M();
		objA.M();
	}
}
