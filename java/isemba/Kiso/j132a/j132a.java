//  -*- mode: java -*-  Time-stamp: <2009-06-17 11:25:19 kahata>
/*================================================================
 * title: 
 * file: j132a.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j132a.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j132a.java >>
//
//  基礎（３）：配列（２次元配列、宣言）
//
//  ●配列の宣言
//　　　　型名　配列名[][] = new 型名[要素数][要素数]
//     型名　配列名[][] = { データをカンマで区切る }
//
////////////////////////////////////////////////////////////////////////////////

public class j132a {
  public static void main(String args[]) {

    // 配列の宣言。
    int a[][] = new int[2][3]; 

    a[0][0] = 11; a[0][1] = 12; a[0][2] = 13;
    a[1][0] = 21; a[1][1] = 22; a[1][2] = 23;

    // 配列aの確認。
    System.out.println("a[0][0] = " + a[0][0]);
    System.out.println("a[0][1] = " + a[0][1]);
    System.out.println("a[0][2] = " + a[0][2]);
    System.out.println("a[1][0] = " + a[1][0]);
    System.out.println("a[1][1] = " + a[1][1]);
    System.out.println("a[1][2] = " + a[1][2]);
    System.out.println();

    // 配列の宣言。
    int b[][] = { { 31,32,33}, {41,42,43} }; 

    // 配列bの確認。
    System.out.println("b[0][0] = " + b[0][0]);
    System.out.println("b[0][1] = " + b[0][1]);
    System.out.println("b[0][2] = " + b[0][2]);
    System.out.println("b[1][0] = " + b[1][0]);
    System.out.println("b[1][1] = " + b[1][1]);
    System.out.println("b[1][2] = " + b[1][2]);
  }
}
/*
実行結果
% javac j132a.java
% java j132a
a[0][0] = 11
a[0][1] = 12
a[0][2] = 13
a[1][0] = 21
a[1][1] = 22
a[1][2] = 23

b[0][0] = 31
b[0][1] = 32
b[0][2] = 33
b[1][0] = 41
b[1][1] = 42
b[1][2] = 43
*/
