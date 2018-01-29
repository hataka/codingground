// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:49 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_050/event04/event04.cs
 * url:  cs/cs_050/event04/event04.cs
 * created: Time-stamp: <2016-08-24 15:57:49 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_50.htm
 * description: 
 *
 *================================================================*/
// event04.cs

using System;

class event04
{
    public static void Main()
    {
        DateTime dt;
        int oldSecond = 0;
        Console.CancelKeyPress += new ConsoleCancelEventHandler(MyEventHandler);

        Console.CursorVisible = false;

        while (true)
        {
            dt = DateTime.Now;
            if (dt.Second != oldSecond)
            {
                Console.SetCursorPosition(0, 0);
                Console.WriteLine("{0}年{1:00}月{2:00}日{3:00}時{4:00}分{5:00}秒",
                    dt.Year, dt.Month, dt.Day, dt.Hour, dt.Minute, dt.Second);
                oldSecond = dt.Second;
            }
        }
    }
    protected static void MyEventHandler(object sender, ConsoleCancelEventArgs args)
    {
        Console.SetCursorPosition(0, 2);
        Console.WriteLine("CancelKeyPressイベントが発生しました");
        Console.Write("Ctrl + C を有効にしますか(Y/N)");
        while (true)
        {
            if (Console.KeyAvailable)
            {
                ConsoleKeyInfo cki = Console.ReadKey(true);
                if (cki.KeyChar == 'Y')
                {
                    args.Cancel = false;
                    Console.Clear();
                    break;
                }
                else
                {
                    args.Cancel = true;
                    Console.Clear();
                    break;
                }
            }
        }
    }
}
