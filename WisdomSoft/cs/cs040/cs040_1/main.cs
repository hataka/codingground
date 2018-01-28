// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:17 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs040/cs040_1/main.cs
 * url:  cs/cs040/cs040_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:17 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs40.html
 * description: 
 *
 *================================================================*/
class Kitty {
	private string[] strName;
	private Kitty() {}

	public Kitty(string[] str) {
		strName = str;
	}
	public int Length {
		get { return strName.Length; }
	}

	public string this[int index] {
		get { return strName[index];		}
		set { strName[index] = value;	}
	}
	
}
class Test {
	public static void Main() {
		private string[] str = new string[] {"Rena" , "Petit Charat" , "Mimi"};
		Kitty obj = new Kitty(str);
		GetKitty(obj);
		obj[1] = "Yuki";
		GetKitty(obj);
	}
	static void GetKitty(Kitty obj) {	
		for (int i = 0 ; i  < obj.Length ; i++)
			System.Console.WriteLine(obj[i]);
	}
}
