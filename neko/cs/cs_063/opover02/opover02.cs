// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:56 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_063/opover02/opover02.cs
 * url:  cs/cs_063/opover02/opover02.cs
 * created: Time-stamp: <2016-08-24 15:57:56 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_63.htm
 * description: 
 *
 *================================================================*/
// opover02.cs

using System;

class MyPosition
{
    int nX, nY;

    public int x
    {
        get
        {
            return nX;
        }
        set
        {
            nX = value;
        }
    }
    public int y
    {
        get
        {
            return nY;
        }
        set
        {
            nY = value;
        }
    }

    public static MyPosition operator +(MyPosition a, MyPosition b)
    {
        MyPosition c = new MyPosition();

        c.nX = a.nX + b.nX;
        c.nY = a.nY + b.nY;

        return c;
    }

    public static MyPosition operator -(MyPosition a, MyPosition b)
    {
        MyPosition c = new MyPosition();

        c.nX = a.nX - b.nX;
        c.nY = a.nY - b.nY;

        return c;
    }

    public static MyPosition operator *(MyPosition a, int b)
    {
        MyPosition c = new MyPosition();
        c.x = a.x * b;
        c.y = a.y * b;
        return c;
    }

    public static MyPosition operator *(int b, MyPosition a)
    {
        MyPosition c = new MyPosition();
        return a * b;
    }

    public MyPosition(int m, int n)
    {
        nX = m;
        nY = n;
    }

    public MyPosition()
    {
        nX = 0;
        nY = 0;
    }
}

class opover01
{
    public static void Main()
    {
        MyPosition A = new MyPosition(3, 5);
        MyPosition B = new MyPosition(4, 6);

        MyPosition C = A * 3;
        Console.WriteLine("A * 3 = ({0}, {1})", C.x, C.y);
        MyPosition D = 3 * A;
        Console.WriteLine("3 * A = ({0}, {1})", D.x, D.y);
       

        MyPosition E = (A + B) * 5;
        Console.WriteLine("(A + B) * 5 = ({0}, {1})", E.x, E.y);

        MyPosition F = A * 5 + B * 5;
        Console.WriteLine("A * 5 + B * 5 = ({0}, {1})", F.x, F.y);
    }
}
