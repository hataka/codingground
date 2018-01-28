// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:09 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs018/cs018_2/main.cs
 * url:  cs/cs018/cs018_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:09 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs18.html
 * description: 
 *
 *================================================================*/
class Kitty {
	public string name = "RENA" , sex = "雌猫";
	public void Write() {
		System.Console.WriteLine("名前 = " + name + " : 性別 = " + sex);
	}
}

class Test {
	static void Main() {
		Kitty rena = new Kitty();
		Kitty yuki = new Kitty();
		yuki.name = "YUKI";

		rena.Write();
		yuki.Write();
	}
}
