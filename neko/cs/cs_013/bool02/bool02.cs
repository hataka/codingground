// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:27 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_013/bool02/bool02.cs
 * url:  cs/cs_013/bool02/bool02.cs
 * created: Time-stamp: <2016-08-24 15:57:27 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_13.htm
 * description: 
 *
 *================================================================*/
// bool02.cs

using System;

class bool02
{
    public static void Main()
    {
        Console.WriteLine("*** Menu ***");
        Console.WriteLine("1.ファイル");
        Console.WriteLine("2.編集");
        Console.WriteLine("3.表示");
        Console.WriteLine("************");
        Console.Write("\n");
        Console.Write("選択--- ");

        string selNo = Console.ReadLine();
        if (selNo.Length >= 2)
        {
            Console.WriteLine("入力桁数が多すぎます");
            return;
        }
        if (!char.IsNumber(selNo[0]))
        {
            Console.WriteLine("数字を入力します");
            return;
        }

        int no = int.Parse(selNo);
        if (no <= 0 || no >= 4)
        {
            Console.WriteLine("番号が不正です");
            return;
        }
        if (no == 1)
            Console.WriteLine("「ファイル」が選択されました");
        else if (no == 2)
            Console.WriteLine("「編集]が選択されました");
        else
            Console.WriteLine("「表示」が選択されました");

    }
}
