// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:29 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_016/dowhile01/dowhile01.cs
 * url:  cs/cs_016/dowhile01/dowhile01.cs
 * created: Time-stamp: <2016-08-24 15:57:29 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_16.htm
 * description: 
 *
 *================================================================*/
// dowhile01.cs

using System;

class dowhle01
{
    public static void Main()
    {
        Console.Write("数字を入力してください(1-9) --- ");

        string strInput = Console.ReadLine();

        if (strInput.Length >= 2)
            return;

        if (!char.IsDigit(strInput[0]) || strInput[0] == '0')
            return;
        int n = strInput[0] - '0';
        
        string mystr = "";

        int i = 1, sum = 0;
        do
        {
            sum += i;
            mystr += string.Format("{0} + ", i);
            i++;
        } while (i <= n);

        char[] trimchar = new char[] { '+', ' ' };
        mystr = mystr.TrimEnd(trimchar);
        mystr += " = ";
        mystr += sum;
        Console.WriteLine(mystr);
    }
}
