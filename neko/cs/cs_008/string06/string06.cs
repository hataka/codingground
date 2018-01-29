// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:24 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_008/string06/string06.cs
 * url:  cs/cs_008/string06/string06.cs
 * created: Time-stamp: <2016-08-24 15:57:24 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_08.htm
 * description: 
 *
 *================================================================*/
// string06.cs

using System;

class string06
{
    public static void Main()
    {
        string str1 = "abc", str2 = "abc", str3 = "bcd", str4 = "5";
        str2 = "abc";

        Console.WriteLine(str1.CompareTo(str2));
        Console.WriteLine(str1.CompareTo(str3));
        Console.WriteLine(str1.CompareTo(str4));
    }
}
