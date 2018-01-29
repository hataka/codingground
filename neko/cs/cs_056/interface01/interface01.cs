// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:52 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_056/interface01/interface01.cs
 * url:  cs/cs_056/interface01/interface01.cs
 * created: Time-stamp: <2016-08-24 15:57:52 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_56.htm
 * description: 
 *
 *================================================================*/
// interface01.cs

using System;

public interface IMyInterface
{
    double Pulus(double a, double b);
}

class MyClass : IMyInterface
{
    public double Pulus(double x, double y)
    {
        return x + y;
    }
}

class interface01
{
    public static void Main()
    {
        MyClass mc = new MyClass();
        string strFormat = "{0} + {1} = {2}";

        Console.WriteLine(strFormat, 100, 200, mc.Pulus(100, 200));
        Console.WriteLine(strFormat, 10.5, 12.5, mc.Pulus(10.5, 12.5));
    }
}
