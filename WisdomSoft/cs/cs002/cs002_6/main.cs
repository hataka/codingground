// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:32 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs002/cs002_6/main.cs
 * url:  cs/cs002/cs002_6/main.cs
 * created: Time-stamp: <2016-10-03 06:15:32 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs2_2.html
 * description: 
 *
 *================================================================*/
class A { public A() {} }
class B { private B() {} }

class GTest<TYPE> where TYPE : new() {}

class Test {
	static void Main() {
		GTest<A> aObj = new GTest<A>();
		//GTest<B> bObj = new GTest<B>(); //エラー

		System.Console.WriteLine(aObj);
	}
}
