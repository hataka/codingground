// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:37 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_030/indexer02/indexer02.cs
 * url:  cs/cs_030/indexer02/indexer02.cs
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
// indexer02.cs

using System;

class MyIndexer
{
   public string this[string str]
    {
        get
        {
            switch (str)
            {
                case "一郎":
                    return "いちろう";
                case "次郎":
                    return "じろう";
                case "三郎":
                    return "さぶろう";
                case "四郎":
                    return "しろう";
                case "五郎":
                    return "ごろう";
                default:
                    return "読めません";
            }
        }
    }
}

class indexer02
{
    public static void Main()
    {
        string strFormat = "「{0}」の読み方は「{1}」です";
        MyIndexer mi = new MyIndexer();

        Console.WriteLine(strFormat, "次郎", mi["次郎"]);
        Console.WriteLine(strFormat, "五郎", mi["五郎"]);
        Console.WriteLine(strFormat, "猫", mi["猫"]);
    }
}
