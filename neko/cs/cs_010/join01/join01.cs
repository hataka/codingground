// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:25 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_010/join01/join01.cs
 * url:  cs/cs_010/join01/join01.cs
 * created: Time-stamp: <2016-08-24 15:57:25 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_10.htm
 * description: 
 *
 *================================================================*/
// join01.cs

using System;

class join01
{
    public static void Main()
    {
        string[] strarray = { "猫", "でも", "わかる", "プログラミング"};
        

        string str1 = string.Join("-", strarray);
        Console.WriteLine(str1);

        string str2 = string.Join("!!", strarray, 2, 2);
        Console.WriteLine(str2);
    }
}
