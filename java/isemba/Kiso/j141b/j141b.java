//  -*- mode: java -*-  Time-stamp: <2009-06-17 19:50:17 kahata>
/*================================================================
 * title: 
 * file: j141b.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j141b.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j141b.java >>
//
//  基礎（４）：分岐（if文）
//
//  ●if文の繰り返し
//
//      if(条件式１) {
//         処理１
//      } else if(条件式２) {
//         処理２
//      } else {
//         処理３
//      }
//
//      ・条件式１がtrueのとき処理１が実行される。
//      ・条件式１がfalse、条件式２がtrueのとき処理２が実行される。
//      ・条件式１がfalse、条件式２がfalseのとき処理３が実行される。
//
////////////////////////////////////////////////////////////////////

class j141b {
  public static void main(String args[]) {

    boolean b1,b2;

    // if文の動作確認。
    b1 = true; 
    b2 = true; // falseでもよいが、いずれかにしておかないとエラーになる。
    System.out.println("b1=" + b1);
    if( b1 ) {           
      System.out.println("処理１");
    } else if( b2 ) {
      System.out.println("処理２");
    } else {
      System.out.println("処理３");
    }
    System.out.println();

    // if文の動作確認。
    b1 = false;
    b2 = true;
    System.out.println("b1=" + b1 + " b2=" + b2);
    if( b1 ) {           
      System.out.println("処理１");
    } else if( b2 ) {
      System.out.println("処理２");
    } else {
      System.out.println("処理３");
    }
    System.out.println();

    // if文の動作確認。
    b1 = false;
    b2 = false;
    System.out.println("b1=" + b1 + " b2=" + b2);
    if( b1 ) {           
      System.out.println("処理１");
    } else if( b2 ) {
      System.out.println("処理２");
    } else {
      System.out.println("処理３");
    }
  }
}
/*
実行結果
% javac j141b.java
% java j141b
b1=true
処理１

b1=false b2=true
処理２

b1=false b2=false
処理３
*/
