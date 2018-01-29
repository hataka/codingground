// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:22 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_005/cast02/cast02.cs
 * url:  cs/cs_005/cast02/cast02.cs
 * created: Time-stamp: <2016-08-24 15:57:22 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_05.htm
 * description: 
 *
 *================================================================*/
// cast02.cs

using System;

class cast02
{
    public static void Main()
    {
        int x = 10, y = 3;
        double z;

        z = x / y;
        Console.WriteLine("{0} / {1} = {2}", x, y, z);

        z = (double)(x / y);
        Console.WriteLine("{0} / {1} = {2}", x, y, z);

        z = ((double)x) / y;
        Console.WriteLine("{0} / {1} = {2}", x, y, z);
    }
}
