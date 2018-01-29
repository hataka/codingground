// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:27 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_012/char01/char01.cs
 * url:  cs/cs_012/char01/char01.cs
 * created: Time-stamp: <2016-08-24 15:57:27 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_12.htm
 * description: 
 *
 *================================================================*/
// char01.cs

using System;

class char01
{
    public static void Main()
    {
        char a = '1', b = '=', c = 'c';

        Console.WriteLine("a は制御文字か--{0}", char.IsControl(a));
        Console.WriteLine("a は10進の数字か---{0}", char.IsDigit(a));
        Console.WriteLine("a はアルファベット文字か---{0}", char.IsLetter(a));
        Console.WriteLine("a は数字か---{0}", char.IsNumber(a));
        Console.WriteLine("b は算術記号などの記号か---{0}", char.IsSymbol(b));
        Console.WriteLine("c は大文字か---{0}", char.IsUpper(c));
        Console.WriteLine();

        string str = "ab, 01+=";
        Console.WriteLine(char.IsLower(str, 0));
        Console.WriteLine(char.IsLetter(str, 1));
        Console.WriteLine(char.IsPunctuation(str, 2));
        Console.WriteLine(char.IsSeparator(str, 3));
        Console.WriteLine(char.IsDigit(str, 4));
        Console.WriteLine(char.IsNumber(str, 5));
        Console.WriteLine(char.IsSymbol(str, 6));
        Console.WriteLine(char.IsSymbol(str, 7));
    }
}
