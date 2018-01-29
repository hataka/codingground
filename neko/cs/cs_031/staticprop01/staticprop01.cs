// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:38 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_031/staticprop01/staticprop01.cs
 * url:  cs/cs_031/staticprop01/staticprop01.cs
 * created: Time-stamp: <2016-08-24 15:57:38 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_31.htm
 * description: 
 *
 *================================================================*/
// staticprop01.cs

using System;

class MyProp
{
    static int x;
    static int[] y = new int[10];
    public static int z;

    // プロパティはstaticにできる
    public static int age
    {
        get
        {
            return x;
        }
        set
        {
            x = value;
        }
    }

    //インデクサはstaticにできない
    public int this[int index]
    {
        get
        {
            return y[index];
        }
        set
        {
            y[index] = value;
        }
    }

    // インスタンスメソッドはstaticなフィールドにアクセスできる
    // 逆にインスタンスフィールドにstaticなメソッドはアクセスできない
    public int show()
    {
        return z;
    }
}

class staticprop01
{
    public static void Main()
    {
        MyProp.age = 20;
        Console.WriteLine("MyProp.age = {0}", MyProp.age);

        MyProp mp = new MyProp();
        mp[0] = 100;
        Console.WriteLine("mp[0] = {0}", mp[0]);

        MyProp.z = 100;
        Console.WriteLine("mp.show() = {0}", mp.show());
    }
}
