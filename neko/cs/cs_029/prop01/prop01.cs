// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:37 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_029/prop01/prop01.cs
 * url:  cs/cs_029/prop01/prop01.cs
 * created: Time-stamp: <2016-08-24 15:57:37 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_29.htm
 * description: 
 *
 *================================================================*/
// prop01.cs

using System;

class MyClass
{
    int x;

    public void setvalue(int y)
    {
        x = y;
    }
    public void show()
    {
        Console.WriteLine("x = {0}");
    }
}

class prop01
{
    public static void Main()
    {
        MyClass mc = new MyClass();

        mc.setvalue(100);
        mc.show();
    }
}
