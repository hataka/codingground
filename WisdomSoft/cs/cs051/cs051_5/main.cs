// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:25 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs051/cs051_5/main.cs
 * url:  cs/cs051/cs051_5/main.cs
 * created: Time-stamp: <2016-10-03 06:15:25 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs51.html
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
	using KittyScope ;

	class Kitty {
		public override string ToString() {
			return "Silver Gene";
		}
	}

	class Test {
		static void Main() {
			System.Console.WriteLine(new Kitty());
			System.Console.WriteLine(new KittyScope.Kitty());
		}
	}
}
