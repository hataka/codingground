// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:26 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_010/concat01/concat01.cs
 * url:  cs/cs_010/concat01/concat01.cs
 * created: Time-stamp: <2016-08-24 15:57:26 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_10.htm
 * description: 
 *
 *================================================================*/
// concat01.cs

using System;

class concat01
{
    public static void Main()
    {
        string[] strarray;
        strarray = new string[4]{"猫", "でも", "わかる", "プログラミング"};

        string str = string.Concat(strarray);
        Console.WriteLine(str);

        string str1 = "猫でもわかる", str2 = "プログラミング";
        str = string.Concat(str1, str2);
        Console.WriteLine(str);

        string str10 = "猫でも", str20 = "わかる", str30 = "プログラミング";
        str = string.Concat(str10, str20, str30);
        Console.WriteLine(str);

        string str100 = "猫", str200 = "でも", str300 = "わかる",
        str400 = "プログラミング";

        str = string.Concat(str100, str200, str300, str400);
        Console.WriteLine(str);

        Console.WriteLine();
        string stra = "アイスクリームは", strb = "円です";
        int a = 100;
        str = string.Concat(stra, a);
        str = string.Concat(str, strb);
        Console.WriteLine(str);

        str = string.Concat(stra, a, strb);
        Console.WriteLine(str);

        double pai = Math.PI;
        string en = "円周率は", endesu = "です";

        str = string.Concat(en, pai, endesu);
        Console.WriteLine(str);

        string str0 = null;
        str = string.Concat(str0);
        Console.WriteLine(str);

        int x = 100;
        str = string.Concat(x);
        Console.WriteLine(str);

    }
}
