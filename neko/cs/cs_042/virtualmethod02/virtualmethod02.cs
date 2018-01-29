// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:44 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_042/virtualmethod02/virtualmethod02.cs
 * url:  cs/cs_042/virtualmethod02/virtualmethod02.cs
 * created: Time-stamp: <2016-08-24 15:57:44 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_42.htm
 * description: 
 *
 *================================================================*/
// virtualmethod02.cs

using System;

class MyClass1
{
    public virtual void show()
    {
        Console.WriteLine("MyClass1");
    }
}

class MyClass2 : MyClass1
{
    public override void show()
    {
        Console.WriteLine("MyClass2");
    }
}

class MyClass3 : MyClass2
{
    public override void show()
    {
        Console.WriteLine("MyClass3");
    }
}

class virtualmethod02
{
    public static void Main()
    {
        MyClass3 mc3 = new MyClass3();
        MyClass2 mc2 = new MyClass2();
        MyClass1 mc1 = new MyClass1();

        MyClass1 mcx;

        mcx = mc1;
        mcx.show();

        mcx = mc2;
        mcx.show();

        mcx = mc3;
        mcx.show();
    }
}
