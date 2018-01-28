// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j234a.java 
 * created : Time-stamp: <09/06/27(土) 10:27:00 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j234a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j234a.java >>
//
//  クラス（３）：オーバーロード
//
//　　引数が０個と１個の場合について、オーバーロードを確認する。
//
//　　（１）引数０個のメソッドを定義。
//　　（２）引数１個のメソッドを定義。
//　　（３）引数１個のメソッドを定義。
//　　（４）オブジェクトobjの作成。
//　　（５）引数０個のメソッドm()の呼び出し。
//　　（６）引数１個のメソッドm(123)の呼び出し。
//　　（７）引数１個のメソッドm("abc")の呼び出し。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  void m() { //（１）
    System.out.println("（５）引数0個のメソッド：m()");
  }
  // 引数1個のメソッド。
  void m(int a) { //（２）
    System.out.println("（６）引数1個のメソッド：m(int a)");
  }
  void m(String s) { //（３） 
    System.out.println("（７）引数1個のメソッド：m(String s)");
  }
}

class j234a {
  public static void main(String args[]) {

    C obj = new C(); //（４）

    obj.m(); //（５）

    obj.m(123); //（６）

    obj.m("abc"); //（７）
  }
}
/*
実行結果
% javac j234a.java
% java j234a
（５）引数0個のメソッド：m()
（６）引数1個のメソッド：m(int a)
（７）引数1個のメソッド：m(String s)
*/
