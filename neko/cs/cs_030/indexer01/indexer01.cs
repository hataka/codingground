// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:37 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_030/indexer01/indexer01.cs
 * url:  cs/cs_030/indexer01/indexer01.cs
 * created: Time-stamp: <2016-08-24 15:57:37 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_30.htm
 * description: 
 *
 *================================================================*/
// indexer01.cs

using System;

class MyIndexer
{
    string[] name;

    public string this[int n]
    {
        get
        {
            return name[n];
        }
        set
        {
            name[n] = value;
        }
    }

    public MyIndexer(int a)
    {
        name = new string[a];
    }
}
        

class indexer01
{
    public static void Main()
    {
        MyIndexer mi = new MyIndexer(5);

        string[] myname = new string[5]
            { "一郎", "次郎", "三郎", "四郎", "五郎"};

        for (int i = 0; i < 5; i++)
            mi[i] = myname[i];

        for (int i = 0; i < 5; i++)
            Console.WriteLine("mi[{0}] = {1}", i, mi[i]);
    }
}
