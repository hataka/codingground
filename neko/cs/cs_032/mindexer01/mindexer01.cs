// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:39 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_032/mindexer01/mindexer01.cs
 * url:  cs/cs_032/mindexer01/mindexer01.cs
 * created: Time-stamp: <2016-08-24 15:57:39 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_32.htm
 * description: 
 *
 *================================================================*/
// mindexer01.cs

using System;

class MyClass
{
    int[,] array;

    public int this[int x, int y]
    {
        get
        {
            return array[x, y];
        }
        set
        {
            array[x, y] = value;
        }
    }
    public MyClass(int a, int b)
    {
        array = new int[a, b];
    }
}

class mindexer01
{
    public static void Main()
    {
        MyClass mc = new MyClass(4, 4);

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                mc[i, j] = i + j;
            }
        }

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                Console.WriteLine("{0} + {1} = {2}", i, j, mc[i, j]);
            }
        }
    }
}
