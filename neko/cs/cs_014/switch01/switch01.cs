// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:28 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_014/switch01/switch01.cs
 * url:  cs/cs_014/switch01/switch01.cs
 * created: Time-stamp: <2016-08-24 15:57:28 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_14.htm
 * description: 
 *
 *================================================================*/
// switch01.cs

using System;

class switch01
{
    public static void Main()
    {
        string[] menu = new string[]{"1.ファイル",
            "2.編集", "3.表示"};
        string format = "「{0}」が選択されました";

        Console.WriteLine("*** Menu ***");
        Console.WriteLine(menu[0]);
        Console.WriteLine(menu[1]);
        Console.WriteLine(menu[2]);
        Console.WriteLine("************");
        Console.Write("\n");

        Console.Write("選択--- ");
        string sel = Console.ReadLine();

        switch (sel)
        {
            case "1":
                Console.WriteLine(format, menu[0]);
                break;
            case "2":
                Console.WriteLine(format, menu[1]);
                break;
            case "3":
                Console.WriteLine(format, menu[2]);
                break;
            default:
                Console.WriteLine("選択が正しくありません");
                break;
        }
    }
}
