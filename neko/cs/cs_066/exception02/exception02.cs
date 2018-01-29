// -*- mode: java -*-  Time-stamp: <2016-08-24 15:57:58 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs_066/exception02/exception02.cs
 * url:  cs/cs_066/exception02/exception02.cs
 * created: Time-stamp: <2016-08-24 15:57:58 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://www.kumei.ne.jp/c_lang/
 * link: http://www.kumei.ne.jp/c_lang/cs/cs_66.htm
 * description: 
 *
 *================================================================*/
// exception02.cs

using System;

class exception02
{
    public static void Main()
    {
        int x = 100, z;

        for (int i = 10; i > -11; i--)
        {
            try
            {
                z = x / i;
            }
            catch (Exception e)
            {
                Console.WriteLine("Message = {0}", e.Message);
                Console.WriteLine("Source = {0}", e.Source);
                Console.WriteLine("GetType = {0}", e.GetType());
                Console.WriteLine("TargetSite = {0}", e.TargetSite);
                z = 99999;
            }
            Console.WriteLine("{0} / {1} = {2}", x, i, z);
        }
    }
}
