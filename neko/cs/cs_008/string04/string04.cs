// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:24 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_008/string04/string04.cs
 * url:  cs/cs_008/string04/string04.cs
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
// string04.cs

using System;

class string04
{
    public static void Main()
    {
        string str = "猫でもわかるプログラミング";
        string str2, str3;

        str2 = str.Substring(6);
        str3 = str.Substring(6, 2);

        Console.WriteLine("str2 = {0}", str2);
        Console.WriteLine("str3 = {0}", str3);
    }
}
