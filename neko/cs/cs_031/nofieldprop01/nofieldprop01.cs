// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:38 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_031/nofieldprop01/nofieldprop01.cs
 * url:  cs/cs_031/nofieldprop01/nofieldprop01.cs
 * created: Time-stamp: <2016-08-24 15:57:38 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_31.htm
 * description: 
 *
 *================================================================*/
// nofieldprop01.cs

using System;

class MyProp
{
    public int age
    {
        get
        {
            return 20;
        }
    }
}

class nofield01
{
    public static void Main()
    {
        MyProp mp = new MyProp();

        Console.WriteLine("mp.age = {0}", mp.age);
    }
}
