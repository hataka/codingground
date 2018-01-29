// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:46 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_044/abstract02/abstract02.cs
 * url:  cs/cs_044/abstract02/abstract02.cs
 * created: Time-stamp: <2016-08-24 15:57:46 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_44.htm
 * description: 
 *
 *================================================================*/
// abstract02.cs

using System;

abstract class MyCalcOrg
{
    public abstract void puls(int x);
    public abstract int ans();
    public abstract void minus(int x);
}

class MyCalc : MyCalcOrg
{
    int sum;

    public override void puls(int x)
    {
        sum += x;
    }
    public override int ans()
    {
        return sum;
    }
    public override void minus(int x)
    {
        sum -= x;
    }
    public void setZero()
    {
        sum = 0;
    }
    public MyCalc()
    {
        setZero();
    }
}

class abstract02
{
    public static void Main()
    {
        int num = 0;

        MyCalc m = new MyCalc();


        while (true)
        {
            Console.Write("整数値(*で終了,=で計算結果)--- ");
            string strnum = Console.ReadLine();
            if (strnum == "*")
                break;
            else if (strnum == "=")
            {
                Console.WriteLine("計算結果-- {0}", m.ans());
                m.setZero();
                continue;
            }
            else
                num = Int32.Parse(strnum);
            Console.Write("記号(+-)--- ");
            string kigo = Console.ReadLine();

            switch (kigo)
            {
                case "+":
                    m.puls(num);
                    break;
                case "-":
                    m.minus(num);
                    break;
                default:
                    Console.WriteLine("入力エラー");
                    return;
            }
        }
    }
}
