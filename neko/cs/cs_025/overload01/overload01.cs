// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:35 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_025/overload01/overload01.cs
 * url:  cs/cs_025/overload01/overload01.cs
 * created: Time-stamp: <2016-08-24 15:57:35 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_25.htm
 * description: 
 *
 *================================================================*/
// overload01.cs

using System;

class Sq
{
    public static int sq(int x)
    {
        Console.WriteLine("intバージョンが呼ばれました");
        return x * x;
    }
    public static double sq(double x)
    {
        Console.WriteLine("doubleバージョンが呼ばれました");
        return x * x;
    }
}

class overload01
{
    public static void Main()
    {
        Console.WriteLine("{0}の２乗は{1}です", 5, Sq.sq(5));
        Console.WriteLine("{0}の２乗は{1}です", 0.5, Sq.sq(0.5));
    }
}
