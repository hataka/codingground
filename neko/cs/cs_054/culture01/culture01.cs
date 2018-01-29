// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:51 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_054/culture01/culture01.cs
 * url:  cs/cs_054/culture01/culture01.cs
 * created: Time-stamp: <2016-08-24 15:57:51 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_54.htm
 * description: 
 *
 *================================================================*/
// culture01.cs

using System;
using System.Globalization;

class culture01
{
    public static void Main()
    {
        CultureInfo ci;
        DateTime now = System.DateTime.Now;

        string[] strcul = {
            "ja-JP", "en-US", "de-DE","zh-CN"};

        for (int i = 0; i < strcul.Length; i++)
        {
            ci = new CultureInfo(strcul[i]);
            Console.WriteLine("{0}:{1}", strcul[i], now.ToString("F", ci));
            Console.WriteLine("{0}:{1}", strcul[i], now.ToString("MMMM dd (dddd)", ci));
            Console.Write("\n");
        }
    }
}
