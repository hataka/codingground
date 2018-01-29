// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:46 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_045/delegate01/delegate01.cs
 * url:  cs/cs_045/delegate01/delegate01.cs
 * created: Time-stamp: <2016-08-24 15:57:46 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_45.htm
 * description: 
 *
 *================================================================*/
// delegate01.cs

using System;

delegate void MyDelegate(string str);

class MyClass
{

    public void show(string s)
    {
        Console.WriteLine(s + "です。");
    }
}

class delegate01
{
    public static void Main()
    {
        MyClass mc = new MyClass();

        MyDelegate md = new MyDelegate(mc.show);

        md("よい天気");
    }
}
