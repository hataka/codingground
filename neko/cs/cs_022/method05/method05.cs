// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:33 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_022/method05/method05.cs
 * url:  cs/cs_022/method05/method05.cs
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
// method05.cs

using System;

class MyOut
{
    public void calc(int x, out int i, out int j, out int k)
    {
        i = x * 2;
        j = x * x;
        k = x * x * x;
    }
}

class method05
{
    public static void Main()
    {
        MyOut mo = new MyOut();
        int a = 3, x, y, z;

        mo.calc(a, out x, out y, out z);

        for (int i = 1; i <= 10; i++)
        {
            mo.calc(i, out x, out y, out z);
            Console.WriteLine("{0}の２倍は{1}, ２乗は{2}, ３乗は{3}",
                i, x, y, z);
        }

    }
}
