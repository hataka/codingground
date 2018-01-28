// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:23 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs049/cs049_3/main.cs
 * url:  cs/cs049/cs049_3/main.cs
 * created: Time-stamp: <2016-10-03 06:15:23 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs49.html
 * description: 
 *
 *================================================================*/
class Test {
	static void Main(string[] args) {
		try { A(); }
		catch (System.Exception err) {
			System.Console.WriteLine(err.Message);
		}
	}
	static void A() {
		try { B(); }
		catch { 
			System.Console.WriteLine("Silver Gene");
			throw;
		}
	}
	static void B() {
		throw new System.Exception("Kitty on your lap");
	}
}
