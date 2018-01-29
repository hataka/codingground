// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:30 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_017/foreach01/foreach01.cs
 * url:  cs/cs_017/foreach01/foreach01.cs
 * created: Time-stamp: <2016-08-24 15:57:30 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_17.htm
 * description: 
 *
 *================================================================*/
// foreach01.cs

using System;

class foreach01
{
    public static void Main()
    {
        string[] st = new string[] {"猫でも", "わかる", "プログラミング"};

        foreach (string s in st)
            Console.Write(s);
        Console.Write("\n");
    }
}
