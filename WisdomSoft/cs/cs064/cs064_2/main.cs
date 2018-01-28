// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:29 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs064/cs064_2/main.cs
 * url:  cs/cs064/cs064_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:29 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs64.html
 * description: 
 *
 *================================================================*/
using System;

enum KittyName { RENA , YUKI , MIMI }

[AttributeUsage(AttributeTargets.Class , AllowMultiple=true)]
class KittyAttribute : Attribute {
	public readonly KittyName name;
	public KittyAttribute(KittyName name) {
		this.name = name;
	}
}

[Kitty(KittyName.RENA)]
[Kitty(KittyName.YUKI)]
[Kitty(KittyName.MIMI)]
class Kitty {}

class Test {
	public static void Main() {
		Type t = typeof(Kitty);
		foreach(Object tmp in t.GetCustomAttributes(false)) {
			KittyAttribute attrKitty = tmp as KittyAttribute;
			if (attrKitty != null)
				Console.WriteLine("名前 : " + attrKitty.name);
		}
	}
}
