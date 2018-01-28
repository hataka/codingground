// -*- mode: java -*- Time-stamp: <2009-06-29 17:12:16 kahata>
/*====================================================================
 * name: j262b.java 
 * created : Time-stamp: <09/06/29(月) 17:11:39 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j262b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j262b.java >>
//
//  クラス（６）：例外（自作の例外処理、自メソッド外で処理)
//
//    自作の例外処理、自メソッド外で処理を確認する。
//
//　　（１）自作の例外クラス。
//　　（２）自メソッド外に例外クラスを送出するメソッドの記述。
//　　（３）例外発生。
//　　（４）tryブロック。
//　　（５）例外クラスを送出するメソッド。
//    （６）catchブロック：Exception
//　　（７）finallyブロック
//
////////////////////////////////////////////////////////////////////////////////

//（１）
class MyException extends Exception {
  MyException() { // コンストラクタ。
    System.out.println("自作例外クラスが呼び出されました");
  }
}

class j262b {
  //（２）
  static void m() throws MyException {
    System.out.println("メソッドm()が実行されました");
    MyException e = new MyException();
    throw e; //（３）
  }

  public static void main(String args[]) {

    System.out.println("プログラム開始");

    try { //（４）
      System.out.println("（４）tryブロック開始");
      m(); //（５） 
      System.out.println("（４）tryブロック終了");

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
実行結果
% javac j262b.java
% java j262b
プログラム開始
（４）tryブロック開始
メソッドm()が実行されました
自作例外クラスが呼び出されました
（５）catchブロック(Exception)開始
MyException
（５）catchブロック(Exception)終了
（６）finallyブロック開始
（６）finallyブロック終了
プログラム終了
*/
