//  -*- mode: java -*-  Time-stamp: <2009-06-17 10:38:54 kahata>
/*================================================================
 * title: 
 * file: j131a.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j131a.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j131a.java >>
//
//  基礎（３）：配列（１次元配列、宣言と確保、代入）
//
//  ●配列
//    同一の型をもつ多数のデータを処理するときに、有用である。
//  　個々のデータを配列の要素という。
//
//  ●配列の宣言
//
//　　　　型名　変数名[]　または　型名[]　変数名
//
//　●配列の確保
//
//    　　変数名 = new 型名[要素数]
//
//　　・配列の領域を確保するのに、予約語newを使う。
//    　要素数分の領域が確保され、その先頭のアドレスが変数に格納される。
//    ・配列の宣言と確保を同時にしてもよい。
//        型名 変数名[] = new 型名[要素数]
//        型名[] 変数名 = new 型名[要素数]
//　　・配列の要素は、添字（そえじと読む）で指定する。添字は0から始まる。
//
//　●配列要素数の参照
//
//        変数名.length
//
////////////////////////////////////////////////////////////////////

public class j131a {
  public static void main(String args[]) {

    // 配列の宣言（int型の変数aの宣言）。
    //int a[];               
    int[] a;               

    // 配列の確保（10個分の配列を確保。a[0],a[1],...,a[9]）。
    a = new int[10];

    // 配列要素へ代入。
    a[0] = 111; a[1] = 222; a[2] = 333;
 
    // 配列aの確認。
    System.out.println("a[0] = " + a[0]);
    System.out.println("a[1] = " + a[1]);
    System.out.println("a[2] = " + a[2]);
    // 配列aの要素数を確認。
    System.out.println("配列aの要素数 = " + a.length);
    System.out.println();

    // 配列の宣言。配列の領域を確保していないことに注意。
    int b[]; 

    b = a; // 変数aに格納されているアドレスが変数bに代入される。

    // 配列bの確認。
    System.out.println("b[0] = " + b[0]);
    System.out.println("b[1] = " + b[1]);
    System.out.println("b[2] = " + b[2]);
    // 配列bの要素数を確認。
    System.out.println("配列bの要素数 = " + b.length);
    System.out.println();

    // 配列bを変更すると、配列aに影響する。
    b[0] = -b[0]; b[1] = -b[1]; b[2] = -b[2];
    // 配列bの確認。
    System.out.println("b[0] = " + b[0]);
    System.out.println("b[1] = " + b[1]);
    System.out.println("b[2] = " + b[2]);
    // 配列aの確認。
    System.out.println("a[0] = " + a[0]);
    System.out.println("a[1] = " + a[1]);
    System.out.println("a[2] = " + a[2]);
  }
}
/*
実行結果

% javac j131a.java
% java j131a

a[0] = 111
a[1] = 222
a[2] = 333
配列aの要素数 = 10

b[0] = 111
b[1] = 222
b[2] = 333
配列bの要素数 = 10

b[0] = -111
b[1] = -222
b[2] = -333
a[0] = -111
a[1] = -222
a[2] = -333
*/
