// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:22 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs048/cs048_6/main.cs
 * url:  cs/cs048/cs048_6/main.cs
 * created: Time-stamp: <2016-10-03 06:15:22 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs48.html
 * description: 
 *
 *================================================================*/
class Test {
	static void Main(string[] args) {
		try {
			System.Console.WriteLine(args[0]);
		}
		catch (System.Exception err) {
			System.Console.WriteLine(err.Message);
		}
		finally {
			System.Console.WriteLine("Kitty on your lap");
		}
	}
}
