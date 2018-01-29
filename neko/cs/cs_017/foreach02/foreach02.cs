// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:30 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_017/foreach02/foreach02.cs
 * url:  cs/cs_017/foreach02/foreach02.cs
 * created: Time-stamp: <2016-08-24 15:57:30 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_17.htm
 * description: 
 *
 *================================================================*/
// foreach02.cs

using System;
using System.Collections;

class foeach02
{
    public static void Main()
    {
        ArrayList al = new ArrayList();

        while (true)
        {
            Console.Write("(xで終了)データ:");
 
            string strData = Console.ReadLine();

            if (strData == "")
                return;

            if (!char.IsDigit(strData[0]) && strData[0] != '-')
                break;

            double dData = double.Parse(strData);
            al.Add(dData);
        }

        double sum = 0.0;

        if (al.Count == 0)
        {
            Console.WriteLine("データが有りません");
            return;
        }

        foreach (double d in al)
        {
            sum += d;
        }

        Console.WriteLine("データ数:{0, 6}\n合計:{1, 10}\n平均:{2, 10}",
            al.Count, sum, sum / al.Count);
    }
}
