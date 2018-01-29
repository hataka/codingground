// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:25 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_009/string09/string09.cs
 * url:  cs/cs_009/string09/string09.cs
 * created: Time-stamp: <2016-08-24 15:57:25 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_09.htm
 * description: 
 *
 *================================================================*/
// string09.cs

using System;

class string09
{
    public static void Main()
    {
        string str = "今日はよい天気ですが、あしたはどうなるかわかりません";

        Console.WriteLine("「あした」は、文字列中{0}番目の文字に見つかりました",
            1 + str.IndexOf("あした"));
        Console.WriteLine("「は」という文字が最初に見つかったのは、{0}番目の文字です。",
            1 + str.IndexOf('は'));
        Console.WriteLine("「は」という文字が最後に見つかったのは、{0}番目の文字です。",
            1 + str.LastIndexOf('は'));
    }
}
