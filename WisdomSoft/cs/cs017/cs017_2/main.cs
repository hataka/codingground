// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:09 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs017/cs017_2/main.cs
 * url:  cs/cs017/cs017_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:09 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs17.html
 * description: 
 *
 *================================================================*/
class Calc {
	public int value;
	public int getPercent(int pc) {
		return (int)(value * ((double)pc / 100));
	}
}

class Test {
	static void Main() {
		Calc obj = new Calc();
		obj.value = 1000;
		System.Console.WriteLine(obj.getPercent(5));
	}
}
