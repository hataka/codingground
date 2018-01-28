// -*- mode: java -*- Time-stamp: <2009-06-26 08:29:05 kahata>
/*====================================================================
 * name: j624.java 
 * created : Time-stamp: <09/06/26(金) 08:27:52 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/FILE/j624.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j624.java >>
//
//  ファイル処理（２）文字ストリーム（入出力：ファイル、バッファリング）
//
//    ファイルから１行単位で読み込み、ファイルに１行単位で出力する。
//    入出力ともにバッファリングを行う。
//
//　●java.io.PrintWriterクラス
//　　基本データ型やオブジェクトを文字にして出力するクラスである。
//
//　●PrintWriterクラスのコンストラクタ。
//    PrintWriter(Writer obj)
//      機能：WriterクラスのオブジェクトobjからPrintWriterクラスの
//　　　　　　オブジェクトを作成。 
//
//  ●PrintWriterクラスのメソッド
//    public void println(String s)
//      機能：文字列sを書き込む。その後、改行。
//    public void close()
//      機能：ストリームを閉じる。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;  

class j624 {
  public static void main(String args[]) {
    try { 
      // 入力ストリームを作成。
			// FileReader fr = new FileReader(args[0]); // args[0]は入力ファイル名。
      FileReader fr = new FileReader("in.txt"); // in.txtは入力ファイル名。
      BufferedReader br = new BufferedReader(fr);

      // 出力ストリームを作成。
			// FileWriter fw = new FileWriter(args[1]); // args[1]は出力ファイル名。
      FileWriter fw = new FileWriter("out.txt"); // out.txtは出力ファイル名。
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter pw = new PrintWriter(bw);

      // 読込みループ。
      String line; // 読み込まれた１行。
      while( (line = br.readLine()) != null ) {
        //System.out.println(line);
				pw.println(line);
      }

      // 入力・出力ストリームを閉じる。
      br.close(); fr.close();
      pw.close(); bw.close(); fw.close();
    } catch ( Exception e ) { }
		//System.out.println(Lib.basename("C:\\sss\\aaa\\bbb.ccc"));
		System.out.println(Lib.File_ReadToEndDecode("in.txt","utf-8"));
		LibTest();
		}

	public static void LibTest(){
		String path = "F:/codingground/swt.snippets/java/swt-4.5-win32-win32-x86_64/swt.jar";
		System.out.println(Lib.filebody(path));
  	System.out.println(Lib.basename(path));
  	System.out.println(Lib.fileext(path));
  	System.out.println(Lib.filedir(path));
		Lib.MessageBox("こんにちわ","Lib試験"); //ok
	}
}
		
/*
実行結果
% type in.txt
123
abc
日本語

% javac j624.java
% java j624 in.txt out.txt

% type out.txt
123
abc
日本語
*/
