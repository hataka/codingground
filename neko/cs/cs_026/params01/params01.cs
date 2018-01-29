// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:35 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_026/params01/params01.cs
 * url:  cs/cs_026/params01/params01.cs
 * created: Time-stamp: <2016-08-24 15:57:35 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_26.htm
 * description: 
 *
 *================================================================*/
// params01.cs

using System;

class MyAdd
{
    int sum;

    public int add(params int[] x)
    {
        sum = 0;
        for (int i = 0; i < x.Length; i++)
            sum += x[i];
        return sum;
    }
 }

class params01
{
    public static void Main()
    {
        MyAdd ma = new MyAdd();

        Console.WriteLine("{0} + {1} + {2} = {3}",
            1, 10, 5, ma.add(1, 10, 5));
        Console.WriteLine("引数なしの時 = {0}", ma.add());
        Console.WriteLine("{0} + {1} + {2} + ({3}) + {4} = {5}",
            2, 4, 6, -8, 10, ma.add(2, 4, 6, -8, 10));

        int[] ar = new int[3] { 2, 8, 10 };
        Console.WriteLine("配列の要素の合計 = {0}", ma.add(ar));
    }
}
