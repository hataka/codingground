// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:24 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_008/string02/string02.cs
 * url:  cs/cs_008/string02/string02.cs
 * created: Time-stamp: <2016-08-24 15:57:24 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_08.htm
 * description: 
 *
 *================================================================*/
// string02.cs

using System;

class string02
{
    public static void Main()
    {
        string str = "猫でもわかるプログラミング";
        char[] c = new char[7];

        //strの(6 + 1)番目の文字から、配列cへコピーします。
        //コピー先はインデックス0から７文字だけ受け入れます。
        str.CopyTo(6, c, 0, 7);
        Console.WriteLine(c);
    }
}
