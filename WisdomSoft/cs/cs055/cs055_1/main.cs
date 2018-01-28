// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:26 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs055/cs055_1/main.cs
 * url:  cs/cs055/cs055_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:26 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs55.html
 * description: 
 *
 *================================================================*/
class Test {
	delegate void KittyCallback();
	static void Main() {
		KittyCallback kitty = new KittyCallback(Kitty);
		kitty += new KittyCallback(Temp);
		kitty();
	}
	static void Kitty() {
		System.Console.WriteLine("Kitty on your lap");
	}
	static void Temp() {
		System.Console.WriteLine("Silver Line");
	}
}
