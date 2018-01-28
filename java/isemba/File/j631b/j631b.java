// -*- mode: java -*- Time-stamp: <2009-06-26 09:25:03 kahata>
/*====================================================================
 * name: j631b.java 
 * created : Time-stamp: <09/06/26(金) 09:24:01 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j631b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j631b.java >>
//
//  ファイル処理（３）バイトストリーム（入力：ファイル　出力：ファイル）
//
//    内部で定義したデータを文字ストリームでファイルに出力した後、
//　　バイトストリームで入力する。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j631b {
  public static void main(String args[]) {

    try {
      byte b1 = 12;
      byte b2 = -12;
      int n1 = 12;
      int n2 = 256;

      // 出力ストリームを作成。
      PrintWriter pw = new PrintWriter("file.txt");
      // ファイルに出力。
      pw.println(b1);
      pw.println(b2);
      pw.println(n1);
      pw.println(n2);
      // 出力ストリームを閉じる。
      pw.close();

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
% javac j631b.java
% java j631b
整数値：49　バイト値：49
整数値：50　バイト値：50
整数値：13　バイト値：13
整数値：10　バイト値：10
整数値：45　バイト値：45
整数値：49　バイト値：49
整数値：50　バイト値：50
整数値：13　バイト値：13
整数値：10　バイト値：10
整数値：49　バイト値：49
整数値：50　バイト値：50
整数値：13　バイト値：13
整数値：10　バイト値：10
整数値：50　バイト値：50
整数値：53　バイト値：53
整数値：54　バイト値：54
整数値：13　バイト値：13
整数値：10　バイト値：10
*/
