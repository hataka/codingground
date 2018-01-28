// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:27 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs061/cs061_2/main.cs
 * url:  cs/cs061/cs061_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:27 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs61.html
 * description: 
 *
 *================================================================*/
using System;

class Test {
	static void Main() {
		CheckType('A');
		CheckType(50);
		CheckType("Kitty on your lap");
	}
	static void CheckType(Object obj) {
		Type t = obj.GetType();
		Console.WriteLine(t);
	}
}
