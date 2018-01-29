// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:25 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_009/string08/string08.cs
 * url:  cs/cs_009/string08/string08.cs
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
// string08.cs

using System;

class string08
{
    public static void Main()
    {
        string str;
        int i = 125;
        string name = "吉田";

        str = string.Format("{0} * 100 = {1}", i, i * 100);
        Console.WriteLine(str);

        str = string.Format("{0}さんの所持金は{1:c}です", name, i);
        Console.WriteLine(str);
    }
}
