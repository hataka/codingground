// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:44 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_042/virtualmethod01/virtualmethod01.cs
 * url:  cs/cs_042/virtualmethod01/virtualmethod01.cs
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
// virtualmethod01.cs

using System;

class MyClass1
{
    public virtual void show()
    {
        Console.WriteLine("Class1のshow()");
    }
    public void xshow()
    {
        Console.WriteLine("MyClass1のxshow()");
    }
}

class MyClass2 : MyClass1
{
    public override void show()
    {
        Console.WriteLine("MyClass2のshow()");
    }

    new public void xshow()
    {
        Console.WriteLine("MyClass2のxshow()");
    }
}


class virtualmethod01
{
    public static void Main()
    {
        MyClass2 mc2 = new MyClass2();
        mc2.show();
        mc2.xshow();

        Console.WriteLine("--------");
        MyClass1 mc1;
        mc1 = mc2;
        mc1.show();
        mc1.xshow();
    }
}
