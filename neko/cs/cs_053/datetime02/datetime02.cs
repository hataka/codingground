// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:51 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_053/datetime02/datetime02.cs
 * url:  cs/cs_053/datetime02/datetime02.cs
 * created: Time-stamp: <2016-08-24 15:57:51 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_53.htm
 * description: 
 *
 *================================================================*/
// datetime02.cs

using System;

class datetime02
{
    public static void Main()
    {
        DateTime dt;


        string[] dtformat = new string[]{
            "d", "dd", "ddd", "dddd", "ddddd",
            "f", "ff", "fff", "ffff", "fffff", "ffffff", "fffffff",
            "F", "FF", "FFF", "FFFF", "FFFFF", "FFFFFF", "FFFFFFF",
            "g", "gg",
            "hh",
            "m", "mm", 
            "M", "MM", "MMM", "MMMM",
            "s", "ss",
            "t", "tt", "ttt",
            "y", "yy", "yyy", "yyyy",
            "yy/MM/dd h:m:s",
            "ggyyyy年MMMMdd日(dddd)"};

        dt = DateTime.Now;

        for (int i = 0; i < dtformat.Length; i++)
            Console.WriteLine("{0,7}:  {1}",
                dtformat[i], dt.ToString(dtformat[i]));
    }
}
