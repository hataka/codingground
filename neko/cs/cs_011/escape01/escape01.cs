// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:26 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_011/escape01/escape01.cs
 * url:  cs/cs_011/escape01/escape01.cs
 * created: Time-stamp: <2016-08-24 15:57:26 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_11.htm
 * description: 
 *
 *================================================================*/
// escape01.cs

using System;

class escape01
{
    public static void Main()
    {
        string str;
        string[] strarray = new string[] { "これは", "猫です" };
        string stra = "これは\t猫です\n";

        str = string.Join("\t", strarray);
        str = string.Concat(str, "\n");

        Console.Write(str);
        Console.Write(stra);
    }
}
