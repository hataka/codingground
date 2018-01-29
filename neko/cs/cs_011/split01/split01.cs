// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:26 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_011/split01/split01.cs
 * url:  cs/cs_011/split01/split01.cs
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
// split01.cs

using System;

class split01
{
    public static void Main()
    {
        string str = "abc,def,gh\nijk\tlmn,opq\trst,uvw,xyz";

        char[] sep = new char[] { ',', '\n', '\t' };

        string[] newstr = str.Split(sep);

        str = string.Concat(newstr);
        Console.WriteLine(str);
    }
}
