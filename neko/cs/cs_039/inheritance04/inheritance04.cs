// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:43 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_039/inheritance04/inheritance04.cs
 * url:  cs/cs_039/inheritance04/inheritance04.cs
 * created: Time-stamp: <2016-08-24 15:57:43 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_39.htm
 * description: 
 *
 *================================================================*/
// inheritance04.cs

using System;

class MyClass1
{
    protected int x;

    public MyClass1(int a)
    {
        Console.WriteLine("xを初期化します");
        x = a;
    }
}

class MyClass2 : MyClass1
{
    protected int y;

    public MyClass2() : base(10) 
    {
        Console.WriteLine("yを初期化します");
        y = 100;
    }

    public void show()
    {
        Console.WriteLine("x = {0}, y = {1}", x, y);
    }
}

class inheritance04
{
    public static void Main()
    {
        MyClass2 mc2 = new MyClass2();

        mc2.show();
    }
}
