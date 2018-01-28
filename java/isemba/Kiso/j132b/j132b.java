//  -*- mode: java -*-  Time-stamp: <2009-06-17 11:31:44 kahata>
/*================================================================
 * title: 
 * file: j132b.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j132b.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j132b.java >>
//
//  基礎（３）：配列（２次元配列）
//
//　　２次元配列では、各要素の要素数が異なっていてもよい。
//
////////////////////////////////////////////////////////////////////

public class j132b {
  public static void main(String args[]) {

    // 配列aの宣言。
    int a[][] = { {11,12,13},{21,22},{31} };

    // 配列aの確認。
    System.out.println("a.length = " + a.length);
    System.out.println("a[0].length = " + a[0].length);
    System.out.println("a[1].length = " + a[1].length);
    System.out.println("a[2].length = " + a[2].length);
    System.out.println();

    System.out.println("a[0][0] = " + a[0][0]);
    System.out.println("a[0][1] = " + a[0][1]);
    System.out.println("a[0][2] = " + a[0][2]);
    System.out.println("a[1][0] = " + a[1][0]);
    System.out.println("a[1][1] = " + a[1][1]);
    System.out.println("a[2][0] = " + a[2][0]);
    System.out.println();

    // 配列bの宣言。
    int b[][] = new int[3][];
    b[0] = new int[3];
    b[1] = new int[2];
    b[2] = new int[1];

    // 配列要素へ代入。
    b[0][0] = 11; b[0][1] = 12; b[0][2] = 13;
    b[1][0] = 21; b[1][1] = 22; 
    b[2][0] = 31;  

    // 配列bの確認。
    System.out.println("b.length = " + b.length);
    System.out.println("b[0].length = " + b[0].length);
    System.out.println("b[1].length = " + b[1].length);
    System.out.println("b[2].length = " + b[2].length);
    System.out.println();

    System.out.println("b[0][0] = " + b[0][0]);
    System.out.println("b[0][1] = " + b[0][1]);
    System.out.println("b[0][2] = " + b[0][2]);
    System.out.println("b[1][0] = " + b[1][0]);
    System.out.println("b[1][1] = " + b[1][1]);
    System.out.println("b[2][0] = " + b[2][0]);
  }
}
/*
実行結果
% javac j132b.java
% java j132b
a.length = 3
a[0].length = 3
a[1].length = 2
a[2].length = 1

a[0][0] = 11
a[0][1] = 12
a[0][2] = 13
a[1][0] = 21
a[1][1] = 22
a[2][0] = 31

b.length = 3
b[0].length = 3
b[1].length = 2
b[2].length = 1

b[0][0] = 11
b[0][1] = 12
b[0][2] = 13
b[1][0] = 21
b[1][1] = 22
b[2][0] = 31
*/
