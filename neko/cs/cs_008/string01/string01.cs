// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:24 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_008/string01/string01.cs
 * url:  cs/cs_008/string01/string01.cs
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
// string01.cs

using System;

class string01
{
    public static void Main()
    {
        char[] chararray = new char[3];
        chararray[0] = 'a';
        chararray[1] = 'b';
        chararray[2] = 'c';

        string str;
        str = new string(chararray);
        Console.WriteLine(str);

        char[] title = {'猫', 'で', 'も', 'わ', 'か', 'る'};
        string strTitle = new string(title);
        Console.WriteLine(strTitle);

        
        string strx = "C#プログラム";
        int n = strx.Length;
        Console.WriteLine("「{0}」の文字数は{1}です", strx, n);

        char c = strx[1];
        Console.WriteLine("「{0}」の2番目の文字は「{1}」です", strx, c);
        

    }
}
