// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j622.java 
 * created : Time-stamp: <09/06/26(金) 06:48:27 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/FILE/j622.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j622.java >>
//
//  ファイル処理（２）文字ストリーム（入力：ファイル、出力：ファイル）
//
//    ファイルから１文字単位で読み込み、ファイルに出力する。
//
//　●FileWriterクラス
//    このクラスの親クラスは、java.io.OutputStreamWriterクラスである。
//
//　○FileWriterクラスのコンストラクタ。   
//    public FileWriter(String s) throws IOException
//      機能：ファイル名sに対するFileWriterオブジェクトを作成する。 
//
//  ●java.io.OutputStreamWriterクラスのメソッド
//    public void write(int c) throws IOException
//      機能：１文字cを書き込む。
//    public void close() throws IOException
//      機能：ストリームを閉じる。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j622 {
  public static void main(String args[]) {

    try { 
      // 入力ストリームを作成。
//      FileReader fr = new FileReader(args[0]); // arg[0]は入力ファイル名。
      FileReader fr = new FileReader("in.txt"); // in.txtは入力ファイル名。

      // 出力ストリームを作成。
//      FileWriter fw = new FileWriter(args[1]); // arg[1]は出力ファイル名。
      FileWriter fw = new FileWriter("out.txt"); // out.txtは出力ファイル名。

      // 読込みループ。
      int c;
      while( (c = fr.read()) != -1 ) { 
        fw.write(c);
      }

      // 入力・出力ストリームを閉じる。
      fr.close();
      fw.close();

    } catch ( Exception e ) { } 
  }
} 
/*
実行結果
% type in.txt
123
abc
日本語

% javac j622.java
% java j622 in.txt out.txt

% type out.txt
123
abc
日本語
*/
