// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:39 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_033/indexover01/indexover01.cs
 * url:  cs/cs_033/indexover01/indexover01.cs
 * created: Time-stamp: <2016-08-24 15:57:39 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_33.htm
 * description: 
 *
 *================================================================*/
// indexover01.cs

using System;

class MyIndexer
{
    int[] no;
    string[] name;

    public int this[string str]
    {
        get
        {
            int n = 0;
            foreach (string s in name)
            {
                if (s == str)
                    return no[n];
                n++;
            }
            return 0;
        }
        
    }

    public string this[int index]
    {
        get
        {
            int n = 0;
            foreach (int p in no)
            {
                if (p == index)
                    return name[n];
                n++;
            }
            return "知りません";
        }
    }

    public MyIndexer()
    {
        no = new int[5] { 100, 145, 325, 400, 155 };
        name = new string[5] { "田中", "佐藤", "鈴木", "池田", "吉田" };
    }
}

class indexover01
{
    public static void Main()
    {
        MyIndexer mi = new MyIndexer();

        Console.WriteLine("番号145の生徒は{0}です", mi[145]);
        Console.WriteLine("番号400の生徒は{0}です", mi[400]);
        Console.WriteLine("番号100の生徒は{0}です", mi[100]);
        Console.WriteLine("佐藤の番号は{0}です", mi["佐藤"]);
        Console.WriteLine("吉田の番号は{0}です", mi["吉田"]);
        Console.WriteLine("田中の番号は{0}です", mi["田中"]);
    }
}
