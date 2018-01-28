// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:26 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs055/cs055_2/main.cs
 * url:  cs/cs055/cs055_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:26 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs55.html
 * description: 
 *
 *================================================================*/
delegate void KittyCallback();

class Kitty {
	private string str;
	public Kitty(string str) {
		this.str = str;
	}
	public static implicit operator KittyCallback(Kitty obj) {
		return new KittyCallback(obj.Write);
	}
	public void Write() {
		System.Console.WriteLine(str);
	}
}

class Test {
	static void Main() {
		KittyCallback[] obj = new KittyCallback[] {
			new Kitty("Kitty on your lap") ,
			new Kitty("Selver Gene") ,
			new Kitty("Tokyo mew mew")
		};

		KittyCallback kitty = null;
		foreach(KittyCallback tmp in obj)
			kitty += tmp;
		kitty();

		System.Console.WriteLine("\n----減算後----");
		kitty -= obj[1];
		kitty();
	}
}
