// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:25 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_009/string10/string10.cs
 * url:  cs/cs_009/string10/string10.cs
 * created: Time-stamp: <2016-08-24 15:57:25 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_09.htm
 * description: 
 *
 *================================================================*/
// string10.cs

using System;

class string10
{
    public static void Main()
    {
        string str = "This Is A Pen.";
        string strSmall, strBig;

        strSmall = str.ToLower();
        Console.WriteLine(strSmall);

        strBig = str.ToUpper();
        Console.WriteLine(strBig);
    }
}
