// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:23 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_007/format02/format02.cs
 * url:  cs/cs_007/format02/format02.cs
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
// format02.cs

using System;

class format02
{
    public static void Main()
    {
        int i = 123;
        double d = 123.45;
        double e = 10000000000;
        double f = 1254700000;
        int g = 01125472356;

        Console.WriteLine("i = {0}", i);
        Console.WriteLine("i = {0:0000.00} ---0000.00", i);
        Console.WriteLine("i = {0:####.##} ---####.##", i);
        Console.WriteLine();
        Console.WriteLine("d = {0}", d);
        Console.WriteLine("d = {0:.0000} ---.0000", d);
        Console.WriteLine("d = {0:####.#} ---####.#", d);
        Console.WriteLine();
        Console.WriteLine("e = {0}", e);
        Console.WriteLine("e = {0:0,0} ---0,0", e);
        Console.WriteLine("e = {0:0,} ---0,", e);
        Console.WriteLine("e = {0:0,0,} ---0,0,", e);
        Console.WriteLine("e = {0:0,0,,} ---0,0,,", e);
        Console.WriteLine("e = {0:0,0,,,} ---0,0,,,", e);
        Console.WriteLine("e = {0:0,0,,,,} ---0,0,,,,", e);
        Console.WriteLine("e = {0:#,#} ---#,#", e);
        Console.WriteLine();
        Console.WriteLine("f = {0}", f);
        Console.WriteLine("f = {0:e} ---e", f);
        Console.WriteLine("f = {0:0.0e+000000} ---0.0e+000000", f);
        Console.WriteLine();
        Console.WriteLine("g = {0}", g);
        Console.WriteLine("g = {0:(###)####-####} ---(###)####-####", g);
        Console.WriteLine("g = {0:(000)0000-0000} ---(000)0000-0000", g);
    }
}
