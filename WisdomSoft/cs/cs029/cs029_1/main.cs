// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:13 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs029/cs029_1/main.cs
 * url:  cs/cs029/cs029_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:13 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs29.html
 * description: 
 *
 *================================================================*/
sealed class Kitty {
	public void Write() {
		System.Console.WriteLine("Kitty on your lap");
	}
}

//class Taruto : Kitty {}	//エラー、継承できない

class Test {
	static void Main() {
		Kitty obj = new Kitty();
		obj.Write();
	}
}
