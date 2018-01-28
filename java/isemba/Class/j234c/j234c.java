// -*- mode: java -*- Time-stamp: <2009-06-27 10:34:35 kahata>
/*====================================================================
 * name: j234c.java 
 * created : Time-stamp: <09/06/27(土) 10:33:58 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j234c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j234c.java >>
//
//  クラス（３）：オーバーロード
//
//　　固定引数と可変引数の場合について、オーバーロードを確認する。
//
//　　（１）固定引数１個のメソッドを定義。
//　　（２）可変引数のメソッドを定義。
//　　（３）オブジェクトobjの作成。
//　　（４）引数０個のメソッドm()の呼び出し。
//　　（５）引数１個のメソッドm(123)の呼び出し。
//　　（６）引数２個のメソッドm(123,456)の呼び出し。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  void m(int a) { //（１） 
    System.out.println("固定引数１個のメソッド：m(int a)");
  }
  void m(int... a) { //（２）
    System.out.print("可変引数のメソッド：m(int... a)");
    System.out.println("　a.length = " + a.length);
  }
}

class j234c {
  public static void main(String args[]) {

    C obj = new C(); //（３）

    System.out.print("（４）");
    obj.m(); //（４）

    System.out.print("（５）");
    obj.m(123); //（５）

    System.out.print("（６）");
    obj.m(123,456); //（６）
  }
}
/*
実行結果
% javac j234c.java
% java j234c
（４）可変引数のメソッド：m(int... a)　a.length = 0
（５）固定引数１個のメソッド：m(int a)
（６）可変引数のメソッド：m(int... a)　a.length = 2
*/
