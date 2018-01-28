// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:16 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs035/cs035_4/main.cs
 * url:  cs/cs035/cs035_4/main.cs
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
		string[,] str = {
			{"Rena" , "Yuki" , "Mimi"} ,
			{"Di Gi Charat" , "Petit Charat" , "Rabi en Rose"} ,
		};

		for (int i = 0 ; i  < 2 ; i++)
			for (int j = 0 ; j  < 3 ; j++)
				System.Console.WriteLine(str[i , j]);
	}
}
