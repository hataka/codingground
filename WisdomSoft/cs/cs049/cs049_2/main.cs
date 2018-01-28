// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:22 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs049/cs049_2/main.cs
 * url:  cs/cs049/cs049_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:22 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs49.html
 * description: 
 *
 *================================================================*/
class KittyException : System.Exception {
	public override string Message {
		get { return "Kitty on your lap"; }
	}
}

class Test {
	static void Main(string[] args) {
		try { Kitty(); }
		catch (KittyException err) {
			System.Console.WriteLine(err.Message);
		}
	}
	public static void Kitty() {
		throw new KittyException();
	}
}
