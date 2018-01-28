// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:27 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs056/cs056_1/main.cs
 * url:  cs/cs056/cs056_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:27 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs56.html
 * description: 
 *
 *================================================================*/
delegate void KittyCallback(string str);

class Kitty {
	private string str;
	public event KittyCallback KittyListener;
	public Kitty(string str) {
		this.str = str;
	}
	public void StartEvent() {
		KittyListener(str);		//Kitty内からは呼び出せる
	}
}

class Test {
	static void Main() {
		Kitty obj = new Kitty("Kitty on your lap");
		obj.KittyListener += new KittyCallback(Action);
		//obj.KittyListener(); 	//呼び出せない
		obj.StartEvent();
	}
	static void Action(string str) {
		System.Console.WriteLine(str);
	}	
}
