//  -*- mode: java -*-  Time-stamp: <2009-06-17 11:20:18 kahata>
/*================================================================
 * title: 
 * file: j131b.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j131b.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j131b.java >>
//
//  基礎（３）：配列（１次元配列、列挙による宣言と代入）
//  ●配列の宣言
//　　　　型名　変数名[] = {データをカンマで区切る}
//  ●配列の代入
//　　　　変数名　= new 型名[] {データをカンマで区切る}
////////////////////////////////////////////////////////////////////////////////

public class j131b {
  public static void main(String args[]) {

    // 列挙による配列aの宣言。
    int a[] = { 1,2,3 }; 

    // 配列aの確認。
    System.out.println("a[0] = " + a[0]);
    System.out.println("a[1] = " + a[1]);
    System.out.println("a[2] = " + a[2]);
    System.out.println("配列aの要素数 = " + a.length);
    System.out.println();

    // 列挙による配列bの宣言。
    int b[];
    b = new int[] { -1,-2,-3 };

    // 配列bの確認。
    System.out.println("b[0] = " + b[0]);
    System.out.println("b[1] = " + b[1]);
    System.out.println("b[2] = " + b[2]);
    System.out.println("配列bの要素数 = " + b.length);
  }
}
/*
実行結果

% javac j131b.java
% java j131b
a[0] = 1
a[1] = 2
a[2] = 3
配列aの要素数 = 3

b[0] = -1
b[1] = -2
b[2] = -3
配列bの要素数 = 3
*/
