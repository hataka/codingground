// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:24 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_008/string03/string03.cs
 * url:  cs/cs_008/string03/string03.cs
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
// string03.cs

using System;

class string03
{
    public static void Main()
    {
        string str = "猫でもわかるプログラミング";
        char[] c = new char[str.Length];

        str.CopyTo(0, c, 0, str.Length);
        string str2 = new string(c);

        Console.WriteLine(str2);
    }
}
