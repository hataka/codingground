// -*- mode: java -*- Time-stamp: <2009-06-28 16:38:19 kahata>
/*====================================================================
 * name: j243a.java 
 * created : Time-stamp: <09/06/28(日) 16:37:44 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j243a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j243a.java >>
//
//  クラス（４）：継承（オーバーライド）
//
//　　オーバーライドを確認する。
//
//　　（１）子クラスで親クラスと同じ名前のフィールド変数を定義。
//　　（２）子クラスで親クラスのメソッドmをオーバーライド。
//　　（３）子クラスのオブジェクトobjcの作成。
//　　（４）親クラスと同じ名前のフィールド変数の参照。
//　　（５）オーバーライドした子クラスのメソッドmの呼び出し。
//
///////////////////////////////////////////////////////////////////////////////

class Parent {
  int a = 123;
  void m() {
    System.out.println("親クラスのメソッド(m)");
  }
}

class Child extends Parent {
  int a = 456; //（１）
  void m() { //（２）
    System.out.println("オーバーライドした子クラスのメソッド(m)");
  }
}

class j243a {
  public static void main(String args[]) {

    Child objc = new Child(); //（３）

    System.out.println("（４）objc.a：" + objc.a); //（４）

    System.out.print("（５）objc.m()：");
    objc.m(); //（５）
  }
}
/*
実行結果
% javac j243a.java
% java j243a
（４）objc.a：456
（５）objc.m()：オーバーライドした子クラスのメソッド(m)
*/
