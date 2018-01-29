// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:48 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_049/event03/event03.cs
 * url:  cs/cs_049/event03/event03.cs
 * created: Time-stamp: <2016-08-24 15:57:48 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_49.htm
 * description: 
 *
 *================================================================*/
// event03.cs

using System;
using System.Threading;

delegate void MyEventHandler(int x, int y, ConsoleColor c);

class MyEvent
{
    public event MyEventHandler myevent;
    
    public void OnMyEvent(int x, int y, ConsoleColor c)
    {
        if (myevent != null)
            myevent(x, y, c);
    }
}


class ShowCircle
{
    public void show(int x, int y, ConsoleColor c)
    {
        Console.Clear();
        Console.CursorLeft = x;
        Console.CursorTop = y;
        Console.ForegroundColor = c;
        Console.Write("●");
    }
}

class event03
{
    public static void Main()
    {
        int x = 0, y = 0;
        bool dx = true, dy = true;
        ConsoleColor c = ConsoleColor.Black;

        MyEvent me = new MyEvent();
        ShowCircle sc = new ShowCircle();

        me.myevent += new MyEventHandler(sc.show);

        Console.CursorVisible = false;

        while (true)
        {
            Thread.Sleep(30);
             me.OnMyEvent(x, y, c);
            if (Console.KeyAvailable)
                break;
            if (dx)
            {
                x++;
                if (x > Console.WindowWidth - 2)
                {
                    x = Console.WindowWidth - 2;
                    dx = false;
                    c++;
                    if (c > ConsoleColor.Yellow)
                        c = ConsoleColor.Black;
                }
            }
            else
            {
                x--;
                if (x < 0)
                {
                    x = 0;
                    dx = true;
                }
            }

            if (dy)
            {
                y++;
                if (y > Console.WindowHeight - 1)
                {
                    y = Console.WindowHeight - 1;
                    dy = false;
                }
            }
            else
            {
                y--;
                if (y < 0)
                {
                    y = 0;
                    dy = true;
                }
            }

        }
    }
}
