// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:33 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_022/method04/method04.cs
 * url:  cs/cs_022/method04/method04.cs
 * created: Time-stamp: <2016-08-24 15:57:33 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_22.htm
 * description: 
 *
 *================================================================*/
// method04.cs

using System;

class Nijo
{
    public int calc(int a)
    {
        int b = a * a;
        return b;
    }
}

class method04
{
    public static void Main()
    {
        Nijo t = new Nijo();

        int x = 10;

        int z = t.calc(x);

        Console.WriteLine("{0}の２乗は{1}です", x, z);
        
    }
}
