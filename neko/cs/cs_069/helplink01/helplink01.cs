// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:59 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_069/helplink01/helplink01.cs
 * url:  cs/cs_069/helplink01/helplink01.cs
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
// helplink01.cs

using System;

public class MyException : ApplicationException
{
    string help = "http://www.kumei.ne.jp/c_lang/";

    public override string HelpLink
    {
        get
        {
            return help;
        }
        set
        {
            help = value;
        }
    }
}

class helplink01
{
    public static int MyInput()
    {
        int no;
        Console.Write("整数値を入力--- ");
        string strNo = Console.ReadLine();
        try
        {
            no = Int32.Parse(strNo);
        }
        catch (Exception)
        {
            throw new MyException();
        }
        return no;
    }

    public static void Main()
    {
        int no;

        try
        {
            no = MyInput();
        }
        catch (MyException me)
        {
            Console.WriteLine("入力が不正です\n" + 
                me.HelpLink + "を参照してください");
            no = 0;
        }
        Console.WriteLine("no = {0}", no);
        
    }
}
