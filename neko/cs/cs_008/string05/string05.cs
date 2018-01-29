// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:24 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_008/string05/string05.cs
 * url:  cs/cs_008/string05/string05.cs
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
// string05.cs

using System;

class string05
{
    public static void Main()
    {
        string str = "猫でもわかるプログラミング";
        string str2, str3;

        str2 = string.Copy(str);
        Console.WriteLine("str2 = {0}", str2);

        str3 = str2;
        Console.WriteLine("str3 = {0}", str3);
    }
}
