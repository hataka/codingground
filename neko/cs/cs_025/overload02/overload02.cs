// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:35 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_025/overload02/overload02.cs
 * url:  cs/cs_025/overload02/overload02.cs
 * created: Time-stamp: <2016-08-24 15:57:35 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_25.htm
 * description: 
 *
 *================================================================*/
// overload02.cs

using System;

class MyClass
{
    public int add(int x)
    {
        return x;
    }
    public int add(int x, int y)
    {
        return x + y;
    }
    public int add(int x, int y, int z)
    {
        return x + y + z;
    }
}

class overload02
{
    public static void Main()
    {
        MyClass mc = new MyClass();
        Console.WriteLine("{0} = {1}", 10, mc.add(10));
        Console.WriteLine("{0} + {1} = {2}", 10, 20, mc.add(10, 20));
        Console.WriteLine("{0} + {1} + {2} = {3}", 10, 20, 30,
            mc.add(10, 20, 30));
    }
}
