// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:31 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_020/simpleclass01/simpleclass01.cs
 * url:  cs/cs_020/simpleclass01/simpleclass01.cs
 * created: Time-stamp: <2016-08-24 15:57:31 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_20.htm
 * description: 
 *
 *================================================================*/
// simpleclass01.cs

using System;

class MyClass
{
    public int x;
}

class simpleclass01
{
    public static void Main()
    {
        MyClass myclass = new MyClass();

        myclass.x = 10;

        Console.WriteLine("myclass.x = {0}", myclass.x);
    }
}
