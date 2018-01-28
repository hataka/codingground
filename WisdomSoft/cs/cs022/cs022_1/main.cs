// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:10 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs022/cs022_1/main.cs
 * url:  cs/cs022/cs022_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:10 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs22.html
 * description: 
 *
 *================================================================*/
class Kitty {
	public string str;
	public void Write() {
		str = "Kitty on your lap";
		System.Console.WriteLine(this.str);
	}
}
		
class Test {
	static void Main() {
		Kitty obj = new Kitty();
		obj.Write();
	}
}
