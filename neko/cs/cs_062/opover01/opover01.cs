// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:55 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_062/opover01/opover01.cs
 * url:  cs/cs_062/opover01/opover01.cs
 * created: Time-stamp: <2016-08-24 15:57:55 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_62.htm
 * description: 
 *
 *================================================================*/
// opover01.cs

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
        MyPosition mp = new MyPosition(3, 5);
        MyPosition np = new MyPosition(7, 3);

        MyPosition A, B;

        A = mp + np;
        Console.WriteLine("A = ({0}, {1})", A.x, A.y);

        B = mp - np;
        Console.WriteLine("B = ({0}, {1})", B.x, B.y);
        
    }
}
