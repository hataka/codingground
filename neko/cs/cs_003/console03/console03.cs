// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:21 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_003/console03/console03.cs
 * url:  cs/cs_003/console03/console03.cs
 * created: Time-stamp: <2016-08-24 15:57:21 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_03.htm
 * description: 
 *
 *================================================================*/
//console03.cs

using System;

class Console03
{
    public static int Main()
    {
        Console.Write("あなたの名前は ");
        string YourName = Console.ReadLine();
        Console.Write("あなたの年齢は ");
        string YourAge = Console.ReadLine();
        Console.WriteLine("あなたの名前は{0}で年齢は{1}歳です",
            YourName, YourAge);
        
        return 0;
    }
}
