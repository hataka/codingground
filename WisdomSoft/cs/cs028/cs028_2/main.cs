// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:13 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs028/cs028_2/main.cs
 * url:  cs/cs028/cs028_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:13 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs28.html
 * description: 
 *
 *================================================================*/
abstract class Kitty {
	public abstract void Write();
}

class Taruto : Kitty {
	public override void Write() {
		System.Console.WriteLine("Magical nyan nyan TARUTO");
	}
}

class Test {
	static void Main() {
		Taruto obj = new Taruto();
		obj.Write();
	}
}
