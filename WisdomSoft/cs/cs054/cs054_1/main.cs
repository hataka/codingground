// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:26 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs054/cs054_1/main.cs
 * url:  cs/cs054/cs054_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:26 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs54.html
 * description: 
 *
 *================================================================*/
delegate void KittyCallback();

class Test {
	static void Main() {
		KittyCallback kitty = new KittyCallback(Kitty);
		kitty();
	}
	static void Kitty() {
		System.Console.WriteLine("Kitty on your lap");
	}
}
