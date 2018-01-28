// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:34 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs002/cs002_5/main.cs
 * url:  cs/cs002/cs002_5/main.cs
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
delegate void CallbackMethod();

class Test {
	static CallbackMethod [] GetMethods(string param) {
		CallbackMethod [] result = new CallbackMethod[5];
		for (int i = 0 ; i < result.Length ; i++) {
			result[i] = delegate { System.Console.WriteLine(i); } ;
		}
		return result;
	}
	static void Main() {
		CallbackMethod [] callbacks = GetMethods("Kitty on your lap");
		for(int i = 0 ; i < callbacks.Length ; i++)
			callbacks[i]();
	}
}
