// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:22 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_005/datatype01/datatype01.cs
 * url:  cs/cs_005/datatype01/datatype01.cs
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
// datatype01.cs

using System;

class datatype01
{
    public static void Main()
    {
        string format = "{0, -8}:{1}〜{2}", dot = "----------------";

        Console.WriteLine(format, "sbyte",sbyte.MinValue, sbyte.MaxValue);
        Console.WriteLine(format, "short", short.MinValue, short.MaxValue);
        Console.WriteLine(format, "int", int.MinValue, int.MaxValue);
        Console.WriteLine(format, "long", long.MinValue, long.MaxValue);
        Console.WriteLine(dot);
        Console.WriteLine(format, "byte", byte.MinValue, byte.MaxValue);
        Console.WriteLine(format, "ushort", ushort.MinValue, ushort.MaxValue);
        Console.WriteLine(format, "uint", uint.MinValue, uint.MaxValue);
        Console.WriteLine(format, "ulong", ulong.MinValue, ulong.MaxValue);
        Console.WriteLine(dot);
        Console.WriteLine(format, "float", float.MinValue, float.MaxValue);
        Console.WriteLine(format, "double", double.MinValue, double.MaxValue);
        Console.WriteLine(dot);
        Console.WriteLine(format, "decimal", decimal.MinValue, decimal.MaxValue);
        Console.WriteLine(dot);
    }
}
