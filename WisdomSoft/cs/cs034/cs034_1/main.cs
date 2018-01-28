// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:15 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs034/cs034_1/main.cs
 * url:  cs/cs034/cs034_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:15 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs34.html
 * description: 
 *
 *================================================================*/
class Kitty {
	private string strName;
	public string StrName {
		get {
			System.Console.WriteLine("strName を要求");
			return strName;
		}
		set {
			System.Console.WriteLine(value + "を設定");
			strName = value;
		}
	}
}

class Test {
	static void Main() {
		Kitty obj = new Kitty();
		obj.StrName = "Kitty on your lap";
		string str = obj.StrName;
	}
}
