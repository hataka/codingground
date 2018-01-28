// -*- mode: java -*- Time-stamp: <2009-06-26 18:08:03 kahata>
/*====================================================================
 * name: j231a.java 
 * created : Time-stamp: <09/06/26(金) 18:07:23 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j231a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j231a.java >>
//
//  クラス（３）：メソッド（インスタンスメソッドの例）
//
//　　インスタンスメソッドの例を示す。
//　　オブジェクトが存在しないときインスタンスメソッドを呼び出す
//　　ことはできない。
//
//　　（１）インスタンスメソッド(f)の定義。
//　　（２）オブジェクトobjの作成。
//    （３）オブジェクトobjのインスタンスメソッドfの呼び出し。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  void f() { //（１）
    System.out.println("インスタンスメソッド(f)");
  }
}
 
class j231a {
  public static void main(String args[]) {

    C obj= new C(); //（２）

    System.out.print("（３）obj.f()：");
    obj.f(); //（３）
  }
}
/*
実行結果
% javac j231a.java
% java j231a
（３）obj.f()：インスタンスメソッド(f)
*/
