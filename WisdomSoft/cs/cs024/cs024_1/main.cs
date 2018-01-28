// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:11 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs024/cs024_1/main.cs
 * url:  cs/cs024/cs024_1/main.cs
 * created: Time-stamp: <2016-10-03 06:15:11 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs24.html
 * description: 
 *
 *================================================================*/
class Kitty {
	public string name;
	public void WriteName() {
		System.Console.WriteLine(name);
	}
}

class TokyoMM : Kitty {
	public string ability;
	public void Attack() {
		WriteName();
		System.Console.WriteLine(ability);
	}
	static void Main() {
		TokyoMM ichigo = new TokyoMM();
		ichigo.name = "いちご";
		ichigo.ability = "リボーン・ストロベリー・チェーック!!";
		ichigo.Attack();
	}
}
