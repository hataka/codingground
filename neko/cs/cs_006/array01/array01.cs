// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:23 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_006/array01/array01.cs
 * url:  cs/cs_006/array01/array01.cs
 * created: Time-stamp: <2016-08-24 15:57:23 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_06.htm
 * description: 
 *
 *================================================================*/
// array01.cs

using System;

class array01
{
    public static void Main()
    {
        // 要素に一つずつ値を代入
        int[] myarray1 = new int[3];
        myarray1[0] = 10;
        myarray1[1] = 20;
        myarray1[2] = 30;

        // 宣言と同時に初期化
        int[] myarray2 = new int[3]{10, 20, 30};

        // 要素数を省略することも可能
        int[] myarray3 = new int[]{10, 20, 30};

        //別な方法
        int[] myarray4;
        myarray4 = new int[]{10, 20, 30};

    }
}
