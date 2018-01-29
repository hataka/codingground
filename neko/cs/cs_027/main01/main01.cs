// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:36 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_027/main01/main01.cs
 * url:  cs/cs_027/main01/main01.cs
 * created: Time-stamp: <2016-08-24 15:57:36 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_27.htm
 * description: 
 *
 *================================================================*/
// main01.cs

using System;

class main01
{
    public static void Main(string[] str)
    {
        for (int i = 0; i < str.Length; i++)
            Console.WriteLine("引数{0}は{1}です。", i + 1, str[i]);
    }
}
