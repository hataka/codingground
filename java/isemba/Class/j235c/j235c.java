// -*- mode: java -*- Time-stamp: <2009-06-27 10:56:50 kahata>
/*====================================================================
 * name: j235c.java 
 * created : Time-stamp: <09/06/27(土) 10:56:01 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j235c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j235c.java >>
//
//  クラス（３）：コンストラクタ（オーバーロード）
//
//　　コンストラクタについてもオーバーロードが使える。
//
//　　（１）オブジェクトobj1の作成とコンストラクタ実行。
//　　（２）オブジェクトobj2の作成とコンストラクタ実行。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  C(int a) { // 引数１個のコンストラクタ。
    System.out.println("（１）引数１個のコンストラクタ：C(int a)");
  }
  C(String s) { // 引数１個のコンストラクタ。
    System.out.println("（２）引数１個のコンストラクタ：C(String s)");
  }
}

class j235c {
  public static void main(String args[]) {

    C obj1 = new C(123); //（１）
    C obj2 = new C("abc"); //（２）
  }
}
/*
実行結果
% javac j235c.java
% java j235c
（１）引数１個のコンストラクタ：C(int a)
（２）引数１個のコンストラクタ：C(String s)
*/
