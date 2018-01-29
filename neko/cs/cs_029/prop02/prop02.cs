// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:37 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_029/prop02/prop02.cs
 * url:  cs/cs_029/prop02/prop02.cs
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
// prop02.cs

using System;

class MyProp
{
    int x;

    public int age
    {
        get
        {
            return x;
        }
        set
        {
            if (value >= 0)
                x = value;
        }
    }
}

class prop02
{
    public static void Main()
    {
        MyProp mp = new MyProp();
        mp.age = 20;

        Console.WriteLine("年齢は{0}歳です", mp.age);

        mp.age = -20;

        Console.WriteLine("年齢は{0}歳です", mp.age);
    }
}
