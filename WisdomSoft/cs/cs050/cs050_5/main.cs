// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:24 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs050/cs050_5/main.cs
 * url:  cs/cs050/cs050_5/main.cs
 * created: Time-stamp: <2016-10-03 06:15:24 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs50.html
 * description: 
 *
 *================================================================*/
namespace KittyScope {
	class Kitty {
		public override string ToString() {
			return "Kitty on your lap";
		}
	}
}

namespace KittyScope {
	class Test {
		static void Main() {
			Kitty obj = new Kitty();
			System.Console.WriteLine(obj);
		}
	}
}
