// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:52 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_055/calcdate02/calcdate02.cs
 * url:  cs/cs_055/calcdate02/calcdate02.cs
 * created: Time-stamp: <2016-08-24 15:57:52 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_55.htm
 * description: 
 *
 *================================================================*/
// calcdate02.cs

using System;

class calcdate02
{
    public static void Main()
    {
        DateTime dt = DateTime.Now;
        TimeSpan ts;

        for (int i = 0; i < 20; i++)
        {
            ts = new TimeSpan(i, 0, 0, 0);
            DateTime dtx = dt + ts;
            Console.WriteLine("今日から{0, 2}日後は{1}です", i, dtx.ToString("D"));
        }
    }
}
