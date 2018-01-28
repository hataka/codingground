// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:34 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs002/cs002_3/main.cs
 * url:  cs/cs002/cs002_3/main.cs
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
delegate void CallbackMethod(string param);

public class Test {
	public static void Main() {
		CallbackMethod callback = delegate(string param) {
			System.Console.WriteLine(param);
		};
		callback("Kitty on your lap");
//TODO 
		//仮パラメータ定義は省略可能
		callback = delegate {
			System.Console.WriteLine("Anonymous Method");
		};
		callback("Neko Mimi Mode");
	}
}
