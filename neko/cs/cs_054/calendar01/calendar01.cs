// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:51 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_054/calendar01/calendar01.cs
 * url:  cs/cs_054/calendar01/calendar01.cs
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
// calendar01.cs

using System;
using System.Globalization;

class calendar01
{
    public static void Main()
    {
        CultureInfo ci = new CultureInfo("ja-JP");
        DateTime dt = DateTime.Now;

        ci.DateTimeFormat.Calendar = new JapaneseCalendar();

        Console.WriteLine(dt.ToString("F", ci));
    }
}
