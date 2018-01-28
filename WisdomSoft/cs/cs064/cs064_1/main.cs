// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:29 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs064/cs064_1/main.cs
 * url:  cs/cs064/cs064_1/main.cs
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

[AttributeUsage(AttributeTargets.Class)]
class KittyAttribute : Attribute {
	public readonly KittyName name;
	public KittyAttribute(KittyName name) {
		this.name = name;
	}
}

[Kitty(KittyName.RENA)] class Kitty {
	[Kitty(KittyName.YUKI)] public void KittyMethod() {}	//エラー
}

class Test {
	public static void Main() {}
}
