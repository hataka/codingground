// -*- mode: java -*- Time-stamp: <2009-06-26 14:31:36 kahata>
/*====================================================================
 * name: j633a.java 
 * created : Time-stamp: <09/06/26(金) 14:30:22 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/FILE/j633a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j633a.java >>
//
//  ファイル処理（３）ランダムアクセス（読み込み）
//
//    ファイルをランダムアクセスで開き、末尾のデータから読み込む。
//
//　●java.io.RandomAccessFileクラス
//    このクラスを使って、ファイルにランダムアクセスをすることができる。
//
//  ○RandomAccessFileクラスのコンストラクタ
//    public RandomAccessFile(File f, String m) throws FileNotFoundExceptionFile
//　　　機能：ファイルfに対して、ランダムアクセスファイルストリームを作成する。
//　　　　　　モードmが、"r"の場合、読み込み用に開く。
//　　　　　　"rw"の場合、読み込みおよび書き込み用に開く。ファイルが存在しない
//　　　　　　場合は、新規に作成される。
// 
//  ○RandomAccessFileクラスのメソッド
//    public void close() throws IOException
//　　　機能：ランダムアクセスファイルストリームを終了する。
//    public int read() throws IOException
//　　　機能：1バイトのデータを読み込む。値は、0 ～ 255の範囲の整数。
//　　public void seek(long pos) throws IOException
//　　　機能：ファイルの先頭を始点(0)として、読み込みまたは書き込みは、
//　　　　　　位置posから行われる。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j633a {

  public static void main(String args[]) {

    try {

      // ファイルをランダムアクセスで開く。
      RandomAccessFile raf = new RandomAccessFile("j633a.txt","r");

      // ファイルの末尾から逆順に１バイトずつ読み込む。
      for( long i=raf.length(); i>=1; i-- ) {
        raf.seek(i-1);
        int n = raf.read();
        System.out.printf("%d  %c\n",n,(char)n);
      }
      // ファイルを閉じる。
      raf.close();
    } catch( Exception e ) { }
  }
} 
/*
実行結果
% type j633a.txt
12345abc

% javac j633a.java
% java j633a
99  c
98  b
97  a
53  5
52  4
51  3
50  2
49  1
*/
