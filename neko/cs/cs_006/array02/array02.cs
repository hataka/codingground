// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:23 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_006/array02/array02.cs
 * url:  cs/cs_006/array02/array02.cs
 * created: Time-stamp: <2016-08-24 15:57:23 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_06.htm
 * description: 
 *
 *================================================================*/
// array02.cs

using System;

class array02
{
    public static void Main()
    {
        int[,] myarray = new int[2, 3]{{1, 2, 3}, {10, 11, 12}};

        Console.WriteLine("myarray[0, 0] = {0}", myarray[0, 0]);
        Console.WriteLine("myarray[0, 1] = {0}", myarray[0, 1]);
        Console.WriteLine("myarray[0, 2] = {0}", myarray[0, 2]);
        Console.WriteLine("myarray[1, 0] = {0}", myarray[1, 0]);
        Console.WriteLine("myarray[1, 1] = {0}", myarray[1, 1]);
        Console.WriteLine("myarray[1, 2] = {0}", myarray[1, 2]);

        Console.WriteLine("myarray.Length = {0}", myarray.Length);
        Console.WriteLine("myarray.Rank = {0}", myarray.Rank);
    }
}
