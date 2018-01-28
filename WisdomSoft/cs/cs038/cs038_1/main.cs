// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:17 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs038/cs038_1/main.cs
 * url:  cs/cs038/cs038_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:17 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs38.html
 * description: 
 *
 *================================================================*/
class Test {
	public static int Main(string[] args) {
		for (int i = 0 ; i  < args.Length ; i++)
			System.Console.WriteLine("第" + (i + 1) + "引数  = " + args[i]);
		return 0;
	}
}
