// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:57 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_065/exception01/exception01.cs
 * url:  cs/cs_065/exception01/exception01.cs
 * created: Time-stamp: <2016-08-24 15:57:57 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_65.htm
 * description: 
 *
 *================================================================*/
// exception01.cs

using System;

class exception01
{
    public static void Main()
    {
        int x, y, z;

        try
        {
            x = 100;
            y = 0;
            z = x / y;
        }
        catch
        {
            Console.WriteLine("例外が発生しました");
        }

        Console.WriteLine("何事もなかったように続きの処理をします");
    }
}
