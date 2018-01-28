// -*- mode: java -*- Time-stamp: <2009-06-29 17:09:29 kahata>
/*====================================================================
 * name: j262a.java 
 * created : Time-stamp: <09/06/29(月) 17:08:49 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j262a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j262a.java >>
//
//  クラス（６）：例外（自メソッド外で例外を処理する場合）
//
//　　自メソッド外での基本的例外処理を確認する。
//
//　　（１）自メソッド外に例外クラスを送出するメソッドの記述。
//　　（２）例外発生。
//　　（３）tryブロック。
//　　（４）例外クラスを送出するメソッド。
//    （５）catchブロック：Exception
//　　（６）finallyブロック
//
////////////////////////////////////////////////////////////////////////////////

class j262a {
  //（１）
  static void m() throws ArithmeticException {
    int a,b;
    System.out.println("m()実行");
    a = 1;
    b = 1/(a-1); //（２）
  } 

  public static void main(String args[]) {

    System.out.println("プログラム開始");

    try { //（３）
      System.out.println("（３）tryブロック開始");
      m(); //（４） 
      System.out.println("（３）tryブロック終了");

    } catch ( Exception e ) { //（５）
      System.out.println("（５）catchブロック(Exception)開始");
      System.out.println(e); // エラーの詳細を表示。
      System.out.println("（５）catchブロック(Exception)終了");

    } finally { //（６）
      System.out.println("（６）finallyブロック開始");
      System.out.println("（６）finallyブロック終了");
    }
    System.out.println("プログラム終了");
  }
}
/*
% javac j262a.java
% java j262a
プログラム開始
（３）tryブロック開始
m()実行
（５）catchブロック(Exception)開始
java.lang.ArithmeticException: / by zero
（５）catchブロック(Exception)終了
（６）finallyブロック開始
（６）finallyブロック終了
プログラム終了
*/
