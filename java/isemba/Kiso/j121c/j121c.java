//  -*- mode: java -*-  Time-stamp: <2009-06-17 09:54:01 kahata>
/*================================================================
 * title: 
 * file: j121c.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j121c.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j121c.java >>
//
//  基礎（２）：文字列
//
//　●文字列の探索
//　　s.indexOf("文字列")と書くと、変数sが指す文字列中に、引数の文字列が
//　　見つかった場合、その位置を取得できる。見つからない場合、-1が返される。
//
////////////////////////////////////////////////////////////////////

class j121c {
  public static void main(String args[]) {

    int k;
    String s;

    s = "12345茨城大学abc"; 
    System.out.println("s =" + s);

    k = s.indexOf("45");
    System.out.println("s.indexOf(\"45\") =" + k);

    k = s.indexOf("大学");
    System.out.println("s.indexOf(\"大学\") =" + k);

    k = s.indexOf("abc");
    System.out.println("s.indexOf(\"abc\") =" + k);

    k = s.indexOf("7");
    System.out.println("s.indexOf(\"7\") =" + k);
  }
}
/*
実行結果

% javac j121c.java
% java j121c
s =12345茨城大学abc
s.indexOf("45") =3
s.indexOf("大学") =7
s.indexOf("abc") =9
s.indexOf("7") =-1
*/
