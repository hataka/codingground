// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:23 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_007/format01/format01.cs
 * url:  cs/cs_007/format01/format01.cs
 * created: Time-stamp: <2016-08-24 15:57:23 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_07.htm
 * description: 
 *
 *================================================================*/
// format01.cs

using System;

class format01
{
    public static void Main()
    {
        double d = 1596.28;
        int i = 123;
        double e = 1.256E10;
        double f = 12.3;
        double g = 1234500000000.258;
        double p = 0.8569;
        double r = 12.15;
        int x = 255;

        Console.WriteLine("d = {0}", d);
        Console.WriteLine("d = {0:c} ---c", d);
        Console.WriteLine("d = {0:c4} ---c4", d);
        Console.WriteLine();
        Console.WriteLine("i = {0}", i);
        Console.WriteLine("i = {0:d} ---d", i);
        Console.WriteLine("i = {0:d5} ---d5", i);
        Console.WriteLine();
        Console.WriteLine("e = {0}", e);
        Console.WriteLine("e = {0:e2} ---e2", e);
        Console.WriteLine("e = {0:e5} ---e5", e);
        Console.WriteLine();
        Console.WriteLine("f = {0}", f);
        Console.WriteLine("f = {0:f} ---f", f);
        Console.WriteLine("f = {0:f5} ---f5", f);
        Console.WriteLine();
        Console.WriteLine("g = {0}", g);
        Console.WriteLine("g = {0:g} ---g", g);
        Console.WriteLine("g = {0:g7} ---g7", g);
        Console.WriteLine();
        Console.WriteLine("p = {0}", p);
        Console.WriteLine("p = {0:p2} ---p2", p);
        Console.WriteLine("p = {0:p4} ---p4", p);
        Console.WriteLine();
        Console.WriteLine("r = {0}", r);
        Console.WriteLine("r = {0:r} ---r", r);
        Console.WriteLine();
        Console.WriteLine("x = {0}", x);
        Console.WriteLine("x = {0:x} ---x", x);
        Console.WriteLine("x = {0:x8} ---x8", x);

    }
}
