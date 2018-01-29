// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:49 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_051/struct01/struct01.cs
 * url:  cs/cs_051/struct01/struct01.cs
 * created: Time-stamp: <2016-08-24 15:57:49 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_51.htm
 * description: 
 *
 *================================================================*/
// struct01.cs

using System;

struct MyStruct
{
    int struct_x;
    int[] ar;

    public int Show()
    {
        Console.WriteLine("struct_x = {0}", struct_x);
        return 0;
    }

    public int x
    {
        get
        {
            return struct_x;
        }
        set
        {
            struct_x = value;
        }
    }

    public int this[int n]
    {
        get
        {
            return ar[n];
        }
        set
        {
            ar[n] = value;
        }
    }

    public MyStruct(int a)
    {
        ar = new int[a];
        struct_x = 0;
    }
}

class struct01
{
    public static void Main()
    {
        // 独自のコンストラクタの使用
        MyStruct ms = new MyStruct(5);

        // プロパティの使用
        ms.x = 10;
        Console.WriteLine("struct_x = {0}", ms.x);

        // メソッドの使用
        ms.Show();

        // インデクサの使用
        for (int i = 0; i < 5; i++)
            ms[i] = i * 10;

        for (int i = 0; i < 5; i++)
        {
            Console.WriteLine("ms[{0}] = {1}", i, ms[i]);
        }
    }
}
