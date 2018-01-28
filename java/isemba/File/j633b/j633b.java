// -*- mode: java -*- Time-stamp: <2009-06-26 14:31:36 kahata>
/*====================================================================
 * name: j633b.java 
 * created : Time-stamp: <09/06/26(金) 14:30:22 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/FILE/j633b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j633b.java >>
//
//  ファイル処理（３）ランダムアクセス（読み込み、書き込み）
//
//    ファイルをランダムアクセスで開き、内容を反転して表示する。
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
//    public int write(int n) throws IOException
//　　　機能：1バイトのデータを現在のファイルポインタの位置に書き込む。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j633b {

  public static void main(String args[]) {

    try {

      // ファイルをランダムアクセスで開く。
      RandomAccessFile raf = new RandomAccessFile("j633b.txt","rw");

      // ファイルの内容を反転する。
      int s,t;
      long i,j;
      i = 1; j = raf.length();
      while( i < j ) {
        raf.seek(i-1); s = raf.read();
        raf.seek(j-1); t = raf.read();
        raf.seek(j-1); raf.write(s);
        raf.seek(i-1); raf.write(t);
        i++; j--;
      }

      for( long k=1; k<=raf.length(); k++ ) {
        raf.seek(k-1);
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
% type j633b.txt
123abc

% javac j633b.java
% java j633b
99  c
98  b
97  a
51  3
50  2
49  1
*/
