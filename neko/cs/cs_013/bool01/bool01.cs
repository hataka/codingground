// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:27 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_013/bool01/bool01.cs
 * url:  cs/cs_013/bool01/bool01.cs
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
// bool01.cs

using System;

class bool01
{
    public static void Main()
    {
        int n;

        Console.Write("0から9までの数字を入力---");
        string strNum = Console.ReadLine();

        if (strNum.Length >= 2)
        {
            Console.WriteLine("1文字だけの入力です");
            return;
        }

        if (!Char.IsNumber(strNum, 0))
        {
            Console.WriteLine("数字を入力します");
            return;
        }
        else
            n = Int32.Parse(strNum);

        if (n >= 5)
            Console.WriteLine("あなたの入力した数字は5以上です");
        else
            Console.WriteLine("あなたの入力した数字は4以下です");
    }
}
