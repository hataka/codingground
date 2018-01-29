// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:46 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_045/delegate02/delegate02.cs
 * url:  cs/cs_045/delegate02/delegate02.cs
 * created: Time-stamp: <2016-08-24 15:57:46 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_45.htm
 * description: 
 *
 *================================================================*/
// delegate02.cs

using System;

delegate int Add(int x, int y);

class delegate02
{
    static int Calc(int a, int b)
    {
        return a + b;
    }

    public static void Main()
    {
        Add add = new Add(Calc);
        Console.WriteLine("3 + 10 = {0}", add(3, 10));
    }
}
