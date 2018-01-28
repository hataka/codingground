// -*- mode: java -*- Time-stamp: <2009-06-29 16:49:42 kahata>
/*====================================================================
 * name: j261a.java 
 * created : Time-stamp: <09/06/29(月) 16:49:07 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j261a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j261a.java >>
//
//  クラス（６）：例外（基本的な例外処理）
//
//　　基本的な例外処理を確認する。
//
//　　（１）tryブロック
//    （２）例外発生
//    （３）catchブロック：ArithmeticException
//　　（４）catchブロック：Exception)
//　　（５）finallyブロック
//
////////////////////////////////////////////////////////////////////////////////

class j261a {
  public static void main(String args[]) {

    System.out.println("プログラム開始");

    try { //（１）
      System.out.println("（１）tryブロック開始");
      int a,b;
      a = 1;
      b = 1/(a-1); //（２）
      System.out.println("（１）tryブロック終了");

    } catch ( ArithmeticException e ) { //（３）
      System.out.println("（３）catchブロック(ArithmeticException)開始");
      System.out.println(e); // エラーの詳細を表示。
      System.out.println("（３）catchブロック(ArithmeticException)終了");

    } catch ( Exception e ) { //（４）
      System.out.println("（４）catchブロック(Exception)開始");
      System.out.println(e); // エラーの詳細を表示。
      System.out.println("（４）catchブロック(Exception)終了");

    } finally { //（５）
      System.out.println("（５）finallyブロック開始");
      System.out.println("（５）finallyブロック終了");
    }

    System.out.println("プログラム終了");
  }
}
/*
% javac j261a.java
% java j261a
プログラム開始
（１）tryブロック開始
（３）catchブロック(ArithmeticException)開始
java.lang.ArithmeticException: / by zero
（３）catchブロック(ArithmeticException)終了
（５）finallyブロック開始
（５）finallyブロック終了
プログラム終了
*/
