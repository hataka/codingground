// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:18 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs041/cs041_1/main.cs
 * url:  cs/cs041/cs041_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:18 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs41.html
 * description: 
 *
 *================================================================*/
class Test {
	public const string strKitty = "Kitty on your lap";

	static void Main() {
		const string strName ="Rena";
		//strName = "Yuki";		//代入できない
		//strKitty = "Di Gi Charat";	//代入できない

		System.Console.WriteLine(strKitty);
		System.Console.WriteLine(strName);
	}
}
