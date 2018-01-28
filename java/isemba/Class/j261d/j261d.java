// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j261d.java 
 * created : Time-stamp: <09/06/29(月) 17:02:24 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j261d.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j261d.java >>
//
//  クラス（６）：例外（自作の例外処理）
//
//    自作の例外クラス(MyException)をExceptionクラスの子クラスとして作成する。
//
//　　自作の例外処理を確認する。
//
//　　（１）自作の例外クラス。
//　　（２）tryブロック
//　　（３）throw文で例外を送出する。
//    （４）catchブロック：Exception
//　　（５）finallyブロック
//
////////////////////////////////////////////////////////////////////////////////

class MyException extends Exception { //（１）
  MyException() { // コンストラクタ。
    System.out.println("自作例外クラスが呼び出されました");
  }
}

class j261d {
  public static void main(String args[]) {

    System.out.println("プログラム開始");

    try { //（２）
      System.out.println("（１）tryブロック開始");
      MyException e = new MyException();
      throw e; //（３）

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
% javac j261d.java
% java j261d
プログラム開始
（１）tryブロック開始
自作例外クラスが呼び出されました
（３）catchブロック(Exception)開始
MyException
（３）catchブロック(Exception)終了
（４）finallyブロック開始
（４）finallyブロック終了
プログラム終了
*/
