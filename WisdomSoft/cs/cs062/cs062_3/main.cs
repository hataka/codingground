// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:28 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs062/cs062_3/main.cs
 * url:  cs/cs062/cs062_3/main.cs
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

[KittyAttribute(KittyName.RENA)] class Kitty {}

class Test {
	static void Main(string[] args) {
		Type t = typeof(Kitty);
		foreach(Object tmp in t.GetCustomAttributes(false)) {
			KittyAttribute attrKitty = tmp as KittyAttribute;
			if (attrKitty != null)
				Console.WriteLine("名前 : " + attrKitty.name);
		}
	}
}
