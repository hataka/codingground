// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:54 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_059/interface04/interface04.cs
 * url:  cs/cs_059/interface04/interface04.cs
 * created: Time-stamp: <2016-08-24 15:57:54 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_59.htm
 * description: 
 *
 *================================================================*/
// interface04.cs

using System;

public delegate void MyEventHandler();

public interface IEvent
{
    event MyEventHandler MyEvent;

    void OnMyEvent();
}

class MyClass : IEvent
{
    public event MyEventHandler MyEvent;

    public void OnMyEvent()
    {
        if (MyEvent != null)
            MyEvent();
    }
}

class interface04
{
    public static void Show()
    {
        Console.WriteLine("イベントが発生しました");
    }

    public static void Main()
    {
        MyClass mc = new MyClass();

        // イベントハンドラをイベントに追加
        mc.MyEvent += new MyEventHandler(Show);

        // イベントを発生させる
        mc.OnMyEvent();
    }
}
