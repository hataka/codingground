// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:24 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_008/string07/string07.cs
 * url:  cs/cs_008/string07/string07.cs
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
// string07.cs

using System;

class string07
{
    public static void Main()
    {
        string str1 = "abc", str2 = "abc", str3 = "bcd", str4 = "5";

        Console.WriteLine(string.Compare(str1, str2));
        Console.WriteLine(string.Compare(str1, str3));
        Console.WriteLine(string.Compare(str1, str4));
    }
}
