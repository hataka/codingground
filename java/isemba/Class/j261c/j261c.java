// -*- mode: java -*- Time-stamp: <2009-06-29 16:58:22 kahata>
/*====================================================================
 * name: j261c.java 
 * created : Time-stamp: <09/06/29(月) 16:57:49 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j261c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j261c.java >>
//
//  クラス（６）：例外（例外の送出）
//
//　　予約語throwを使って、自分で例外を送出することができる。
//    例外が発生すると、それ以降の処理は実行されない。
//
//　　自分で例外を送出する方法を確認する。
//
//　　（１）tryブロック
//　　（２）throw文で例外を送出する。
//    （３）catchブロック：Exception
//　　（４）finallyブロック

////////////////////////////////////////////////////////////////////////////////

class j261c {
  public static void main(String args[]) {

    System.out.println("プログラム開始");

    try { //（１）
      System.out.println("（１）tryブロック開始");
      throw new ArithmeticException(); //（２）

    } catch ( Exception e ) { //（３）
      System.out.println("（３）catchブロック(Exception)開始");
      System.out.println(e); // エラーの詳細を表示。
      System.out.println("（３）catchブロック(Exception)終了");

    } finally { //（４）
      System.out.println("（４）finallyブロック開始");
      System.out.println("（４）finallyブロック終了");
    }
    System.out.println("プログラム終了");
  }
}
/*
% javac j261c.java
% java j261c
プログラム開始
（１）tryブロック開始
（３）catchブロック(Exception)開始
java.lang.ArithmeticException
（３）catchブロック(Exception)終了
（４）finallyブロック開始
（４）finallyブロック終了
プログラム終了
*/
