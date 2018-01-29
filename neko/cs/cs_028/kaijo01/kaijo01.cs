// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:36 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_028/kaijo01/kaijo01.cs
 * url:  cs/cs_028/kaijo01/kaijo01.cs
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
// kaijo01.cs

using System;

class Kaijo
{
    public int kai(int n)
    {
        if (n <= 1)
            return 1;
        else
            return n * kai(n - 1);
    }
}

class kaijo01
{
    public static void Main()
    {
        Kaijo k = new Kaijo();

        for (int i = 0; i < 10; i++)
            Console.WriteLine("{0}! = {1}", i, k.kai(i));
    }
}
