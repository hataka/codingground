// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:26 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_011/split02/split02.cs
 * url:  cs/cs_011/split02/split02.cs
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
// split02.cs

using System;

class split02
{
    public static void Main()
    {
        string str = "a,b,c,d,e,f,g,h,i,j,k";

        char[] sep = new char[] { ',' };
        string[] newstr = str.Split(sep, 3);

        Console.WriteLine("newstr[0] = {0}", newstr[0]);
        Console.WriteLine("newstr[1] = {0}", newstr[1]);
        Console.WriteLine("newstr[2] = {0}", newstr[2]);

        str = string.Concat(newstr);

        Console.WriteLine(str);
    }
}
