// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:33 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_023/field02/field02.cs
 * url:  cs/cs_023/field02/field02.cs
 * created: Time-stamp: <2016-08-24 15:57:33 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_23.htm
 * description: 
 *
 *================================================================*/
// field02.cs

using System;

class MyClass
{
    public static int x;
    public int y;

    public void Show()
    {
        Console.WriteLine("x = {0}, y = {1}", x, y);
    }
}

class field02
{
    public static void Main()
    {
        MyClass.x = 10;

        MyClass mc1 = new MyClass();
        mc1.y = 20;
        Console.WriteLine("1回目-------");
        mc1.Show();

        MyClass mc2 = new MyClass();
        Console.WriteLine("2回目-------");
        mc2.Show();

        MyClass mc3 = new MyClass();
        mc3.y = 500;
        Console.WriteLine("3回目-------");
        mc3.Show();

        mc3 = mc2;
        Console.WriteLine("4回目-------");
        mc3.Show();
    }
}
