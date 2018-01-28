// -*- mode: java -*- Time-stamp: <2009-06-26 06:44:24 kahata>
/*====================================================================
 * name: j621b.java 
 * created : Time-stamp: <09/06/26(金) 06:42:09 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/FILE/j621b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j621b.java >>
//
//  ファイル処理（２）文字ストリーム（入力：ファイル、出力：画面）
//
//    ファイルから１文字単位で読み込み、標準出力に出力する。
//
//　　・ファイルの文字コード(EUCコード、シフトJISコード、JISコード)を入力時に
//      自動判別する。
//　　　
//　●InputStreamReaderクラス
//    public class InputStreamReader extends Reader
//    InputStreamReaderクラスは、バイトストリームからバイトデータを読み込み、
// 　 指定されたcharset を使用して文字ストリーム変換する。
//
//　○InputStreamReaderクラスのコンストラクタ
//    public InputStreamReader(InputStream in)
//      機能：デフォルトの文字エンコーディングを使うInputStreamReaderを
//            作成する。 
//    public InputStreamReader(InputStream in, Charset cs)
//      機能：与えられた文字エンコーディングを使うInputStreamReaderを
//            作成する。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j621b {
  public static void main(String args[]) {

    try { 
      // 入力ストリームを作成。arg[0]はファイル名。
//      InputStreamReader isr = new InputStreamReader(
//                                  new FileInputStream(args[0]),"JISAutoDetect"); 

      InputStreamReader isr = new InputStreamReader(
                                  new FileInputStream("sjis.txt"),"JISAutoDetect"); 


      // 文字コードの確認。
      String s = isr.getEncoding();
      System.out.println("文字コード：" + s);
 
      // 読込みループ。
      int c;
      while( (c = isr.read()) != -1 ) {     
        System.out.print("整数値：" + c); 
        System.out.println("　文字：" + (char)c); 
      }

      // 入力ストリームを閉じる。
      isr.close();

    } catch ( Exception e ) { } 
  }
} 
/*
実行結果
euc.txt：EUCコードのファイル
シフトJISコードのパソコン上で実行。

% type sjis.txt
123
abc
日本語

% javac j621b.java
% java j621b sjis.txt
文字コード：JISAutoDetect
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
123
abc
ﾆ・ﾜｸ

% java j621b euc.txt
文字コード：JISAutoDetect
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
*/
