// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:53 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_058/interface03/interface03.cs
 * url:  cs/cs_058/interface03/interface03.cs
 * created: Time-stamp: <2016-08-24 15:57:53 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_58.htm
 * description: 
 *
 *================================================================*/
// interface03.cs

using System;

public interface IMyInterface
{
    int SetNo { set;}
    int GetNo { get;}
    int this[int index] { get;set;}
}

class MyClass : IMyInterface
{
    int x;
    int[] arr;

    public int SetNo
    {
        set
        {
            x = value;
        }
    }

    public int GetNo
    {
        get
        {
            return x;
        }
    }

    public int this[int index]
    {
        get
        {
            return arr[index];
        }
        set
        {
            arr[index] = value;
        }
    }

    public MyClass(int n)
    {
        arr = new int[n];
    }
}

class interface03
{
    public static void Main()
    {
        MyClass mc = new MyClass(3);

        mc.SetNo = 10;
        Console.WriteLine("mc.GetNo = {0}", mc.GetNo);

        for (int i = 0; i < 3; i++)
            mc[i] = (i + 1) * 10;

        for (int i = 0; i < 3; i++)
            Console.WriteLine("mc[{0}] = {1}", i, mc[i]);
    }
}
