// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:14 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs031/cs031_5/main.cs
 * url:  cs/cs031/cs031_5/main.cs
 * created: Time-stamp: <2016-10-03 06:15:14 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs31.html
 * description: 
 *
 *================================================================*/
struct Kitty {
	public static string s_str = "Silver Gene";
	public string str; 	// = "Kitty on your lap"; //とするとエラー
	//public Kitty();	//ノンパラメータのコンストラクタは作れない
	public Kitty(string str) {
		//base();	//base() コンストラクタ初期化子は使えない
		this.str = str;
	}
}

class Test {
	static void Main() {
		Kitty obj = new Kitty("Kitty on your lap");
		System.Console.WriteLine(Kitty.s_str);
		System.Console.WriteLine(obj.str);
	}
}
