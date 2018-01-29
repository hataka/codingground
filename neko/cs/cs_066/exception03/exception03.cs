// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:58 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_066/exception03/exception03.cs
 * url:  cs/cs_066/exception03/exception03.cs
 * created: Time-stamp: <2016-08-24 15:57:58 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_66.htm
 * description: 
 *
 *================================================================*/
// exception03.cs

using System;

class exception03
{
    public static void Main()
    {
        int[] ar = new int[3] { 1, 2, 3 };

        for (int i = 0; i < 5; i++)
        {
            try
            {
                Console.WriteLine("ar[{0}] = {1}", i, ar[i]);
                Console.WriteLine("ar[{0}] / {1} = {2}", i, i, ar[i] / i);
            }
            catch (IndexOutOfRangeException o)
            {
                Console.WriteLine(o.Message);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }
        Console.WriteLine("try-catchを抜けました");
    }
}
