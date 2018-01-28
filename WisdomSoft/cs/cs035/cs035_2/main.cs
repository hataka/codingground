// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:16 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs035/cs035_2/main.cs
 * url:  cs/cs035/cs035_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:16 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs35.html
 * description: 
 *
 *================================================================*/
class Test {
	public static void Main() {
		string[,] str = new string[2 , 3];

		str[0 , 0] = "Rena";
		str[0 , 1] = "Yuki";
		str[0 , 2] = "Mimi";

		str[1 , 0] = "Di Gi Charat";
		str[1 , 1] = "Petit Charat";
		str[1 , 2] = "Rabi en Rose";

		for (int i = 0 ; i  < 2 ; i++)
			for (int j = 0 ; j  < 3 ; j++)
				System.Console.WriteLine(str[i , j]);
	}
}
