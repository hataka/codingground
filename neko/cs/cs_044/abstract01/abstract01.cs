// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:46 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_044/abstract01/abstract01.cs
 * url:  cs/cs_044/abstract01/abstract01.cs
 * created: Time-stamp: <2016-08-24 15:57:46 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_44.htm
 * description: 
 *
 *================================================================*/
// abstract01.cs

using System;

abstract class MyClassA
{
    public abstract void show();
}

class MyClass : MyClassA
{
    public override void show()
    {
        Console.WriteLine("showメソッドです");
    }
}

class abstract01
{
    public static void Main()
    {
        MyClass mc = new MyClass();

        mc.show();
    }
}
