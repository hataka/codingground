// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:45 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_043/virtualindexer01/virtualindexer01.cs
 * url:  cs/cs_043/virtualindexer01/virtualindexer01.cs
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
// virtualindexer01.cs

using System;

class MyClass1
{
    string[] str = new string[2];

    public virtual string this[int n]
    {
        get
        {
            return str[n];
        }
        set
        {
            str[n] = value;
        }
    }
}

class MyClass2 : MyClass1
{
    string[] arr = new string[2];

    public override string this[int n]
    {
        get
        {
            return arr[n];
        }
        set
        {
            arr[n] = value;
        }
    }

}

class virtualindexer01
{
    public static void Main()
    {
        MyClass1 mc1 = new MyClass1();
        MyClass2 mc2 = new MyClass2();

        mc1[0] = "MyClass1";
        mc1[1] = "です";

        mc2[0] = "MyClass2";
        mc2[1] = "でございます";

        MyClass1 mcx;

        mcx = mc1;
        Console.Write(mcx[0]);
        Console.WriteLine(mcx[1]);

        mcx = mc2;
        Console.Write(mcx[0]);
        Console.WriteLine(mcx[1]);
    }
}
