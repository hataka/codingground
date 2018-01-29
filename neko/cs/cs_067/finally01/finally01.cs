// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:58 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_067/finally01/finally01.cs
 * url:  cs/cs_067/finally01/finally01.cs
 * created: Time-stamp: <2016-08-24 15:57:58 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_67.htm
 * description: 
 *
 *================================================================*/
// finally01.cs

using System;

class finally01
{
    public static void Main()
    {
        try
        {
            Console.Write("何か数字を入力してください---");
            string str = Console.ReadLine();
            int x = Int32.Parse(str);
            int y = x / 2;
            Console.WriteLine("今入力した数字を２で割ると{0}です", y);
        }
        catch (Exception e)
        {
            Console.WriteLine("例外が発生しました");
            Console.WriteLine(e.Message);
        }
        finally
        {
            Console.WriteLine("finallyです");
        }
    }
}
