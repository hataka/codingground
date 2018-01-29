// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:52 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_055/setdate01/setdate01.cs
 * url:  cs/cs_055/setdate01/setdate01.cs
 * created: Time-stamp: <2016-08-24 15:57:52 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_55.htm
 * description: 
 *
 *================================================================*/
// setdate01.cs

using System;

class setdate01
{
    public static void Main()
    {
        DateTime dt = new DateTime(1955,5,31);
        Console.WriteLine(dt.ToString("F"));

        dt = new DateTime(1955, 5, 31, 13, 15, 0);
        Console.WriteLine(dt.ToString("F"));

        dt = DateTime.Parse("12:15");
        Console.WriteLine(dt.ToString("F"));

        dt = DateTime.Parse("2006/12/31 23:59:59");
        Console.WriteLine(dt.ToString("F"));

        dt = DateTime.Parse("昭和30年5月31日");
        Console.WriteLine(dt.ToString("F"));
    }
}
