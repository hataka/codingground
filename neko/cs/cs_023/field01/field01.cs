// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:33 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_023/field01/field01.cs
 * url:  cs/cs_023/field01/field01.cs
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
// field01.cs

using System;

class MyClass
{
    int x;

    public void Show()
    {
        Console.WriteLine("x = {0}", x);
    }

    public void Set(int y)
    {
        x = y;
    }
}

class field01
{
    public static void Main()
    {
        MyClass mc = new MyClass();
        mc.Show();

        mc.Set(100);
        mc.Show();

    }
}
