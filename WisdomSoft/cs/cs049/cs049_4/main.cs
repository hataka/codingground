// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:23 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs049/cs049_4/main.cs
 * url:  cs/cs049/cs049_4/main.cs
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
		finally {
			System.Console.WriteLine("Silver Gene");
		}
	}
	static void A() {
		try { B(); }
		catch (System.DivideByZeroException err) {
			System.Console.WriteLine(err.Message);
		}
		finally {
			System.Console.WriteLine("Di Gi Charat");
		}
	}
	static void B() {
		try {
			int x = 0;
			x = 10 / x; //DivideByZeroException 発生
		}
		catch (System.IndexOutOfRangeException err) { 
			System.Console.WriteLine(err.Message);
		}
		finally {
			System.Console.WriteLine("Kitty on your lap");
		}
	}
}
