// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:09 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs017/cs017_1/main.cs
 * url:  cs/cs017/cs017_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:09 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs17.html
 * description: 
 *
 *================================================================*/
class Kitty {
	public string name;
	public void Write() {
		System.Console.WriteLine("名前 = " + name);
	}
}

class Test {
	static void Main() {
		Kitty rena = new Kitty();
		rena.name = "RENA";
		rena.Write();
	}
}
