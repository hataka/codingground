// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:33 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_022/swap02/swap02.cs
 * url:  cs/cs_022/swap02/swap02.cs
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
// swap02.cs

using System;

class MySwap
{
    unsafe public void myswap(int *x, int *y)
    {
        int temp;
        temp = *x;
        *x = *y;
        *y = temp;
    }
}


class swap02
{
    unsafe public static void Main()
    {
        int x = 10, y = 20;

        MySwap ms = new MySwap();

        ms.myswap(&x, &y);
        Console.WriteLine("x = {0}, y = {1}", x, y);

    }
}
