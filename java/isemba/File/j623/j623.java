// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j623.java 
 * created : Time-stamp: <09/06/26(金) 07:12:49 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/FILE/j623.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j623.java >>
//
//  ファイル処理（２）文字ストリーム（入出力：ファイル、バッファリング）
//
//    バッファリングを行いながら１行単位で入出力を行う。
//
//　●BufferedReaderクラス
//　　読込み時に、バッファリングを行うクラス。
//    このクラスの親クラスは、java.io.Readerクラスである。
//
//　○BufferedReaderクラスのコンストラクタ。
//    public BufferedReader(FileReader obj)
//      機能：FileReaderクラスのオブジェクトobjからBufferedReaderクラスの
//　　　　　　オブジェクトを作成。 
//
//  ○BufferedReaderクラスのメソッド
//    public String readLine() throws IOException
//      機能：１行単位で読み込む。ファイルの最後を検出したときは、nullを返す。
//    public void close() throws IOException
//      機能：ストリームを閉じる。
//
//　●BufferedWriterクラス
//　　書き込み時に、バッファリングを行うクラス。
//    このクラスの親クラスは、java.io.Writerクラスである。
//
//　○BufferedWriterクラスのコンストラクタ。
//    public BufferedWriter(FileWriter obj)
//      機能：FileWriterクラスのオブジェクトobjからBufferedWriterクラスの
//　　　　　　オブジェクトを作成。 
//
//  ○BufferedWriterクラスのメソッド
//    public void newLine() throws IOException
//      機能：行区切り文字を書き込む。
//    public void close() throws IOException
//      機能：ストリームを閉じる。
//
//　●java.io.Writerクラスのメソッド
//    public void write(String str) throws IOException
//      機能：文字列sを書き込む。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j623 {

  public static void main(String args[]) {
    try { 
      // 入力ストリームを作成。
//      FileReader fr = new FileReader(args[0]); // args[0]は入力ファイル名。
      FileReader fr = new FileReader("in.txt"); // in.txtは入力ファイル名。
  
      BufferedReader br = new BufferedReader(fr);

      // 出力ストリームを作成。
//      FileWriter fw = new FileWriter(args[1]); // args[1]は出力ファイル名。
      FileWriter fw = new FileWriter("out.txt"); // out.txtは出力ファイル名。

      BufferedWriter bw = new BufferedWriter(fw);

      // 読込みループ。
      String line; // 読み込まれた１行。
      while( (line = br.readLine()) != null ) { 
        bw.write(line); bw.newLine();
      }

      // 入力・出力ストリームを閉じる。
      br.close(); fr.close(); 
      bw.close(); fw.close();
    } catch ( Exception e ) { }
  }
}
/*
実行結果
% type in.txt
123
abc
日本語

% javac j623.java
% java j623 in.txt out.txt

% type out.txt
123
abc
日本語
*/
