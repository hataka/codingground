// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:42 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_038/inheritance02/inheritance02.cs
 * url:  cs/cs_038/inheritance02/inheritance02.cs
 * created: Time-stamp: <2016-08-24 15:57:42 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_38.htm
 * description: 
 *
 *================================================================*/
// inheritance02.cs

using System;

class MyClass1
{
    public int x = 0;
}

class MyClass2 : MyClass1
{
    public int y = 1;
}

class MyClass3 : MyClass2
{
    public int z = 2;
}

class inheritance02
{
    public static void Main()
    {
        MyClass3 mc3 = new MyClass3();

        MyClass1 mc1;
        mc1 = mc3;
        Console.WriteLine("x = {0}", mc1.x);

        MyClass2 mc2;
        mc2 = mc3; //同じものを代入しているのにできることが増えている
        Console.WriteLine("x = {0}, y = {1}", mc2.x, mc2.y);

        Console.WriteLine("x = {0}, y = {1}, z = {2}", mc3.x, mc3.y, mc3.z);
    }
}
