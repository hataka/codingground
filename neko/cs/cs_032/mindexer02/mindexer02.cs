// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:39 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_032/mindexer02/mindexer02.cs
 * url:  cs/cs_032/mindexer02/mindexer02.cs
 * created: Time-stamp: <2016-08-24 15:57:39 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_32.htm
 * description: 
 *
 *================================================================*/
// mindexer02.cs

using System;

class MyTelephone
{
    public string this[string address, int phone]
    {
        get
        {
            switch (address)
            {
                case "北海道":
                    switch (phone)
                    {
                        case 166:
                            return "旭川市";
                        case 11:
                            return "札幌市";
                        default:
                            return "知りません";
                    }
                case "東京都":
                    switch (phone)
                    {
                        case 3:
                            return "２３区";
                        case 422:
                            return "小金井市";
                        default:
                            return "知りません";
                    }
                default:
                    return "知りません";
            }
        }
    }
}

class mindexer02
{
    public static void Main()
    {
        string strFormat = "{0}で市外局番が{1}は{2}です";
        MyTelephone mt = new MyTelephone();

        Console.WriteLine(strFormat, "東京都", 3, mt["東京都", 3]);
        Console.WriteLine(strFormat, "北海道", 166, mt["北海道", 166]);
        Console.WriteLine(strFormat, "九州", 114, mt["九州", 114]);
    }
}
