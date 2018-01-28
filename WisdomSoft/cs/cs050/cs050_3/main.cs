// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:23 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs050/cs050_3/main.cs
 * url:  cs/cs050/cs050_3/main.cs
 * created: Time-stamp: <2016-10-03 06:15:23 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs50.html
 * description: 
 *
 *================================================================*/
namespace A {
	namespace B {
		namespace C {
			class Kitty {
				public override string ToString() {
					return "Kitty on your lap";
				}
			}
		}
	}
}
class Test {
	static void Main() {
		A.B.C.Kitty obj = new A.B.C.Kitty();
		System.Console.WriteLine(obj);
	}
}
