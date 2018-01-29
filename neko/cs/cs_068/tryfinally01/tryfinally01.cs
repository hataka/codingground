// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:59 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_068/tryfinally01/tryfinally01.cs
 * url:  cs/cs_068/tryfinally01/tryfinally01.cs
 * created: Time-stamp: <2016-08-24 15:57:59 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_68.htm
 * description: 
 *
 *================================================================*/
// tryfinally01.cs

using System;

class tryfinally01
{
    public static void Main()
    {
        int no;

        Console.Write("整数値を入力してください--- ");
        string strNo = Console.ReadLine();

        try
        {
            no = Int32.Parse(strNo);
        }
        finally
        {
            Console.WriteLine("入力が終わりましたね");
        }
        Console.WriteLine("try-finallyを抜けました");
    }
}
