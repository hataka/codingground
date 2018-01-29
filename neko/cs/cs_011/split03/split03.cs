// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:26 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_011/split03/split03.cs
 * url:  cs/cs_011/split03/split03.cs
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
// split03.cs

using System;

class split03
{
    public static void Main()
    {
        string str = "ab,,c";
        char[] sep = new char[] { ',' };

        string[] newstr = str.Split(sep, StringSplitOptions.None);
        Console.WriteLine("newstr[0] = {0}", newstr[0]);
        Console.WriteLine("newstr[1] = {0}", newstr[1]);
        Console.WriteLine("newstr[2] = {0}", newstr[2]);

        string[] otherstr = str.Split(sep, StringSplitOptions.RemoveEmptyEntries);
        Console.WriteLine("otherstr[0] = {0}", otherstr[0]);
        Console.WriteLine("otherstr[1] = {0}", otherstr[1]);
    }
}
