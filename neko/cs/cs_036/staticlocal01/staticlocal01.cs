// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:41 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_036/staticlocal01/staticlocal01.cs
 * url:  cs/cs_036/staticlocal01/staticlocal01.cs
 * created: Time-stamp: <2016-08-24 15:57:41 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_36.htm
 * description: 
 *
 *================================================================*/
// staticlocal01.cs

using System;

class MyClass
{
    int x = 0;

    public void show1()
    {
        int x = 0;
        x++; // ローカル変数の値を1増やす
        Console.WriteLine("Local x = {0}", x);
    }
    public void show2()
    {
        x++; // インスタンスフィールドの値を1増やす
        Console.WriteLine("static x = {0}", x);
    }
}

class staticlocal01
{
    public static void Main()
    {
        MyClass mc = new MyClass();

        Console.WriteLine("mcでshow1メソッド呼び出し");
        for (int i = 0; i < 5; i++)
            mc.show1();

        Console.WriteLine("\nmcでshow2メソッド呼び出し");

        for (int i = 0; i < 5; i++)
            mc.show2();
    }
}
