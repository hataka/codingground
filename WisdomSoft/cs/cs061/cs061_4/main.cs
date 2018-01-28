// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:27 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs061/cs061_4/main.cs
 * url:  cs/cs061/cs061_4/main.cs
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
using System.Reflection;

class Test {
	static void Main(string[] args) {
		if (args.Length == 0) return;

		Type t = Type.GetType(args[0]);
		MemberInfo[] mi = t.GetMembers();
		foreach(MemberInfo tmp in mi) Console.WriteLine(tmp);
	}
}
