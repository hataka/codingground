// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j261b.java 
 * created : Time-stamp: <09/06/29(月) 16:53:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j261b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j261b.java >>
//
//  クラス（６）：例外（基本的な例外処理）
//
//　　例外に対応する例外クラスがわからない場合、Exceptionクラスで例外を
//　　受け取ればよい。
//　　Exceptionクラスで、回復処理を適切に行うと実行を継続できる
//　　例外クラスを受け取ることができる。
//
//　　基本的な例外処理を確認する。
//
//　　（１）tryブロック
//    （２）例外発生
//    （３）catchブロック：Exception
//　　（４）finallyブロック

////////////////////////////////////////////////////////////////////////////////

class j261b {
  public static void main(String args[]) {

    System.out.println("プログラム開始");

    try { //（１）
      System.out.println("（１）tryブロック開始");
      int a,b;
      a = 1;
      b = 1/(a-1); //（２）
      System.out.println("（１）tryブロック終了");

    } catch ( Exception e ) { //（３）
      System.out.println("（３）catchブロック(Exception)開始");
      System.out.println(e); // エラーの詳細を表示。
      System.out.println("（３）catchブロック(Exception)終了");

    } finally { //（４）
      System.out.println("（４）finallyブロック開始");
      System.out.println("（４）finallyブロック終了");
    }

    System.out.println("プログラム開始");
  }
}
/*
% javac j261b.java
% java j261b
プログラム開始
（１）tryブロック開始
（３）catchブロック(Exception)開始
java.lang.ArithmeticException: / by zero
（３）catchブロック(Exception)終了
（４）finallyブロック開始
（４）finallyブロック終了
プログラム開始
*/
