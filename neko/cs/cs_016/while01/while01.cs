// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:29 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_016/while01/while01.cs
 * url:  cs/cs_016/while01/while01.cs
 * created: Time-stamp: <2016-08-24 15:57:29 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_16.htm
 * description: 
 *
 *================================================================*/
// while01.cs

using System;

class while01
{
    public static void Main()
    {
        bool bError = false;

        while (true)
        {
            Console.Write("単位期間の利率(%)(0で終了)---- ");
            string strR = Console.ReadLine();
            if (strR.CompareTo("0") == 0)
                break;

            for (int i = 0; i < strR.Length; i++)
            {
                if (!char.IsDigit(strR[i]) && strR[i] != '.')
                {
                    bError = true;    
                    break;
                }
            }

            if (bError)
                break;


            double r = double.Parse(strR) / 100.0;

            Console.Write("借入金額---- ");
            string strGan = Console.ReadLine();

            for (int i = 0; i < strGan.Length; i++)
            {
                if (!char.IsDigit(strGan[i]))
                {
                    bError = true;
                    break;
                }
            }
            if (bError)
                break;

            double a = double.Parse(strGan);

            Console.Write("期間---- ");
            string strKikan = Console.ReadLine();

            for (int i = 0; i < strKikan.Length; i++)
            {
                if (!char.IsDigit(strKikan[i]))
                {
                    bError = true;
                    break;
                }
            }

            if (bError)
                break;
            double n = double.Parse(strKikan);

            double dTotal = a * Math.Pow((1.0 + r), n);
            Console.WriteLine("元利合計は{0}円です。", dTotal);
        }
    }
}
