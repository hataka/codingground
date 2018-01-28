// -*- mode: java -*- Time-stamp: <2009-06-28 16:44:21 kahata>
/*====================================================================
 * name: j243b.java 
 * created : Time-stamp: <09/06/28(日) 16:43:37 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j243b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j243b.java >>
//
//  クラス（４）：継承（オーバーライド）
//
//  　オーバーライドされても親クラスのフィールドやメソッドを指定して使うことが
//　　できる。
//  　直接の親クラスを指すsuperという予約語を使う。
//  　super.フィールド名　super.メソッド名　とすればよい。
//
//　　オーバーライドを確認する。
//
//　　（１）子クラスで親クラスと同じ名前のフィールド変数を定義。
//　　（２）子クラスで親クラスのメソッドmをオーバーライド。
//　　（３）子クラスのオブジェクトobjcの作成。
//　　（４）親クラスのフィールドとメソッドmを復元。
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
    System.out.println("子クラスでオーバーライドしたメソッド(m)");
    System.out.println("a = " + a);
  }
  void mm() { //
    System.out.println("super.a = " + super.a); //（４）
    System.out.print("super.m()：");
    super.m(); //（４）
  }
}

class j243b {
  public static void main(String args[]) {

    Child objc = new Child(); //（３）

    System.out.println("（４）");
    objc.mm();
  }
}
/*
実行結果
% javac j243b.java
% java j243b
（４）
super.a = 123
super.m()：親クラスのメソッド(m)
*/
