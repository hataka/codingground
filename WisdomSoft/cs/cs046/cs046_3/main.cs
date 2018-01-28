// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:20 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs046/cs046_3/main.cs
 * url:  cs/cs046/cs046_3/main.cs
 * created: Time-stamp: <2016-10-03 06:15:20 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs46.html
 * description: 
 *
 *================================================================*/
interface KittyStandard {
	string Name { get; }
}

enum KittyName { RENA , YUKI , MIMI }

class Kitty : KittyStandard {
	private string name;
	public Kitty(KittyName name) {
		this.name = name.ToString();
	}
	string KittyStandard.Name { get { return name; } }
}

class Test {
	static void Main() {
		System.Object kitty = new Kitty(KittyName.MIMI);
		CheckKittyStandard(kitty);

		kitty = new Test();
		CheckKittyStandard(kitty);
	}
	static void CheckKittyStandard(System.Object obj) {
		if (obj is KittyStandard)
			System.Console.WriteLine(((KittyStandard)obj).Name);
		else	System.Console.WriteLine("This is not KittyStandard");
	}
}
