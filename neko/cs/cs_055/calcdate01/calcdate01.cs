// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:52 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_055/calcdate01/calcdate01.cs
 * url:  cs/cs_055/calcdate01/calcdate01.cs
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
// calcdate01.cs

using System;

class calcdate01
{
    public static void Main()
    {
        DateTime dt1 = new DateTime(1955, 5, 31);
        DateTime dt2 = DateTime.Now;

        TimeSpan ts = dt2 - dt1;

        Console.WriteLine("経過日数={0}日", ts.Days);
    }
}
