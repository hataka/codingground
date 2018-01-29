// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:32 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_021/method03/method03.cs
 * url:  cs/cs_021/method03/method03.cs
 * created: Time-stamp: <2016-08-24 15:57:32 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_21.htm
 * description: 
 *
 *================================================================*/
// method03.cs

using System;

class method03
{
    public static void Main()
    {
        method03 m3 = new method03();
        m3.Show1();

        Show2();
    }

    void Show1()
    {
        Console.WriteLine("Show1が呼び出されました");
    }

    static void Show2()
    {
        Console.WriteLine("Show2が呼び出されました");
    }
}
