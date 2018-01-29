// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:41 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_037/inheritance01/inheritance01.cs
 * url:  cs/cs_037/inheritance01/inheritance01.cs
 * created: Time-stamp: <2016-08-24 15:57:41 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_37.htm
 * description: 
 *
 *================================================================*/
// inheritance01.cs

using System;

class MyClass
{
    protected int x;

    public void show()
    {
        Console.WriteLine("x = {0}", x);
    }

    public int setx
    {
        set
        {
            x = value;
        }
    }
}

class MyChild : MyClass
{
    int y;

    public void show2()
    {
        Console.WriteLine("x = {0}, y = {1}", x, y);
    }

    public int sety
    {
        set
        {
            y = value;
        }
    }
}

class inheritance01
{
    public static void Main()
    {
        MyChild mc = new MyChild();

        mc.setx = 10;
        mc.sety = 20;
        mc.show();
        mc.show2();

        Console.Write("\n");

        MyClass myclass = new MyClass();
        myclass.setx = 100;
        myclass.show();
    }
}
