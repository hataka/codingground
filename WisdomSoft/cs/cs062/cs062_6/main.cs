// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:28 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs062/cs062_6/main.cs
 * url:  cs/cs062/cs062_6/main.cs
 * created: Time-stamp: <2016-10-03 06:15:28 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs62.html
 * description: 
 *
 *================================================================*/
using System;

enum KittyName { RENA , YUKI , MIMI }

class KittyAttribute : Attribute {
	public readonly KittyName name;
	public KittyAttribute(KittyName name) {
		this.name = name;
	}
}

class Kitty {
	[Kitty(KittyName.RENA)] public void KittyMethod() {}
}

class Test {
	public static void Main() {
		Type t = typeof(Kitty);
		System.Reflection.MethodInfo mi = 
			t.GetMethod("KittyMethod");

		foreach(Object tmp in mi.GetCustomAttributes(false)) {
			KittyAttribute attrKitty = tmp as KittyAttribute;
			if (attrKitty != null) 
				Console.WriteLine("名前 : " + attrKitty.name);
		}	
	}
}
