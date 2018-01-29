// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:25 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_009/string11/string11.cs
 * url:  cs/cs_009/string11/string11.cs
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
// string11.cs

using System;

class string11
{
    public static void Main()
    {
        string str = "今日は、暑い一日でした", very = "大変";

        Console.WriteLine(str.Insert(4, very));
    }
}
