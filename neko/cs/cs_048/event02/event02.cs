// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:48 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_048/event02/event02.cs
 * url:  cs/cs_048/event02/event02.cs
 * created: Time-stamp: <2016-08-24 15:57:48 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_48.htm
 * description: 
 *
 *================================================================*/
// event02.cs

using System;

delegate void EventHandler(ConsoleKeyInfo c);

class Key
{
    public event EventHandler key;

    public void OnKey(ConsoleKeyInfo k)
    {
        if (key != null)
        {
            key(k);
        }
    }
}


class event02
{
    static void Hit(ConsoleKeyInfo ki)
    {
        string strMod = "";

        if ((ki.Modifiers & ConsoleModifiers.Alt) != 0)
            strMod += "Alt+";
        if ((ki.Modifiers & ConsoleModifiers.Shift) != 0)
            strMod += "Shift+";
        if ((ki.Modifiers & ConsoleModifiers.Control) != 0)
            strMod += "Control+";

        Console.WriteLine("押されたキーは[ {0}{1} ]です", strMod, ki.Key);
    }

    public static void Main()
    {
        ConsoleKeyInfo cki;

        Key k = new Key();

        k.key += new EventHandler(Hit);

        Console.WriteLine("xで終了します");

        while (true)
        {
            if (Console.KeyAvailable)
            {
                cki = Console.ReadKey(true);
                if (cki.KeyChar == 'x')
                    break;
                k.OnKey(cki);
            }
        }
    }
}
