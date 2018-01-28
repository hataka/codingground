// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:23 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs050/cs050_2/main.cs
 * url:  cs/cs050/cs050_2/main.cs
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
namespace KittyScope {
	class Kitty {
		public override string ToString() {
			return "Kitty on your lap";
		}
	}
}

namespace MainScope {
	class Kitty {
		public override string ToString() {
			return "Tokyo mew mew";
		}
	}

	class Test {
		static void Main() {
			MainScope.Kitty objA = new MainScope.Kitty();
			KittyScope.Kitty objB = new KittyScope.Kitty();
			System.Console.WriteLine(objA +"\n" + objB);
		}
	}
}
