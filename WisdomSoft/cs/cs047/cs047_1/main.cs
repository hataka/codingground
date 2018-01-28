// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:21 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs047/cs047_1/main.cs
 * url:  cs/cs047/cs047_1/main.cs
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
	string Name { get; }
}

class B {
	private const string name = "Kitty on your lap";
	public string Name { get { return name; } }
}

class C : B , A {}

class Test {
	static void Main() {
		C obj = new C();
		System.Console.WriteLine(obj.Name);
	}
}
