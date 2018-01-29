// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:26 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_011/replace01/replace01.cs
 * url:  cs/cs_011/replace01/replace01.cs
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
// replace01.cs

using System;

class replace01
{
    public static void Main()
    {
        string str = "犬は賢く、ねこは賢くない";

        str = str.Replace('は', 'が');
        Console.WriteLine(str);

        str = str.Replace("犬が", "牛は");
        Console.WriteLine(str);
    }
}
