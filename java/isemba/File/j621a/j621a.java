// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j621a.java 
 * created : Time-stamp: <09/06/26(金) 06:25:27 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/FILE/j621a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j621a.java >>
//
//  ファイル処理（２）文字ストリーム（入力：ファイル、出力：画面）
//
//    ファイルから１文字単位で読み込み、標準出力に出力する。
//
//　　・ファイルで使われている文字コードには、EUCコード、シフトJISコード、
//　　　JISコードがある。Readerクラスのサブクラス(FileReader、BufferedReaderなど）
//　　　や、Writerクラスのサブクラス(FileWriter、BufferedWriterなど）を使うと、
//　　　入出力時に文字コードの変換を行う。すなわち、入力時には、EUCコード、
//　　　シフトJISコード、JISコードのいずれかからUnicodeへ変換する。
//　　　出力時には、UnicodeからEUCコード、シフトJISコード、JISコードのいずれかに
//　　　変換する。
//　　　それぞれ、指定を省略するとプラットフォームの文字コードが仮定される。
//　　　
//　●java.io.FileReaderクラス
//　　このクラスの親クラスは、InputStreamReaderクラスである。
//
//　○FileReaderクラスのコンストラクタ。
//    public FileReader(String s) throws FileNotFoundException
//      機能：ファイル名sに対するオブジェクトを作成。 
//
//  ●java.io.InputStreamReaderクラスのメソッド
//    public int read() throws IOException
//      機能：１文字単位で読み込む。ファイルの最後を検出したときは、-1を返す。
//    public void close() throws IOException
//      機能：ストリームを閉じる。
//　　public String getEncoding() 
//      機能：文字コードの名前を取得する。
//　　
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j621a {
  public static void main(String args[]) {

    try { 
      // 入力ストリームを作成。
//      FileReader fr = new FileReader(args[0]); // arg[0]はファイル名。
      FileReader fr = new FileReader("sjis.txt"); // arg[0]はファイル名。

      // 文字コードの確認。
      // MS932 は、Windowsで使われているシフトJISコードで、Microsoft独自の
      // 機種依存文字を含む。
      String s = fr.getEncoding();
      System.out.println("文字コード：" + s);
 
      // 読込みループ。
      int c;
      while( (c = fr.read()) != -1 ) {     
        System.out.print("整数値：" + c); 
        System.out.println("　文字：" + (char)c); 
      }

      // 入力ストリームを閉じる。
      fr.close();
    } catch ( Exception e ) { } 
  }
} 
/*
実行結果
sjis.txt：シフトJISコードのファイル
euc.txt：EUCコードのファイル
シフトJISコードのパソコン上で実行。

% type sjis.txt
123
abc
日本語

% javac j621a.java
% java j621a sjis.txt
文字コード：MS932
整数値：49　文字：1
整数値：50　文字：2
整数値：51　文字：3
整数値：13　文字：
整数値：10　文字：

整数値：97　文字：a
整数値：98　文字：b
整数値：99　文字：c
整数値：13　文字：
整数値：10　文字：

整数値：26085　文字：日
整数値：26412　文字：本
整数値：35486　文字：語

% type euc.txt
123abc
ﾆ・ﾜｸ

% java j621a euc.txt
文字コード：MS932
整数値：49　文字：1
整数値：50　文字：2
整数値：51　文字：3
整数値：13　文字：
整数値：10　文字：

整数値：97　文字：a
整数値：98　文字：b
整数値：99　文字：c
整数値：13　文字：
整数値：10　文字：

整数値：65414　文字：ﾆ
整数値：65533　文字：?
整数値：65419　文字：ﾋ
整数値：65436　文字：ﾜ
整数値：65400　文字：ｸ
整数値：65533　文字：?
*/
