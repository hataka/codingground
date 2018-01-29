// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:40 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_035/jag02/jag02.cs
 * url:  cs/cs_035/jag02/jag02.cs
 * created: Time-stamp: <2016-08-24 15:57:40 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_35.htm
 * description: 
 *
 *================================================================*/
// jag02.cs

using System;

class MyClass
{
    string[][] name;
    public int i;

    public int len
    {
        get
        {
            return name[i].Length;
        }
    }

    public string this[int a]
    {
        get
        {
            return name[i][a];
        }
        set
        {
            name[i][a] = value;
        }
    }
    
    public MyClass()
    {
        i = 0;
        name = new string[3][];
        name[0] = new string[2];
        name[1] = new string[3];
        name[2] = new string[2];
    }
}

class jag02
{
    public static void Main()
    {
        MyClass mc = new MyClass();

        mc.i = 0;
        mc[0] = "佐藤";
        mc[1] = "田中";
        mc.i = 1;
        mc[0] = "太田";
        mc[1] = "工藤";
        mc[2] = "吉田";
        mc.i = 2;
        mc[0] = "加藤";
        mc[1] = "伊藤";

        for (int i = 0; i < 3; i++)
        {
            mc.i = i;
            for (int j = 0; j < mc.len; j++)
                Console.WriteLine(mc[j]);
        }
    }
}
