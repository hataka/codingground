// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:36 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_028/kyusu01/kyusu01.cs
 * url:  cs/cs_028/kyusu01/kyusu01.cs
 * created: Time-stamp: <2016-08-24 15:57:36 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_28.htm
 * description: 
 *
 *================================================================*/
// kyusu01.cs

using System;

class Kyusu
{
    public int calc(int n)
    {
        if (n == 0)
            return 0;
        else
            return n + calc(n - 1);

    }
}

class kyusu01
{
    public static void Main()
    {
        Kyusu ks = new Kyusu();
        
        for (int i = 0; i <= 20; i++)
            Console.WriteLine("f({0, 2}) = {1, 3}", i, ks.calc(i));
    }
}
