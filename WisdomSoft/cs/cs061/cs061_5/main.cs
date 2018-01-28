// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:27 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs061/cs061_5/main.cs
 * url:  cs/cs061/cs061_5/main.cs
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
		FieldInfo[] field = t.GetFields();
		MethodInfo[] method = t.GetMethods();

		if (field.Length != 0)
			Console.WriteLine("----------Fields----------");
		foreach(FieldInfo tmp in field) Console.WriteLine(tmp);

		if (method.Length != 0)
			Console.WriteLine("---------Methods--------");
		foreach(MethodInfo tmp in method) Console.WriteLine(tmp);
	}
}
