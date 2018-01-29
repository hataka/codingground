// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:47 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_047/event01/event01.cs
 * url:  cs/cs_047/event01/event01.cs
 * created: Time-stamp: <2016-08-24 15:57:47 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_47.htm
 * description: 
 *
 *================================================================*/
// event01.cs

using System;

// イベント用デリゲート(イベントハンドラ)
delegate void EventHandler();

// イベント送信用のクラス
class MyClick
{
    // イベントオブジェクトの宣言
    public event EventHandler myclick;

    // イベント送信用メソッド
    public void OnMyClick()
    {
        if (myclick != null)
            myclick();
    }
}

class Show
{
    public void show1()
    {
        Console.WriteLine("show1");
    }

    public void show2()
    {
        Console.WriteLine("show2");
    }
}

class event01
{
    public static void Main()
    {
        MyClick mc = new MyClick();
        Show s = new Show();

        // イベント名 += new イベントハンドラ(実行するメソッド);
        mc.myclick += new EventHandler(s.show1);

        // イベントを発生させる
        mc.OnMyClick();

        Console.WriteLine("----------");

        mc.myclick += new EventHandler(s.show2);

        mc.OnMyClick();
    }
}
