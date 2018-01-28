// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:09 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs018/cs018_1/main.cs
 * url:  cs/cs018/cs018_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:09 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs18.html
 * description: コンストラクタ
 *================================================================*/
public class Kitty {
	public string strName , strSex;
	public Kitty(string str , bool bl) {
		strName = str;
		strSex = bl ? "雌猫" : "雄猫";
	}
	public void Write() {
		System.Console.WriteLine(
			"名前 = " + strName + " : 性別 = " + strSex
		);
	}
}

public class Test {
	public static void Main() {
		Kitty rena = new Kitty("RENA" , true);
		Kitty kaimu = new Kitty("カイム" , false);

		rena.Write();
		kaimu.Write();
	}
}
