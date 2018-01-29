// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:57 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_064/opover03/opover03.cs
 * url:  cs/cs_064/opover03/opover03.cs
 * created: Time-stamp: <2016-08-24 15:57:57 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_64.htm
 * description: 
 *
 *================================================================*/
// opover03.cs

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

    public static MyPosition operator +(MyPosition a)
    {
        return a;
    }

    public static MyPosition operator -(MyPosition a)
    {
        return a * -1;
    }

    public static bool operator ==(MyPosition a, MyPosition b)
    {
        if (a.x == b.x && a.y == b.y)
            return true;
        else
            return false;
    }

    public static bool operator !=(MyPosition a, MyPosition b)
    {
        if (a == b)
            return false;
        else
            return true;
    }

    public override bool Equals(object obj)
    {
        MyPosition a;
        if (this.GetType() != obj.GetType())
            return false;
        a = (MyPosition)obj;
        if (a.x == this.x && a.y == this.y)
            return true;
        else
            return false;
    }

    public override int GetHashCode()
    {
        return base.GetHashCode();
    }

    public override string ToString()
    {
        return string.Format("({0}, {1})", this.x, this.y);
    }

    public MyPosition()
    {
        nX = 0;
        nY = 0;
    }

    public MyPosition(int m, int n)
    {
        nX = m;
        nY = n;
    }
}

class opover01
{
    public static void Main()
    {
        MyPosition A = new MyPosition(3, 5);
        MyPosition B = new MyPosition(4, 6);
        MyPosition C = new MyPosition(7, 11);
        MyPosition D = new MyPosition(-1, -1);

        if (C == (A + B))
            Console.WriteLine("C = A + Bです");
        else
            Console.WriteLine("C = A + Bではありません");

        if (D != (A - B))
            Console.WriteLine("D = A - Bではありません");
        else
            Console.WriteLine("D = A - Bです");

        if (C.Equals(A + B))
            Console.WriteLine("C = A + Bです");
        else
            Console.WriteLine("C = A - Bではありません");

        Console.WriteLine("C = {0}", C.ToString());
    }
}
