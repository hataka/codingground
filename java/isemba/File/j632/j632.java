// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j632.java 
 * created : Time-stamp: <09/06/26(金) 09:35:12 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/FILE/j632.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j632.java >>
//
//  ファイル処理（３）バイトストリーム（入出力：ファイル、バッファリング）
//
//    ファイルからnバイト単位で読み込み、ファイルに出力する。
//    入出力ともにバッファリングを行う。
//
//　●java.io.BufferedInputStreamクラス
//　　バイト単位の入力でバッファリングを行うクラス。
//
//　○BufferedInputStreamクラスのコンストラクタ
//    BufferedInputStream(InputStream obj)
//      機能：InputStreamクラスのオブジェクトobjからBufferedInputStreamの
//　　　　　　オブジェクトを作成。 
//
//  ○BufferedInputStreamクラスのメソッド
//    public int read(byte[] b, int j, int k) throws IOException
//      機能：入力ストリームからbyte配列bの指定された位置(jからkバイト分)に
//　　　　　　読み込む。読みとったバイト数を返す。ストリームの終わりに達した
//　　　　　　ときは-1を返す。
//    public void close() throws IOException
//      機能：ストリームを閉じる。
//
//　●java.io.BufferedOutputStreamクラス
//　　バイト単位の出力でバッファリングを行うクラス。
//
//　○BufferedOutputStreamクラスのコンストラクタ
//    public BufferedOutputStream(OutputStream obj)
//      機能：OutputStreamクラスのオブジェクトobjからBufferedOutputStreamの
//　　　　　　オブジェクトを作成。 
//
//  ○BufferedOutputStreamクラスのメソッド
//    public void write(byte[] b, int j, int k) throws IOException
//      機能：byte配列bの位置jからkバイト分を出力ストリームに書き込む。  
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j632 {

  public static void main(String args[]) {
    try {
      // 入力ストリームを作成。args[0]は入力ファイル名。
//      FileInputStream fis = new FileInputStream(args[0]);
      FileInputStream fis = new FileInputStream("in.txt");
      BufferedInputStream bis = new BufferedInputStream(fis);

      // 出力ストリームを作成。args[1]は出力ファイル名。
//      FileOutputStream fos = new FileOutputStream(args[1]);
      FileOutputStream fos = new FileOutputStream("out.txt");
      BufferedOutputStream bos = new BufferedOutputStream(fos);

      // 読込みループ。
      byte buff[] = new byte[10]; // 読み込まれたバイト分。
      int len; // 読み込まれたバイト数。
      while( (len = bis.read(buff,0,10)) != -1 ) {
        bos.write(buff,0,len);
      }

      // 入力・出力ストリームを閉じる。
      bis.close(); fis.close();
      bos.close(); fos.close();
    } catch ( Exception e ) { }
  }
}
/*
実行結果
% type in.txt
123
abc
日本語

% javac j632.java
% java j632 in.txt out.txt

% type out.txt
123
abc
日本語
*/
