// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:53 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_057/interface02/interface02.cs
 * url:  cs/cs_057/interface02/interface02.cs
 * created: Time-stamp: <2016-08-24 15:57:53 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_57.htm
 * description: 
 *
 *================================================================*/
// interface02.cs

using System;

public interface IDateCalc1
{
    DateTime CalcDate(DateTime dt, TimeSpan ts, string h);
}

public interface IDateCalc2
{
    DateTime CalcDate(DateTime dt, int n);
}

class MyCalcDate : IDateCalc1, IDateCalc2
{
    public DateTime CalcDate(DateTime d, TimeSpan t, string s)
    {
        if (s == "+")
            return d + t;
        else if (s == "-")
            return d - t;
        else
            return DateTime.Now;
    }

    public DateTime CalcDate(DateTime d, int n)
    {
        return d.AddHours((double)n);
    }
}

class interface02
{
    public static void Main()
    {
        MyCalcDate cd = new MyCalcDate();

        DateTime dt = DateTime.Today;
        TimeSpan ts = new TimeSpan(100, 0, 0, 0);

        Console.WriteLine("今日から100日後は{0}です",
            cd.CalcDate(dt, ts, "+").ToString("D"));
        Console.WriteLine("今日の100日前は{0}です",
            cd.CalcDate(dt, ts, "-").ToString("D"));

        dt = DateTime.Now;
        ts = new TimeSpan(100, 0, 0);

        Console.WriteLine("今から100時間後は{0}です",
            cd.CalcDate(dt, ts, "+").ToString("F"));
        Console.WriteLine("今から100時間前は{0}です",
            cd.CalcDate(dt, ts, "-").ToString("F"));

        Console.WriteLine("今から10時間後は{0}です",
            cd.CalcDate(dt, 10).ToString("F"));

    }
}
