// -*- mode: java -*- Time-stamp: <2009-06-30 06:44:08 kahata>
/*====================================================================
 * name: j643b.java 
 * created : Time-stamp: <09/06/30(火) 06:43:32 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j643b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j643b.java >>
//
//  ファイル処理（４）PrintWriterクラス（コンソールへの出力、書式付き）
//
//    C言語のprintf関数と同等の記述ができる。
//
//  ●PrintWriterクラスのメソッド
//    public PrintWriter printf(String fmt, Object... args)
//　　　機能：書式文字列fmtと引数を使用し、このライターに書き込む。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j643b {

  public static void main(String args[]) {

    PrintWriter pw = new PrintWriter(System.out,true);

    int n = 123;
    pw.printf("|%d|\n",n);
    pw.printf("|%6d|\n",n);
    pw.printf("|%-6d|\n",n);
    pw.printf("\n");

    double d = 123.456;
    pw.printf("|%f|\n",d);
    pw.printf("|%12.1f|\n",d);
    pw.printf("|%-12.4f|\n",d);
    pw.printf("|%12.1e|\n",d);
    pw.printf("|%-12.4e|\n",d);
    pw.printf("\n");

    String s = "日本語";
    pw.printf("|%s|\n",s);
    pw.printf("|%10s|\n",s);
    pw.printf("|%-10s|\n",s);
  }
}
/*
実行結果
% javac j643b.java
% java j643b
|123|
|   123|
|123   |

|123.456000|
|       123.5|
|123.4560    |
|     1.2e+02|
|1.2346e+02  |

|日本語|
|       日本語|
|日本語       |
*/
