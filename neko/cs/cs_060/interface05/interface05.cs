// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:54 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_060/interface05/interface05.cs
 * url:  cs/cs_060/interface05/interface05.cs
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
// interface05.cs

using System;

public interface IInterface1
{
    void Show();
}

public interface IInterface2
{
    void Show();
}

class MyClass : IInterface1, IInterface2
{
    public void Show()
    {
        Console.WriteLine("Showメソッドです");
    }
}

class interface05
{
    public static void Main()
    {
        MyClass mc = new MyClass();

        mc.Show();
    }
}
