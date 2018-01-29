// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:26 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_010/pulus01/pulus01.cs
 * url:  cs/cs_010/pulus01/pulus01.cs
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
// pulus01.cs

using System;

class pulus01
{
    public static void Main()
    {
        string str0 = "円周率は", str1 = "です";
        double pai = Math.PI;

        string str = str0 + pai + str1;
        Console.WriteLine(str);
    }
}
