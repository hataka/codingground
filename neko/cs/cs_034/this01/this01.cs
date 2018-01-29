// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:40 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_034/this01/this01.cs
 * url:  cs/cs_034/this01/this01.cs
 * created: Time-stamp: <2016-08-24 15:57:40 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_34.htm
 * description: 
 *
 *================================================================*/
// this01.cs

using System;

class MyClass
{
    public int x;

    public void show(int x)
    {
        Console.WriteLine("x = {0}", x);
        Console.WriteLine("this.x = {0}", this.x);
    }
}

class this01
{
    public static void Main()
    {
        MyClass mc = new MyClass();
        mc.x = 100;
        mc.show(20);
    }
}
