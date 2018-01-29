// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:21 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_004/triangle/triangle.cs
 * url:  cs/cs_004/triangle/triangle.cs
 * created: Time-stamp: <2016-08-24 15:57:21 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_04.htm
 * description: 
 *
 *================================================================*/
// triangle.cs

using System;

class triangle
{
    public static void Main()
    {
        double 底辺, 高さ, 面積;
        string teihen, takasa;
        while (true)
        {
            Console.Write("高さ= ");
            takasa = Console.ReadLine();
            高さ = double.Parse(takasa);
            if (高さ == 0.0)
                break;
            Console.Write("底辺= ");
            teihen = Console.ReadLine();
            底辺 = double.Parse(teihen);
            面積 = 底辺 * 高さ / 2.0;
            Console.WriteLine("高さ{0}、底辺{1}の三角形の面積は{2}です。",
                高さ, 底辺, 面積);
        }
    }
}
