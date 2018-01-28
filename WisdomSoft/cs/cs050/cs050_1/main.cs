// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:23 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs050/cs050_1/main.cs
 * url:  cs/cs050/cs050_1/main.cs
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
	class Kitty {}
}

class Test {
	static void Main() {
		//Kitty obj = new Kitty(); //Kitty はこの空間に存在しない
		KittyScope.Kitty obj = new KittyScope.Kitty();
	}
}
