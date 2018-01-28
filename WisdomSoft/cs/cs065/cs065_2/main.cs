// -*- mode: java -*-  Time-stamp: <2016-10-03 06:15:29 kahata>
/*================================================================
 * title: 
 * file: 
 * path; cs/cs065/cs065_2/main.cs
 * url:  cs/cs065/cs065_2/main.cs
 * created: Time-stamp: <2016-10-03 06:15:29 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: http://wisdom.sakura.ne.jp/programming/cs/cs65.html
 * description: 
 *
 *================================================================*/
using System;
using System.Runtime.InteropServices;

class Win32 {
	[DllImport("USER32.DLL" , EntryPoint="MessageBoxA")]
	public static extern int Dialog(
		int hWnd , String lpText , String lpCaption , uint uType
	);

	public const int MB_OK =		0x00000000;
	public const int MB_OKCANCEL = 		0x00000001;
	public const int MB_ABORTRETRYIGNORE =	0x00000002;
	public const int MB_YESNOCANCEL = 	0x00000003;
	public const int MB_YESNO = 		0x00000004;
	public const int MB_RETRYCANCEL =	0x00000005;

	public const int MB_ICONHAND = 		0x00000010;
	public const int MB_ICONQUESTION =	0x00000020;
	public const int MB_ICONEXCLAMATION =	0x00000030;
	public const int MB_ICONASTERISK = 	0x00000040;
}

class Test {
	public static void Main() {
		Win32.Dialog(0 , "Kitty on your lap" ,
			"MsgBox" , Win32.MB_YESNO | Win32.MB_ICONEXCLAMATION);
	}
}
