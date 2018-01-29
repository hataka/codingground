// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:44 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_041/hideprop01/hideprop01.cs
 * url:  cs/cs_041/hideprop01/hideprop01.cs
 * created: Time-stamp: <2016-08-24 15:57:44 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_41.htm
 * description: 
 *
 *================================================================*/
// hideprop01.cs

using System;

class MyClass1
{
    int x;
    int[] arr = new int[3];

    public int setx
    {
        get
        {
            Console.WriteLine("MyClass1です。xの値を返します。");
            return x;
        }
        set
        {
            Console.WriteLine("MyClass1です。xに値を代入します。");
            x = value;
        }
    }
    public int this[int index]
    {
        get
        {
            Console.WriteLine("MyClass1です。arr[{0}]の値を返します。",
                index);
            return arr[index];
        }
        set
        {
            Console.WriteLine("MyClass1です。arr[{0}]に値を代入します。",
                index);
            arr[index] = value;
        }
    }
}

class MyClass2 : MyClass1
{
    int x;
    int[] arr = new int[3];

    new public int setx
    {
        get
        {
            Console.WriteLine("MyClass2です。xの値を返します。");
            return x;
        }
        set
        {
            Console.WriteLine("MyClass2です。xに値を代入します。");
            x = value;
        }
    }

    new public int this[int index]
    {
        get
        {
            Console.WriteLine("MyClass2です。arr[{0}]の値を返します。",
                index);
            return arr[index];
        }
        set
        {
            Console.WriteLine("MyClass2です。arr[{0}]の値に代入します。",
                index);
            arr[index] = value;
        }
    }
}

class hideprop01
{
    public static void Main()
    {
        MyClass2 mc2 = new MyClass2();

        mc2.setx = 10;

        for (int i = 0; i < 3; i++)
            mc2[i] = i * 10;

        MyClass1 mc1;
        mc1 = mc2;

        mc1.setx = 20;
        for (int i = 0; i < 3; i++)
            mc1[i] = i * 2;

        Console.WriteLine("mc2.setx = {0}", mc2.setx);
        Console.WriteLine("mc1.setx = {0}", mc1.setx);

        for (int i = 0; i < 3; i++)
            Console.WriteLine("mc2[{0}] = {1}", i, mc2[i]);
        for (int i = 0; i < 3; i++)
            Console.WriteLine("mc1[{0}] = {1}", i, mc1[i]);
            
    }
}
