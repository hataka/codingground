// -*- mode: java -*- Time-stamp: <2009-06-28 18:20:23 kahata>
/*====================================================================
 * name: j244b.java 
 * created : Time-stamp: <09/06/28(日) 18:19:40 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j244b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j244bjava >>
//
//  クラス（４）：継承（オーバーライド、性質2）
//
//　　Child objc = new Child();
//    Parent objp = objc;
//
//　　(性質２) 親クラスと子クラスが同じフィールドaをもつとき、objp.aで親クラスの
//　　　       フィールドが参照される。
//
//　　（１）子クラスのオブジェクトobjcの作成。
//　　（２）子クラスのオブジェクトobjcを親クラスの変数objpに代入。
//　　（３）親クラスのオブジェクトでフィールド変数aの参照。
//　　（４）子クラスのオブジェクトでフィールド変数aの参照。
//
///////////////////////////////////////////////////////////////////////////////

class Parent {
  int a = 111; // 子クラスと同じ名前のフィールド。
}

class Child extends Parent {
  int a = 222; // 親クラスと同じ名前のフィールド。
}

class j244b {
  public static void main(String args[]) {

    Child objc = new Child(); //（１）
    Parent objp = objc; //（２）

    System.out.println("（３）objp.a =" + objp.a);
    System.out.println("（４）objc.a =" + objc.a);
  }
}
/*
実行結果 
% javac j244b.java
% java j244b
（３）objp.a =111
（４）objc.a =222
*/
