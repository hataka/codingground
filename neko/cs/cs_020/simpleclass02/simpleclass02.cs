// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:31 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_020/simpleclass02/simpleclass02.cs
 * url:  cs/cs_020/simpleclass02/simpleclass02.cs
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
// simpleclass02.cs

using System;

class MyClass
{
    public static int x;
}

class simpleclass02
{
    public static void Main()
    {
        MyClass.x = 10;

        Console.WriteLine("MyClass.x = {0}", MyClass.x);
    }
}
