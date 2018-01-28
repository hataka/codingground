// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:16 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs037/cs037_1/main.cs
 * url:  cs/cs037/cs037_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:16 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs37.html
 * description: 
 *
 *================================================================*/
class Test {
	public static void Main() {
		string[][] str = new string[2][];
		str[0] = new string[] {"Kitty on your lap" , "Tokyo mew mew"};
		str[1] = new string[] {"Silver Gene" , "Di Gi Charat" , "Words Worth"};

		for (int i = 0 ; i  < str.Length ; i++)
			for (int j = 0 ; j  < str[i].Length ; j++)
				System.Console.WriteLine(str[i][j]);
	}
}
