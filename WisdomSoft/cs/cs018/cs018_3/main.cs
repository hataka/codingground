// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:09 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs018/cs018_3/main.cs
 * url:  cs/cs018/cs018_3/main.cs
 * created: Time-stamp: <2016-10-03 06:15:09 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs18.html
 * description: 
 *
 *================================================================*/
class Tmp {
	public string tmp;
}

class Kitty {
	public Tmp obj;
}

class Test {
	static void Main() {
		Kitty rena = new Kitty();
		rena.obj.tmp = "Kitty on your lap";
	}
}
