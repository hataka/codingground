// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:43 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_039/inheritance03/inheritance03.cs
 * url:  cs/cs_039/inheritance03/inheritance03.cs
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
// inheritance03.cs

using System;

class MyClass1
{
    protected int x;

    public MyClass1()
    {
        Console.WriteLine("xを初期化します");
        x = 10;
    }
}

class MyClass2 : MyClass1
{
    protected int y;

    public MyClass2()
    {
        Console.WriteLine("yを初期化します");
        y = 100;
    }
}

class MyClass3 : MyClass2
{
    protected int z;

    public MyClass3()
    {
        Console.WriteLine("zを初期化します");
        z = 1000;
    }

    public void show()
    {
        Console.WriteLine("x = {0}, y = {1}, z = {2}",
            x, y, z);
    }
}

class inheritance03
{
    public static void Main()
    {
        MyClass3 mc3 = new MyClass3();

        mc3.show();
            
    }
}
