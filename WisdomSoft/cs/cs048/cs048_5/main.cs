// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:22 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs048/cs048_5/main.cs
 * url:  cs/cs048/cs048_5/main.cs
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
			if (args[0] == "A") {
				int x = 0;
				x = 10 / x;
			}
			else if (args[0] == "B") {
				System.Object obj = null;
				string str = obj.ToString();
			}
		}
		catch {
			System.Console.WriteLine("例外がスローされました");
		}
	}
}
