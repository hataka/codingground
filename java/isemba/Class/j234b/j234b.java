// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j234b.java 
 * created : Time-stamp: <09/06/27(土) 10:31:18 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j234b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j234b.java >>
//
//  クラス（３）：オーバーロード
//
//　　引数が２個の場合について、オーバーロードを確認する。
//
//　　（１）引数２個のメソッドを定義。
//　　（２）引数２個のメソッドを定義。
//　　（３）オブジェクトobjの作成。
//　　（４）引数２個のメソッドm(123,"abc")の呼び出し。
//　　（５）引数２個のメソッドm("abc",123)の呼び出し。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  void m(int a, String s) { //（１） 
    System.out.println("（４）引数２個のメソッド：m(int a, String s)");
  }
  void m(String s, int a) { //（２）
    System.out.println("（５）引数２個のメソッド：m(String s, int a)");
  }
}

class j234b {
  public static void main(String args[]) {

    C obj = new C(); //（３）

    obj.m(123,"abc"); //（４）

    obj.m("abc",123); //（５）
  }
}
/*
実行結果
% javac j234b.java
% java j234b
（４）引数２個のメソッド：m(int a, String s)
（５）引数２個のメソッド：m(String s, int a)
*/
