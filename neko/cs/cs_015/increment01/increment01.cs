// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:28 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_015/increment01/increment01.cs
 * url:  cs/cs_015/increment01/increment01.cs
 * created: Time-stamp: <2016-08-24 15:57:28 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_15.htm
 * description: 
 *
 *================================================================*/
// increment01.cs

using System;

class incremet01
{
    public static void Main()
    {
        int a = 10;

        Console.WriteLine("a = {0}", a++);
        Console.WriteLine("a = {0}", a);

        Console.WriteLine("---------------");

        a = 10;
        Console.WriteLine("a = {0}", ++a);
        Console.WriteLine("a = {0}", a);
    }
}
