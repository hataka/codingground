// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:40 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_035/jag01/jag01.cs
 * url:  cs/cs_035/jag01/jag01.cs
 * created: Time-stamp: <2016-08-24 15:57:40 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_35.htm
 * description: 
 *
 *================================================================*/
// jag01.cs

using System;

class jag01
{
    public static void Main()
    {
        string[][] name = new string[3][];
        int i, j;

        name[0] = new string[2]{"田中", "佐藤"};
        name[1] = new string[3]{"横井", "吉田", "工藤"};
        name[2] = new string[1]{"太田"};

        for (i = 0; i < 3; i++)
            foreach (string str in name[i])
                Console.WriteLine(str);
    }
}
