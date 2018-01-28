// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:17 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs039/cs039_1/main.cs
 * url:  cs/cs039/cs039_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:17 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs39.html
 * description: 
 *
 *================================================================*/
class Test {
	public static void GetString(params string[] str) {
		for(int i = 0 ; i  < str.Length ; i++)
			System.Console.WriteLine(str[i]);
		System.Console.WriteLine("");
	}
	static void Main() {
		GetString("Kitty on your lap");
		GetString("Silver Gene" , "Tokyo mew mew");
		GetString("Rena" , "Yuki" , "Mimi");
		GetString(new string[] {"Di Gi Charat" , "Petit Charat"});
	}
}
