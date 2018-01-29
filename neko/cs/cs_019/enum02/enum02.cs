// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:31 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_019/enum02/enum02.cs
 * url:  cs/cs_019/enum02/enum02.cs
 * created: Time-stamp: <2016-08-24 15:57:31 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_19.htm
 * description: 
 *
 *================================================================*/
// enum02.cs

using System;

class enum02
{
    enum myenum : sbyte {a = -20, b, c = -10, d, e = 20};

    public static void Main()
    {
        Console.WriteLine((sbyte)myenum.a);
        Console.WriteLine((sbyte)myenum.b);
        Console.WriteLine((sbyte)myenum.c);
        Console.WriteLine((sbyte)myenum.d);
        Console.WriteLine((sbyte)myenum.e);
    }
}
