// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:22 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_005/literal01/literal01.cs
 * url:  cs/cs_005/literal01/literal01.cs
 * created: Time-stamp: <2016-08-24 15:57:22 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_05.htm
 * description: 
 *
 *================================================================*/
// literal01.cs

using System;

class literal01
{
    public static void Main()
    {
        string format = "{0}の型は{1}";
        
        Console.WriteLine(format, 10, 10.GetType());
        Console.WriteLine(format, 1.2, (1.2).GetType());

    }
}
