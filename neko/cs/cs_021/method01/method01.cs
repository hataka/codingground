// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:32 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_021/method01/method01.cs
 * url:  cs/cs_021/method01/method01.cs
 * created: Time-stamp: <2016-08-24 15:57:32 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_21.htm
 * description: 
 *
 *================================================================*/
// method01.cs

using System;

class MyClass
{
    public void Show()
    {
        Console.WriteLine("Showメソッドが呼ばれました");
    }
}

class method01
{
    public static void Main()
    {
        MyClass mc = new MyClass();

        mc.Show();
    }
}
