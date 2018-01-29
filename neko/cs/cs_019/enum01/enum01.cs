// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:31 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_019/enum01/enum01.cs
 * url:  cs/cs_019/enum01/enum01.cs
 * created: Time-stamp: <2016-08-24 15:57:31 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_19.htm
 * description: 
 *
 *================================================================*/
// enum01.cs

using System;

class enum01
{
    public enum mymonth {Jan = 1, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct,
    Nov, Dec};

    public static void Main()
    {
        Console.WriteLine("Jan = {0}月", (int)mymonth.Jan);
        Console.WriteLine("Feb = {0}月", (int)mymonth.Feb);
        Console.WriteLine("Mar = {0}月", (int)mymonth.Mar);
        Console.WriteLine("Apr = {0}月", (int)mymonth.Apr);
        Console.WriteLine("May = {0}月", (int)mymonth.May);
        Console.WriteLine("Jun = {0}月", (int)mymonth.Jun);
        Console.WriteLine("Jul = {0}月", (int)mymonth.Jul);
        Console.WriteLine("Aug = {0}月", (int)mymonth.Aug);
        Console.WriteLine("Sep = {0}月", (int)mymonth.Sep);
        Console.WriteLine("Oct = {0}月", (int)mymonth.Oct);
        Console.WriteLine("Nov = {0}月", (int)mymonth.Nov);
        Console.WriteLine("Dec = {0}月", (int)mymonth.Dec);
    }
        
}
