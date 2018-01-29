// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:36 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_028/kaijo02/kaijo02.cs
 * url:  cs/cs_028/kaijo02/kaijo02.cs
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
// kaijo02.cs

using System;

class Kaijo
{
    public int calc(int n)
    {
        int seki = 1;

        if (n == 0)
            return 1;

        for (int i = 1; i <= n; i++)
            seki *= i;

        return seki;
    }
}

class kaijo02
{
    public static void Main()
    {
        Kaijo kai = new Kaijo();

        for (int i = 0; i < 10; i++)
            Console.WriteLine("{0}! = {1}", i, kai.calc(i));
    }
}
