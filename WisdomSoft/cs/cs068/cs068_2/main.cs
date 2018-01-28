// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:31 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs068/cs068_2/main.cs
 * url:  cs/cs068/cs068_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:31 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs68.html
 * description: 
 *
 *================================================================*/
unsafe class Test {
	public static void Main() {
		char* str = stackalloc char[256];
		SetStringToChar(str , "Kitty on your lap");
		WriteChar(str);
	}
	static void SetStringToChar(char *pstr , string strSet) {
		int iCount = 0;
		for ( ; iCount  < strSet.Length ; iCount++)
			*(pstr + iCount) = strSet[iCount];
		*(pstr + iCount) = (char)0;
	}
	static void WriteChar(char *pstr) {
		for(int iCount = 0 ; *(pstr + iCount) != 0 ; iCount++)
			System.Console.Write(*(pstr + iCount));
	}
}
