// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:26 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs054/cs054_4/main.cs
 * url:  cs/cs054/cs054_4/main.cs
 * created: Time-stamp: <2016-10-03 06:15:26 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs54.html
 * description: 
 *
 *================================================================*/
class Test {
	delegate void WriteCallback(System.Object str);
	static void Main() {
		WriteCallback write = new WriteCallback(System.Console.WriteLine);
		write("Kitty on your lap");
	}
}
