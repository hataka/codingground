// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:33 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_022/swap01/swap01.cs
 * url:  cs/cs_022/swap01/swap01.cs
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
// swap01.cs

using System;

class MySwap
{
    public int myswap(int x, int y)
    {
        int temp;
        temp = x;
        x = y;
        y = temp;
        Console.WriteLine("myswap: x = {0}, y = {1}", x, y);
        return 0;
    }
}

class swap01
{
    public static void Main()
    {
        MySwap ms = new MySwap();

        int x = 10, y = 20;
        ms.myswap(x, y);

        Console.WriteLine("Main: x = {0}, y = {1}", x, y); 
    }
}
