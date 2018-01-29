// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:50 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_052/datetime01/datetime01.cs
 * url:  cs/cs_052/datetime01/datetime01.cs
 * created: Time-stamp: <2016-08-24 15:57:50 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_52.htm
 * description: 
 *
 *================================================================*/
// datetime01.cs

using System;

class datetime01
{
    public static void Main()
    {
        DateTime dt;
        string[] dtformat = new string[]{
            "D", "d", "F", "f", "G", "g", "U", "u", "Y", "y", "M", "m",
            "T", "t"};

        dt = DateTime.Now;

        for (int i = 0; i < dtformat.Length; i++)
            Console.WriteLine("{0}:  {1}",
                dtformat[i], dt.ToString(dtformat[i]));
    }
}
