// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:07 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs013/cs013_4/main.cs
 * url:  cs/cs013/cs013_4/main.cs
 * created: Time-stamp: <2016-10-03 06:15:07 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs13.html
 * description: 
 *
 *================================================================*/
class Test {
	static void Main() {
		int x = 0;
		string str = "";

		switch(x) {
		case 0:
			str = "Kitty on your lap\n";
			goto case 1;
		case 1:
			str += "Tokyo mew mew\n";
			goto case 2;
		case 2:
			str += "Di Gi Charat";
			goto default;
		default:
			System.Console.WriteLine(str);
			break;
		}
	}
}
