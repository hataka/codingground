// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:47 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_046/multicast01/multicast01.cs
 * url:  cs/cs_046/multicast01/multicast01.cs
 * created: Time-stamp: <2016-08-24 15:57:47 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_46.htm
 * description: 
 *
 *================================================================*/
// multicast01.cs

using System;

delegate void MD();

class multicast01
{
    void show1()
    {
        Console.WriteLine("show1です");
    }
    void show2()
    {
        Console.WriteLine("show2です");
    }
    void show3()
    {
        Console.WriteLine("show3です");
    }
    public static void Main()
    {
        multicast01 m = new multicast01();

        MD md1 = new MD(m.show1);
        MD md2 = new MD(m.show2);
        MD md3 = new MD(m.show3);

        MD md;
        md = md1;
        md += md2;
        md += md3;
        md();

        Console.WriteLine("----------");
        md -= md2;
        md();

        Console.WriteLine("----------");
        md -= md1;
        md();

        Console.WriteLine("----------");
        md += md3;
        md += md3;
        md();
    }
}
