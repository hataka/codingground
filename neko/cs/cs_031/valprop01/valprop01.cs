// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:38 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_031/valprop01/valprop01.cs
 * url:  cs/cs_031/valprop01/valprop01.cs
 * created: Time-stamp: <2016-08-24 15:57:38 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_31.htm
 * description: 
 *
 *================================================================*/
// valprop01.cs

using System;

class MyClass
{
    int n = 2;
    string[] arr = new string[3];

    public int x
    {
        get
        {
            int val; //アクセッサ内で変数の宣言可能
            val = n * 10;
            return val;
        }
        set
        {
            int y;
            y = value * 20;
            n = y;
        }
    }

    public string this[int n]
    {
        get
        {
            string add = "です";
            return arr[n] + add;
        }
        set
        {
            string sama;
            sama = value + "様";
            arr[n] = sama;
        }
    }
}

class valprop01
{
    public static void Main()
    {
        MyClass mc = new MyClass();

        mc.x = 10;
        Console.WriteLine("mc.x = {0}", mc.x);

        mc[0] = "粂井";
        Console.WriteLine("mc[0] = 「{0}」", mc[0]);
    }
}
