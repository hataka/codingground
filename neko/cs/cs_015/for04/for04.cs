// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:29 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_015/for04/for04.cs
 * url:  cs/cs_015/for04/for04.cs
 * created: Time-stamp: <2016-08-24 15:57:29 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_15.htm
 * description: 
 *
 *================================================================*/
// for04.cs

using System;

class for04
{
    public static void Main()
    {
        int i = 0;

        for( ; i < 5; )
        {
            Console.WriteLine("猫でもわかるプログラミング[{0}]", i);
            i++;
        }

        Console.WriteLine("-----");

        for (i = 0; ; i++)
        {
            if (i >= 5)
                break;
            Console.WriteLine("猫でもわかるプログラミング[{0}]", i);
        }

        Console.WriteLine("-----");

        i = 0;
        for ( ; ; )
        {
            Console.WriteLine("猫でもわかるプログラミング[{0}]", i);
            i++;
            if (i >= 5)
                break;
            
        }

    }
}
