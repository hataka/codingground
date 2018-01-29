// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:31 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_020/simpleclass03/simpleclass03.cs
 * url:  cs/cs_020/simpleclass03/simpleclass03.cs
 * created: Time-stamp: <2016-08-24 15:57:31 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_20.htm
 * description: 
 *
 *================================================================*/
// simpleclass03.cs

using System;

class simpleclass03
{
    int x;
    static int y;

    public static void Main()
    {
        simpleclass03 sc = new simpleclass03();
        sc.x = 10;

        simpleclass03.y = 20;

        Console.WriteLine("sc.x = {0}, simpleclass03.y = {1}",
            sc.x, simpleclass03.y);
    }
}
