// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:34 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs002/cs002_4/main.cs
 * url:  cs/cs002/cs002_4/main.cs
 * created: Time-stamp: <2016-10-03 06:15:34 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs2_5.html
 * description: 
 *
 *================================================================*/
public delegate void CallbackMethod();

class Test {
	public static CallbackMethod GetMethod(string param) {
		int i = 10;
		return delegate {
			System.Console.WriteLine("param = " + param);
			System.Console.WriteLine("i = " + i);
		};
	}
	public static void Main() {
		CallbackMethod callback = GetMethod("Kitty on your lap");
		callback();
	}
}
