// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:27 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs056/cs056_2/main.cs
 * url:  cs/cs056/cs056_2/main.cs
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
using cout = System.Console;
delegate void KittyCallback();

class Kitty {
	private static KittyCallback kitty_listener;
	public static event KittyCallback KittyListener {
		add {
			cout.WriteLine("add : " + value);
			kitty_listener += value;
		}
		remove {
			cout.WriteLine("remove : " + value);
			kitty_listener -= value;
		}
	}
}

class Test {
	static void Main() {
		KittyCallback call = new KittyCallback(Action);
		Kitty.KittyListener += call;
		Kitty.KittyListener -= call;
	}
	static void Action() {}
}
