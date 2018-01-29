// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:54 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_060/interface06/interface06.cs
 * url:  cs/cs_060/interface06/interface06.cs
 * created: Time-stamp: <2016-08-24 15:57:54 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_60.htm
 * description: 
 *
 *================================================================*/
// interface06.cs

using System;

public interface IInterface1
{
    void Show(string s);
}

public interface IInterface2
{
    void Show(string s);
}

class MyClass : IInterface1, IInterface2
{
    void IInterface1.Show(string s)
    {
        Console.WriteLine(s + "です");
    }

    void IInterface2.Show(string s)
    {
        Console.WriteLine(s + "だ");
    }
}

class interface06
{
    public static void Main()
    {
        MyClass mc = new MyClass();

        IInterface1 i1 = mc;
        
        i1.Show("テスト");

        IInterface2 i2 = mc;

        i2.Show("テスト");

    }
}
