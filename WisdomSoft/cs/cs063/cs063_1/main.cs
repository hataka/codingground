// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:28 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs063/cs063_1/main.cs
 * url:  cs/cs063/cs063_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:28 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs63.html
 * description: 
 *
 *================================================================*/
using System;

enum KittyName { RENA , YUKI , MIMI }

class KittyAttribute : Attribute {
	public readonly KittyName name;
	public String strTitle;
	public KittyAttribute(KittyName name) {
		this.name = name;
		if (strTitle == null) strTitle = "Kitty on your lap";
	}
}

[Kitty(KittyName.RENA)] class Kitty1 {}
[Kitty(KittyName.YUKI , strTitle = "Hiza no ue no pertner")] class Kitty2 {}

class Test {
	public static void Main() {
		WriteAtt(typeof(Kitty1));
		WriteAtt(typeof(Kitty2));
	}
	private static void WriteAtt(Type t) {
		foreach(Object tmp in t.GetCustomAttributes(false)) {
			KittyAttribute attrKitty = tmp as KittyAttribute;
			if (attrKitty != null) {
				Console.WriteLine("作品 : " + attrKitty.strTitle);
				Console.WriteLine("名前 : " + attrKitty.name);
			}
		}
	}
}
