// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:12 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs027/cs027_1/main.cs
 * url:  cs/cs027/cs027_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:12 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs27.html
 * description: 
 *
 *================================================================*/
class Kitty {
	private string name;
	public void setName(string name) {
		this.name = name;
	}
	public string getName() {
		return name;
	}
}

class Test {
	static void Main() {
		Kitty rena = new Kitty();
		//rena.name = "RENA";	//コンパイルエラー
		rena.setName("RENA");
		System.Console.WriteLine(rena.getName());
	}
}
