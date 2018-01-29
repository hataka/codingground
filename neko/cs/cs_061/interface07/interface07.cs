// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:55 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_061/interface07/interface07.cs
 * url:  cs/cs_061/interface07/interface07.cs
 * created: Time-stamp: <2016-08-24 15:57:55 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_61.htm
 * description: 
 *
 *================================================================*/
// interface07.cs

using System;

public interface IInterface1
{
    void Pulus(int x, int y, out int z);
}

public interface IInterface2 : IInterface1
{
    void Minus(int x, int y, out int z);
}

class MyClass : IInterface2
{
    public void Pulus(int x, int y, out int z)
    {
        z = x + y;
    }

    public void Minus(int x, int y, out int z)
    {
        z = x - y;
    }
}

class interface07
{
    public static void Main()
    {
        MyClass mc = new MyClass();
        int ans;

        mc.Pulus(3, 5, out ans);
        Console.WriteLine("{0} + {1} = {2}", 3, 5, ans);

        mc.Minus(3, 5, out ans);
        Console.WriteLine("{0} - {1} = {2}", 3, 5, ans);

        Console.WriteLine("IInterface1の参照変数を利用");
        IInterface1 i1 = mc;

        i1.Pulus(3, 5, out ans);
        Console.WriteLine("{0} + {1} = {2}", 3, 5, ans);

        Console.WriteLine("IInterface2の参照変数を利用");
        IInterface2 i2 = mc;

        i2.Pulus(3, 5, out ans);
        Console.WriteLine("{0} + {1} = {2}", 3, 5, ans);

        i2.Minus(3, 5, out ans);
        Console.WriteLine("{0} - {1} = {2}", 3, 5, ans);

    }
}
