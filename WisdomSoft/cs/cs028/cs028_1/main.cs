// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:13 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs028/cs028_1/main.cs
 * url:  cs/cs028/cs028_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:13 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs28.html
 * description: 
 *
 *================================================================*/
abstract class Kitty {
	public void Write() {
		System.Console.WriteLine("Kitty on your lap");
	}
}

class Taruto : Kitty {
	new public void Write() {
		System.Console.WriteLine("Magical nyan nyan TARUTO");
	}
}

class Test {
	static void Main() {
		Kitty obj = new Taruto();
		obj.Write();
	}
}
