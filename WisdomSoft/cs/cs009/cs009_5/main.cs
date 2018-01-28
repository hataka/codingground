// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:05 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs009/cs009_5/main.cs
 * url:  cs/cs009/cs009_5/main.cs
 * created: Time-stamp: <2016-10-03 06:15:05 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs9.html
 * description: 
 *
 *================================================================*/
class Test {
	static void Main() {
		bool var1 = true , var2 = false;
		System.Console.WriteLine((var1 | var2) & !(var1 & var2));
		System.Console.WriteLine((var1 | var1) & !(var1 & var1));
		System.Console.WriteLine((var2 | var2) & !(var2 & var2));
	}
}
