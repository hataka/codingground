//  -*- mode: java -*-  Time-stamp: <2009-06-17 13:16:42 kahata>
/*================================================================
 * title: 
 * file: j141a.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j141a.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j141a.java >>
//
//  基礎（４）：分岐（if文）
//
//  ●if文
//
//      if(条件式) {
//         処理
//      }
//
//      ・条件式がtrueのとき処理が実行される。
//
//      if(条件式) {
//         処理１
//      } else {
//         処理２
//      }
//
//      ・条件式がtrueのとき処理１が実行される。
//      ・条件式がfalseのとき処理２が実行される。
//
//  ●条件式
//
//        a == b     aとbが等しい
//        a != b     aとbが等しくない
//        a > b      aがbより大きい
//        a >= b     aがbより大きいかまたは等しい
//        a < b      aがbより小さい
//        a <= b     aがbより小さいかまたは等しい  
//
//        x && y     xとyがともにtrueの場合true,その他の場合false 
//        x || y     xとyの少なくとも一方がtrueの場合true,その他の場合false
//　　　　!x　　　　 xがtrueの場合false,xがfalseの場合true
//
////////////////////////////////////////////////////////////////////

public class j141a {
  public static void main(String args[]) {

    int i,j,k;

    // if文の動作確認。
    i = 111; j = 222;
    System.out.println("i=" + i + " j=" + j);
    if( i < j ) {           
      System.out.println(i + " < " + j);
    } else {
      System.out.println(i + " >= " + j);
    }
    System.out.println();

    // if文の動作確認。
    i = 222; j = 111;
    System.out.println("i=" + i + " j=" + j);
    if( i < j ) {           
      System.out.println(i + " < " + j);
    } else {
      System.out.println(i + " >= " + j);
    }
    System.out.println();

    // if文の動作確認。
    i = 111; j = 222; k = 333;
    System.out.println("i=" + i + " j=" + j + " k=" + k);
    if( (i < j)&&(j < k) ) {           
      System.out.println(i + " < " + j + " < " + k);
    } else {
      System.out.println("i = "+i+" j = "+j+" k = "+k);
    }
    System.out.println();

    // if文の動作確認。
    i = 333; j = 222; k = 111;
    System.out.println("i=" + i + " j=" + j + " k=" + k);
    if( (i < j)&&(j < k) ) {           
      System.out.println(i + " < " + j + " < " + k);
    } else {
      System.out.println("i=" + i + " j=" + j + " k=" + k);
    }
  }
}
/*
実行結果
% javac j141a.java
% java j141a
i=111 j=222
111 < 222

i=222 j=111
222 >= 111

i=111 j=222 k=333
111 < 222 < 333

i=333 j=222 k=111
i=333 j=222 k=111
*/
