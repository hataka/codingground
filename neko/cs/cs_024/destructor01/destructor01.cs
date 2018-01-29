// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:34 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_024/destructor01/destructor01.cs
 * url:  cs/cs_024/destructor01/destructor01.cs
 * created: Time-stamp: <2016-08-24 15:57:34 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_24.htm
 * description: 
 *
 *================================================================*/
// destructor01.cs

using System;

class MyClass
{
    public int x;

    ~MyClass()
    {
        Console.WriteLine("デストラクタが呼ばれました({0})", x);
    }
    public MyClass(int a)
    {
        x = a;
    }
}

class destructor01
{
    public static void Main()
    {
        MyClass[] mc = new MyClass[10];

        for (int i = 0; i < 10; i++)
        {
            mc[i] = new MyClass(i);
            Console.WriteLine("インスタンスを生成しましたmc[{0}]", i);
        }

    }
}
