// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j631a.java 
 * created : Time-stamp: <09/06/26(金) 09:17:35 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/FILE/j631a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j631a.java >>
//
//  ファイル処理（３）バイトストリーム（入力：ファイル　出力：ファイル）
//
//    内部で定義したデータをバイトストリームでファイルに出力した後、
//　　バイトストリームで入力する。
//
//　●java.io.FileOutputStreamクラス
//    ファイルにバイト単位で書き込むクラスである。
//
//　○FileOutputStreamクラスのコンストラクタ。
//    public FileOutputStream(String s) throws FileNotFoundException
//      機能：ファイル名sに対するオブジェクトを作成。 
//
//  ○FileOutputStreamクラスのメソッド
//    public void write(int b) throws IOException
//      機能：１バイトcを出力ストリームに書き込む。
//    public void close()
//      機能：ストリームを閉じる。
//
//　●java.io.FileInputStreamクラス
//　　ファイルからバイト単位で読み込むクラスである。
//
//　○FileInputStreamクラスのコンストラクタ。
//    public FileInputStream(String s) throws FileNotFoundException
//      機能：ファイル名sに対するオブジェクトを作成。 
//
//  ○FileInputStreamクラスのメソッド
//    public int read() throws IOException
//      機能：入力ストリームから１バイトを読み込む。
//            ファイルの終わりに達したときは-1を返す。
//    public void close()
//      機能：ストリームを閉じる。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j631a {
  public static void main(String args[]) {

    try {
      byte b1 = 12;
      byte b2 = -12;
      int n1 = 12;
      int n2 = 256;

      // 出力ストリームを作成。
      FileOutputStream fos = new FileOutputStream("file.txt");
      // ファイルに出力。
      fos.write(b1);
      fos.write(b2);
      fos.write(n1);
      fos.write(n2);
      // 出力ストリームを閉じる。
      fos.close();

      // 入力ストリームを作成。 
      FileInputStream fis = new FileInputStream("file.txt"); 
      // 読込みループ。
      int c; // 読み込まれた１バイト。入出力はint型で行われる。
             // byte型は、-128～127。int型は、0～255。
      while( (c = fis.read()) != -1 ) {
        System.out.print("整数値：" + c); 
        System.out.println("　バイト値：" + (byte)c); 
      }
      // 入力ストリームを閉じる。
      fis.close();
    } catch ( Exception e ) { } 
  }
} 
/*
実行結果
% javac j631a.java
% java j631a
整数値：12　バイト値：12
整数値：244　バイト値：-12
整数値：12　バイト値：12
整数値：0　バイト値：0
*/
