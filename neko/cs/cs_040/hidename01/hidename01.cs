// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:43 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_040/hidename01/hidename01.cs
 * url:  cs/cs_040/hidename01/hidename01.cs
 * created: Time-stamp: <2016-08-24 15:57:43 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_40.htm
 * description: 
 *
 *================================================================*/
// hidename01.cs

using System;

class MyClass1
{
    public int x = 10;

    public int show()
    {
        Console.WriteLine("MyClass1のshowメソッドです");
        return 0;
    }
}

class MyClass2 : MyClass1
{
    new public int x = 20;

    new public int show()
    {
        Console.WriteLine("x = {0}", x);
        return 0;
    }

    public int callold()
    {
        Console.WriteLine("MyClass1のshowメソッドを呼び出します");
        base.show();
        Console.WriteLine("MyClass1のx = {0}", base.x);
        return 0;
    }
}

class hidename01
{
    public static void Main()
    {
        MyClass2 mc2 = new MyClass2();
        mc2.show();
        mc2.callold();

        Console.WriteLine("---------------");

        MyClass1 mc1; //MyClass1のインスタンスは生成していない
        mc1 = mc2;
        mc1.show();
        Console.WriteLine("MyClass1のxは{0}です", mc1.x);
    }
}
