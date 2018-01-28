// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:13 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs029/cs029_2/main.cs
 * url:  cs/cs029/cs029_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:13 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs29.html
 * description: 
 *
 *================================================================*/
class Kitty {
	public virtual void Write() {
		System.Console.WriteLine("Kitty on your lap");
	}
}

class Taruto : Kitty {
	public sealed override void Write() {
		System.Console.WriteLine("Magical nyan nyan TARUTO");
	}
}

class TokyoMM : Taruto {
	//public override void Write() {}//エラー、オーバーライドできない
}

class Test {
	static void Main() {
		Kitty obj = new Taruto();
		obj.Write();
	}
}
