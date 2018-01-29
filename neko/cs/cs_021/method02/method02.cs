// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:32 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_021/method02/method02.cs
 * url:  cs/cs_021/method02/method02.cs
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
// method02.cs

using System;

class MyClass
{
    public static void Show()
    {
        Console.WriteLine("Showメソッドが呼ばれました");
    }
}

class method02
{
    public static void Main()
    {
        MyClass.Show();
    }
}
