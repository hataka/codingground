// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:40 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_034/this02/this02.cs
 * url:  cs/cs_034/this02/this02.cs
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
// this02.cs

using System;

class MyClass
{
    int x, y, z;

    public MyClass()
    {
        Console.WriteLine("引数なしコンストラクタが呼ばれました");
        x = 1;
        y = 1;
        z = 1;
    }
    public MyClass(int a)
        : this()
    {
        x = a;
    }

    public MyClass(int a, int b)
        : this()
    {
        x = a;
        y = b;
    }

    public MyClass(int a, int b, int c)
    {
        x = a;
        y = b;
        z = c;
    }

    public void show()
    {
        Console.WriteLine("x = {0}, y = {1}, z = {2}", x, y, z);
    }
}



class this02
{
    public static void Main()
    {
        string strLine = "-------------------";

        MyClass mc1 = new MyClass();
        mc1.show();

        Console.WriteLine(strLine);

        MyClass mc2 = new MyClass(5);
        mc2.show();

        Console.WriteLine(strLine);

        MyClass mc3 = new MyClass(10, 20);
        mc3.show();

        Console.WriteLine(strLine);

        MyClass mc4 = new MyClass(100, 200, 300);
        mc4.show();
        
    }
}
