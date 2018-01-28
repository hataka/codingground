//  -*- mode: java -*-  Time-stamp: <2009-06-16 20:49:36 kahata>
/*================================================================
 * title: 
 * file: j112b.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j112a.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j121a.java >>
//
//  基礎（２）：文字列
//
//  ●文字列の宣言
//    String 変数名;
//　　・String型の変数には、文字列が直接格納されずに、文字列が格納されている
//　　　場所を指す情報（アドレスという）が格納されている。
//    ・String型の変数が指す文字列は、変更できない。
//
//　●文字列を連結するには、＋演算子を使う。
//
////////////////////////////////////////////////////////////////////
 /**
   文字列を連結するには、＋演算子を使う
 */
class j121a {
  public static void main(String args[]) {

    // 文字列変数の宣言。
    String s1,s2,s3;

    // 文字列変数への代入。
    s1 = "12345";
    s2 = "abc"; 
    System.out.println("s1 =" + s1);
    System.out.println("s2 =" + s2);

    // 文字列の連結。
    s3 = s1 + s2;
    System.out.println("s1 + s2 =" + s3);
  }
}
/*
実行結果
% javac j121a.java
% java j121a

s1 =12345
s2 =abc
s1 + s2 =12345abc
*/
