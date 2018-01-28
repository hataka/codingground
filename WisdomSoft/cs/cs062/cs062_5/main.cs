// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:28 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs062/cs062_5/main.cs
 * url:  cs/cs062/cs062_5/main.cs
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

class KittyAttribute : Attribute {}
class Kitty : Attribute {}

[Kitty()] class Kitty1 {}
[KittyAttribute()] class Kitty2 {}

class Test {
	static void Main(string[] args) {
		CheckAttribute(typeof(Kitty1));
		CheckAttribute(typeof(Kitty2));
	}
	static void CheckAttribute(Type t) {
		foreach(Object tmp in t.GetCustomAttributes(false)) {
			if (tmp is KittyAttribute)
				Console.WriteLine(t + " have KittyAttribute");
			else if (tmp is Kitty)
				Console.WriteLine(t + " have Kitty");
		}
	}
}
