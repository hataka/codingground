// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:59 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_069/throw01/throw01.cs
 * url:  cs/cs_069/throw01/throw01.cs
 * created: Time-stamp: <2016-08-24 15:57:59 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_69.htm
 * description: 
 *
 *================================================================*/
// throw01.cs

using System;

class MyException : ApplicationException
{
    public override string Message
    {
        get
        {
            return "例外が発生しました";
        }
    }
}

class throw01
{
    public static void Main()
    {
        try
        {
            throw new MyException();
        }
        catch (MyException me)
        {
            Console.WriteLine(me.Message);
        }
        Console.WriteLine("try-catchを抜けました");
    }
}
