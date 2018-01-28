// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j231b.java 
 * created : Time-stamp: <09/06/26(金) 19:49:53 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j231b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j231b.java >>
//
//  クラス（３）：メソッド（クラスメソッドの例）
//
//　　クラスメソッドの例を示す。
//　　オブジェクトが存在しないときでもクラスメソッドを呼び出すことができる。
//　　もちろん、オブジェクトが存在するときもクラスメソッドを呼び出すことができる。
//
//　　（１）クラスメソッド(g)の定義。
//    （２）オブジェクトが存在しないときのクラスメソッドgの呼び出し。
//　　（３）オブジェクトobjの作成。
//    （４）オブジェクトobjが存在するときのクラスメソッドgの呼び出し。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  static void g() { //（１）
    System.out.println("クラスメソッド(g)");
  }
}
 
class j231b {
  public static void main(String args[]) {

    System.out.print("（２）c.g()：");
    C.g(); //（２）

    C obj= new C(); //（３）

    System.out.print("（４）obj.g()：");
    obj.g(); //（４）
  }
}
/*
実行結果
% javac j231b.java
% java j231b
（２）c.g()：クラスメソッド(g)
（４）obj.g()：クラスメソッド(g)
*/
