// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:45 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_043/virtualprop01/virtualprop01.cs
 * url:  cs/cs_043/virtualprop01/virtualprop01.cs
 * created: Time-stamp: <2016-08-24 15:57:45 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_43.htm
 * description: 
 *
 *================================================================*/
// virtualprop01.cs

using System;

class MyClass1
{
    int xx;

    public virtual int x
    {
        get
        {
            //Console.WriteLine("MyClass1");
            return xx;
        }
        set
        {
            xx = value;
        }
    }
}

class MyClass2 : MyClass1
{
    int yy;

    public override int x
    {
        get
        {
            return yy;
        }
        set
        {
            yy = value;
        }
    }
}

class virtualprop01
{
    public static void Main()
    {
        MyClass1 mc1 = new MyClass1();
        MyClass2 mc2 = new MyClass2();

        mc1.x = 10;
        mc2.x = 100;
        Console.WriteLine("mc1.x = {0}", mc1.x);
        Console.WriteLine("mc2.x = {0}", mc2.x);

        MyClass1 mcx;

        mcx = mc1;
        Console.WriteLine("mcx.x = {0}", mcx.x);

        mcx = mc2;
        Console.WriteLine("mcx.x = {0}", mcx.x);
    }
}
