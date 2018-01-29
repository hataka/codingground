// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:22 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_005/cast01/cast01.cs
 * url:  cs/cs_005/cast01/cast01.cs
 * created: Time-stamp: <2016-08-24 15:57:22 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_05.htm
 * description: 
 *
 *================================================================*/
// cast01.cs

using System;

class cast01
{
    public static void Main()
    {
        byte a;
        int b = 10;
        a = (byte)b;

        Console.WriteLine("a = {0}", a);

        // 256はbyte型の範囲を超え桁あふれが起る
        b = 256;
        a = (byte)b;
        Console.WriteLine("a = {0}", a);
    }
}
