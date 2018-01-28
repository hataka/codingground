// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:31 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs067/cs067_4/main.cs
 * url:  cs/cs067/cs067_4/main.cs
 * created: Time-stamp: <2016-10-03 06:15:31 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs67.html
 * description: 
 *
 *================================================================*/
using cout = System.Console;

struct Msg {
	public const int INT = 0x2;
	public const int KITTY = 0x4;
	
	public unsafe static bool Proc(uint msg , int lParam) {
		switch(msg) {
		case INT:
			cout.WriteLine(*((int *)lParam));
			return true;
		case KITTY:
			((Kitty *)lParam)->Write();
			return true;
		default:
			cout.WriteLine(lParam);
			return false;
		}
	}
}

struct Kitty {
	public void Write() {
		cout.WriteLine("Kitty on your lap");
	}
}

unsafe class Test {
	public static void Main() {
		int x = 0x10;
		Kitty cat = new Kitty();

		Msg.Proc(Msg.INT , (int)&amp;x);
		Msg.Proc(Msg.KITTY , (int)&amp;cat);
		Msg.Proc(0 , 0x100);
	}
}
