// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:09 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs019/cs019_2/main.cs
 * url:  cs/cs019/cs019_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:09 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs19.html
 * description: 
 *
 *================================================================*/
class Math {
	public static int Max(int x , int y) {
		return x >= y ? x : y;
	}
}

class Test {
	static void Main() {
		System.Console.WriteLine(Math.Max(10 , 20));
	}
}
