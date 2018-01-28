// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:25 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs052/cs052_1/main.cs
 * url:  cs/cs052/cs052_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:25 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs52.html
 * description: 
 *
 *================================================================*/
using System;

class Kitty : IDisposable {
	private string name;
	void IDisposable.Dispose() {
		Console.WriteLine("Dispose : " + name);
	}
	public string Name {
		get { return name;	}
		set { name = value;	}
	}
}

class Test {
	static void Main() {
		using (Kitty obj = new Kitty()) obj.Name = "Kitty on your lap";
	}
}
